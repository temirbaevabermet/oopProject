package users;

import java.util.Scanner;

public class Director {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Greetings dear Director!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 8:";
    public void menu() {
        System.out.println("1. Show a list of all coverage areas :\n" +
                "• Show customer coverage area for Bishkek\n" +
                "• Show customer coverage area for Talas\n" +
                "• Show customer coverage area for Jalal-Abad\n" +
                "• Show customer coverage area for Osh\n" +
                "• Show customer coverage area for Naryn\n" +
                "• Show customer coverage area for Issyk-Kul\n" +
                "• Show customer coverage area for Batken\n" +
                "2. Show a list of budget categories: \n" +
                "• Show marketing budget \n" +
                "• Show salary budget\n" +
                "3. Show the allocated budget for a certain category of places for marketing: \n" +
                "• Advertising in the media\n" +
                "• Internet advertising\n" +
                "• Outdoor advertising\n" +
                "• PR events\n" +
                "4. Show current funds for marketing; \n" +
                "5. Show the total budget required for the salary; \n" +
                "6. Increase the employee’s salary; \n" +
                "7. Reduce an employee’s salary; \n" +
                "8. Exit;");
    }

    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1.1")){
            choice = "Coverage percentage in Bishkek: 35%; " +
                    "Number of clients: 700k people;";
        }
        else if(getchoice.equals("1.2")){
            choice = "Coverage percentage in Talas: 15%; " +
                    "Number of clients: 300k people;";
        }
        else if(getchoice.equals("1.3")){
            choice = "Coverage percentage in Jalal-Abad: 7%; " +
                    "Number of clients: 140k people;";
        }
        else if(getchoice.equals("1.4")){
            choice = "Coverage percentage in Osh: 25%; " +
                    "Number of clients: 500k people;";
        }
        else if(getchoice.equals("1.5")){
            choice = "Coverage percentage in Naryn: 5%; " +
                    "Number of clients: 100k people;";
        }
        else if(getchoice.equals("1.6")){
            choice = "Coverage percentage in Issyk-Kul: 8%; " +
                    "Number of clients: 160k people;";
        }
        else if(getchoice.equals("1.7")){
            choice = "Coverage percentage in Batken: 5%; " +
                    "Number of clients: 100k people;";
        }
        else if(getchoice.equals("2.1")){
            choice = "Marketing budget: 250k som;";
        }
        else if(getchoice.equals("2.2")){
            choice = "Salary budget: 200k som;";
        }
        else if(getchoice.equals("3.1")){
            choice = "Advertising in the media(budget): 80k som;";
        }
        else if(getchoice.equals("3.2")){
            choice = "PR events(budget): 70k som;";
        }
        else if(getchoice.equals("3.3")){
            choice = "Outdoor advertising(budget): 30k som;";
        }
        else if(getchoice.equals("3.4")){
            choice = "Internet advertising(budget): 20k som;";
        }
        else if(getchoice.equals("4")){
            choice = "Current funds for marketing: 150k som;";
        }
        else if(getchoice.equals("5")){
            choice = "Total budget required for the salary: 300k som;";
        }
        else if(getchoice.equals("6")){
            System.out.print("Enter the name of the employee whose salary you want to increase:");
            String nameOfEmployee = scanner.next();
            System.out.print("Enter the amount of the salary bonus:");
            String bonusSalary = scanner.next();
            choice = "The surcharge has been successfully made! Current salary for this employee after bonus:";
        }
        else if(getchoice.equals("7")){
            System.out.print("Enter the name of the employee whose salary you want to reduce:");
            String nameOfEmployee = scanner.next();
            System.out.print("Enter the amount of the salary reduction:");
            String reducedSalary = scanner.next();
            choice = "Salary reduction successfully completed! Current salary for this employee after salary cut:";
        }
        else if(getchoice.equals("8")){
            choice = "The program is over, we look forward to your return!";
        }

        return choice;

    }

}
