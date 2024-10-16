public class Magasin {
    private int id ;
    private String adresse ;
    private int capaciteMagasin ;
    protected String ensembleProduits ;

    public Magasin() {

    }

    public Magasin(int id , String adresse , int capaciteMagasin ) {
        this.id = id ;
        this.adresse = adresse;
        this.capaciteMagasin = capaciteMagasin;
    }
    public void visualiser() {
        System.out.println("ID: " + this.id);
        System.out.println("Adresse: " + this.adresse);
        System.out.println("Capacité: " + this.capaciteMagasin);
    }
}
