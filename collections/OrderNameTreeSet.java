import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class OrderNameTreeSet {
    
        Set<String> conj = new TreeSet<String>();
        Scanner input = new Scanner(System.in);

        OrderNameTreeSet(){
            byte quantidade_nomes;
            do{
            System.out.println("Qual a quantidade de nome? Máximo de 127, sem repetidos:");
            quantidade_nomes = input.nextByte();
            } while(quantidade_nomes > 127);

            for(byte i = 0; i <= quantidade_nomes; i++){ // <= devido a quebra de linha em quantidade_nomes = input.nextByte();
                conj.add(input.nextLine());
            }

            for(String nome : conj){
                System.out.println(nome);
            }
        }

        public static void main(String[] args){
            new OrderNameTreeSet();
        }
}
