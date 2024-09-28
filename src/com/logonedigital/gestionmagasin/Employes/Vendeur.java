package com.logonedigital.gestionmagasin.Employes;

public class Vendeur extends Employes {
    private double tauxDeVente ;

    public Vendeur(){

    }

    public  Vendeur(String idE , String nomE , String adE, int nbHeures , double TDV) {
        super(idE, nomE, adE, nbHeures);
        this.tauxDeVente = TDV ;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public void afficher() {
        System.out.print( "ID employé : " + super.getIdEmploye());
        System.out.println("Nom employé : " + super.getNomEmploye());
        System.out.println("Adresse employé : " + super.getAdresseEmploye());
        System.out.println("Nombre d'heures : " + super.getNbHeuresParMois());
        System.out.println("Taux de vente : " + this.tauxDeVente);
    }

    public double calculerSalaire() {
        return 810000* getTauxDeVente() / 100 ;
    }

    public void afficerSalaire() {
        System.out.println("Salaire : " + calculerSalaire());
    }
}