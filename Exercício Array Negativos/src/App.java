import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");

        int n = sc.nextInt();
        int vet[] = new int[n];
        
        for(int i = 0; i < vet.length; i++){

            System.out.print("Digite o número: ");
            vet[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if (vet[i]< 0) {
                System.out.println("número(s) negativo(s): " + vet[i] );
            }

        }
        sc.close();
    }
}
