import java.util.Locale;
import java.util.Scanner;

public class Notas {
    static double valor;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        valor = s.nextDouble();

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", decompoe(100));
        System.out.printf("%d nota(s) de R$ 50.00%n", decompoe(50));
        System.out.printf("%d nota(s) de R$ 20.00%n", decompoe(20));
        System.out.printf("%d nota(s) de R$ 10.00%n", decompoe(10));
        System.out.printf("%d nota(s) de R$ 5.00%n", decompoe(5));
        System.out.printf("%d nota(s) de R$ 2.00%n", decompoe(2));

        valor = valor*100;

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", decompoe(100));
        System.out.printf("%d moeda(s) de R$ 0.50%n", decompoe(50));
        System.out.printf("%d moeda(s) de R$ 0.25%n", decompoe(25));
        System.out.printf("%d moeda(s) de R$ 0.10%n", decompoe(10));
        System.out.printf("%d moeda(s) de R$ 0.05%n", decompoe(5));
        System.out.printf("%d moeda(s) de R$ 0.01%n", decompoe(1));

        s.close();
    }
    public static int decompoe(double valorNotaMoeda) {
        int resultado = (int) (valor/valorNotaMoeda);
        valor = valor%valorNotaMoeda;
        return resultado;
    }
}
