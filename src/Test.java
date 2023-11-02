import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        HashMap hash=new HashMap();

        hash.put(2,"nom1");

        hash.put("test","AL2");
        hash.put(2,"nom2");

        hash.put("test","AL3");
        hash.put(5.2,"AL3");

        System.out.println(hash.size());
        System.out.println(hash);

        HashMap<Etudiant,String> hashmap1=new HashMap<>();
        Etudiant et1=new Etudiant(1,"nom1","prenom1");
        Etudiant et2=new Etudiant(2,"nom2","prenom2");
        Etudiant et3=new Etudiant(3,"nom3","prenom3");
        Etudiant et4=new Etudiant(3,"nom3","prenom3");

        hashmap1.put(et2,"AL2");
        hashmap1.put(et3,"AL1");
        hashmap1.put(et1,"AL2");
        hashmap1.put(et1,"AL5");

        hashmap1.put(et4,"AL4");

        System.out.println(hashmap1);
        System.out.println(hashmap1.size());


        System.out.println(hashmap1.containsKey(et1));
        System.out.println(hashmap1.containsValue("AL1"));
        System.out.println(hashmap1.remove(et4));
        System.out.println(hashmap1.get(et1));

        String str=hashmap1.get(et1);
        //parcours des clés
        //parcous des valeurs
        //parcours des clés/valeur



    }
}
