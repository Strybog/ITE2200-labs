package app;

/**
 * "extends" keyword indicates that a class is inherited from another class, in
 * this case the SpecializedStudent inherits from the Student
 * 
 * therefore SpecializedStudent inherits all the properties and methods in the
 * Student class
 */
public class SpecializedStudent extends Student {

  // Constructor
  SpecializedStudent(String name, String email, Gender gender) {
    /**
     * "super()" is a reference to the immediate parent class, in this case the
     * Student class
     */
    super(name, email, gender);
    this.setProgrammeName("Specialized programme");
    this.setAttendanceTotal(80);
  }

  /**
   * overrides method canWriteFinal() from Student class, since SpecializedStudent
   * has its own implementation
   */
  protected boolean canWriteFinal() {
    return getAttendancePercentage() >= 80 ? true : false;
  }

}