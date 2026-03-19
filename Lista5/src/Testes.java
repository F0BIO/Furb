public class Testes {
    public static void main(String[] args) {

        testar("Caso 1", new Funcionario("João", 850.00, null).IdentificarFaixaIrpf() == FaixaIrpf.PRIMEIRA);
        testar("Caso 2", igualDouble(new Funcionario("João", 850.00, null).calcularIrpf(), 0.00));

        testar("Caso 3", new Funcionario("João", 1903.98, null).IdentificarFaixaIrpf() == FaixaIrpf.PRIMEIRA);
        testar("Caso 4", igualDouble(new Funcionario("João", 1903.98, null).calcularIrpf(), 0.00));

        testar("Caso 5", new Funcionario("João", 1903.99, null).IdentificarFaixaIrpf() == FaixaIrpf.SEGUNDA);
        testar("Caso 6", igualDouble(new Funcionario("João", 1903.99, null).calcularIrpf(), 0.00));

        testar("Caso 7", new Funcionario("João", 2000.00, null).IdentificarFaixaIrpf() == FaixaIrpf.SEGUNDA);
        testar("Caso 8", igualDouble(new Funcionario("João", 2000.00, null).calcularIrpf(), 7.20));

        testar("Caso 9", new Funcionario("João", 2826.65, null).IdentificarFaixaIrpf() == FaixaIrpf.SEGUNDA);
        testar("Caso 10", igualDouble(new Funcionario("João", 2826.65, null).calcularIrpf(), 69.20));

        testar("Caso 11", new Funcionario("João", 2826.66, null).IdentificarFaixaIrpf() == FaixaIrpf.TERCEIRA);
        testar("Caso 12", igualDouble(new Funcionario("João", 2826.66, null).calcularIrpf(), 69.20));

        testar("Caso 13", new Funcionario("João", 3000.00, null).IdentificarFaixaIrpf() == FaixaIrpf.TERCEIRA);
        testar("Caso 14", igualDouble(new Funcionario("João", 3000.00, null).calcularIrpf(), 95.20));

        testar("Caso 15", new Funcionario("João", 3751.05, null).IdentificarFaixaIrpf() == FaixaIrpf.TERCEIRA);
        testar("Caso 16", igualDouble(new Funcionario("João", 3751.05, null).calcularIrpf(), 207.86));
    }

    private static void testar(String nomeTeste, boolean condicao) {
        if (condicao) {
            System.out.println(nomeTeste + " PASSOU");
        } else {
            System.out.println(nomeTeste + " FALHOU");
        }
    }

    private static boolean igualDouble(double a, double b) {
        return Math.abs(a - b) < 0.01;
    }
}
