package BasicLambdaExpressionAndJava8Feat;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTaxService {
    private static final String TAX = "Tax";

    public static List<Employee> evaluateTaxUsers(String input) {
        return input.equalsIgnoreCase(TAX) ?
                EmployeeDAO.getEmployees().stream()
                        .filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                : EmployeeDAO.getEmployees().stream()
                .filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("Non Tax"));
    }
}
