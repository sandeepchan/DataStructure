import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TechMahindra {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(1, "Test", "Pune", "India", 10000, "Testing");
        Employee employee2 = new Employee(2, "John", "Indore", "India", 20000, "Development");
        Employee employee3 = new Employee(3, "Aohan", "Mumbai", "India", 50000, "Testing");
        Employee employee4 = new Employee(4, "Mohan", "Dehradun", "India", 80000, "Sales");
        Employee employee5 = new Employee(5, "ABc", "Pune", "India", 90000, "Development");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        var sorted_emp = employees.stream().sorted().collect(Collectors.toList());

        HashMap<String, Integer> samecity = new HashMap<>();

        System.out.println("Sort By Name");
        double sum = 0;
        for(var emp : sorted_emp)
        {
            if(samecity.containsKey(emp.getEmpCity()))
            {
                var count = samecity.get(emp.getEmpCity());
                samecity.put(emp.getEmpCity(), count +1);
            }
            else {
                samecity.put(emp.getEmpCity(), 0);
            }
            System.out.println(emp);
            sum = emp.getEmpSalary();
        }

        System.out.println("Filter By  Name start with A");
        var filterByName = employees.stream().filter(s->s.getEmpName().startsWith("A")).collect(Collectors.toList());
        for(var emp : filterByName)
        {
            System.out.println(emp);
        }
        System.out.println("Emp Total  salary " + sum);

        samecity.forEach((key,val)->{
            System.out.println("City is " + key + " total emp " + val);
        });


       var re = employees.stream().sorted().limit(2).skip(1).toArray();
        System.out.println(Arrays.toString(re));






    }
}


