package ZooApp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

    static void mainMenu(){
        System.out.println("1 - Create a zoo");
        System.out.println("2 - List all zoos");
        System.out.println("3 - Visit a zoo");
        System.out.println("4 - Exit");
    }

    static List<String> getNewZooInfo(){

        Scanner input = new Scanner(System.in);

        String[] questions = {"What is the name of your zoo?", 
                            "What is the street address of your zoo?",
                            "What is the city of your zoo?",
                            "What is the zip of your zoo?",
                            "What is the phone of your zoo?",
                            "What is the email of your zoo?"};

        List<String> answers = new ArrayList<String>();

        for(String i : questions){
            System.out.println(i);
            answers.add(input.nextLine());
        }
       return answers;
    }

    static Zoo createZoo(){
        List<String> info = getNewZooInfo();
        String name = info.get(0);
        String street = info.get(1);
        String city = info.get(2);
        String zip = info.get(3);
        String phone = info.get(4);
        String email = info.get(5);
        Zoo newZoo = new Zoo(name, street, city, zip, phone, email);
        return newZoo;
    }

   public static void main(String[] args) {

    System.out.println("Welcome to the Zoo App!");
       Scanner input = new Scanner(System.in);
       Integer selection;
       Zoo activeZoo;
       List<Zoo> zooList = new ArrayList<>();

       do {
           mainMenu();
           selection = input.nextInt();
           switch (selection) {
                case 1:
                    zooList.add(createZoo());
                    System.out.println("Zoo Created!");
                    break;

                case 2:
                    for (Zoo zoo : zooList) {
                        System.out.println(zoo.name);
                    }
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