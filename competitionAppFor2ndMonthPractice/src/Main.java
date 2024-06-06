import bean.User;
import services.impl.RegisterServiceImpl;
import util.Menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("username: ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.print("password:");
        String password = sc.nextLine();
        int count = 3;
        boolean login =false;


        if (userName.equalsIgnoreCase(User.getUserName()) && password.equalsIgnoreCase(User.getPassword())){
            System.out.println("Successfully login");
            login = true;
        }
        else {

           while (count >= 1){
               System.out.println("Your username or password are wrong .Please enter again");
               count--;
               System.out.print("username: ");
               String userName2 = sc.nextLine();
               System.out.print("password:");
               String password2 = sc.nextLine();
               if (userName2.equalsIgnoreCase(User.getUserName()) && password2.equalsIgnoreCase(User.getPassword())){
                   System.out.println("Successfully login");
                   login =true;
                   break;
               }else {
                   System.out.printf("you had: %d chance",count);
                   System.out.println();
               }

           }
           if (!login){
               System.out.println("You banned");
           }
        }

        if (login){
            Menu[] values = Menu.values();

            for (Menu menu:values){
                System.out.println(menu.getNum() + " " + menu.getLabel());
            }
            System.out.println("Please enter number");
            int num = sc.nextInt();
            switch (num){
                case 1 :
                    RegisterServiceImpl.getInstance().process();
                    System.out.println(" Yarışmada iştirak edən şəxslər uğurla qeydiyyatdan keçdi.");
            }
        }


    }
}