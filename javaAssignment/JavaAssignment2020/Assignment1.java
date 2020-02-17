/*
Create a java program to search through the home directory and look for files that match a regular expression. The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.

Provide appropriate documentation and comments on your code.
 */

import java.io.*;
import java.util.regex.*;
class Assignment1
{
    static String s;
    static Pattern pattern;
    public static void search(String path,String regex)
    {
        File folder = new File(path);
        pattern = Pattern.compile(regex);
       // String result="not found";
        for(File file:folder.listFiles())
        {

            if(file.isFile() && pattern.matcher(file.getName()).matches())
                System.out.println(file.getAbsolutePath());

                //return file.getAbsolutePath();
            else if(file.isDirectory())
                search(file.getAbsolutePath(),regex);
        }


    }
    public static void main(String []args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Enter the regex to search (CTRL+C to quit): ");
            String regex = br.readLine();
            search(System.getProperty("user.home"),regex);
        }
    }
}