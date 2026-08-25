import java.util.HashSet;
public class p16{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        // Add first array elements
        for (int i = 0; i < a.length; i++) {
            set1.add(a[i]);
        }
        // Check common elements
        for (int i = 0; i < b.length; i++) {
            if (set1.contains(b[i])) {
                intersection.add(b[i]);
            }
        }
        System.out.println("Intersection of arrays: " + intersection);
    }
}
    