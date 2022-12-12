package ie.atu;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class exam {

    private String name;
    private int transponderid;
    private String type;

    public static void main(String[] args) {
        System.out.println("Please enter name");
        Scanner input = new Scanner(System.in);
        TrawlerApp store = new TrawlerApp();
        String name = input.nextLine();
        store.setName(name);

        if (name.length()<7 || name.length()>24)
        {
            System.out.println("Invalid name");
        }
        else {
            System.out.println("you entered:" + store.getName());
        }


        System.out.println("Please enter Transponder Id");
        int transponderid  = input.nextInt();
        store.setTransponderid(transponderid);
        System.out.println("you entered:" + store.getTransponderid());

        /*  int length = String.valueOf(transponderid).length();
        if (length = 11)
        {
            System.out.println("you entered:" + store.getTransponderid());
        }
        else {
            length = String.valueOf(transponderid).length();
            System.out.println("invalid transponder id");
        }*/


        System.out.println("Please enter Trawler type");
        String type = input.nextLine();
        store.setType(type);
        System.out.println("you entered:" + store.getType());

    }
}
