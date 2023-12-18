import java.util.Scanner;

public class exAula {
    public static void main(String args[]){
        String nome;
        int idade=0;
        Scanner lerteclado= new Scanner(System.in);
        System.out.println("Nome:"); nome = lerteclado.next();
        System.out.println("Idade:"); idade = lerteclado.nextInt();
        System.out.println(nome+" tem "+idade+" anos!");
    }
    
}
