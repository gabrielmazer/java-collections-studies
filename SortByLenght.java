//
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
import java.io.IOException;


class SortByLenght {

    static class Comp implements Comparator<String> {
        public int compare(String str1, String str2){
            return Integer.compare(str1.length(), str2.length());
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int N;

        do{
            N = input.nextInt();
        }while(1 > N || N > 50);
        input.nextLine();

        for(int i = 0; i < N; i++){
            String frase = input.nextLine();
            String pals[] = frase.split(" ");
            List<String> palavras = Arrays.asList(pals);
            palavras.sort(new Comp().reversed());
            Iterator<String> ite = palavras.iterator();

            while(ite.hasNext()){
                System.out.print(ite.next() + " ");
            }
            System.out.println();
        }
        input.close();
    }

}