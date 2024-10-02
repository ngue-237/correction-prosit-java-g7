package employe;

public class Employe {
    protected int idEmploye;
    protected String nom;
    protected String adresse;
    protected int nbHeures;

    public Employe() {
    }

    public Employe(int idEmploye, String nom, String adresse, int nbHeures) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.adresse = adresse;
        this.nbHeures = nbHeures;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }


}
