package Employe;

public class Employe {
    protected int idEmploye;
    protected String nom;
    protected String adress;
    protected int nbHeure;

    public Employe() {
    }

    public Employe(int idEmploye, String nom, String adress, int nbHeure) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.adress = adress;
        this.nbHeure = nbHeure;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }
}
