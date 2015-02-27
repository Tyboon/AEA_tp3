package graphe;




public class Graphe {
	
	private String[] mots;
	private Liste listeSucc;

	public Graphe(String[] lesMots) {
		this.mots = lesMots;
		this.listeSucc = new Liste(lesMots.length);
	}
	
	public void ajouterArete(int s, int d) {
		this.listeSucc.ajouterLien(s, d);
	}
	
	public void lettreQuiSaute() {
		int size = this.mots.length;
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				if (this.diffUneLettre(this.mots[i],this.mots[j])&& !(this.listeSucc.get(i).contains(j)))
					this.ajouterArete(i, j);
	}
	
	private boolean diffUneLettre(String a, String b) {
	    int i=0 ;
	    while (i<a.length() && a.charAt(i) == b.charAt(i)) 
	      ++i ;
	    if (i == a.length()) return false ;
	    ++i ;
	    while (i<a.length() && a.charAt(i) == b.charAt(i))
	      ++i ;
	    if (i == a.length()) return true ;
	    return false ;
	}
	
	public void afficher() {
		for (int i = 0; i < this.mots.length; i++) {
			System.out.print("Successeurs de "+this.getMot(i)+" :");
			for (int j : this.listeSucc.get(i))
				System.out.print(this.getMot(j)+";");
			System.out.println();
		}
	}
	
	public String getMot(int i) {
		return this.mots[i];
	}
}
