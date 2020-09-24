package classwork.Arraylists;

import java.util.List;
import java.util.Scanner;

public interface EmployeeInterface {
    void displayAllEmployee(List<Employee> e);
    void addEmployee(Scanner sc, List<Employee> e);
    void editEmployee(Scanner sc, List<Employee> e);
    void deleteEmployee(Scanner sc, List<Employee> e);
}
