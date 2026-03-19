import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario("", 0, null);
            
            System.out.print("Imforme o nome do funcionário: ");
            funcionario.setNome(scanner.next());

            System.out.print("Imforme o salário do funcionário: ");
            funcionario.setSalario(scanner.nextDouble());

            double imposto = funcionario.calcularIrpf();

            System.out.printf("Funcionário: "+ funcionario.getNome() 
                                +"\nImposto devido: R$ %.2f", imposto);
            System.out.println("\nFaixa: " + funcionario.IdentificarFaixaIrpf());

        scanner.close();
    } 
}
