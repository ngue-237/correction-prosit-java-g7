public class Magasin {
    private int id ;
    private String adresse ;
    private int capaciteMagasin ;
    protected String ensembleProduits ;

    public Magasin() {

    }

    public Magasin(int id , String adresse , int capaciteMagasin , String ensembleProduits) {
        this.id = id ;
        this.adresse = adresse;
        this.capaciteMagasin = capaciteMagasin;
        this.ensembleProduits = ensembleProduits;
    }



}
