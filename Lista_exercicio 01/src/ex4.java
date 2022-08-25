import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        Double x1;
        x1 = sc.nextDouble();
        System.out.println("Digite outro número");
        Double x2;
        x2 = sc.nextDouble();
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f %n",(x1-x2));
        sc.close();
    }
}
