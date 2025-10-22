import java.util.Scanner;

public class Menu {
    int opcaoMenu;
    Scanner sc = new Scanner(System.in);
    public Menu(){
        exibirMenu();
    }

    private void exibirMenu(){
        do{
            System.out.println("Menu de Comida");
            System.out.println("1 - Pizza");
            System.out.println("2 - Hamburguer");
            System.out.println("3 - Sushi");
            System.out.println("4 - Habibis");
            System.out.println("5 - Sair");
            opcaoMenu = sc.nextInt();
        }while(opcaoMenu != 5);
    }
    public static void main(String[] args) {
        new Menu();
    }
}
