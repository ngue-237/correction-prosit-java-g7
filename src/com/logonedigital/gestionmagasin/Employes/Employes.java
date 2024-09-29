package com.logonedigital.gestionmagasin.Employes;

public class Employes {
    protected String idEmploye ;
    protected String nomEmploye;
    protected String adresseEmploye;
    protected int nbHeuresParMois;


    public Employes() {
    }

    public Employes(String idE , String nomE , String adE , int nbHeures ) {
        this.idEmploye = idE ;
        this.nomEmploye = nomE ;
        this.adresseEmploye = adE ;
        this.nbHeuresParMois = nbHeures ;
    }

    public String getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(String idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getAdresseEmploye() {
        return adresseEmploye;
    }

    public void setAdresseEmploye(String adresseEmploye) {
        this.adresseEmploye = adresseEmploye;
    }

    public int getNbHeuresParMois() {
        return nbHeuresParMois;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeuresParMois = nbHeures;
    }
    public void afficher() {
        System.out.println( "ID employé : " + this.idEmploye);
        System.out.println("Nom employé : " + this.nomEmploye);
        System.out.println("Adresse employé : " + this.adresseEmploye);
        System.out.println("Nombre d'heures par mois: " + this.nbHeuresParMois);
    }
}
