/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;

import java.util.*;
import java.io.*;

public class Solution42 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new FileReader("data/exercise42_input.txt"));
        ArrayList<Person> people = new ArrayList<>();
        while(in.hasNext()){
            String[] s = in.nextLine().split(",");
            people.add(new Person(s[1],s[0],Integer.parseInt(s[2])));
        }
        String output = format(people);
        System.out.println(output);
        in.close();
    }
    static String format(ArrayList<Person> data){
        String s = "Last      First     Salary\n--------------------------\n";
        for(Person p:data){
            s += String.format("%-10s%-10s%-6s\n",p.lastName,p.firstName,Integer.toString(p.salary));
        }
        return s;
    }
}
