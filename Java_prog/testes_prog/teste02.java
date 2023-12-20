import java.util.Scanner;

public class teste02 {
    public static int fatorial(int num){

        int resultado_fatorial;

        if (num == 1) {
            return 1;            
        }else{
             resultado_fatorial = num * (fatorial(num-1)); // programa recorrente, chama o metodo dentro do próprio para fazer o calculo.
             return resultado_fatorial;
        }

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int rec1;
        System.out.print("Digite 1 número para o fatorial: ");
        rec1 = ler.nextInt();
        ler.close();
        System.out.println("Fatorial: "+fatorial(rec1));
        }
}
