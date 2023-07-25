import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        char[][] text = new char[1000][80];
        String enterText;
        int countWhite = 0, countA = 0, l = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto com 80000 caracteres:");
        enterText = sc.nextLine();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 80; j++) {
              //  if (i > 0) {                
              //      l = 80 + l;
              //  }
              //  text[i][j] = enterText.charAt(l);
            }
        }
        /*
         * for (int i = 0; i < 1000; i++) {
         * for (int j = 0; j < 80; j++) {
         * if (text[i][j] == ' ') {
         * countWhite += 1;
         * } else if (text[i][j] == 'a') {
         * countA += 1;
         * }
         * }
         * }
         */
        System.out.println("Quantidade de espaços em branco = " + countWhite);
        System.out.println("Quantidade de letras 'a' = " + countA);

        sc.close();

    }
}
