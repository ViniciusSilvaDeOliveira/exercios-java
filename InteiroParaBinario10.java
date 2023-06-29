import java.util.Scanner;

public class InteiroParaBinario10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        String binary;

        System.out.print("Informe um número até 32 para convertemos para binário: ");
        num = entrada.nextInt();

        binary = Integer.toBinaryString(num);

        System.out.println("A conversão de " + num + " para binário é " + binary);

        entrada.close();
    }
}
