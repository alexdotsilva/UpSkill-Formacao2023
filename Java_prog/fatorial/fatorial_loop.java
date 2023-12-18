import java.util.Scanner;

public class fatorial_loop {

    public static void main(String[] args){
        int numero, fatorial, aux;
        Scanner lerteclado = new Scanner(System.in);
        System.out.println("Inserir um número para fatorial: "); numero = lerteclado.nextInt();
        aux = numero;
        fatorial = numero;
        while (aux>1) {
            fatorial = fatorial*(aux-1);
            aux--;
        }
        System.out.println("O fatorial é: "+fatorial);

    }
}





