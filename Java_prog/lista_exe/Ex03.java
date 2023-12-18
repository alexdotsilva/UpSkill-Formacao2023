import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        int num1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre um número inteiro e verifique se é divisivel por 5. ");
        num1 = teclado.nextInt();

        if ((num1%5 != 0 || num1 == 0)) {
            System.out.println("O numero "+num1+" não é divísivel por 5.");
        }else{
            System.out.println("O numero "+num1+" é divísivel por 5.");
        }
    }
    
}

/* Codificar um programa em Java para o seguinte problema: Entrar com um número inteiro e informar o utilizador se o número lido é ou não divisível por 5 */