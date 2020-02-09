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
   * throws Exception -
   */
  public static void main(String[] args) throws Exception {
    // Student s1 = new Student("Jane Doe", "jane@email.com", 1);
    // s1.setProgrammeName("ITE 2200");
    // s1.print();
    // s1.setAttendanceCount(30);

    GeneralStudent gs1 = new GeneralStudent("John Doe", "john@email.com", 0);
    gs1.setAttendanceCount(10);
    gs1.print();
    System.out.println(gs1.canWriteFinalMessage());

    SpecializedStudent ss1 = new SpecializedStudent("Jame Moore", "jame@email.com", 0);
    ss1.setAttendanceCount(10);

    ss1.print();
    System.out.println(ss1.canWriteFinalMessage());
  }
}
