package Lists;

import java.util.Scanner;

public class ManagerList {
    Scanner scanner = new Scanner(System.in);
    public String coverageArea(){
        System.out.println("1. Show customer coverage area for Bishkek\n" +
                "2. Show customer coverage area for Talas\n" +
                "3. Show customer coverage area for Jalal-Abad\n" +
                "4. Show customer coverage area for Osh\n" +
                "5. Show customer coverage area for Naryn\n" +
                "6. Show customer coverage area for Issyk-Kul\n" +
                "7. Show customer coverage area for Batken");
        System.out.print("Choose one category:");
        String chooseArea = scanner.next();
        String choosedArea = "null";
        if(chooseArea.equals("1")){
            choosedArea = "Coverage percentage in Bishkek: 35%; " +
                    "Number of clients: 700k people;";
        }
        else if(chooseArea.equals("2")){
            choosedArea = "Coverage percentage in Talas: 15%; " +
                    "Number of clients: 300k people;";
        }
        else if(chooseArea.equals("3")){
            choosedArea = "Coverage percentage in Jalal-Abad: 7%; " +
                    "Number of clients: 140k people;";
        }
        else if(chooseArea.equals("4")){
            choosedArea = "Coverage percentage in Osh: 25%; " +
                    "Number of clients: 500k people;";
        }
        else if(chooseArea.equals("5")){
            choosedArea = "Coverage percentage in Naryn: 5%; " +
                    "Number of clients: 100k people;";
        }
        else if(chooseArea.equals("6")){
            choosedArea = "Coverage percentage in Issyk-Kul: 8%; " +
                    "Number of clients: 160k people;";
        }
        else if(chooseArea.equals("7")){
            choosedArea = "Coverage percentage in Batken: 5%; " +
                    "Number of clients: 100k people;";
        }
        return choosedArea;
    }
    public String vouchers(){
        System.out.println("1.Show total amount\n" +
                "2.Show the amount for vouchers");
        System.out.print("Choose one category: ");
        String chooseVoucher = scanner.next();
        String choosedVoucher = "null";
        if(chooseVoucher.equals("1")){
            choosedVoucher = "Total amount of vouchers: 100;";
        }
        else if(chooseVoucher.equals("2")){
            System.out.println("1.For 1st quarter;\n" +
                    "2. For the 2nd quarter;\n" +
                    "3. For the 3rd quarter;\n" +
                    "4. For the 4th quarter;");
            System.out.print("Choose one quarter:");
            String chooseQuarter = scanner.next();
            if(chooseQuarter.equals("1")){
                choosedVoucher = "For 1st quarter: 40;";
            }
            else if(chooseQuarter.equals("2")){
                choosedVoucher = "For the 2nd quarter: 25;";
            }
            else if(chooseQuarter.equals("3")){
                choosedVoucher = "For the 3rd quarter: 15;";
            }
            else if(chooseQuarter.equals("4")){
                choosedVoucher = "For the 4th quarter: 20;";
            }
        }
        return choosedVoucher;
    }
}
