import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da entrada inteira (pode usar vírgula):");
        String entradaInt = ler.next();
        // Tratando a vírgula: troca ',' por '.' para não dar erro no Double
        double valorInteira = Double.parseDouble(entradaInt.replace(",", "."));

        System.out.println("Digite o valor da meia-entrada:");
        String entradaMeia = ler.next();
        double valorMeia = Double.parseDouble(entradaMeia.replace(",", "."));

        System.out.println("Quantos ingressos inteiros foram vendidos?");
        int qtdInteira = ler.nextInt();

        System.out.println("Quantos ingressos de meia-entrada foram vendidos?");
        int qtdMeia = ler.nextInt();

        double totalInteira = valorInteira * qtdInteira;
        double totalMeia = valorMeia * qtdMeia;
        double totalGeral = totalInteira + totalMeia;

        // Valor médio (soma total dividida pela soma das quantidades)
        double valorMedio = totalGeral / (qtdInteira + qtdMeia);

        // 4. Saída de resultados
        System.out.println("\n--- RESULTADOS DA SESSÃO ---");
        System.out.println("Arrecadado com inteiras: R$ " + totalInteira);
        System.out.println("Arrecadado com meias: R$ " + totalMeia);
        System.out.println("Total geral arrecadado: R$ " + totalGeral);

        // Mostrar apenas 2 casas decimais no valor médio
        System.out.printf("Valor médio por ingresso: R$ %.2f%n", valorMedio);

        ler.close(); // Fecha o scanner
    }
}