import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");

        int contaPares;
        int n = sc.nextInt();
        int vet[] = new int[n];
        double count;

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            vet[i] = sc.nextInt();
        }
        System.out.print("Números pares: ");

        contaPares = 0;

        for(int i = 0; i < n; i++){
            count = vet[i] %2;
            if(count == 0 || count == 2){ 
                
                contaPares++;

                System.out.print(vet[i]+ " ");

            }
        }
        System.out.println(" Quantidade de números pares: "+contaPares);
        sc.close();
    }
}
