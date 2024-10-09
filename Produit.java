package logonedigital.gestionmagasin.model;

public class Produit {
        private int identifiant;
        private double prix;
        private String libelle;
        public Produit(int identifiant, String libelle, double prix){
            this.libelle= libelle;
            this.prix=prix;
            this.identifiant=identifiant;
        }

    public int getIdentifiant() {
        return identifiant;
    }
    public String getLibelle() {
            return libelle;

        }
        public double getPrix() {
            return prix;
        }
        public void setPrix() throws PrixNegativeException {
            if (prix>= 0){
                this.prix=prix;
            } else {
                throw new PrixNegativeException("le prix d'un produit ne peut pas etre negatif");
            }
            this.prix=prix;
        }
}
