package Employe;

import java.util.Date;

        public class ProduitLegume {
        int idProduit;
        String type;
        String libelle;
        double qte;
        String Saison ;

        public ProduitLegume() {
        }

        public ProduitLegume(int idProduit, String type, String libelle,  double qte, String ss) {

            this.idProduit = idProduit;
            this.type = type;
            this.libelle = libelle;
            this.qte = qte;
            this.Saison = ss;
        }

        public void ajouterProduitP(){
            System.out.println("Identifiant : "+this.idProduit);
            System.out.println("Type : " + this.type);
            System.out.println("Libelle : " + this.libelle);
            System.out.println("Quantite: "+this.qte);
            System.out.println("Saison : "+this.Saison);

        }
    }
}
}
