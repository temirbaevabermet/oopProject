package typeOfAccount;
import LoginPassword.Login;
import users.Director;
import users.Manager;

import java.util.Scanner;
public class Account {
    public static  void main(String[] args){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        String loginRequest = "Please enter your type of account: ";
        System.out.print(loginRequest);
        String typeOfAccount = scanner.next();
        if(typeOfAccount.equals(login.directorLogin)){
            Director director = new Director();
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password1 = scanner.next();
            if(password1.equals(login.directorPassword)){
                System.out.println(director.greetings);
                director.menu();
                String choice = director.getChoice();
                System.out.println(choice);
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else if(typeOfAccount.equals(login.managerLogin)){
            Manager manager = new Manager();
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password2 = scanner.next();
            if(password2.equals(login.managerPassword)){
                System.out.println(manager.greetings);
                manager.menu();
                String choice = manager.getChoice();
                System.out.println(choice);
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else if(typeOfAccount.equals(login.marketingLogin)){
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password3 = scanner.next();
            if(password3.equals(login.marketingPassword)){
                System.out.println("Hello");
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else if(typeOfAccount.equals(login.saleManagerLogin)){
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password4 = scanner.next();
            if(password4.equals(login.saleManagerPassword)){
                System.out.println("Hello");
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else if(typeOfAccount.equals(login.workerLogin)){
            String passwordRequest = "Please enter your password: ";
            System.out.print(passwordRequest);
            String password5 = scanner.next();
            if(password5.equals(login.workerPassword)){
                System.out.println("Hello");
            }
            else {
                System.out.println("Sorry, but password entered incorrectly, please try again!");
            }
        }
        else{
            System.out.println("Sorry, but we do not find this type of account, please try again!");
        }

    }

}
