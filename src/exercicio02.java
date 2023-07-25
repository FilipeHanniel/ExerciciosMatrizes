import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        
        float[][] data = new float[250][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 250; i++) {
            System.out.println("Pessoa " + (i+1) +":");
            for (int j = 0; j < 3; j++) {                
                switch (j) {
                    case 0:
                        System.out.print("Idade:");
                        data[i][j] = Float.parseFloat(sc.nextLine());
                        break;
                    case 1:
                        System.out.print("Peso:");
                        data[i][j] = Float.parseFloat(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Altura:");
                        data[i][j] = Float.parseFloat(sc.nextLine());
                        break;
                }
            }            
        }
        System.out.println("DADOS COLETADOS:");
        for (int i = 0; i < 50; i++) {
            System.out.println("Pessoa " + (i+1) +":");
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Idade:");
                        System.out.println(data[i][j]);
                        break;
                    case 1:
                        System.out.print("Peso:");
                        System.out.println(data[i][j]);
                        break;
                    case 2:
                        System.out.print("Altura:");
                        System.out.println(data[i][j]);
                        break;
                }
                
            }
            
        }

        sc.close();
    }
    
}
