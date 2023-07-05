import java.util.ArrayList;
import java.util.Scanner;

public class GitPractise {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sarah");
        names.add("Peter");
        names.add("Maria");
        names.add("Meral");
        names.add("Hakan");
        names.add("Monika");
        names.add("Ahmet");
        names.add("Talha");

        Scanner scanner = new Scanner(System.in);
        boolean foundName = false;
        System.out.println("Welcome to BMW annual event!!");

        while (!foundName) {

            System.out.println("Please enter your name to entry: ");
            String searchName = scanner.next();



            if (names.contains(searchName)) {
                System.out.println(searchName + " is in the guest list :) WELCOME!");
                break;
            } else {
                System.out.println(searchName + " is not in the guest list :( Try again!");
            }
        }

    }


}
