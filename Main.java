import java.util.Locale;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args)  {
       
        Titular1 T1 =new Titular1();
        Titular2 T2 =new Titular2();
        Titular3 T3 =new Titular3();
        Titular4 T4 =new Titular4();
        Titular5 T5 =new Titular5();
        Banco Bank = new Banco();

        Integer tiponota[]={2,10,20,50};
        int quant[]= new int[4];
        quant[0]=2;
        quant[1]=20;
        quant[2]=20;
        quant[3]=20;
        System.out.println("Antes do saque: "+Bank.getSaldoBancoTotal());
        T1.setSaque1(Bank,164,tiponota, quant);
        System.out.println("\r\nSaldo Do Titular 1: "+T1.getSaldo());
        System.out.println("\r\nDepois do saque: "+Bank.getSaldoBancoTotal());
        System.out.println("\r\nquantidade de notas de 2: "+Bank.getNota2());
        System.out.println("\r\nquantidade de notas de 10: "+Bank.getNota10());
        System.out.println("\r\nquantidade de notas de 20: "+Bank.getNota20());
        System.out.println("\r\nquantidade de notas de 50: "+Bank.getNota50());
    }
}
