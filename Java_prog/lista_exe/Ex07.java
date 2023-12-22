import java.util.Scanner;

public class Ex07 {

    public static double triangulo(double lado1, double lado2, double lado3){
        int lados = 0;

        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            lados = 1;
        }else{
            lados = 2;
        }

        return lados;
    }

    public static double tipo(double lado1, double lado2, double lado3){
        int type = 0;
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros para os lados do triangulo!");
        System.out.println("Digite 1 valor: ");
        lado1 = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        lado2 = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        lado3 = teclado.nextInt();
        teclado.close();*/


        if (lado1 == lado2 && lado1 == lado3) {
            type = 1; //Equilatero
        } else {
            if ((lado1 = lado2) != lado3 || (lado2 = lado3) != lado1 || (lado1 = lado3) != lado2) {
            type = 2; //Isoceles 
            }else{
            type = 3; //Escaleno
            }
        }
        return type;
    }

    public static void main(String[] args) {
        double a, b, c, ok, type;

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
        type = tipo(a, b, c);

        if (ok == 1) {
            System.out.println(a+","+b+","+c+" - Estes valores não fazem um triangulo.");
        } else {
                System.out.println(a+" - "+b+" - "+c+" - Estes valores fazem um triangulo.");
                tipo(a,b,c);
                if (type==1) {
                    System.out.print(" Do tipo Equilatero.");
                } if (type==2) {
                    System.out.print(" Do tipo Isoceles.");
                } else {
                    System.out.print(" Do tipo Escaleno.");
                } 
        }
       
    }
    
}
/* Codificar um programa em Java para o seguinte problema: Ler três números e apresentar se os números podem ser ou não ser lados de um triângulo. Caso seja um triângulo, classifica-o segundo os seus lados.
 */