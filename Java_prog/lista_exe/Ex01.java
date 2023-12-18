package lista_exe;
import java.util.Scanner;

public class Ex01 { // essa é a classe principal, onde todo o codigo vai ser inserido
    
    public void soma(){
        int num1, num2, total;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: "); num1 = ler.nextInt();
        System.out.print(" e agora outro numero inteiro: "); num2 = ler.nextInt();
        total = num1 + num2;
        System.out.println("A soma é: "+total);
    }

    public static void main(String[] args){
        Ex01 calc = new Ex01();
        calc.soma();
    }
    
}

/* Codificar um programa em Java que aceite dois valores numéricos inteiros e efectue a adição.
Caso o resultado seja maior do que 10, deve informar o utilizador que “Resultado é Superior a 10”.

int: num1, num2, total
inicio
escreve("Digite 2 valores inteiros para adição")
ler(num1)
ler(num2)
total=num1 + num2
escreve("A soma é:"+total)
*/