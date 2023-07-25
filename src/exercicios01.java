import java.util.Scanner;

public class exercicios01 {

    public static void main(String[] args) {
        
        float[][] notas = new float[50][2];
        float[] media = new float[50];
        String[] nomes = new String[50];
        float medias, maiorMedia = -1, menorMedia = 99999999;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Aluno " + (i+1) + " nota N" + (j+1) + ": ");
                notas[i][j] = Float.parseFloat(sc.nextLine());
            }
        }    

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 2; j++) {
                media[i] = notas[i][j] + media[i];
                if (j == 2) {
                    media[i] = media[i]/2;
                }
            }
            
        }

        for (int i = 0; i < 50; i++) {
            if (maiorMedia < media[i]) {
                    
                maiorMedia = media[i];
                
            }
            
            if (menorMedia > media[i]) {
                
                menorMedia = media[i];
            }
        }

        sc.close();

        System.out.println("Maior média: " + maiorMedia );
        System.out.println("Menor média: " + menorMedia);
    }

}
