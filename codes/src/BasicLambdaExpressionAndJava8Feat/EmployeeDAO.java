package BasicLambdaExpressionAndJava8Feat;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(176, "Roshan", "IT", 600000));
        employees.add(new Employee(388, "Bikash", "CIVIL", 900000));
        employees.add(new Employee(470, "Bimal", "DEFENCE", 500000));
        employees.add(new Employee(624, "Sourav", "CORE", 400000));
        employees.add(new Employee(176, "Prakash", "SOCIAL", 1200000));
        return employees;
    }
}
