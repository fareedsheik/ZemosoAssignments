/*
Create main class in package yourname.assignment.main, create object of first class and call both the methods to print the values. Create object of second class using static method and then call the other method to print the String.

One or more tasks mentioned above are not possible in JAVA, comment that part of the code with block comments and add the explanation for the same.
 */
package fareed.assignment5.main;
import fareed.assignment5.data.Data;
import fareed.assignment5.singleton.Single;
public class Main
{
    public static void main(String...args)
    {
        Data data= new Data();
        Single single=Single.getObject("Fareed");
        data.getInstanceVar();
        single.getName();
    }
 }
