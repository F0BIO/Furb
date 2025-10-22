import java.util.Scanner;

public class Uni5Exe09 {
    String nome, nomes18;
    int idade, qtdMais20;
    public Uni5Exe09(){
        alunosIdade();
    }
    public static void main(String[] args) {
        new Uni5Exe09();
    }

    private void alunosIdade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe n:");
        int n = sc.nextInt();

        if (n % 1 != 0 && n < 0) {
            System.out.println("Número inválido.");
            System.out.print("n deve ser inteiro maior que 0: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++){
            System.out.println("Informe o nome é a idade do "+i+"º aluno repectivamente: ");
            nome = sc.next();
            idade = sc.nextInt();

            if (idade == 18){
                if (nomes18 == null){
                    nomes18 = nome;
                }
                else{
                    nomes18 += ", " + nome;
                }
            }
            if (idade > 20) {
                qtdMais20++;
            }

        }
        System.out.println("Nomes dos alunos que tem 18 anos:" + nomes18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + qtdMais20);
        sc.close();
    }
}
