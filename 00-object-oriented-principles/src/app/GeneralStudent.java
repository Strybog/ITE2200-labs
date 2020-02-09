package app;

public class GeneralStudent extends Student {

  GeneralStudent(String name, String email, int gender) {
    super(name, email, gender);

    this.setProgrammeName("General programme");
    this.setAttendanceTotal(60);
  }

  protected boolean canWriteFinal() {
    return getAttendancePercentage() >= 75 ? true : false;
  }
}