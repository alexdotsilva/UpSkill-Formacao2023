import java.util.Scanner; //importa a função que rastreia os inputs como o teclado e rato

public class teste01 { //declara a classe, tudo vai acontecer aqui dentro, as declarações de metodos e o main.

    public static int soma(int soma1, int soma2){ //declaração do metodo soma, com 2 variaveis inteiras locais
        int resultado_soma; // declaração da variavel de retorno

        resultado_soma = soma1 + soma2; // o que o metodo vai fazer

        return resultado_soma; //declaração do que o metodo vai devolver.
    }

    public static void main(String[] args) { //aqui o programa vai chamar os metodos para rodar
        Scanner ler = new Scanner(System.in); // cria a variavel "ler" que recebe o que for digitado
        int num1, num2; //declaração das duas variaveis publicas do programa
        System.out.print("Digite 2 números para somar. Digite o primeiro número: "); //imprema na tela para o usuario
        num1 = ler.nextInt(); // lê o que foi digitado na variavel "ler" e envia para num1
        System.out.print("Agora digite o segundo: ");
        num2 = ler.nextInt(); // lê o que foi digitado na variavel "ler" e envia para num2
        ler.close(); //fecha a leitura do teclado
        System.out.println("A soma de "+num1+" e "+num2+" é: "+soma(num1,num2)); // imprime as variaveis chamadas e concatena com o texto. Chama o metodo soma no fim e apresenta as 2 variaveis
    }

}
