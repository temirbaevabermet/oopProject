package Lists;

import users.SaleManager;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManagerList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> clients = new ArrayList<String>();
    String[] clientsList = new String[] {"Dylan Diaz" , "Junaid Stewart" , "Trey Osborn" , "Julius Black" , "Amie Arias"};
    String[] clientsList1 = new String[] {"Dylan" , "Junaid" , "Trey" , "Julius" , "Amie"};
    public String client(){
        for(int i=0; i<clientsList.length; i++){
            clients.add(clientsList[i]);
        }
        return clients.toString();
    }
    public String clientName(){
        SaleManager saleManager = new SaleManager();
        System.out.print("Enter the client name to search:");
        String clientnameRequest = scanner.next();
        String clientNameSurname = "null";
        int a = 0;
        for(int i=0; i<clientsList1.length; i++){
            if(clientsList1[i].equals(clientnameRequest)){
                a++;

            }

        }
        if(a>0){
            clientNameSurname = "The client was found!";
        }
        else{
            clientNameSurname = "Sorry, but client did not found!";
        }

        return clientNameSurname;
    }
}
