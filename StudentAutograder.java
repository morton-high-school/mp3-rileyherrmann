public class StudentAutograder{
  public static void main(String[] args){
    testTeacherMethods();
    testStudentIDs();
    testGPAMethods();
    testStudentTeacherMethods();
  }

  public static void testTeacherMethods(){
    Teacher one = new Teacher("Zeller", "He's a great guy.");
    Boolean a = one.getName().equals("Zeller");
    Boolean b = one.getReason().equals("He's a great guy.");

    one.setName("Zehr");
    one.setReason("Out of pity.");
    Boolean c = one.getName().equals("Zehr");
    Boolean d = one.getReason().equals("Out of pity.");

    if(!a){
      System.out.println("Failed Teacher Get Name Test");
    }
    if(!b){
      System.out.println("Failed Teacher Get Reason Test");
    }
    if(!c){
      System.out.println("Failed Teacher Set Name Test");
    }
    if(!d){
      System.out.println("Failed Teacher Set Reason Test");
    }
    if(a&&b&&c&&d){
      System.out.println("All Teacher Methods Passed");
    }
  }

  public static void testStudentIDs(){
    Student one = new Student("Calvin");
    Boolean a = (one.getID() == 0);
    Student two = new Student("Hobbes");
    Boolean b = (two.getID() == 1);

    Student.addStudents(50);
    Boolean c = (Student.getStudentCount() == 52);

    Student three = new Student("Bill");
    Boolean d = (three.getID() == 52);

    if(!a){
      System.out.println("Failed First Student ID Test");
    }
    if(!b){
      System.out.println("Failed Second Student ID Test");
    }
    if(!c){
      System.out.println("Failed Get Student Count Test");
    }
    if(!d){
      System.out.println("Failed Third Student ID Test");
    }
    if(a&&b&&c&&d){
      System.out.println("All Student ID Tests Passed");
    }
  }

  public static void testGPAMethods(){
    Student one = new Student("King Arthur");
    one.addGrade(4);
    Boolean a = (one.getGPA() == 4.0);
    one.addGrade(1);
    Boolean b = (one.getGPA() == 2.5);
    one.addGrade(4);
    Boolean c = (one.getGPA() == 3.0);

    if(!a){
      System.out.println("Failed First GPA Test");
    }
    if(!b){
      System.out.println("Failed Second GPA Test");
    }
    if(!c){
      System.out.println("Failed Third GPA Test");
    }
    if(a&&b&&c){
      System.out.println("All Student GPA Tests Passed");
    }
  }

  public static void testStudentTeacherMethods(){
    Student one = new Student("Hobbes");
    Teacher two = new Teacher("Socrates", "He was pretty cool.");
    one.setFavoriteTeacher(two);
    Boolean a = one.getFavoriteTeacher().getName().equals("Socrates");
    Boolean b = one.getFavoriteTeacher().getReason().equals("He was pretty cool.");
    two.setName("Pythagoras");
    two.setReason("Because of the triangles.");
    Boolean c = one.getFavoriteTeacher().getName().equals("Socrates");
    Boolean d = one.getFavoriteTeacher().getReason().equals("He was pretty cool.");

    if(!a){
      System.out.println("Failed Get Name of Favorite Teacher Test");
    }
    if(!b){
      System.out.println("Failed Get Reason of Favorite Teacher Test");
    }
    if(!c){
      System.out.println("Failed Name Pass By Reference Test");
    }
    if(!d){
      System.out.println("Failed Reason Pass By Reference Test");
    }
    if(a&&b&&c&&d){
      System.out.println("All Student Teacher Methods Passed");
    }
  }
}
