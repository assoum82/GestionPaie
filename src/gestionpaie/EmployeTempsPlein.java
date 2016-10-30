
package gestionpaie;

/**
 *
 * @author pro
 */
public class EmployeTempsPlein extends Employe {

    private double montant_hebdomadaire;
    private double prime;

    public EmployeTempsPlein(String nom, String job) {
        super(nom, job);
    }

    public double getMontant_hebdomadaire() {
        return montant_hebdomadaire;
    }

    public void setMontant_hebdomadaire(double montant_hebdomadaire) {
        this.montant_hebdomadaire = montant_hebdomadaire;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public double calcul_paie() {
        super.salaire = montant_hebdomadaire * 4 + prime;
        return super.salaire;
    }

}
