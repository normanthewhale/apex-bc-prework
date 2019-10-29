package ZooApp;
import java.util.Scanner;

public class App {

    static void mainMenu(){
        System.out.println("1 - Create a zoo");
        System.out.println("2 - List all zoos");
        System.out.println("3 - Visit a zoo");
        System.out.println("4 - Exit");
    }

   public static void main(String[] args) {
    System.out.println("Welcome to the Zoo App!");
       Scanner input = new Scanner(System.in);
       Integer selection;
       do {
           mainMenu();
           selection = input.nextInt();
           switch (selection) {
                case 1:
                    Zoo zoo1 = new Zoo();
                    zoo1.hello();
                    break;

                case 4:
                    System.out.println("Now exiting the Zoo App.");
                    System.out.println("Goodbye!");
                    break;
           
                default:
                    System.out.println("Please enter a valid selection number.");
                    break;
           }
       } while (selection != 4);
       input.close();
   }
}