package app;

public class App {
  public static void main(String[] args) {

    // developer leaf instances
    DeveloperLeaf developer1 = new DeveloperLeaf("Noob Noob", 123, "Junior Developer");
    DeveloperLeaf developer2 = new DeveloperLeaf("Jane Doe", 456, "Intern Developer");

    // manager leaf instance
    ManagerLeaf manager1 = new ManagerLeaf("Schrimply Pibbles", 678, "Chief DevOps Officer");

    // director component instance
    Director director = new Director();

    // composite class adds leaf as part of component
    director.addEmployee(developer1);
    director.addEmployee(developer2);
    director.addEmployee(manager1);

    // print employee details to console
    director.showEmployeeDetails();

    // retrieves children from list
    System.out.println(director.getEmployees());
  }
}