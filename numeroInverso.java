import java.util.Scanner;

public class numeroInverso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String num;
        String numInv = "";

        System.out.print("Por gentileza, informe um número e iremos realizar a inversão dele: ");
        num = entrada.next();

        for(int i = num.length(); i > 0; i--){
            numInv += num.substring(i - 1, i);
        }

        System.out.println("O número invertido é " + numInv);

        entrada.close();
    }
}
