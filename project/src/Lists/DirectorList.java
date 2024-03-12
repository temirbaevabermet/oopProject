package Lists;

import java.util.Scanner;

public class DirectorList {
    Scanner scanner = new Scanner(System.in);
    public String budgetList(){
        System.out.println( "1. Show marketing budget \n" +
                "2. Show salary budget");
        System.out.print("Choose one category: ");
        String chooseBudget = scanner.next();
        String choosedBudget = "null";
        if(chooseBudget.equals("1")){
            choosedBudget = "Marketing budget: 250k som;";
        }
        else if(chooseBudget.equals("2")){
            choosedBudget = "Salary budget: 200k som;";
        }
        return choosedBudget;
    }
}
