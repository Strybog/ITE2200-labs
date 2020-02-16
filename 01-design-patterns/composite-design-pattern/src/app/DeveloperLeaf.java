package app;

import java.util.List;

/**
 * Leaf class representing a Developer that implements methods of the component
 * interface (Employee.java)
 * 
 * Leaf classes represent simple elements, you can have multiple different leaf
 * classes.
 */

public class DeveloperLeaf implements Employee {

  // private properties
  private int employeeNumber;
  private String name;
  private String position;

  // constructor
  DeveloperLeaf(String name, int empNo, String position) {
    this.name = name;
    this.employeeNumber = empNo;
    this.position = position;
  }

  // implemented method to print employee details to console
  @Override
  public void showEmployeeDetails() {
    System.out.println(this.name + " " + this.employeeNumber + " " + this.position + " is a developer.");
  }

  /**
   * 
   * unimplemented methods
   * 
   * Because operations were defined in the component interface (Employee.java),
   * some methods will be empty in the leaf classes since they aren't applicable
   * to the leaf.
   */

  @Override
  public void addEmployee(Employee e) {
  }

  @Override
  public void removeEmployee(Employee e) {
  }

  @Override
  public List<Employee> getEmployees() {
    return null;
  }

}