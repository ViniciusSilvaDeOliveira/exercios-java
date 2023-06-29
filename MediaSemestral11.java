import java.util.Scanner;

public class MediaSemestral11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double notaBimestre1;
        double nota2Bimestre1;
        double notaBimestre2;
        double nota2Bimestre2;
        double cal1;
        double cal2;
        double mediaFinal;

        System.out.print("Informe a nota da primeira prova do primeiro semestre: ");
        notaBimestre1 = entrada.nextDouble();

        System.out.print("Informe a nota da segunda prova do primeiro semestre: ");
        nota2Bimestre1 = entrada.nextDouble();

        System.out.print("Informe a nota da primeira prova do segundo semestre: ");
        notaBimestre2 = entrada.nextDouble();

        System.out.print("Informe a nota da segunda prova do segundo semestre: ");
        nota2Bimestre2 = entrada.nextDouble();

        cal1 = (notaBimestre1 + nota2Bimestre1)/ 2;
        cal2 = (notaBimestre2 + nota2Bimestre2)/ 2;

        mediaFinal = (cal1 + cal2)/ 2;

        System.out.println("A média semestral desse aluno é " + mediaFinal);

        entrada.close();
    }
}
