import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int posicao;   
        double sup;
        int count;

        System.out.println("Quantos números você vai digitar: ");

        int n = sc.nextInt();
        double vet[] = new double[n];

        for(int i = 0; i < n; i++ ){

            System.out.print("Digite um número: ");
            vet[i]=sc.nextInt();
        }

        posicao = 0;
        sup = vet[0];
        count = 0;

        for(int i = 1; i < vet.length; i++){
            if(vet[i] > sup){  

                sup = vet[i];
                posicao = i;
            }
        }
        System.out.println("Maior valor: "+sup);
        System.out.println("Posição do maior valor: "+posicao);
        sc.close();
    }
}
