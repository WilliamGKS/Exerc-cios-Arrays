import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão inseridos? ");
        int n = sc.nextInt();

        double media;
        int x = 0;
        String vetNomes[] = new String[n];
        double vetNotaA[] = new double[n];
        double vetNotaB[] = new double[n];
        double count;

        for(int i = 0; i < n; i++){
            x++;
            System.out.print("Digite o nome do " + x + "º aluno: ");
            vetNomes[i] = sc.next();
            System.out.print("Digite a sua primeira nota: ");   
            vetNotaA[i] = sc.nextDouble();
            System.out.print("Digite sua segunda nota: ");
            vetNotaB[i] = sc.nextDouble();
        }
        media = 0;
        count = 0;

        System.out.println("Alunos aprovados: " );
        System.out.println(" ");

        for(int i = 0; i < n; i++){
            count = vetNotaA[i] + vetNotaB[i];
            media = count / 2;
            if(media >= 6.0){
                System.out.println(vetNomes[i] + " nota: "+media);
            }
        }
        sc.close();
    }
}
