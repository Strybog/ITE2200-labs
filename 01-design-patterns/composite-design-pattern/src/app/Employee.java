package app;

/**
 * an import of List interface, also known as ordered collection or a sequence. 
 */
import java.util.List;

/**
 * Component interface that defines common operations for both simple (leaf) and
 * complex objects (composite) of a composition
 */

public interface Employee {

  // prints employee details to console
  public void showEmployeeDetails();

  // adds an employee element to a container
  public void addEmployee(Employee e);

  // removes an employee element from a container
  public void removeEmployee(Employee e);

  // retrieves employee elements from a container
  public List<Employee> getEmployees();
}