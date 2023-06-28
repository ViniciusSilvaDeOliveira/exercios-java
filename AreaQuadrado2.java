import java.util.Scanner;

public class AreaQuadrado2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ladoQuadrado;
        double area;
        double perimetro;

        System.out.print("Informe o lado do quadrado: ");
        ladoQuadrado = entrada.nextDouble();

        area = Math.pow(ladoQuadrado, 2);
        perimetro = ladoQuadrado * 4;

        System.out.println("A área do quadrado é " + area);
        System.out.println("O perímetro do quadrado é " + perimetro);

        entrada.close();
    }
}
