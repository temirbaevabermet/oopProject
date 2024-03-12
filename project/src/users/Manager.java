package users;

import Lists.ManagerList;

import java.util.Scanner;

public class Manager {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Greetings dear Manager!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 6:";
    public void menu(){
        System.out.println("1. Show list of employees;\n" +
                "2. Show to-do list;\n" +
                "3. Show a list of instructions to employees;\n" +
                "4. Show a list of all coverage areas;\n" +
                "5. Show the amount of vouchers;\n" +
                "6. Exit;");
    }
    public String getChoice(){
        ManagerList managerList = new ManagerList();
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
        else if(getchoice.equals("4")){
            choice = managerList.coverageArea();
        }
        else if(getchoice.equals("5")){
            choice = managerList.vouchers();
        }
        else if(getchoice.equals("6")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }

}
