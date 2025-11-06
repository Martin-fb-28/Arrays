import java.util.Random;

public class puntuacionjuego {
    public static void main(String[] args) {
        Random random = new Random();
        int puntuacion = 0;
        int puntuaciontotal = 0;
        int media = 0;
        int record = 0;
        int numalto = 0;
        int[] partidas = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < partidas.length; i++) {
            System.out.println("\nEs la partida número: " + partidas[i]);
            puntuacion = random.nextInt(101);
            System.out.println("En esta partida ha conseguido: " + puntuacion + " puntos");
            puntuaciontotal += puntuacion;
            if (numalto < puntuacion) {
                numalto = puntuacion;
            }
            media = puntuaciontotal / partidas.length;
        }
        System.out.println("\nLa puntuación total es: " + puntuaciontotal);
        System.out.println("\nLa media de puntuacion es de: " + media + " puntos");
        System.out.println("\nLa puntuación más alta de las 6 partidas ha sido: " + numalto);


    }
}
