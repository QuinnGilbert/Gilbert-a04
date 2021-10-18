package baseline;

import java.util.*;
import java.io.*;

public class Solution43 {
    public static void main(String[] args) throws Exception{
        //prompt for name and author
        Scanner in = new Scanner(System.in);
        System.out.print("Site name: ");
        String name = in.nextLine();
        System.out.print("Author: ");
        String author = in.next();
        //ask if folders should be made
        System.out.print("Do you want a folder for JavaScript? ");
        boolean javascript = in.next().equals("y");
        System.out.print("Do you want a folder for CSS? ");
        boolean css = in.next().equals("y");
        //make folders
        makeFolders(name,author,javascript,css);

    }

    static void makeFolders(String name, String author, boolean javascript, boolean css) throws Exception{
        //create folders
        new File("/path/website/"+author).mkdirs();
        System.out.println("Created ./website/"+author);
        File index = new File("/website/"+author+"/+index.html");
        index.createNewFile();
        PrintWriter out = new PrintWriter(new FileWriter(index));
        out.println("<title>"+name+"</title>"+"<meta>"+author+"</meta>");
        out.close();
        System.out.println("Created ./website/"+author+"/+index.html");
        if(javascript){
            new File("/website/"+author+"/js/").mkdirs();
            System.out.println("Created "+"./website/"+author+"/js/");
        }
        if(css){
            new File("/website/"+author+"/css/").mkdirs();
            System.out.println("Created ./website/"+author+"/css/");
        }

    }

}
