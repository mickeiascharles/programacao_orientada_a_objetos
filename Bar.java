import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da mesa: ");
        int numeroMesa = sc.nextInt();
        sc.nextLine();

        System.out.println("\n1ª Solicitação:");
        System.out.print("Nome do produto: ");
        String produto1 = sc.nextLine();
        System.out.print("Valor do produto: R$ ");
        double valor1 = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade1 = sc.nextInt();

        System.out.println("\n2ª Solicitação:");
        System.out.print("Nome do produto: ");
        String produto2 = sc.nextLine();
        System.out.print("Valor do produto: R$ ");
        double valor2 = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade2 = sc.nextInt();

        double total1 = valor1 * quantidade1;
        double total2 = valor2 * quantidade2;
        double totalGeral = total1 + total2;

        System.out.println("\n--- RESUMO DO PEDIDO ---");
        System.out.println("Mesa nº: " + numeroMesa);
        System.out.println(produto1 + " | R$ " + valor1 + " x " + quantidade1 + " = R$ " + total1);
        System.out.println(produto2 + " | R$ " + valor2 + " x " + quantidade2 + " = R$ " + total2);
        System.out.println("TOTAL A PAGAR: R$ " + totalGeral);

        sc.close();
    }
}
