package users;

import java.util.Scanner;

public class SaleManager {
    Scanner scanner = new Scanner(System.in);
    public String greetings = "Greetings dear Sales Agent!\n" +
            "Please dial the menu number to work with the program, if you are finished, then dial 8:";
    public void menu(){
        System.out.println("1. Show all clients;\n" +
                "2. Search for a client;\n" +
                "3. Show available shopping vouchers;\n" +
                "4. Show sold tours;\n" +
                "5. Show the most expensive trip;\n" +
                "6. Show the cheapest tour;\n" +
                "7. Sell a trip;\n" +
                "8. Exit;");
    }
    public String getChoice(){
        String choice = "null";
        String numberRequest = "Please dial the menu number to work with the program:";
        System.out.print(numberRequest);
        String getchoice = scanner.next();
        if(getchoice.equals("1")){
            choice = "1.Dylan Diaz\n" +
                    "2.Junaid Stewart\n" +
                    "3.Trey Osborn\n" +
                    "4.Julius Black\n" +
                    "5.Amie Arias\n" +
                    "6.Sofia Zuniga\n" +
                    "7.Jorge Vincent\n" +
                    "8.Sonny Hughes\n" +
                    "9.Hussein Henry\n" +
                    "10.Iestyn Cole";
        }
        else if(getchoice.equals("2")){
            System.out.print("Enter the client surname to search:");
            String clientSurnameRequest = scanner.next();
            System.out.print("Enter the client name to search:");
            String clientNameRequest = scanner.next();
            choice = "The client was found:"+clientSurnameRequest+" "+clientNameRequest;
        }
        else if(getchoice.equals("3")){
            choice = "There are available trips to: South Korea, the USA, Thailand, Italy, Germany, Russia;";
        }
        else if(getchoice.equals("4")){
            choice = "Sold tours: to Turkey, to Canada, to Malaysia, to China;";
        }
        else if(getchoice.equals("5")){
            choice = "The most expensive trip: to the USA - 2000$;";
        }
        else if(getchoice.equals("6")){
            choice = "The cheapest trip: to the Russia - 600$;";
        }
        else if(getchoice.equals("7")){
            System.out.print("Please write your sales address:");
            String adress = scanner.next();
            System.out.print("Please write the new owner of the voucher:");
            String newOwner = scanner.next();
            choice = "Sale completed successfully!";
        }
        else if(getchoice.equals("8")){
            choice = "The program is over, we look forward to your return!";
        }
        return choice;
    }
}
