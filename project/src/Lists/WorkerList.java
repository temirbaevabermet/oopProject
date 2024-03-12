package Lists;

import users.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> toDoList = new ArrayList<String>();
    ArrayList<String> doneWorks = new ArrayList<String>();
    public String works(){
        String work1 = "1) Print out a list of customer service areas;";
        String work2 = "2) Show the building to new employees;";
        String work3 = "3) Translate the main speech for the consul from America;";
        String work4 = "4) Print monthly report;";
        toDoList.add(work1);
        toDoList.add(work2);
        toDoList.add(work3);
        toDoList.add(work4);
        return toDoList.toString();
    }
    public String doneWorks(){
        Worker worker = new Worker();
        doneWorks.add(worker.doneTasks);
        return doneWorks.toString();
    }
}
