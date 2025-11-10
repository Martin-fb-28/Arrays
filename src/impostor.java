import java.util.Random;
import java.util.Scanner;
public class impostor {
    public static void main(String[] args) {
        String[] personajes = {"Diddy", "Manolo", "Agustín", "Julio", "Kai Cenat", "Duke"};
        Random random = new Random();
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < personajes.length; i++) {
            System.out.println("Los jugadores en la partida son: " + personajes[i]);
        }
            int impostor = random.nextInt(6);
            System.out.println("\n¿Quién crees que es el impostor?");
            String adivina = lector.nextLine();
            if(adivina.equals(personajes[impostor])){
                System.out.println("Has acertado, el impostor es: " + personajes[impostor]);
            }else{
                System.out.println("Has fallado, el impostor no era " + adivina + " , sino que era: " + personajes[impostor]);
            }
        int fin = random.nextInt(2) + 1;
            if(fin == 1){
                System.out.println("El impostor era: " + personajes[impostor] + ". Ha ganado la partida.");
            }else{
                System.out.println("El impostor era: " + personajes[impostor] + ". Lo han pillado y ha perdido.");
            }

    }
}
