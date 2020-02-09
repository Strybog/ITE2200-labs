package app;

public class Student {

  /**
   * class properties with private access modifier
   * 
   * properties and methods declared as private are accessible only within the
   * class in which they are declared
   */
  private String name;
  private String email;
  private int gender;
  private String usi;
  private String programmeName;
  private int attendanceCount;
  private int attendanceTotal;

  // Constructor
  Student(String name, String email, int gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.attendanceTotal = 40;
    this.programmeName = "Default programme";
  }

  public String getName() {
    return name;
  }

  public int getAttendanceTotal() {
    return attendanceTotal;
  }

  public void setAttendanceTotal(int attendanceTotal) {
    this.attendanceTotal = attendanceTotal;
  }

  public int getAttendanceCount() {
    return attendanceCount;
  }

  public void setAttendanceCount(int attendanceCount) {
    this.attendanceCount = attendanceCount;
  }

  public void setName(String name) {
    this.name = name;
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

  public int isGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return isGender() == 0 ? "Male" : "Female";
  }

  public void print() {
    System.out.println("Name: " + getName());
    System.out.println("Gender: " + getGender());
    System.out.println("Email: " + getEmail());
    System.out.println("Programme: " + getProgrammeName());
    System.out.println("Attendance count: " + getAttendanceCount());
    System.out.println("Attendance: " + getAttendanceCount() + "/" + getAttendanceTotal());
    System.out.println("USI: " + getUsi());
  }

  protected double getAttendancePercentage() {
    return Math.round(attendanceCount * 100.0 / attendanceTotal);
  }

  protected boolean canWriteFinal() {
    return getAttendancePercentage() >= 60 ? true : false;
  }

  protected String canWriteFinalMessage() {
    return canWriteFinal() ? getName() + "'s attendance is " + getAttendancePercentage() + " % and can write finals.\n"
        : getName() + "'s attendance is " + getAttendancePercentage() + " and needs to be withdrawn from programme.\n";
  }
}
