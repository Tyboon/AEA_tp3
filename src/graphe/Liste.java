package graphe;
import java.util.ArrayList;


public class Liste {
	
	private ArrayList<ArrayList<Integer>> listeSucc;
	
	public Liste(int nbMots) {
		this.listeSucc = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i<nbMots; i++)
			this.ajouterList();
	}
	
	public void ajouterLien(int s, int d) {
		this.listeSucc.get(s).add(d);
		this.listeSucc.get(d).add(s);
	}
	
	private void ajouterList() {
		this.listeSucc.add(new ArrayList<Integer> ());
	}

	public ArrayList<Integer> get(int i) {
		return this.listeSucc.get(i);
	}
	
	public int getSize() {
		return this.listeSucc.size();
	}

}
