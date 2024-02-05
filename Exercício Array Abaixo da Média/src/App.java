import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n;
        double count;
        double media;

        System.out.println("Quantos elementos terá o vetor?: ");
        n = sc.nextInt();

        double vetA[] = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetA[i] = sc.nextDouble();
        }

        count = 0;
        for(int i = 0; i < n; i++){ 
            count = count + vetA[i];
        }
        media = count / n;
        System.out.println("Média do vetor: "+ media);

        System.out.println("");

        System.out.println("Números abaixo da média: ");

        for(int i = 0; i < n; i++){
            if(vetA[i] < media){
              System.out.println(vetA[i]);
            }
        }
        sc.close();
    }
}
