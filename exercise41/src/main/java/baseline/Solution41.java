/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
import java.io.*;

public class Solution41 {

    public static void main(String[] args) throws IOException{
        //input and parse data
        Scanner in = new Scanner(new FileReader("data/exercise41_input.txt"));
        ArrayList<Person> people = new ArrayList<>();
        while(in.hasNext()) {
            String first = in.next();
            first = first.substring(0, first.length() - 1);
            String last = in.next();
            people.add(new Person(first, last));
        }
        //get sorted names
        String output = sortedNames(people);
        //print data
        PrintWriter out = new PrintWriter(new FileWriter("data/exercise41_output.txt"));
        out.println(output);
        out.close();
    }
    static String sortedNames(ArrayList<Person> people){
        //sort data
        String result = "Total of "+people.size()+" names\n-----------------\n";
        Collections.sort(people);
        for(Person i:people){
            result+=i.first+", "+i.last+"\n";
        }
        return result;
    }
}
