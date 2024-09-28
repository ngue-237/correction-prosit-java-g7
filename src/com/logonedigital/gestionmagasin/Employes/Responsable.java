package com.logonedigital.gestionmagasin.Employes;

public class Responsable extends Employes {
    private double prime ;

    public Responsable() {
    }


    public  Responsable(String idE , String nomE , String adE, int nbHeures , double prime) {
        super(idE, nomE, adE, nbHeures);
        this.prime = prime ;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public void afficher() {
        System.out.println( "ID employé : " + super.getIdEmploye());
        System.out.println("Nom employé : " + super.getNomEmploye());
        System.out.println("Adresse employé : " + super.getAdresseEmploye());
        System.out.println("Nombre d'heures : " + super.getNbHeuresParMois());
        System.out.println("Prime : " + this.prime);
    }

    public double calculerSalaire() {
        double salaire = getNbHeuresParMois() * 2000 * prime;
        if (getNbHeuresParMois() > 160) {
            salaire += (getNbHeuresParMois() - 160) * 20000*0.2 ;
        }
        return salaire;
}
    public void afficerSalaire() {
        System.out.println("Salaire : " + calculerSalaire());
    }



}
