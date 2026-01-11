import java.util.Locale;
import java.util.Scanner;

public class tester_001 {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salario:");
        double salario = sc.nextDouble();

        System.out.println("Digite quantas horas trabalha:");
        double horas_trabalhada = sc.nextDouble();

        double funcionario_horas_sal = salario / horas_trabalhada;

        System.out.printf(
            "Funcionario trabalha %.2f horas%nSalario: R$ %.2f%nValor da hora: R$ %.2f%n",
            horas_trabalhada,
            salario,
            funcionario_horas_sal
        );

        sc.close();
    }
}
