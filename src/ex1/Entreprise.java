package ex1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Entreprise {
	private String nomEntreprise;
	private HashMap<Integer, Departement> Liste_Deps;
	
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public Entreprise(String nomEntreprise) {
		super();
		this.nomEntreprise = nomEntreprise;
		this.Liste_Deps = new HashMap<>();
	}
	
	public void ajoutDep(Departement d)
	{
		Liste_Deps.put(d.getIdDep(), d);
	}
	public void retirerDep(Departement d)
	{
		Liste_Deps.remove(d.getIdDep());
	}
	public void afficheE()
	{
		Set <Entry<Integer,Departement>> s= Liste_Deps.entrySet();
		for(Entry<Integer,Departement> e:s) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
	public void UpdateDep(employe E, int idDep) {
		for (Departement dep : Liste_Deps.values()) {
            if (dep.existeE(E.getCin())) {
                dep.retirerEmploye(E);
                Departement newDep = Liste_Deps.get(idDep);
                if (newDep != null) {
                    newDep.ajoutEmploye(E);
                } else {
                    System.out.println("Le dép n'existe pas.");
                }
                return;
            }
        }
        System.out.println("L'employé n'appartient à aucun dép .");

	}
	public boolean existeD(Departement d)
	{
		 return Liste_Deps.containsValue(d);
	}
	public void DepMinCapacity() {
		TreeMap<Integer,Departement> t =new TreeMap<Integer,Departement>(Liste_Deps);
		System.out.println("le min  = "+ t.firstKey()+" : "+t.get(t.firstKey()));
	}
}
