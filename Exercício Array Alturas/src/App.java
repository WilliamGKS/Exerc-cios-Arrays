import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitalizadas? ");

        int n = sc.nextInt();

        int x = 0;
    
        double soma, media;
        double calc;
        double porcent = 0;

        String vetNome[] = new String[n];

        int vetIdade[] = new int[n];

        double vetAltura[] = new double[n];

        soma = 0;

        for(int i = 0; i < n; i++){
            x++;
            System.out.println("Dados da "+x+ "ª pessoa:");
            System.out.print("Nome: ");
            vetNome[i] = sc.next();
            System.out.print("Idade: ");
            vetIdade[i] = sc.nextInt();
            System.out.print("Altura: ");
            vetAltura[i] = sc.nextDouble();
        }

        calc = 0;
        for(int i = 0; i < vetIdade.length; i++){

            if(vetIdade[i] < 16){             
                 calc++;   
             }
        }     

        for(int i = 0; i < n; i++){
            soma = soma + vetAltura[i];
        }

        media = soma/n;
        System.out.printf("Altura média: %.2f\n", media); 
        porcent = ((calc/n)*100);
        System.out.println("Pessoas com menos de 16 anos: "+porcent+"%");

        for(int i = 0; i < n; i++){
            if(vetIdade[i] < 16){
                System.out.println(vetNome[i]);
            }

        }
        sc.close();
    }   
}
