import java.util.Scanner;

public class Area1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.print("Informe a base do retângulo: ");
        base = entrada.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        altura = entrada.nextDouble();

        if(base == altura) {
            System.out.println("As medidas que está informando é de um quadrado!!!");
        }else {
            area = base * altura;
            System.out.println("A área do retângulo é " + area);
        }

        entrada.close();
    }
}