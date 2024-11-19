import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.print("Valor invalido! Favor digitar um valor positivo: ");
            n = sc.nextInt();
        }

        double weightSum = 0.00;
        String highestAthlete = "";
        double highestAthleteHeight = 0.00;
        int menQuantity = 0;
        double womenHeightSum = 0.00;
        int womenQuantity = 0;


        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Digite os dados do atleta numero %d:%n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();


            System.out.print("Sexo: ");
            char gender = sc.next().charAt(0);

            while (gender != 'F' && gender != 'M') {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                gender = sc.next().charAt(0);
            }

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            while (height <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                height = sc.nextDouble();
            }

            System.out.print("Peso: ");
            double weight = sc.nextDouble();

            while (weight <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                weight = sc.nextDouble();
            }

            weightSum += weight;

            if (gender == 'M' && (height > highestAthleteHeight)) {
                highestAthleteHeight = height;
                highestAthlete = name;
            }

            if (gender == 'M') {
                menQuantity++;
            }

            if (gender == 'F') {
                womenHeightSum += height;
                womenQuantity++;
            }
        }

        double menPercentage = ((double) menQuantity / n * 100);

        System.out.printf("%nRELATÓRIO:%n");

        System.out.printf("Peso médio dos atletas: %.2f%n", weightSum / n);
        System.out.printf("Atleta mais alto: %s%n", highestAthlete);
        System.out.printf("Porcentagem de homens: %.2f%%%n", menPercentage);

        if (womenQuantity > 0) {
            System.out.printf("Altura média das mulheres: %.2f", womenHeightSum / womenQuantity);
        } else {
            System.out.print("Não há mulheres cadastradas");
        }

        sc.close();
    }
}