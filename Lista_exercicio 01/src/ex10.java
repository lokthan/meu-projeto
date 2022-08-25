import java.util.Locale;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite os valores das notas A1, A2 e A3");
        double a1, a2, a3;
        a1 = sc.nextDouble();
        a2 = sc.nextDouble();
        a3 = sc.nextDouble();
        double media = (a1*2 + a2*3 + a3*5)/(2+ 3+ 5);
        System.out.printf("A média final é: "+"%.1f",media);
        sc.close();
    }
}
