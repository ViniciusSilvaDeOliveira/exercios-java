import java.util.Scanner;

public class DivisaoInteiros6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int num2;
        int cal;
        int cal2;

        System.out.print("Informe o primeiro número: ");
        num = entrada.nextInt();

        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextInt();

        cal = num / num2;
        cal2 = num % num2;

        System.out.println("O quociente da divisão é " + cal + " e o resto é " + cal2);

        entrada.close();
    }
}
