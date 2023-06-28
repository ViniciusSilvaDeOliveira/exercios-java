import java.util.Scanner;

public class CalLataOleo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio;
        double altura;
        double pi = 3.14;
        double volume;

        System.out.print("Informe o raio do cilindro: ");
        raio = entrada.nextDouble();

        System.out.print("Informe a altura do cilindro: ");
        altura = entrada.nextDouble();

        volume = (Math.pow(raio, 2)) * pi * altura ;

        System.out.print("O volume do cilindro é " + volume);

        entrada.close();
    }
}
