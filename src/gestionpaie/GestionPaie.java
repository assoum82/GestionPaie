
package gestionpaie;

/**
 *
 * @author pro
 */
public class GestionPaie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***Gestion de la Paie 1ere façon ***");
        Employe e1 = new Employe("Salim", "PDG");
        e1.setSalaire(100000);
        e1.cheque_de_paie();
        Employe e2 = new EmployeTempsPlein("Halima", "Secretaire");
        ((EmployeTempsPlein) e2).setMontant_hebdomadaire(5000);
        ((EmployeTempsPlein) e2).setPrime(2000);
        e2.calcul_paie();
        e2.cheque_de_paie();
        Employe e3 = new EmployeTempsPartiel("Houari",
                "Agent de Sécurité");
        ((EmployeTempsPartiel) e3).setMontant_heure(45);
        e3.calcul_paie();
        e3.cheque_de_paie();
        e1 = new EmployeTempsPlein("Salim", "PDG");
        ((EmployeTempsPlein) e1).setMontant_hebdomadaire(24000);
        ((EmployeTempsPlein) e1).setPrime(4000);
        e1.calcul_paie();
        e1.cheque_de_paie();
        System.out.println("***Gestion de la Paie 2eme façon ***");
        Employe e[] = new Employe[3];
        e[0] = e1;
        e[1] = e2;
        e[2] = e3;
        for (int i = 0; i < 3; i++) {
            e[i].calcul_paie();
            e[i].cheque_de_paie();
        }
    }}
