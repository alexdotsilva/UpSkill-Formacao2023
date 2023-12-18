import java.util.*;
public class fatorial1 {

    public static void main(String[] args) {
        int numero, fatorial, aux;
        Scanner lerteclado = new Scanner(System.in);
        System.out.println("Digite um numero:");
        numero = lerteclado.nextInt();
        aux = numero;
        fatorial = numero;
        while (aux > 1) {
            fatorial = fatorial*(aux - 1);
            aux--;
        }
        System.out.println("O fatorial é: "+fatorial);
    }
}