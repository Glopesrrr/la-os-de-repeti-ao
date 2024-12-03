import java.util.Scanner;

public class ReajusteSalarial {

    public static void main(String[] args) {
        // Scanner para receber o salário do colaborador
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do salário do colaborador
        System.out.print("Informe o salário do colaborador: R$ ");
        double salario = scanner.nextDouble();
        
        // Inicializa as variáveis para o aumento percentual e o valor do aumento
        double aumentoPercentual = 0;
        double aumento = 0;
        double novoSalario = salario;
        
        // Definindo o aumento de acordo com o salário
        if (salario <= 280.00) {
            aumentoPercentual = 0.20; // 20%
        } else if (salario > 280.00 && salario <= 700.00) {
            aumentoPercentual = 0.15; // 15%
        } else if (salario > 700.00 && salario <= 1500.00) {
            aumentoPercentual = 0.10; // 10%
        } else {
            aumentoPercentual = 0.05; // 5%
        }
        
        // Calculando o aumento
        aumento = salario * aumentoPercentual;
        
        // Calculando o novo salário após o aumento
        novoSalario = salario + aumento;
        
        // Inflação de 3.8%
        double inflacao = 0.038;
        
        // Calculando o aumento real, descontando a inflação
        double aumentoReal = aumento - (aumento * inflacao);
        
        // Exibindo as informações solicitadas
        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + (aumentoPercentual * 100) + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);
        System.out.println("Valor do aumento real, descontado a inflação: R$ " + aumentoReal);
        
        // Fechar o scanner
        scanner.close();
    }
}