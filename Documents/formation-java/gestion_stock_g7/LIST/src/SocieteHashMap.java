import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InteerfaceSociete{
    HashMap<Integer, Employe> employes = new HashMap<>();
    HashMap<Integer, Departement> departements = new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        int i = 0;
        do {
            employes.put(i,e);
            departements.put(i, d);
            i++;
        }
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {

    }

    @Override
    public void afficherLesEmployes() {

    }

    @Override
    public void afficherDepartements(Employe e) {

    }

    @Override
    public void rechercherEmploye(Employe e) {

    }

    @Override
    public void rechercherDepartement(Departement d) {

    }
}
