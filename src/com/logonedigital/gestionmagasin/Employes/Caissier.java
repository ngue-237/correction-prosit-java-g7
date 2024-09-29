package com.logonedigital.gestionmagasin.Employes;

public class Caissier extends Employes {
    private int numeroDeCaisse ;

    public Caissier() {

    }

    public  Caissier(String idE , String nomE , String adE, int nbHeures , int NDC) {
        super(idE, nomE, adE, nbHeures);
        this.numeroDeCaisse = NDC ;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public void afficher() {
        System.out.println( "ID employé : " + super.getIdEmploye());
        System.out.println("Nom employé : " + super.getNomEmploye());
        System.out.println("Adresse employé : " + super.getAdresseEmploye());
        System.out.println("Nombre d'heures : " + super.getNbHeuresParMois());
        System.out.println("Numero de caisse : " + this.numeroDeCaisse);
    }

    public double calculerSalaire() {
        double salaire ;
        if (this.nbHeuresParMois > 180) {
            salaire = 180*1000 + (this.nbHeuresParMois - 180) *1150 ;
         return salaire;
        } else {
            salaire = this.getNbHeuresParMois()*1000;
            return salaire;
        }
    }

     public void afficerSalaire() {
        System.out.println("Salaire : " + calculerSalaire());
     }
}
