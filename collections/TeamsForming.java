// https://codeforces.com/problemset/problem/1092/B

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class TeamsForming {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        byte n;
        do{
            System.out.println("What is the numbers of students? n is even and 2 <= n =< 100");
            n = input.nextByte();
        }while(n < 2 || n > 100 || n % 2 != 0);

        Vector<Byte> skill_vector = new Vector<Byte>();
        byte skill;
        for(byte i = 0; i < n; i++){
            System.out.println("Skill of the " + (i+1) + "º student:");
            skill= input.nextByte();
            skill_vector.add(skill);
        }

        Collections.sort(skill_vector);

        int total_difference = 0;
        for(byte i = 0; i < skill_vector.size(); i++){
            int difference = Math.abs(skill_vector.get(i) - skill_vector.get(i+1));
            total_difference += difference;
            i++;
        }

        System.out.println("Minimum number of problems to be solved: " + total_difference);

        input.close();

    }
}
