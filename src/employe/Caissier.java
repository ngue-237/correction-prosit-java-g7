package employe;

public class Caissier extends Employe{
    private int numCaisse;

    public Caissier() {
        super();
    }

    public Caissier(int idEmploye, String nom, String adresse, int nbHeures, int numCaisse) {
        super(idEmploye, nom, adresse, nbHeures);
        this.numCaisse = numCaisse;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    public double calculeSalaireCaisier(){
        double salaireNormal = this.nbHeures*1000;

        if(this.getNbHeures() > 180)
        {
            return salaireNormal + (this.nbHeures-180)*1150;
        }

        return salaireNormal;
    }
}
