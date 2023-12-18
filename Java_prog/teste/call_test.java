import java.util.*;
public class call_test {
    static void myMethod(){
        String palavra;
        Scanner lerteclado = new Scanner(System.in); 
        System.out.println("Digite uma palavra:"); palavra = lerteclado.next();
        System.out.println("A palavra digitada foi :"+palavra);
    }    
    public static void main(String[] args) {
        call_test();
    }
}
