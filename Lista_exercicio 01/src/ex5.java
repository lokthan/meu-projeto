import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        Double x;
        x = sc.nextDouble();
        System.out.println("Digite outro número");
        Double y;
        y = sc.nextDouble();
        int din_inteira = (int) (x/y);
        System.out.printf("%.2f %n",(x*y));
        System.out.printf("%.2f %n",(x/y));
        System.out.printf("%.2f %n",(x%y));
        System.out.println(din_inteira);

        sc.close();

    }
}
