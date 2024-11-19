import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double salaryIncome = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double servicesIncome = sc.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double capitalGainIncome = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        double medicalExpenses = sc.nextDouble();

        System.out.print("Gastos educacionais: ");
        double educationalExpenses = sc.nextDouble();

        double monthlySalaryIncome = salaryIncome / 12;
        double taxSalaryIncome = 0.00;
        double taxServicesIncome = 0.00;
        double taxCapitalGainIncome = 0.00;

        if (monthlySalaryIncome >= 3000.00 && monthlySalaryIncome < 5000.00) {
            taxSalaryIncome += salaryIncome * 0.10;
        } else if (monthlySalaryIncome >= 5000.00) {
            taxSalaryIncome += salaryIncome * 0.20;
        }

        if (servicesIncome > 0.00) {
            taxServicesIncome += servicesIncome * 0.15;
        }

        if (capitalGainIncome > 0.00) {
            taxCapitalGainIncome += capitalGainIncome * 0.20;
        }

        double taxesSum = taxSalaryIncome + taxServicesIncome + taxCapitalGainIncome;
        double maxDeductible = taxesSum * 0.3;
        double deductibleExpenses = medicalExpenses + educationalExpenses;
        double taxRebate = 0.00;

        if (maxDeductible > deductibleExpenses) {
            taxRebate = deductibleExpenses;
        } else if (maxDeductible < deductibleExpenses) {
            taxRebate = maxDeductible;
        }

        System.out.printf("%nRELATÓRIO DE IMPOSTO DE RENDA%n");

        System.out.printf("%nCONSOLIDADO DE RENDA:%n");
        System.out.printf("Imposto sobre salário: %.2f%n", taxSalaryIncome);
        System.out.printf("Imposto sobre serviços: %.2f%n", taxServicesIncome);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", taxCapitalGainIncome);

        System.out.printf("%nDEDUÇÕES:%n");
        System.out.printf("Máximo dedutível: %.2f%n", maxDeductible);
        System.out.printf("Gastos dedutíveis: %.2f%n", deductibleExpenses);

        System.out.printf("%nRESUMO:%n");
        System.out.printf("Imposto bruto total: %.2f%n", taxesSum);
        System.out.printf("Abatimento: %.2f%n", taxRebate);
        System.out.printf("Imposto devido: %.2f", taxesSum - taxRebate);

        sc.close();
    }
}