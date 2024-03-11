package users;

import java.util.Scanner;

public class MarketingList {
    Scanner scanner = new Scanner(System.in);
    public String budget(){
        System.out.println( "1. Advertising in the media\n" +
                "2. Internet advertising\n" +
                "3. Outdoor advertising\n" +
                "4. PR events");
        System.out.print("Choose one category:");
        String chooseCategory = scanner.next();
        String userChoice = "null";
        if(chooseCategory.equals("1")){
             userChoice = "Advertising in the media(budget): 80k som;";
        }
        else if(chooseCategory.equals("2")){
            userChoice = "PR events(budget): 70k som;";
        }
        else if(chooseCategory.equals("3")){
            userChoice = "Outdoor advertising(budget): 30k som;";
        }
        else if(chooseCategory.equals("2.4")){
            userChoice = "Internet advertising(budget): 20k som;";
        }
        return userChoice;
    }
    public String spendBudget(){
        System.out.println("1. Instagram\n" +
                "2. Facebook\n" +
                "3. YouTube");
        System.out.print(" Select a name for promotion:");
        String choosePromotion = scanner.next();
        String choosedPromotion = "null";
        Marketing marketing = new Marketing();
        if(choosePromotion.equals("1")){
            String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
            System.out.print(expenseRequest);
            String expense = scanner.next();
            int expense1 = Integer.valueOf(expense);
            if(expense1>150000){
                choosedPromotion = "Sorry, but the indicated expense exceeds the total budget!";
            }
            else{
                marketing.marketBudget = marketing.marketBudget-expense1;
                choosedPromotion = "Operation completed successfully!";
            }

        }
        if(choosePromotion.equals("2")){
            String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
            System.out.print(expenseRequest);
            String expense = scanner.next();
            int expense1 = Integer.valueOf(expense);
            if(expense1>150000){
                choosedPromotion = "Sorry, but the indicated expense exceeds the total budget!";
            }
            else{
                marketing.marketBudget = marketing.marketBudget-expense1;
                choosedPromotion = "Operation completed successfully!";
            }

        }
        if(choosePromotion.equals("3")){
            String expenseRequest = "Enter the amount of expense you want to spend from your budget:";
            System.out.print(expenseRequest);
            String expense = scanner.next();
            int expense1 = Integer.valueOf(expense);
            if(expense1>150000){
                choosedPromotion = "Sorry, but the indicated expense exceeds the total budget!";
            }
            else{
                marketing.marketBudget = marketing.marketBudget-expense1;
                choosedPromotion = "Operation completed successfully!";
            }

        }
        return choosedPromotion;

    }
}
