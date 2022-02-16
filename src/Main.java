import com.factory.Factory;
import com.types.Data;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Initialization of objects
        Data t1 = null;
        Data t2 = null;
        String choice;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println(menu());
            choice = input.next();
            switch(choice)
            {
                case "1" -> {
                    t1 = Factory.createType("string");
                    t2 = Factory.createType("string");
                }

                case "2" -> {
                    t1 = Factory.createType("binary");
                    t2 = Factory.createType("binary");
                }

                case "3" -> {
                    if (t1 != null && t2 != null)
                    {
                        System.out.println(t1.getData());
                        System.out.println(t2.getData());
                    }
                    else
                    {
                        System.out.println("Objects are empty!");
                    }
                }

                case "4" -> {
                    t1 = Factory.delete();
                    t2 = Factory.delete();
                    if (t1 == null && t2 == null)
                    {
                        System.out.println("Objects are deleted!");
                    }
                }

                case "5" -> {
                    if (t1 != null && t2 != null)
                    {
                        System.out.println(t1.operator(t2));
                    }
                    else
                    {
                        System.out.println("Objects are empty!");
                    }
                }
            }
        }
        while(!choice.equals("q"));
    }

    //static method to print menu
    public static String menu()
    {
        return  "---------------------------------------------------------------\n"+
                "Enter ( 1 ) to create a character string.\n"+
                "Enter ( 2 ) to create a binary string.\n"+
                "Enter ( 3 ) to check the data.\n"+
                "Enter ( 4 ) to delete objects.\n"+
                "Enter ( 5 ) to perform string reduction.\n"+
                "Enter ( q ) to quit.\n"+
                "---------------------------------------------------------------";
    }
}
