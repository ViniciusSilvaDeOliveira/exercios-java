import java.util.Scanner;

public class DistanciaEntreOsFarois14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double distancia;
        int velocidadePermitida;
        double aceleracao;
        double conversaoMetrosKm;

        System.out.println("Vamos calcular a distância entre farois para sincronizar todos e o carro passar no verde quando chegar no próximo.");
        System.out.print("Informe a distância entre um farol e outro: ");
        distancia = entrada.nextDouble();

        System.out.print("Informe a velocidade máxima permitida na via: ");
        velocidadePermitida = entrada.nextInt();

        System.out.print("Informe o tempo que o carro leva para chegar a velocidade máxima permitida na via: ");
        aceleracao = entrada.nextDouble();

        conversaoMetrosKm = distancia/ 1000;


        System.out.print(conversaoMetrosKm);

        entrada.close();
    }
}
