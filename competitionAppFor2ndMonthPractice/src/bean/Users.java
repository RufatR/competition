package bean;

import annotations.BoshOlmasin;

public class Users {
    private String name;

    @BoshOlmasin
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
