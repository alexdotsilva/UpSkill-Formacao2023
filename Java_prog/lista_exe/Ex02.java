import java.util.Scanner;

public class Ex02 {
    public void soma(){
        int num1, num2, total;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: "); num1 = ler.nextInt();
        System.out.print(" e agora outro numero inteiro: "); num2 = ler.nextInt();
        total = num1 + num2;
        ler.close();
        System.out.println("A soma é: "+total);

        if (total > 10) {
            System.out.println("Resultado é Superior a 10");
                }else{
            System.out.println("Resultado não é Superior a 10");
        }
    }

    public static void main(String[] args){
    Ex02 calc = new Ex02();
    calc.soma();
    }

}

/* Codificar um programa em Java que aceite dois valores numéricos inteiros e efectue a adição.
Caso o resultado seja maior do que 10, deve informar o utilizador que “Resultado é Superior a 10”; para
o caso do resultado não ser superior a 10, informar o utilizador que o “Resultado não Superior a 10”.
*/