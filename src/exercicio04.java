import java.util.Scanner;

public class exercicio04 {
    
    public static void main(String[] args) {
        
        char[][] text = new char[1000][80];

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 80; j++) {
                text[i][j] = sc.next().charAt(0);
                System.out.println(text[i][j]);
                if (j == 10) {
                    break;
                }
            }
            if (i == 1) {
                break;
            }
        }



        sc.close();

    }
}
