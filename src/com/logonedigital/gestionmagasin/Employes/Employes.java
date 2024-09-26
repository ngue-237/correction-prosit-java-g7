package com.logonedigital.gestionmagasin.Employes;

public class Employes {
    private String idEmploye ;
    private String nomEmploye;
    private String adresseEmploye;
    private int nbHeures;


    public Employes() {
    }

    public Employes(String idE , String nomE , String adE , int nbHeures ) {
        this.idEmploye = idE ;
        this.nomEmploye = nomE ;
        this.adresseEmploye = adE ;
        this.nbHeures = nbHeures ;
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

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }
}
