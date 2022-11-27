import java.util.Scanner;

public class task1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\n\nВведите число a: ");
        int a = iScanner.nextInt();
        System.out.print("Введите число b: ");
        int b = iScanner.nextInt();

        if (b == 0) {
            System.out.println("Число " + a + " в нулевой степени = 1");
        } else if (b == 1) {
            System.out.println("Число " + a + " ^ " + b + " = " + a + " .");
        } else {
            double c = a;
            for (int i = 1; i < Math.abs(b); i++) {
                c = c * a;
            }
            if (0 < b) {
                System.out.println("Число " + a + " ^ " + b + " = " + c + " .");
            }
            if (b < 0) {
                System.out.println("Число " + a + " ^ " + b + " = " + 1 / c + " .");
            }
        }

    }
}