package employe;

public class Responsable extends Employe{
    private double prime;

    public Responsable() {
        super();
    }

    public Responsable(int idEmploye, String nom, String adresse, int nbHeures, double prime) {
        super(idEmploye, nom, adresse, nbHeures);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public double calculeSalaireResponsable(){
        double salaireNormal = (this.nbHeures*2000)+this.prime;

        if(this.getNbHeures() > 160)
        {
            return salaireNormal + (this.nbHeures-160)*2400;
        }

        return salaireNormal;
    }
}
