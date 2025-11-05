public class App {

    public App(){
        int vetor[] = new int[10];

        for(int i=0; i < vetor.length; i++)
        {
            vetor[i] = i * 10;
        }

        for(int i=0; i < vetor.length; i++)
        {
            System.out.println("Posção"+i+" valor: "+ vetor[i]);
        }

        for(int i=0; i < vetor.length; i++)
        {
            vetor[i] = i * 3;
        }
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
