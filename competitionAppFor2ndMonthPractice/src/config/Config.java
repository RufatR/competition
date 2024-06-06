package config;

import bean.Users;

public class Config {
    private Users [] users = new Users[0];
    private static Config config = null;


    public static Config getConfig() {
        if (config == null){
            return new Config();
        }
        return config;
    }

    public  Users[] getUsers() {
        return users;
    }

    public void getAppend(Users user){
      Users [] newUsers = new Users[users.length + 1] ;
        for (int i = 0; i < users.length; i++) {
            newUsers[i] = users[i];
        }
        newUsers[newUsers.length-1] = user;

        users = newUsers;


    }

}
