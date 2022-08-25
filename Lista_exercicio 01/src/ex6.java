import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o lado do Quadrado");
        Double lado;
        lado = sc.nextDouble();
        Double area = lado * lado;
        System.out.printf("Area: "+ "%.2f" + "M²", area);

        sc.close();

    }
}
