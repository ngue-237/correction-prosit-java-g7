package Employe;

import java.util.Date;

public class ProduitFruit {

        int idProduit;
        String type;
        String libelle;
        double qte;
        String Saison ;

        public ProduitFruit() {
        }

        public ProduitFruit( int idProduit, String type, String libelle, double qte, String ss,) {

            this.idProduit = idProduit;
            this.type = type;
            this.libelle = libelle;
            this.qte = qte;
            this.Saison = ss;
        }


    }

