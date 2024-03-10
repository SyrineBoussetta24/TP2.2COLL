package ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        Departement d1 = new Departement(1);

        employe e1 = new employe(1, "syrine", 1200, 1);
        employe e2 = new employe(12, "SOUMAYA", 1100, 2);

        d1.ajoutEmploye(e1);
        d1.ajoutEmploye(e2);

        System.out.println("Department 1:");
        d1.afficheDep();

        d1.retirerEmploye(e2);
        d1.afficheDep();

        int cin = 1;
        System.out.println("Employee avec ID " + cin + " existe dans departement : " + d1.existeE(cin));

        employe empSalMax = d1.getEmpSalMax();
        System.out.println("L'employe avec le salaire max est :  " + empSalMax.toString());

        Entreprise entreprise = new Entreprise("AA");
        entreprise.ajoutDep(d1);
        entreprise.UpdateDep(e1, 2);

        System.out.println("Departments after modification:");
        entreprise.afficheE();

        System.out.println("Department 1 existe dans l'entreprise: " + entreprise.existeD(d1));

        entreprise.DepMinCapacity();
    }
}
