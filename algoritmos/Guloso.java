//criar matriz, escolher qual o melhor valor da primeira coluna, escolhe o menor valor entre os três possíveis da prox coluna

import java.util.Scanner;

public class Guloso {
    static Scanner input = new Scanner(System.in);
    static int[][] matriz = new int[5][6];
    static int menor, maior;

    public static void scaneia_matriz(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 6; j++){
                matriz[i][j] = input.nextInt();
            }
        }
    }



}