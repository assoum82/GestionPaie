
package gestionpaie;

/**
 *
 * @author pro
 */
public class Employe {

    protected String nom;
    protected String job;
    protected double salaire;

    public Employe(String nom, String job) {
        this.nom = nom;
        this.job = job;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getNom() {
        return nom;
    }

    public String getJob() {
        return job;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double calcul_paie() {
        return salaire;
    }

    public void cheque_de_paie() {
        System.out.println("Payer à l'ordre de " + this.nom +
                " (" + this.job + "): "
                + salaire + " DA");
    }
}
