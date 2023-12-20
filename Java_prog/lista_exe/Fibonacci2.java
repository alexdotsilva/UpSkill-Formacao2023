import java.util.Scanner;

public class Fibonacci2 {
    public static int fibonacci_seq(int numero) {
        int resultado = 0;

        if (numero==0) {
            return 0;
        } if (numero==1 || numero==2) {
            return 1;
        } if (numero>=3) {
            resultado = fibonacci_seq(numero-1)+fibonacci_seq(numero-2);
            return resultado;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        if (num<0) {
            System.out.println("Digite um numero maior que 0.");
            ler.close();
        }else {
            System.out.println("O Fibonacci de "+num+" é "+fibonacci_seq(num));
        }
    }
    
}
