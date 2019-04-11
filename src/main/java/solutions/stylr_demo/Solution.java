package solutions.stylr_demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author mali.sahin
 * @since 11.04.2019.
 */
public class Solution {

    public static void main(String... args) {

        String PATH = "/Users/mehmetalisahinogullari/Documents/WORKS/hackerrank-solutions/src/main/resources/";
        String FIRST_INPUT = PATH + "input1.tsv";
        String SECOND_INPUT = PATH + "input2.tsv";
        Solution solution = new Solution();
        solution.firstSolution(FIRST_INPUT);
        solution.secondSolution(SECOND_INPUT);


    }

    private void firstSolution(String filePath) {
        // Full time Monthly Salary  annual compensation =  12 * salary
        // Part time 40 hours every week  annual compensation = 52 * 40 * hour salary
        String line = null;
        try {
            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<Employee> employeeList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] elements = line.split("\t");
                Employee employee = new Employee(elements);
                employeeList.add(employee);
            }

            employeeList.sort(Comparator.comparing(e -> e.getAnnualCompensation()));
            employeeList.forEach(employee -> System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getAnnualCompensation()));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private void secondSolution(String filePath){
        // Full time Monthly Salary  annual compensation =  12 * salary
        // Part time 40 hours every week  annual compensation = 52 * 40 * hour salary
        String line = null;
        try {
            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<Employee> employeeList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] elements = line.split("\t");
                Employee employee;
                if (elements[3].contains(",")) {
                    String[] directReports =  elements[3].split(",");
                    elements[3] = "0";
                     employee = new Employee(elements, Arrays.asList(directReports));
                } else {
                    employee = new Employee(elements);
                }

                employeeList.add(employee);
            }

            employeeList.sort(Comparator.comparing(e -> e.getAnnualCompensation()));
            employeeList.forEach(employee -> System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getAnnualCompensation()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    private int id;
    private String name;
    private String workingType;
    private Double salary;
    private Double annualCompensation;
    private List<String> directReports;

    public Employee(String[] args) {
        this.id = Integer.parseInt(args[0]);
        this.name = args[1];
        this.workingType = args[2];
        this.salary = Double.valueOf(args[3]);
        this.setAnnualCompensation();
    }

    public Employee(String[] args, List<String> directReports){
        Employee employee = new Employee(args);
        employee.setDirectReports(directReports);
    }

    public void setAnnualCompensation(Double annualCompensation) {
        this.annualCompensation = annualCompensation;
    }


    public List<String> getDirectReports() {
        return directReports;
    }

    public void setDirectReports(List<String> directReports) {
        this.directReports = directReports;
    }

    public void setAnnualCompensation() {
        this.annualCompensation = workingType.equals("FT") ? this.salary * 12 : 52 * 40 * this.salary;
    }

    public Double getAnnualCompensation() {
        return annualCompensation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkingType() {
        return workingType;
    }

    public void setWorkingType(String workingType) {
        this.workingType = workingType;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

enum WorkingType {
    FT, PT
}