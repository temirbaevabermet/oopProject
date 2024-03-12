package users;

import Lists.MarketingList;

import java.util.Scanner;

public class Marketing {
    Scanner scanner = new Scanner(System.in);

    public int marketBudget = 150000;
    public String greetings = "Greetings dear Marketer!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 5:";


    public void menu(){
        System.out.println("1. Show a list of categories for marketing;\n" +
                "2. Show the allocated budget for a certain category of places for marketing;\n" +
                "3. Show the total budget for marketing;\n" +
                "4. Spend budget on promotion;\n" +
                "5. Exit;");
    }
    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        MarketingList marketingList = new MarketingList();
        if(getchoice.equals("1")){
            choice = "1) Instagram: 100k subscribers;\n" +
                    "2) Facebook: 45k subscribers;\n" +
                    "3) Youtube: 20k subscribers;";
        }
        else if(getchoice.equals("2")){
            choice = marketingList.budget();
        }
        else if(getchoice.equals("3")){
            choice = "Total budget for marketing:"+marketBudget+" som;";
        }
        else if(getchoice.equals("4")){
            choice = marketingList.spendBudget();

        }
        else if(getchoice.equals("5")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }
}
