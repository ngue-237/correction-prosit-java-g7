package logonedigital.gestionmagasin.model;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
        private int identifiant;
        private String adresse;
        private int capacite;
        private double prix;
        private Produit[] produits;

        public Magasin(int identifiant, String adresse, int capacite) {
            this.identifiant = identifiant;
            this.adresse = adresse;
            this.capacite = capacite;
            this.produits =new  Produit[2] ;
        }

    public static Magasin magasinAvecPlusDeProduit(Magasin magasin1, Magasin magasin2) {
        return null;
        }

    public boolean comparer(Produit produit) {
            for (Produit p : produits) {
                if (p.getIdentifiant() ==
                        produit.getIdentifiant() &&
                        p.getLibelle().equals(produit.getLibelle()) &&
                        p.getPrix() == produit.getPrix()) {
                    return true;
                }
            }
            return false;
        }
        public boolean comparer(Produit produit1, Produit produit2) {
            return produit1.getIdentifiant() ==
                    produit2.getIdentifiant() &&
                    produit1.getLibelle().equals(produit2.getLibelle()) &&
                    produit1.getPrix() ==
                            produit2.getPrix();
        }
            public boolean chercherProduit(Produit produit){
            return comparer(produit);
            }



        public String getidentifiant() {
            return this.getidentifiant();
        }

    public void ajouterProduit(Produit produit) throws MagasinPleinException {
        if (capacite >= produits.length) {
            throw new MagasinPleinException("Le magasin est plein !");
        }
        produits[capacite++] = produit;
    }


     /*   public void ajouterProduit(Produit produit) {
            if (!comparer(produit)) {
                if (produits.size() < capacite) {
                    boolean add = produits.add(produit);
                } else {
                    throw new IllegalStateException("le magasin est plein. impossible d'ajouter plus de produit.");
                }
            }
        }*/
        /*public void suprimerProduit(Produit produit){
            produit.remove(produit);
        }
*/
        public void afficherCaracteristique() {
            System.out.println("Identifiant" + identifiant);
            System.out.println("Adresse" + adresse);
            System.out.println("Capacite" + capacite);
            System.out.println("produits" + produits);
            for (Produit produit : produits) {
                System.out.println("-" + produit.getIdentifiant() + "(Prix:" + produit.getPrix() + ")");
            }
        }

        public double getPrix() {

            return prix;
        }


    }
