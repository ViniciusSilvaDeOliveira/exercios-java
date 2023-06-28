import java.util.Scanner;

public class NumeroInteiroSucessor5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int cal;

        System.out.print("Informe um número: ");
        num = entrada.nextInt();

        cal = num + 1;

        System.out.print("O sucessor do " + num + " é " + cal);

        entrada.close();
    }
}
