package View;

import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class CreateEmployee implements Option {

    @Override
    public void oper(Employee user, Scanner s, Database database);

}
