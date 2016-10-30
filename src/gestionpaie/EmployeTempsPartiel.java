
package gestionpaie;

import java.util.logging.Logger;

/**
 *
 * @author pro
 */
public class EmployeTempsPartiel extends Employe {

    private final static int heure_mois = 35;
    private double montant_heure;

    public EmployeTempsPartiel(String nom, String job) {
        super(nom, job);
    }

    public double getMontant_heure() {
        return montant_heure;
    }

    public int getHeure_mois() {
        return heure_mois;
    }

    public void setMontant_heure(double montant_heure) {
        this.montant_heure = montant_heure;
    }

    @Override
    public double calcul_paie() {
        salaire = this.heure_mois * montant_heure;
        return salaire; 
    }

}
