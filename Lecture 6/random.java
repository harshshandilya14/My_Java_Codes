import java.util.Scanner;

class random {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= i + i - 1; j++) {
                System.out.print(j);
            }
            for (int j = (i - 1) * 2; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}