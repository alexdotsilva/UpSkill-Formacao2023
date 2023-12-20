import java.util.Scanner;
public class Ex05 {

    public static void main(String[] args) {
        float num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite 3 números para ordernar [1]: ");
        num1 = teclado.nextFloat();
        System.out.print("Digite 3 números para ordernar [2]: ");
        num2 = teclado.nextFloat();
        System.out.print("Digite 3 números para ordernar [3]: ");
        num3 = teclado.nextFloat();
        
        if (num1<num2 && num2<num3) {
            System.out.println(num1+","+num2+","+num3);
        }if (num3<num2 && num2<num1) {
            System.out.println(num3+","+num2+","+num1);
        }if (num1<num3 && num3<num2) {
            System.out.println(num1+","+num3+","+num2);
        }if (num2<num3 && num3<num1) {
            System.out.println(num2+","+num3+","+num1);
        }if (num2<num1 && num1<num3) {
            System.out.println(num2+","+num1+","+num3);
        }if (num3<num1 && num1<num2) {
            System.out.println(num3+","+num1+","+num2);
        }else{
            System.out.println("Há números repetidos.");
        }

    }
    
}

/* Codificar um programa em Java para o seguinte problema: Entrar com três números e apresentá-los em ordem decrescente (considere que os números são distintos). */

/*
float: num1, num2, num3
inicio
escreva("Digite 3 numeros:")
leia(num1)
leia(num2)
leia(num3)

se(num1<num2 && num2<num3)
    escreva(num1+","+num2+","+num3)
se(num3<num2 && num2<num1)
    escreva(num3+","+num2+","+num1)
se(num1<num3 && num3<num2)
    escreva(num1+","+num3+","+num2)
se(num2<num3 && num3<num1)
    escreva(num2+","+num3+","+num1)
se(num2<num1 && num1<num3)
    escreva(num2+","+num1+","+num3)
se(num3<num1 && num1<num2)
    escreva(num3+","+num1+","+num2)
else (escreva(há numeros repetidos))


 */