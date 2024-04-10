import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;

public class OrderName {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o número de nomes? Máximo é 100: ");
        byte quantidade_nomes = input.nextByte();
        input.nextLine(); // Consumir a quebra de linha

        Vector<String> vector = new Vector<String>();
        String name;

        for(byte i = 0; i < quantidade_nomes; i++){
            name = input.nextLine();
            vector.add(name);
        }

        input.close(); // Close the Scanner

        Collections.sort(vector); // Ordenar a lista

        System.out.println(); // Pula uma linha antes da lista ordenada

        for(String nome : vector){
            System.out.println(nome);
        }
    }
}
