public class Uni5Exe11 {
    int qtdbiscoitosQuebrados, aumentoBiscoitosQuebrados = 1;

    public Uni5Exe11(){
        biscoitosQuebrados();
    }

    public static void main(String[] args) {
        new Uni5Exe11();
    }

    private void biscoitosQuebrados(){
        for(int i=1; i <= 16; i++){
            qtdbiscoitosQuebrados += 1 * aumentoBiscoitosQuebrados;
            aumentoBiscoitosQuebrados *= 3;
        }
        System.out.println(qtdbiscoitosQuebrados+" biscoitos quebrado no dia");
    }
}

