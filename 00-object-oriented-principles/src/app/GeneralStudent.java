package app;

/**
 * "extends" keyword indicates that a class is inherited from another class, in
 * this case the GeneralStudent inherits from the Student
 * 
 * therefore GeneralStudent inherits all the properties and methods in the
 * Student class
 */
public class GeneralStudent extends Student {

  // Constructor
  GeneralStudent(String name, String email, Gender gender) {
    /**
     * "super()" is a reference to the immediate parent class, in this case the
     * Student class
     */
    super(name, email, gender);

    this.setProgrammeName("General programme");
    this.setAttendanceTotal(60);
  }

  /**
   * overrides method canWriteFinal() from Student class, since GeneralStudent has
   * its own implementation
   */
  protected boolean canWriteFinal() {
    return getAttendancePercentage() >= 75 ? true : false;
  }
}