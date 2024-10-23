import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class LogoneVector<T> implements Bootcamp {
    private TechDreamer t = new TechDreamer();
    private Vector<TechDreamer> techDreamers = new Vector<>();

    @Override
    public void ajouterTechDreamer(TechDreamer e) {
        for (TechDreamer T : techDreamers) {
            System.out.println(techDreamers.add(e));
        }

    }

    @Override
    public boolean rechercherTechDreamer(TechDreamer e) {
        for (int i = 0; i < techDreamers.size(); i++ ) {
            if (this.techDreamers.equals(e))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherTechDreamer(int id) {
        for (int i = 0; i < techDreamers.size(); i++ ) {
            if (t.getIdTechDreamer() == id )
                return true;
        }
        return false;
    }

    @Override
    public void supprimerTechdreamer(TechDreamer e) {
        if (this.rechercherTechDreamer(e)) {
            for (int i = 0; i < techDreamers.size(); i++) {
                if (this.techDreamers.equals(e)) {
                    techDreamers.remove(this.techDreamers);
                    System.out.println("Produit alimentaire supprimer avec succès !");
                }
            }
        } else
            System.out.println("Ce techDreamer n'existe pas dans cette liste !");
    }

    @Override
    public void displayTechDreamer() {
        techDreamers.toString();
    }

    @Override
    public void trierTechDreamerParId() {
        List<TechDreamer> techDreamerId = techDreamers
                .stream().sorted((s1,s2)->
                        Integer.compare(s1.getIdTechDreamer(),s2.getIdTechDreamer()))
                .collect(Collectors.toList());

    }

    @Override
    public void trierTechDreamerParNom() {
        List<TechDreamer> techDreamerNames= techDreamers
                .stream().sorted().collect(Collectors.toList());


    }
}
