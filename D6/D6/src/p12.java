public class p12 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] numbers = {10, 20, 30};
        
        String[] merged = new String[names.length + numbers.length];
        
        for (int i = 0; i < names.length; i++) {
            merged[i] = names[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            merged[names.length + i] = String.valueOf(numbers[i]);
        }
        
        System.out.println("Merged array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
    }
}
    