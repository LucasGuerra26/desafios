import java.util.Scanner;

public class ImpressoraInfectada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int quantidadeDeCasos = s.nextInt();
        s.nextLine();

        while (quantidadeDeCasos > 0) {
            String casoDeTeste = s.nextLine();
            int indiceDeMudança = (casoDeTeste.length()/2) - 1;
            String saidaCorreta = "";

            for (int i=indiceDeMudança; i>=0; i--) {
                saidaCorreta+=casoDeTeste.charAt(i);
            }
            for (int i=casoDeTeste.length()-1; i>indiceDeMudança; i--) {
                saidaCorreta+=casoDeTeste.charAt(i);
            }

            System.out.println(saidaCorreta);
            quantidadeDeCasos--;
        }
        s.close();
    }
}