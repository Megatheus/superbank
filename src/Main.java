import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        Animal animal =  new Animal("null", "null");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a raça do animal: ");
        String raca = teclado.nextLine();
        System.out.println("Digite a origem do animal: ");
        String origem = teclado.nextLine();

        insereAnimal(raca, origem);

    }

        public static String insereAnimal(String raca, String origem) {

            List<Animal> lista = new ArrayList<>();
            lista.add(new Animal(raca, origem));
            return lista.toString();

    }
        
}


