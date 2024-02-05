import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x;
        int count;
        String nomeMaisVelho;

        System.out.println("Quantas pessoas você irá inserir? ");

        int n = sc.nextInt();
        
        String vetNome[] = new String[n];
        int vetIdade[] = new int[n];

        x = 0;
        count = vetIdade[0];
        nomeMaisVelho = null;

        for(int i = 0; i < n; i++){
            x++;    
            System.out.print("Nome da "+x+"ª pessoa: ");
            vetNome[i] = sc.next();
            System.out.print("Idade: ");
            vetIdade[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++){
            if(vetIdade[i] > count){
                count = vetIdade[i];
                nomeMaisVelho = vetNome[i];
            }
        }
        System.out.println(" ");
        System.out.println("Pessoa mais velha: "+nomeMaisVelho);
        System.out.println("Idade dela: "+count);
    }
}
