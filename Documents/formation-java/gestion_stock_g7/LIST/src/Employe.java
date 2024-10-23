public class Employe {
    private String salaire;
    private String matricule;
    private String nom;
    private String prenom;

    public Employe() {
    }

    public Employe(String salaire, String matricule, String nom, String prenom) {
        this.salaire = salaire;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setCIN(String CIN) {
        this.salaire = salaire;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "salaire='" + salaire + '\'' +
                ", matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
