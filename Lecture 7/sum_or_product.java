import java.util.Scanner;

class sum_or_product {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int sum = 0;
        int product = 1;
        if (c == 1) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else if (c == 2) {
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            System.out.println(product);
        } else {
            System.out.println("-1");
        }

    }
}
