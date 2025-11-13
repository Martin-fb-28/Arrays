import java.util.Scanner;

public class poder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] sayans = {"Goku", "Vegeta", "Broly", "Pan", "Gohan"};
        int[] poderes = {10000, 7000, 4239, 1000, 3000};
        System.out.println("Tienes los siguientes sayans: 0-Goku, 1-Vegeta, 2-Broly, 3-Pan, 4-Gohan");
            for (int i = 0; i < 1; i++) {
                System.out.println("\n¿De qué sayan quieres saber el poder?");
                int comprobar = sc.nextInt();
                if (comprobar >= 0 && comprobar <= 4) {
                    System.out.println("El poder de " + sayans[comprobar] + " es: " + poderes[comprobar]);
                } else {
                    System.out.println("No tengo datos");
                }
            }
            System.out.println("\n¿Quieres saber el poder de otro sayan o no?: ");
            System.out.println("1 = si / 2 = no");
            int respuesta = sc.nextInt();
        while (respuesta == 1) {
            for (int i = 0; i < sayans.length; i++) {
                System.out.println("\n¿De qué sayan quieres saber el poder?");
                int comprobar = sc.nextInt();
                if (comprobar >= 0 && comprobar <= 4) {
                    System.out.println("El poder de " + sayans[comprobar] + " es: " + poderes[comprobar]);
                } else {
                    System.out.println("No tengo datos");
                }
            }
        }

        int podermax = 0;
        int podermin = poderes[0];
        for(int i = 0; i < poderes.length ; i++){
            if(podermax < poderes[i]) {
                podermax = poderes[i];
            }if(podermin > poderes[i]){
              podermin = poderes[i];
            }
        }
        System.out.println("Tu sayan más poderoso es: " + podermax);
        System.out.println("Tu sayan más debil es: " + podermin);





    }
}
