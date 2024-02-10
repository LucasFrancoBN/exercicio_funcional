package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the full file path: ");
    String path = sc.nextLine();
    System.out.print("Enter salary: ");
    double salary = sc.nextDouble();

    try (BufferedReader br = new BufferedReader(new FileReader(path))){
      List<Employee> employees = br.lines().map(line -> {
        String[] splitLine = line.split(",");
        return new Employee(splitLine[0], splitLine[1], Double.parseDouble(splitLine[2]));
      }).toList();

      List<String> emails = employees.stream()
                            .filter(employee -> employee.getSalary() > salary)
                              .map(Employee::getEmail)
                                .sorted()
                                  .toList();

      double sum = employees.stream()
                   .filter(employee -> employee.getName().toUpperCase().charAt(0) == 'M')
                       .mapToDouble(Employee::getSalary)
                          .sum();

      System.out.println("Email of people whose salary is more than " + salary + ":");
      for (String email : emails) {
        System.out.println(email);
      }
      System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
