import java.util.Locale;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o modelo do veículo");
        String modelo;
        modelo = sc.nextLine();
        System.out.println("Digite o valor do preço de fábrica");
        double prec_fabric;
        prec_fabric = sc.nextDouble();
        double imp = prec_fabric * 0.45;
        double revend = prec_fabric * 0.28;
        double prec_ven = prec_fabric + imp + revend;
        System.out.println(modelo);
        System.out.println("$" + prec_fabric);
        System.out.println();
        System.out.printf("O " + modelo + " custa $" + "%.2f", prec_ven);
        sc.close();
    }

}
