package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Director class is a container that can comprise any number of employees, (so
 * leaf classes) and include other complex employee classes.
 * 
 * This composite class represents complex components that may have children.
 * Composite objects usually delegate the actual work to their children (instead
 * of doing something on its own) and then "sums up" the result.
 * 
 */

public class Director implements Employee {

  // private property contains list of children
  private List<Employee> employeesList;

  // constructor
  Director() {
    // constructs an empty array list
    this.employeesList = new ArrayList<Employee>();
  }

  /**
   * Loops through child elements in the list for specific implementation to show
   * employee details
   * 
   * Shows that the function delegates actual work to child class (in this case it
   * can be the DeveloperLeaf or ManagerLeaf).
   */
  @Override
  public void showEmployeeDetails() {
    for (Employee employee : employeesList) {
      employee.showEmployeeDetails();
    }

  }

  /**
   * A composite object can add or remove other components (both simple or
   * complex) to or from its children list.
   */

  // adds child to array of children
  @Override
  public void addEmployee(Employee e) {
    this.employeesList.add(e);
  }

  // removes child from array of children
  @Override
  public void removeEmployee(Employee e) {
    this.employeesList.remove(e);

  }

  // retrieves children from array
  @Override
  public List<Employee> getEmployees() {
    return this.employeesList;
  }

}