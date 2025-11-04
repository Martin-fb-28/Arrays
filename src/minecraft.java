import java.util.Scanner;

public class minecraft {
    public static void main(String[] args){
        String[] inventario = {"Espada", "Pico", "Hacha", "Azada", "Pala"};
        for(int i = 0; i<inventario.length; i++){
            System.out.println("Tienes en tu inventario los siguientes objetos: " + inventario[i]);
        }
        System.out.println("Tienes un total de: " + inventario.length + " objetos");
    }
}
