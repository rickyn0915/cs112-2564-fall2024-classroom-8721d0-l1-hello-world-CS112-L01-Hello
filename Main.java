import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        System.out.println("What is your name");

        String name = GetInput();

        CheckInput(name);
        NameTag nameTag = new NameTag(name);
        NameTag otherName = new NameTag("CS 112");
        NameTag thirdName = new NameTag(nameTag);

        System.out.println("Nice to meet you, " + nameTag);

        if (nameTag.equals(thirdName))
        {
            System.out.println("The name has been duplicated!");
        }
        else
     {
            System.out.println("Those aren't the same names");
        }
    }
        public static String GetInput() {
Scanner scanner = new Scanner (System.in);
String inputString = scanner.nextLine();
return inputString;
        }

        public static void CheckInput (String inputString) {
    
    }
}