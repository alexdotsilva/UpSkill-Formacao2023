import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int numero, a=0, b=1, c, i=2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero = ler.nextInt();
        ler.close();
        if (numero<0) {
            System.out.println("Numero deve ser positivo e maior que zero.");
        if (numero == 0) {
            System.out.print("Fibonacci:"+a+","+b+",");
        }}
        else {
            System.out.print("Fibonacci:"+a+","+b+",");
            while (i<numero) {
                c = a + b;
                a = b;
                b = c;
                i++;
                System.out.print(c+",");
            }
        }
    }
}    

/* In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.  */
