
public class Fat {
    public void fato(int numero){
        int fato;
        if(numero == 1)
        {
            return 1;
        }else
        {
            fato=numero * (fato(numero-1));
        }
    return fato(numero);
}
    public static void main(String[] args) {
        Fat fatorial = new Fat();
        fatorial.fat(2);
    }
}
   

