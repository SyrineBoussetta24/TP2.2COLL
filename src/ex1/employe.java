package ex1;

import java.util.Objects;

public class employe implements Comparable<employe>{
	private int cin ;
	private String nom ;
	private float salaire;
	private int idDep ;
	public int getCin() {
		return cin;
	}
	
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public employe(int cin, String nom, float salaire, int idDep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.idDep = idDep;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", dep=" + idDep + "]";
	}

	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employe other = (employe) obj;
		return cin == other.cin;
	}

	@Override
	public int compareTo(employe e) {
		if (this.getSalaire()>e.getSalaire()) {
    		return -1;
    	}
    	if (this.getSalaire()<e.getSalaire()) {
    		return 1;
    	}
    	return 0;	
    	}

	
	
}
