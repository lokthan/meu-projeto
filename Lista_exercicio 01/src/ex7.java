import java.util.Locale;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento do retângulo");
        double comp;
        comp = sc.nextDouble();
        System.out.println("Digite a altura do retângulo");
        double alt;
        alt = sc.nextDouble();
        double area = comp * alt;
        System.out.printf("Área: "+"%.2f",area);
        sc.close();
    }
}
