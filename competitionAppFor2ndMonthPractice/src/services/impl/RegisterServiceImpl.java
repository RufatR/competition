package services.impl;

import bean.Users;
import config.Config;
import services.MenuService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RegisterServiceImpl implements MenuService {
private  static RegisterServiceImpl registerService = null;


    @Override
    public void process() {
        System.out.println("How many people will join to this competition");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();



        for (int i = 0; i < count; i++) {
            Users users = new Users();
            users.setName(scanner.nextLine());
            Config.getConfig().getAppend(users);
        }



    }

    public static RegisterServiceImpl getInstance(){
        if (registerService == null){
            return new RegisterServiceImpl();
        }
        return registerService;
    }
}
