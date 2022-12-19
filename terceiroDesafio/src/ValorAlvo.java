import java.util.Scanner;

public class ValorAlvo {
    public static void main(String[] args){
        int tamanhoDoArray = 0;
        int valorAlvo = 0;
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String[] valoresDeEntrada = entrada.split(" ");

        if (valoresDeEntrada.length == 2) {
            tamanhoDoArray = Integer.parseInt(valoresDeEntrada[0]);
            valorAlvo = Integer.parseInt(valoresDeEntrada[1]);

            entrada = s.nextLine();
            String[] entradaArray = entrada.split(" ");
            int[] array = new int[tamanhoDoArray];

            if (entradaArray.length == tamanhoDoArray) {
                for (int i = 0; i < entradaArray.length; i++) {
                    array[i] = Integer.parseInt(entradaArray[i]);
                }
            }

            System.out.println(verificaValorAlvo(array, valorAlvo));

        }

        s.close();
    }
    public static int verificaValorAlvo(int[] valores, int valorAlvo){
        int quantidadeDePares = 0;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (i != j) {
                    if (valores[i]-valores[j] == valorAlvo) { quantidadeDePares++; };
                }
            }
        }
        return quantidadeDePares;
    }
}
