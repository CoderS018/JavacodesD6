import java.util.HashSet;

public class p14     {
    public static void main(String[] args) {
        String[] a = {"Alice", "Bob", "Charlie", "David", "Emma"};
        String[] b = {"David", "Emma", "Frank", "Grace", "Henry"};

        HashSet<String> setA = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        HashSet<String> union = new HashSet<>();

        for (String name : a) {
            setA.add(name);
            union.add(name);
        }

        for (String name : b) {
            if (setA.contains(name)) {
                duplicates.add(name); 
            } else {
                union.add(name);     
            }
        }

        for (String duplicate : duplicates) {
            union.remove(duplicate);
        }

        System.out.println("Common names found (deleted): " + duplicates);
        System.out.println("Symmetric difference (Union without duplicates): " + union);
    }
}
    