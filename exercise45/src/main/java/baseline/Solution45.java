/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;
import java.util.*;
import java.io.*;

public class Solution45 {
    public static void main(String[] args) throws Exception{
        //input string
        System.out.println("CHECK1");
        Scanner in = new Scanner(new FileReader("data/exercise45_input.txt"));
        String data = "";
        System.out.println("CHECK");
        while(in.hasNext()){
            data+=in.nextLine()+"\n";
        }
        System.out.println(data);
        //replace occurrences [replace()]
        String output = replace(data);
        //write result to file
        PrintWriter out = new PrintWriter(new FileWriter("data/newFile.txt"));
    }

    static String replace(String data){
        //loop through all occurrences and replace add different value to string
        String result = "";
        for(int i=0;i<data.length();i++){
            if(!data.substring(i,i+7).equals("utilize")){
                result+="use";
                i+=7;
            }else{
                result+=data.charAt(i);
            }
        }
        return result;
    }
}
