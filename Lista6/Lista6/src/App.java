import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Imóvel ===");

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Área (m²): ");
        int area = Integer.parseInt(scanner.nextLine());

        System.out.print("Finalidade (RESIDENCIAL / COMERCIAL / INDUSTRIAL): ");
        String finalidadeInput = scanner.nextLine().toUpperCase();
        Finalidade finalidade = Finalidade.valueOf(finalidadeInput);

        System.out.print("Nome do Bairro: ");
        String nomeBairro = scanner.nextLine();

        System.out.print("Coeficiente do Bairro: ");
        double coeficiente = Double.parseDouble(scanner.nextLine());

        Bairro bairro = new Bairro(nomeBairro, coeficiente);

        Imovel imovel = new Imovel(endereco, area);
        imovel.setBairro(bairro);
        imovel.setFinalidade(finalidade);

        double iptu = imovel.calcularIptu();

        System.out.println("\n=== Resultado ===");
        System.out.println("Endereço: " + imovel.getEndereco());
        System.out.println("Bairro: " + bairro.getNome());
        System.out.println("Finalidade: " + finalidade);
        System.out.println("Área: " + area + " m²");
        System.out.println("IPTU: R$ " + iptu);


        scanner.close();
    }
}

