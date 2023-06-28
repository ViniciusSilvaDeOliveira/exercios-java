import java.util.Scanner;

public class Triangulo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado;
        double base;
        double perimetro;

        System.out.print("Informe um dos lados do triângulo: ");
        lado = entrada.nextDouble();

        System.out.print("Informe a base do triângulo: ");
        base = entrada.nextDouble();

        if(lado < 1 || base < 1){
            System.out.print("Um dos valores é negativo.");
        }else {
            perimetro = (lado * 2) + base;
            System.out.print("O perímetro do Triângulo é " + perimetro);
        }

        entrada.close();
    }
}
