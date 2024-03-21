import java.util.Locale;
import java.util.Scanner;

public class App05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double  r, q, t = 3.14159;
        r = sc.nextDouble();
        q = r * t *t;
        System.out.printf("q=%.4f%n", q);

        sc.close();
    }
}


