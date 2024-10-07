package Employe;

public class Vendeurs extends Employe{
    private double tauxVente;

    public Vendeurs() {
        super();
    }

    public Vendeurs(int idEmploye, String nom, String adresse, int nbHeures, double tauxVente) {
        super(idEmploye, nom, adresse, nbHeures);
        this.tauxVente = tauxVente;
    }

    public double getTauxVente() {
        return tauxVente;
    }

    public void setTauxVente(double tauxVente) {
        this.tauxVente = tauxVente;
    }
}


