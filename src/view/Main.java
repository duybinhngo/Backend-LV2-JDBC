package view;

public class Main {
    public static void main (String[] args) {
        while (true) {
        int userCase = LogIn.logIn();
        var menu = new FapMenu();
        int userChoice;
        if (userCase == 1) {
            menu.add("View information");
            menu.add("View curriculum");
            menu.add("View attendence report");
            menu.add("View mark report");
            menu.add("View academic transcript");
            menu.add("View timetable");
            menu.add("Change group");
            menu.add("Suspend one semester");
            menu.add("Change information");
            menu.add("Request to ignore attendence");
            menu.add("Log out");
            do {
            
            userChoice = menu.getUserChoice();
            System.out.println(userChoice);
            } while (userChoice != 11);
        }
        else if (userCase == 2) {
            menu.add("View timetable");
            menu.add("Check attendence");
            menu.add("Change information");
            menu.add("Change subject");
            menu.add("Change slot");
            menu.add("Enter marks");
            menu.add("Log out");
            do {
           
            userChoice = menu.getUserChoice();
            System.out.println(userChoice);
            } while (userChoice != 7);
        
        }
        else if (userCase == 3) {
            menu.add("Add account");
            menu.add("Delete account");
            menu.add("Update information base on request");

            menu.add("Log out");
            do {
            
            userChoice = menu.getUserChoice();
            System.out.println(userChoice);
            } while (userChoice != 4);
        }
    }
    }
}