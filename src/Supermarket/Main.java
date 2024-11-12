package Supermarket;

import Controller.CreateEmployee;
import Model.Database;
import Model.Employee;
import Model.admin;

public class Main {
    public static void main(String[] args) {
        Employee admin = new admin(0,"Admin","0","Admin0@suoermarket.com",
                "000000","Address 0",1000,"0000");
        Database database = new Database();
        new CreateEmployee(admin,database);


    }
}
