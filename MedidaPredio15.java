import java.util.Scanner;

public class MedidaPredio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double medidaTrena;
        double calculo;
        int quant;

        System.out.print("Quantas vezes foi necessário colocar a trena na sombra: ");
        quant = entrada.nextInt();

        System.out.print("Qual a medida da trena: ");
        medidaTrena = entrada.nextDouble();

        calculo = quant * medidaTrena;
        System.out.println("O prédio tem " + calculo + " metros.");

        entrada.close();
    }
}
