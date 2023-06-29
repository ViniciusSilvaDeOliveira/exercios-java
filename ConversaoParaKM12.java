import java.util.Scanner;

public class ConversaoParaKM12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double velocidadeMs;
        double cal;

        System.out.print("Por gentileza, informe o valor em m/s para convertemos em Km/h: ");
        velocidadeMs = entrada.nextDouble();

        if(velocidadeMs < 0){
            System.out.print("Velocidade abaixo de zero!!!");
        }else{
            cal = velocidadeMs * 3.6;
            System.out.println("A conversão de M/s para Km/h é " + cal);
        }

        entrada.close();
    }
}
