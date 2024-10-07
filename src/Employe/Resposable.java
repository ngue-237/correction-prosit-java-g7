package Employe;

public class Resposable extends Employe{
    private double prime;

    public Resposable() {
        super();
    }

    public Resposable(int idEmploye, String nom, String adress, int nbHeure) {
        super(idEmploye, nom, adress, nbHeure);
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }
    public double calculeSalaireResponsable(){
        double salaireNormal = (this.nbHeure*2000)+this.prime;

        if(this.getNbHeure() > 160)
        {
            return salaireNormal + (this.nbHeure-160)*2400;
        }

        return salaireNormal;
    }
}

