import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;

public class Pokemons {
    
    Pokemons(){
        Scanner input = new Scanner(System.in);
        Set<String> poke_set = new TreeSet<>();
        int quantos_possui = 0;
        
        int N;
        do{
            N = input.nextInt();
            input.nextLine();
        }while(N < 1 || N > 1000);

        while(N-- > 0){
            poke_set.add(input.nextLine());
        }

        for(String s : poke_set){
            quantos_possui++;
        }

        input.close();
        
        System.out.println("Falta(m) "+ (151 - quantos_possui) +" pomekon(s).");
    }

    public static void main(String[] args) throws IOException {
        new Pokemons();
    }

}
