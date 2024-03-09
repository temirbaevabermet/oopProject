package users;

import java.util.Scanner;

public class Marketing {
    Scanner scanner = new Scanner(System.in);

    int marketBudget = 150000;
    public String greetings = "Greetings dear Marketer!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 5:";


    public void menu(){
        System.out.println("1. Show a list of categories for marketing;\n" +
                "2. Show the allocated budget for a certain category of places for marketing:\n" +
                "• Advertising in the media\n" +
                "• Internet advertising\n" +
                "• Outdoor advertising\n" +
                "• PR events\n" +
                "3. Show the total budget for marketing;\n" +
                "4. Spend your budget on promotion:\n" +
                "• Select a name for promotion:\n" +
                "i. Instagram\n" +
                "ii. Facebook\n" +
                "iii. YouTube\n" +
                "5. Exit;");
    }
    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1")){
            choice = "1) Instagram: 100k subscribers;\n" +
                    "2) Facebook: 45k subscribers;\n" +
                    "3) Youtube: 20k subscribers;";
        }
        else if(getchoice.equals("2.1")){
            choice = "Advertising in the media(budget): 80k som;";
        }
        else if(getchoice.equals("2.2")){
            choice = "PR events(budget): 70k som;";
        }
        else if(getchoice.equals("2.3")){
            choice = "Outdoor advertising(budget): 30k som;";
        }
        else if(getchoice.equals("2.4")){
            choice = "Internet advertising(budget): 20k som;";
        }
        else if(getchoice.equals("3")){
            choice = "Total budget for marketing:"+marketBudget+" som;";
        }
        else if(getchoice.equals("4.1")){
            String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
            System.out.print(expenseRequest);
            String expense = scanner.next();
            int expense1 = Integer.valueOf(expense);
            if(expense1>150000){
                choice = "Sorry, but the indicated expense exceeds the total budget!";
            }
            else{
                marketBudget = marketBudget-expense1;
                choice = "Operation completed successfully!";
            }

        }
        else if(getchoice.equals("4.2")){
            String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
            System.out.print(expenseRequest);
            String expense = scanner.next();
            int expense1 = Integer.valueOf(expense);
            if(expense1>150000){
                choice = "Sorry, but the indicated expense exceeds the total budget!";
            }
            else{
                marketBudget = marketBudget-expense1;
                choice = "Operation completed successfully!";
            }

        }
        else if(getchoice.equals("4.3")){
            String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
            System.out.print(expenseRequest);
            String expense = scanner.next();
            int expense1 = Integer.valueOf(expense);
            if(expense1>150000){
                choice = "Sorry, but the indicated expense exceeds the total budget!";
            }
            else{
                marketBudget = marketBudget-expense1;
                choice = "Operation completed successfully!";
            }

        }
        else if(getchoice.equals("5")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }
}
