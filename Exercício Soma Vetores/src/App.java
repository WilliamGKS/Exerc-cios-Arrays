import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double soma, media;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos números você vai digitar? ");
        
        int n = sc.nextInt();
        int vet[] = new int[n];


        for(int i = 0; i < vet.length; i++){

            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();

        }

        System.out.print("Valores = ");
        
        for(int i = 0; i < vet.length; i++){

            System.out.print(vet[i]+" ");

        }
        soma = 0;
        
        for(int i = 0; i < vet.length; i++){
            
            soma = soma+vet[i];

        }
         
        media = soma /n;

        System.out.print("Soma= "+soma);
        System.out.println(" Média: "+media);
        sc.close();
    }
}
