package users;

import java.util.Scanner;

public class Worker {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Greetings dear, Employee Egor!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 5:";
    public void menu(){
        System.out.println("1. Show a list of tasks assigned to me;\n" +
                "2. Complete the order:\n" +
                "3. Show a list of completed instructions;\n" +
                "4. Show salary;\n" +
                "5. Exit;");
    }
    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1")){
            choice = "1) Print out a list of customer service areas;\n" +
                    "2) Translate the main speech for the consul from America;\n" +
                    "3) Show the building to new employees;\n" +
                    "4) Print monthly report;";
        }
        else if(getchoice.equals("2")){
            System.out.print("Please write down the task you are going to do:");
            String task = scanner.next();
            choice = "This task will be crossed off the to-do list";
        }
        else if(getchoice.equals("3")){
            choice = "1) Sort documents in alphabetical order;\n" +
                    "2) Accept resumes of new employees;";
        }
        else if(getchoice.equals("4")){
            Director director = new Director();
            String workersalary = String.valueOf(director.workerSalary);
            choice = "Your salary:"+workersalary+";";
        }
        else if(getchoice.equals("5")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }

}
