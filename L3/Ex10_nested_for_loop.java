public class Ex10_nested_for_loop {
    public static void main(String[] args) {
        int n = 5; // size of the triangle

        // 1. Top-Left Triangle
        System.out.println("Top-Left Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 2. Bottom-Left Triangle
        System.out.println("Bottom-Left Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 3. Top-Right Triangle
        System.out.println("Top-Right Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 4. Bottom-Right Triangle
        System.out.println("Bottom-Right Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
