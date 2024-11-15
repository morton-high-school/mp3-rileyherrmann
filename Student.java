public class Student{
    private String name;
    private int ID;
    private double GPA;
    private Teacher favoriteTeacher;
    private String teacherName;
    private String teacherReason;
    private String favTeacher;
    private static int studentNumber=0;
    private double GPATotal=0;
    private double numberGrades=0;

    public  Student(String name){
        this.name=name;
        this.ID=studentNumber;
        studentNumber++;
    }

    public static void addStudents(int number){
        studentNumber+=number;
    } 

    public static int getStudentCount(){
        return studentNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.ID;
    }

    public void addGrade(int grade){
        this.numberGrades++;
        this.GPATotal+=grade;
        this.GPA=this.GPATotal/this.numberGrades;
    }

    public double getGPA(){
        return this.GPA;
    }

    public void setFavoriteTeacher(Teacher favorite){
        this.favoriteTeacher=favorite;
        this.teacherName=favorite.getName();
         this.teacherReason=favorite.getReason();
    }

    public Teacher getFavoriteTeacher(){
        favoriteTeacher.setName(teacherName);
          favoriteTeacher.setReason(teacherReason);
        return favoriteTeacher;
    }









}