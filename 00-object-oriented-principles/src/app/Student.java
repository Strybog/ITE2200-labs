package app;

/**
 * enum represents a group of constants (unchangeable values) To create, use
 * 'enum' keyword followed by comma separated list of constants
 */
enum Gender {
  MALE, FEMALE
}

public class Student {

  /**
   * class properties with private access modifier
   * 
   * properties and methods declared as private are accessible only within the
   * class in which they are declared
   */
  private String name;
  private String email;
  private String usi;
  private String programmeName;
  private int attendanceCount;
  private int attendanceTotal;
  /** shows usage of enum in properties */
  private Gender gender;

  /**
   * A constructor is a special method used to initialize an object, typically
   * used to give initial values to defined properties
   */
  Student(String name, String email, Gender gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.attendanceTotal = 100;
    this.programmeName = "Default programme";
  }

  /**
   * getters
   * 
   * getters are utility functions that gets the state of a specified property
   * 
   * because "name" is a private property and the getter is public, I am able to
   * access the state in another class like so
   * 
   * e.g Student s1 = new Student("Jane Doe", "jane@email.com", Gender.FEMALE);
   * s1.getName();
   * 
   * and it would retrieve the value 'Jane Doe'
   * 
   * you'll notice a standard way to define a getter
   * 
   * get[PropertyName] with no parameters () since we don't need to pass anything
   * in the function
   */

  public String getName() {
    return name;
  }

  /**
   * setters
   * 
   * setters on the other hand are utility functions that sets the state of a
   * specified property
   * 
   * because "name" is a private property and the setter is public, I am able set
   * the state outside of the Student class like so
   * 
   * e.g Student s1 = new Student("Jane Doe", "jane@email.com", Gender.FEMALE);
   * s1.setName("Jane Does");
   * 
   * does the same as s1.name = "Jane Does"
   * 
   * you'll notice a standard way to define a setter
   * 
   * set[PropertyName] followed by value to set in parameters () since we now need
   * to pass the state that needs to be set in the function
   */

  public void setName(String name) {
    /**
     * the Java "this" keyword is a reference to the current object
     * 
     */
    this.name = name;
  }

  public int getAttendanceCount() {
    return attendanceCount;
  }

  public void setAttendanceCount(int attendanceCount) {
    this.attendanceCount = attendanceCount;
  }

  public String getUsi() {
    return usi;
  }

  public void setUsi(String usi) {
    this.usi = usi;
  }

  public String getProgrammeName() {
    return programmeName;
  }

  public void setProgrammeName(String programmeName) {
    this.programmeName = programmeName;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  protected void setAttendanceTotal(int attendanceTotal) {
    this.attendanceTotal = attendanceTotal;
  }

  // utility function to print the current state of student object
  public void print() {
    System.out.println("Name: " + getName());
    System.out.println("Gender: " + getGender());
    System.out.println("Email: " + this.email);
    System.out.println("Programme: " + this.programmeName);
    System.out.println("Attendance count: " + this.attendanceCount);
    System.out.println("Attendance: " + this.attendanceCount + "/" + this.attendanceTotal);
  }

  // function rounds the student's attendance against overall attendance as a
  // percentage
  protected double getAttendancePercentage() {
    return Math.round(attendanceCount * 100.0 / attendanceTotal);
  }

  /**
   * function that returns true/false on if student can write finals based on
   * his/her attendance percentage passing a threshold (in this case it's 60%)
   * 
   */
  protected boolean canWriteFinal() {
    return getAttendancePercentage() >= 60 ? true : false;
  }

  // prints message if student can/cannot write finals
  protected String canWriteFinalMessage() {
    return canWriteFinal() ? getName() + "'s attendance is " + getAttendancePercentage() + " % and can write finals.\n"
        : getName() + "'s attendance is " + getAttendancePercentage()
            + " % and needs to be withdrawn from programme.\n";
  }
}
