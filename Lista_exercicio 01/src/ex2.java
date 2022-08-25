import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome;
        nome = sc.next();
        System.out.print("Bem vindo, " + nome + "!");
        sc.close();
    }
}
