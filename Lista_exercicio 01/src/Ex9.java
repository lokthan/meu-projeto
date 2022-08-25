import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");
        System.out.println("x = ce - bf / ae - bd");
        System.out.println("y = af - cd / ae - bd");
        System.out.println("Digite o valor de 'a,b, c, d,e f'");
        Double a,b,c,d,e,f;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();
        double x = (c*e - b*f)/(a*e - b*d);
        double y = (a*f - c*d)/(a*e - b*d);
        System.out.printf("x = "+ "%.2f" + " y = "+"%.2f",x, y);
        sc.close();


    }
}
