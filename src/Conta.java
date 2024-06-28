import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor de energia consumida
        System.out.print("Digite o valor de energia consumida (kWh): ");
        double energiaConsumida = scanner.nextDouble();

        // Solicita o valor da tarifa
        System.out.print("Digite o valor da tarifa (R$/kWh): ");
        double tarifa = scanner.nextDouble();

        // Calcula o valor da conta
        double valorDaConta = energiaConsumida * tarifa;

        // Exibe o valor da conta
        System.out.println("O valor da conta a ser paga é: R$ " + valorDaConta);

        scanner.close();
    }
}
