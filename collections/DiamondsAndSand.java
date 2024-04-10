import java.util.Stack;
import java.util.Scanner;

class DiamondsAndSand{

    public static void main(String[] args){
        String line;
        Scanner input = new Scanner(System.in);
        int N;

        N = input.nextInt();
        input.nextLine();

        for(int i = 0; i < N; i++){
            line = input.nextLine();
            Stack<Character> objects = new Stack<>();
            int j = 0;
            int diamonds = 0;

            while(j < line.length()){
                if(line.charAt(j) == '<'){
                    objects.push(line.charAt(j));
                }
                else if(line.charAt(j) == '>' && !objects.isEmpty()){
                    objects.pop();
                    diamonds++;
                }
                j++;
            }
            System.out.println(diamonds);
        }
        input.close();
    }
}