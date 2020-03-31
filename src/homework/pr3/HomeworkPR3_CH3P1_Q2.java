
package homework.pr3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class HomeworkPR3_CH3P1_Q2 {
    
        public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> MapWord = new HashMap<String, Integer>();
        HashMap<Character, Integer> MapChar = new HashMap<Character, Integer>();    

        File text = new File("C:/Q2.txt");
        Scanner inFile = new Scanner(text);
        ArrayList<String> list = new ArrayList<>();
        while(inFile.hasNext()){
        list.add(inFile.next().toLowerCase());
        }
        for (String key :list){
            Integer occ = MapWord.get(key);
            if(occ==null){
            MapWord.put(key, 1);
            }else{
         
            MapWord.put(key, ++occ);
 
 
            }
            char[] chara = key.toCharArray();
            for (char ch : chara){
            Integer occChar = MapChar.get(ch);
            if(occChar==null){
            MapChar.put(ch, 1);
            }else{
            MapChar.put(ch, ++occChar);

            }
            }
        }
            System.out.println("The number of occurrences of each word");
            for (String key:MapWord.keySet()){
                System.out.println("The number of occurrences of \""+key+"\" = "+MapWord.get(key));
            }
            for (char key:MapChar.keySet()){
                System.out.println("The number of occurrences of \""+key+"\" = "+MapChar.get(key));
            }
            


            
        }
}
