public class p3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int windowSize = 3;
        for (int i = 0; i < numbers.length; i++) {
            int total = 0;
            if (i + windowSize <= numbers.length) {
                for (int k = i; k < i + windowSize; k++) {
                    total = total + numbers[k];
                }
                System.out.println(
                    numbers[i] + " + " +
                    numbers[i + 1] + " + " +
                    numbers[i + 2] + " = " + total
                );
            }
        }
    }
}
