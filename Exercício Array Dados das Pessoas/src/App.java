import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão inseridas? ");

        int n = sc.nextInt();
        int x = 0;

        double menorAltura = 0;
        double maiorAltura = 0;
        double media = 0;
        int somaHomens = 0;
        int somaMulheres = 0;
        double somaAlturaMulheres = 0;

        double vetAltura[] = new double[n];
        String vetGen[] = new String[n];

        for(int i = 0; i < n; i++){
            x++;
            System.out.print("Altura da "+ x + "ª pessoa: ");
            vetAltura[i] = sc.nextDouble();
            System.out.print("Gênero da "+ x +"ª pessoa: (f / m) " );
            vetGen[i] = sc.next();
        }

        menorAltura = vetAltura[0];
        maiorAltura = vetAltura[0];

        for(int i = 1; i < n; i++){
            if(vetAltura[i] > maiorAltura) {
                maiorAltura = vetAltura[i];
            }

            if(vetAltura[i] < menorAltura){ 
                menorAltura = vetAltura[i];}
        }

        for(int i = 0; i < n; i++){
            if(vetGen[i].equals("m")) {
                somaHomens++;
            } 

            //Aqui vale o comentário, eu coloquei o cálculo da média dentro do IF, assim protegemos a função de não acabar dividino um valor por zero acidentalmente. Se não houver mulheres no Array, ele não entra no IF.

            if(vetGen[i].equals("f")){
                somaAlturaMulheres = somaAlturaMulheres + vetAltura[i];
                somaMulheres++;
                media = somaAlturaMulheres / somaMulheres;
            }
        }

        System.out.println(" ");
        System.out.println("Menor altura: "+ menorAltura + "\n");
        System.out.println("Maior altura: "+ maiorAltura + "\n");
        System.out.printf("Média altura mulheres: %.2f\n", media);
        System.out.println(" ");
        System.out.println("Número de homens: "+ somaHomens);

        sc.close();
    }
}
