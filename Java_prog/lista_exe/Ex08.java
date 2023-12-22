import java.util.Scanner;
import java.lang.Math;


public class Ex08 {
//ler tres numeros e apresentar se os numeros podem ou nao ser triangulos, se forem, classifica-os segundo os lados
    public static void main(String args[]){

        double a,b,c;
        double x,y,z;
        double a1,b1,c1;
        // int i=0;
        Scanner ler = new Scanner(System.in); //declaramos a variavel como sanner e inicializamos com o valor system.in
        System.out.println("Digite o numero1: ");
        a = ler.nextDouble();
        System.out.println("Digite o numero2: ");
        b = ler.nextDouble();
        System.out.println("Digite o numero3: ");
        c = ler.nextDouble();

        if(a+b>c && b+c>a && a+c>b){

            System.out.println("Os numeros podem ser lados de um triangulo");
            x=(Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2))/(-2*b*c);
            y=(Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2))/(-2*a*c);
            z=(Math.pow(c, 2) - Math.pow(a, 2) - Math.pow(b, 2))/(-2*a*b);
            a1=Math.acos(x)*(180 / Math.PI); //calcula o arccos e transforma para graus
            b1=Math.acos(y)*(180 / Math.PI);
            c1=Math.acos(z)*(180 / Math.PI);

            System.out.println(a1);
            System.out.println(b1);
            System.out.println(c1);

            if(a1==90 || b1==90 || c1==90){   
                System.out.println("É um triangulo Retângulo");
            }else{
                if(a1<90 && b1<90 && c1<90){
                    System.out.println("É um triangulo Agudo");
                }else{
                    if(a1>90 || b1<90 || c1<90){
                        System.out.println("É um triangulo Obtuso");
                    }
                }
            
        }}
        else{
            System.out.println("Os numeros nao podem ser lados de um triangulo");
        }

    }
    
}