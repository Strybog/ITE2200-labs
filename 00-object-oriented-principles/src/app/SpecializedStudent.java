package app;

public class SpecializedStudent extends Student {

  SpecializedStudent(String name, String email, int gender) {
    super(name, email, gender);
    this.setProgrammeName("Specialized programme");
    this.setAttendanceTotal(80);
  }

  /** overrides canWriteFinal() from Student class */
  protected boolean canWriteFinal() {
    return getAttendancePercentage() >= 80 ? true : false;
  }

}