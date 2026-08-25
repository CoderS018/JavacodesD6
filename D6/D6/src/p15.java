import java.util.HashSet;
public class p15 {
    public static void main(String[] args) {
        String[] a = {"Yash", "Prabhas", "Ranveer", "Allu", "Suriya"};
        String[] b = {"Allu", "Suriya", "Vijay", "Dhanush", "Yash"};
        HashSet<String> set = new HashSet<>();
        HashSet<String> intersection = new HashSet<>();
        // Add first array
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        // Find common names
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                intersection.add(b[i]);
            }
        }
        System.out.println("Intersection of names: " + intersection);
    }
}   