import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos terá no vetor: ");
        int n = sc.nextInt();

        int vet[] = new int[n];
        int contaPar;
        int media;
        int soma;
        int count;

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        soma = 0;
        contaPar = 0;
        count = 0;

        for(int i = 0; i < n; i++){
            contaPar = vet[i]%2;
            if(contaPar == 0 || contaPar ==2){  
                soma = soma + vet[i];
                count++;
        }
    }
    if(count > 1){
        media = soma / count;
        System.out.println("Média dos Pares: "+ media);
    }else{
        System.out.println("Nenhum par encontrado!");
        }
    }
}
