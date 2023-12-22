import java.util.Scanner;

public class Ex19 {
public static int sort_numbers(int num){
    int resultado = 0;

    if (num >= 100 && num <=200) {
        resultado = 1;
    }else {
        resultado = 0;
    }

    return resultado;
}

public static void main(String[] args) {
    int num1, aux, parada=1, contador=0;
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um número:");
    num1 = ler.nextInt();
    aux = sort_numbers(num1);

    while (parada != 0) {
            contador = contador +aux;
            System.out.println("Saida: "+contador);
            System.out.println("Digite um número:");
            num1 = ler.nextInt();
            aux = sort_numbers(num1);
            parada = num1;
        }
        System.out.println("O programa acabou.");
        ler.close();
    }
}
    


/* Codificar um programa em Java para o seguinte problema: Entrar vários números e informar
quantos números entre 100 e 200 foram inseridos. Quando o valor 0 (zero) for introduzido, o algoritmo
deverá cessar a sua execução. */
