package users;

import java.util.ArrayList;
import java.util.Scanner;

public class Worker {
    Scanner scanner = new Scanner(System.in);
    String doneTasks = "null";
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
       WorkerList workerList = new WorkerList();
        if(getchoice.equals("1")){
            choice = workerList.works();
        }
        else if(getchoice.equals("2")){
            System.out.print("Please write down the task you are going to do:");
            String task = scanner.next();
            doneTasks = task;
            choice = "This task will be crossed off the to-do list;";
        }
        else if(getchoice.equals("3")){
            String doneworks = workerList.doneWorks();
            choice = doneworks;
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
