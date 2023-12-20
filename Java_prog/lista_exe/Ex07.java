import java.util.Scanner;

public class Ex07 {
    public void tipo(){
        int lado1, lado2, lado3;
        String type;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros para os lados do triangulo!");
        System.out.println("Digite 1 valor: ");
        lado1 = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        lado2 = teclado.nextInt();
        System.out.println("Digite 1 valor: ");
        lado3 = teclado.nextInt();

       /* if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            System.out.println("Estes valores não fazem um triangulo.");
        }else{
            if (lado1 == lado2 == lado3) {
                type= "Equilatero";
            }if ((lado1 = lado2) != lado3 || (lado2 = lado3) != lado1 || (lado1 = lado3) != lado2) {
               type= "Isoceles"; 
            }else{
                type= "Escaleno";
            }
            System.out.println("Estes valores fazem um triangulo "+type);
        }*/
    }

    public static void main(String[] args) {
        Ex06 triangulo = new Ex06();
        triangulo.triangulo();
        Ex07 tipo_triangulo = new Ex07();
        tipo_triangulo.tipo();

    }
    
}
/* Codificar um programa em Java para o seguinte problema: Ler três números e apresentar se os números podem ser ou não ser lados de um triângulo. Caso seja um triângulo, classifica-o segundo os seus lados.
 */