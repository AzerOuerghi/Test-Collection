import java.util.Map;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private TreeMap<Employe, Departement> employesDepartementsTreeMap;

    public SocieteTreeMap() {
        employesDepartementsTreeMap = new TreeMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employesDepartementsTreeMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employesDepartementsTreeMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : employesDepartementsTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " travaille dans le département " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : employesDepartementsTreeMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : employesDepartementsTreeMap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        if (employesDepartementsTreeMap.containsKey(e)) {
            System.out.println(e + " travaille dans le département " + employesDepartementsTreeMap.get(e));
        } else {
            System.out.println("L'employé n'a pas été trouvé.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employesDepartementsTreeMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employesDepartementsTreeMap.containsValue(d);
    }
}
