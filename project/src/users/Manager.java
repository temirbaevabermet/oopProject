package users;

import java.util.Scanner;

public class Manager {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Greetings dear Manager!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 6:";
    public void menu(){
        System.out.println("1. Show list of employees;\n" +
                "2. Show to-do list;\n" +
                "3. Show a list of instructions to employees;\n" +
                "4. Show a list of all coverage areas:\n" +
                "• Show customer coverage area for Bishkek\n" +
                "• Show customer coverage area for Talas\n" +
                "• Show customer coverage area for Jalal-Abad\n" +
                "• Show customer coverage area for Osh\n" +
                "• Show customer coverage area for Naryn\n" +
                "• Show customer coverage area for Issyk-Kul\n" +
                "• Show customer coverage area for Batken\n" +
                "5. Show the amount of vouchers:\n" +
                "• Show total amount\n" +
                "• Show the amount for vouchers\n" +
                "6. Exit;");
    }
    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1")){
            choice = "Makarov Egor\n" +
                    "Kuznetsova Irina\n" +
                    "Anton Shastun";
        }
        else if(getchoice.equals("2")){
            choice = "1) Contact the hotel in Turkey;\n" +
                    "2) Sell the latest travel packages(to Thailand);\n" +
                    "3) Consult an important guest at 3pm;\n" +
                    "4) Create an excursion programm for travelling in South Korea; ";
        }
        else if(getchoice.equals("3")){
            choice = "1) Print out a list of customer service areas;\n" +
                    "2) Translate the main speech for the consul from America;\n" +
                    "3) Show the building to new employees;\n" +
                    "4) Print monthly report;";
        }
        else if(getchoice.equals("4.1")){
            choice = "Coverage percentage in Bishkek: 35%; " +
                    "Number of clients: 700k people;";
        }
        else if(getchoice.equals("4.2")){
            choice = "Coverage percentage in Talas: 15%; " +
                    "Number of clients: 300k people;";
        }
        else if(getchoice.equals("4.3")){
            choice = "Coverage percentage in Jalal-Abad: 7%; " +
                    "Number of clients: 140k people;";
        }
        else if(getchoice.equals("4.4")){
            choice = "Coverage percentage in Osh: 25%; " +
                    "Number of clients: 500k people;";
        }
        else if(getchoice.equals("4.5")){
            choice = "Coverage percentage in Naryn: 5%; " +
                    "Number of clients: 100k people;";
        }
        else if(getchoice.equals("4.6")){
            choice = "Coverage percentage in Issyk-Kul: 8%; " +
                    "Number of clients: 160k people;";
        }
        else if(getchoice.equals("4.7")){
            choice = "Coverage percentage in Batken: 5%; " +
                    "Number of clients: 100k people;";
        }
        else if(getchoice.equals("5.1")){
            choice = "Total amount of vouchers: 100;";
        }
        else if(getchoice.equals("5.2")){
            choice = "o For 1st quarter: 40;\n" +
                    "o For the 2nd quarter: 25;\n" +
                    "o For the 3rd quarter: 15;\n" +
                    "o For the 4th quarter: 20;";
        }
        else if(getchoice.equals("6")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }

}
