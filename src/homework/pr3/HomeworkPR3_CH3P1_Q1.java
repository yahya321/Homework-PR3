
package homework.pr3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class HomeworkPR3_CH3P1_Q1 {


    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        System.out.println("please insert 30 random integers from 0 to 100");
        int loop = 30;
        while (loop!=0){
        Scanner in = new Scanner(System.in);
        int insert = in.nextInt();
        if(insert >= 0 && insert <= 100){
        link.add(insert);
        }else{
            System.out.println("Only numbers between 0 and 100");
            continue;
        }
            
        loop--;
        }
        Collections.sort(link);
        System.out.println("SORTED ELEMENTS");
        float sum=0;
        for(int i = 0;i<30;i++){
            System.out.print(link.get(i)+" "); 
            sum+=link.get(i);
        }
        System.out.println("");
        System.out.println("The sum of all element = "+sum);
        float avg = sum/30;
        System.out.println("The floating-point average of the elements = "+ avg);
        
    }
    
}
