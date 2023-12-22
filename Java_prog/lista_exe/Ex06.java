import java.util.Scanner;

public class Ex06 {
    public static double triangulo(double lado1, double lado2, double lado3){
        int lados = 0;

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros para os lados do triangulo!");
        System.out.println("Digite 1 valor: ");
        lado1 = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        lado2 = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        lado3 = teclado.nextInt();
        teclado.close();*/

        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            lados = 1;
        }else{
            lados = 2;
        }

        return lados;
    }

    public static void main(String[] args) {
        double a, b, c, ok;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros para os lados do triangulo!");
        System.out.println("Digite 1 valor: ");
        a = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        b = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        c = teclado.nextInt();
        teclado.close();

        ok = triangulo(a, b, c);

        /*Ex06 triangulo = new Ex06();
        ok = triangulo.triangulo(a, b, c);*/

        if (ok == 1) {
            System.out.println(a+","+b+","+c+" - Estes valores não fazem um triangulo.");
        } else {
                System.out.println(a+" - "+b+" - "+c+" - Estes valores fazem um triangulo.");
        }
       
    }
    
}

/* Codificar um programa em Java para o seguinte problema: Ler três números e apresentar se os números podem ser ou não ser lados de um triângulo. */