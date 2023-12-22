import java.util.Scanner;

public class Ex04 {
    public void sort(){
        float num1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero para verificar:");
        num1 = teclado.nextFloat();
        teclado.close();
        
        if (num1 == 20) {
            System.out.println("O numero "+num1+" é igual a 20.");
        }if (num1 > 20) {
            System.out.println("O numero "+ num1 +" é maior que 20.");
        } else {
            System.out.println("O numero "+ num1 +" é menor que 20.");
        }
    }

    public static void main(String[] args) {
        Ex04 separa = new Ex04();
        separa.sort();
    }
}
/* Codificar um programa em Java para o seguinte problema: Entrar com um número real e mostrar
ao utilizador uma das seguintes mensagens: maior do que 20, igual a 20 ou menor do que 20. */