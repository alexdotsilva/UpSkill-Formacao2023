import java.util.Scanner;

public class Ex06 {
    public void triangulo(){
        int lado1, lado2, lado3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros para os lados do triangulo!");
        System.out.println("Digite 1 valor: ");
        lado1 = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        lado2 = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        lado3 = teclado.nextInt();

        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            System.out.println(lado1+","+lado2+","+lado3+" - Estes valores não fazem um triangulo.");
        }else{
            System.out.println(lado1+","+lado2+","+lado3+" - Estes valores fazem um triangulo.");
        }
    }

    /*public static void main(String[] args) {
        Ex06 lados = new Ex06();
        lados.triangulo();
    } tirar os comentarios se quiser rodar sozinho*/
    
}

/* Codificar um programa em Java para o seguinte problema: Ler três números e apresentar se os números podem ser ou não ser lados de um triângulo. */