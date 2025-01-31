public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            if (i == 5) {
                continue; // Corrected: loop continues to next iteration
            }
            i++;
        }
    }
}