package app;

public class App {
  /**
   * main method is the entrypoint of any java application
   * 
   * public - an access modifier, has to be public for java runtime to execute the
   * method
   * 
   * static -has to be static so Java Virtual Machine (JVM) can load the class
   * into memory and call the main method
   * 
   * void - method return type, doesn't return anything hence void return type
   * 
   * main - name of the main method, this is fixed and when java starts a
   * programme it looks for main
   * 
   * (String[] args) parameters - main method accepts a single string array
   * argument, can be called as part of java command line arguments
   * 
   */
  public static void main(String[] args) {
    // instance of student
    Student s1 = new Student("Jane Doe", "janedoe@email.com", Gender.FEMALE);
    s1.setName("Jane Does");
    s1.setProgrammeName("ITE 2200");
    s1.setAttendanceCount(75);
    System.out.println("Student---------------------------");
    s1.print();
    System.out.println(s1.canWriteFinalMessage());

    // instance of general student
    GeneralStudent gs1 = new GeneralStudent("John Doe", "john@email.com", Gender.MALE);
    gs1.setAttendanceCount(50);
    System.out.println("General Student---------------------------");
    gs1.print();
    System.out.println(gs1.canWriteFinalMessage());

    // instance of specialized student
    SpecializedStudent ss1 = new SpecializedStudent("Jane Smith", "janesmith@email.com", Gender.FEMALE);
    ss1.setAttendanceCount(35);
    System.out.println("Specialized Student---------------------------");
    ss1.print();
    System.out.println(ss1.canWriteFinalMessage());
  }
}
