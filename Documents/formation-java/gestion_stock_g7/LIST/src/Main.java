import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //LIST
        //Creation de techDreamers
        TechDreamer td1 = new TechDreamer() ;
        TechDreamer td2 = new TechDreamer( 45335 , "Kelian" , "Mbappe") ;
        //Test des setters
        td1.setIdTechDreamer(45528) ; td1.setNomTechDreamer("Lionel"); td1.setPrenomTechDreamer("Messi");
        //test des getters
        System.out.println("TechDreamer 1 : id = " + td1.getIdTechDreamer() + " ,nom =  " + td1.getNomTechDreamer() + " ,prenom = " + td1.getPrenomTechDreamer());
        //test de la methode equal(Objet o)
        if (td1.equals(td2)){
            System.out.println("td1 et td2 sont egaux");
        } else {
            System.out.println("td1 et td2 ne sont pas égaux");
        }
        //test de toString()
        System.out.println(td1);
        System.out.println(td2);
        //creation de la liste et du vecteur techdreamer
        List<TechDreamer> techDreamerList = new ArrayList<>();
        Vector<TechDreamer> techDreamerVector = new Vector<>();
        // ajout des elements
        techDreamerList.add(td1); techDreamerList.add(td2);
        techDreamerVector.add(td1); techDreamerVector.add(td2);



    }
}