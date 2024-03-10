package ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<employe> LEmployes;

	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public Departement(int idDep) {
			this.idDep=idDep;
			LEmployes = new HashSet<>();
	}

	public void ajoutEmploye(employe E) {
		if (E.getCin()>0) {
			LEmployes.add(E);
		}
	}

	public void retirerEmploye(employe E) {
		LEmployes.remove(E);
	}

	public void afficheDep() {
	        for (employe E : LEmployes) {
	        System.out.println(LEmployes.toString());
	        }	}

	public boolean existeE(int cin) {
		employe ec = new employe (cin,"null",0,0);
			 return LEmployes.contains(ec);
	}
	public employe getEmpSalMax()
	{
			TreeSet <employe> p = new TreeSet (LEmployes);
			return p.first();
	}
	
}