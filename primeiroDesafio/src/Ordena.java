import java.util.ArrayList;
import java.util.Scanner;

public class Ordena {
    public static void main(String[] args) {

        int quantidadeNumeros = 0;
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        quantidadeNumeros = s.nextInt();

        while (quantidadeNumeros > 0) {
            int num = s.nextInt();
            if (num % 2 == 0) {
                numerosPares.add(num);
            } else {
                numerosImpares.add(num);
            }


            quantidadeNumeros = quantidadeNumeros -1;
        }

        numerosPares.sort(null);
        numerosImpares.sort(null);

        for (int i = 0; i < numerosPares.size(); i++){
            System.out.println(numerosPares.get(i));
        }
        for (int i = numerosImpares.size()-1; i >= 0; i--){
            System.out.println(numerosImpares.get(i));
        }
    }
}
