package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam {

    private String name;
    private long transponderid;
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

        try {
            System.out.println("Please enter Transponder Id");
            long transponderid  = input.nextLong();
            store.setTransponderid(transponderid);
            System.out.println("you entered:" + store.getTransponderid());
        }
        catch (InputMismatchException e){
            System.out.println("error recieved");
        }

          /*int length = String.valueOf(transponderid).length();
        if (length = 11)
        {
            System.out.println("you entered:" + store.getTransponderid());
        }
        else {
            length = String.valueOf(transponderid).length();
            System.out.println("invalid transponder id");
        }//*/


        System.out.println("Please enter Trawler type");
        String type = input.nextLine();
        store.setType(type);
        System.out.println("you entered:" + store.getType());

    }
}
