import java.util.Scanner;
public class captura {
    public static void main(String[] args){
        int reps = 0;
        Scanner lector = new Scanner(System.in);
        String [] pokemons = new String[5];
        while(reps<pokemons.length) {
            System.out.println("\n¿Qué pokemon has capturado?");
            String pokcap = lector.nextLine();
            System.out.println("Has capturado a: " + pokcap);
            pokemons[reps]= pokcap;
            reps ++;
        }
        System.out.println("Los pokemons que has capturado en nombre inverso son: ");
        for(int i = pokemons.length - 1; i>=0; i--) {
            System.out.println(pokemons[i]);
        }
    }
}
