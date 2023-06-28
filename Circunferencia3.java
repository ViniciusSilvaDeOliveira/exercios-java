import java.util.Scanner;

public class Circunferencia3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio;
        double pi = 3.14;
        double area;

        System.out.print("Informe o raio do circulo: ");
        raio = entrada.nextDouble();

        area = pi * (Math.pow(raio, 2));

        System.out.println("A área do circulo é " + area);

        entrada.close();
    }
}
