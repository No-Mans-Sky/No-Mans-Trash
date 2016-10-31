import java.util.HashMap;
class Transcript{
  public HashMap<Course, String> myGrades9 = new HashMap<Course, String>();
  public HashMap<Course, String> myGrades10 = new HashMap<Course, String>();
  public HashMap<Course, String> myGrades11 = new HashMap<Course, String>();
  public HashMap<Course, String> myGrades12 = new HashMap<Course, String>();


  public Transcript(HashMap<Course, String> myGrades9,
                    HashMap<Course, String> myGrades10,
                    HashMap<Course, String> myGrades11,
                    HashMap<Course, String> myGrades12){
    this.myGrades9 = myGrades9;
    this.myGrades10 = myGrades10;
    this.myGrades11 = myGrades11;
    this.myGrades12 = myGrades12;
  }
  public void printGrades(){
    for (Course course : myGrades9.keySet()) {
      System.out.println("\n*-------------------Grades 9--------------------*\nCourse: " + course.name + " credits: " + course.credits + " Grade: " + myGrades9.get(course));
    }
    for (Course course : myGrades10.keySet()) {
      System.out.println("\n*-------------------Grades 10--------------------*\nCourse: " + course.name + " credits: " + course.credits + " Grade: " + myGrades10.get(course));
    }
    for (Course course : myGrades11.keySet()) {
      System.out.println("\n*-------------------Grades 11--------------------*\nCourse: " + course.name + " credits: " + course.credits + " Grade: " + myGrades11.get(course));
    }
    for (Course course : myGrades12.keySet()) {
      System.out.println("\n*-------------------Grades 12--------------------*\nCourse: " + course.name + " credits: " + course.credits + " Grade: " + myGrades12.get(course));
    }
  }
  public void transcriptMethod(HashMap<Course, String> classGrades){
    if(classGrades.size() <= 0){
      System.out.println("There are no grades.");
    }
  }
  public static void main(String[] args) {
    HashMap<Course, String> myGrades9 = new HashMap<Course, String>();

    // 9th Grade
    myGrades9.put(new Course("English 9", 1.0f), "A");
    myGrades9.put(new Course("Algebra I", 1.0f), "A");
    myGrades9.put(new Course("Biology w/lab", 1.0f), "A");
    myGrades9.put(new Course("American History", 1.0f), "A");
    myGrades9.put(new Course("Drawing", 1.0f), "A");
    myGrades9.put(new Course("Martial Arts I", 0.5f), "A");
    myGrades9.put(new Course("MS Office", 0.5f), "A");

    HashMap<Course, String> myGrades10 = new HashMap<Course, String>();
    // 10th Grade
    myGrades10.put(new Course("English 10", 1.0f), "A");
    myGrades10.put(new Course("Algebra II", 1.0f), "A");
    myGrades10.put(new Course("Chemistry w/lab", 1.0f), "A");
    myGrades10.put(new Course("World History", 1.0f), "A");
    myGrades10.put(new Course("Latin I", 1.0f), "A");
    myGrades10.put(new Course("Martial Arts II", 0.5f), "A");
    myGrades10.put(new Course("Piano", 0.5f), "A");

    HashMap<Course, String> myGrades11 = new HashMap<Course, String>();
    // 11th Grade
    myGrades11.put(new Course("English 11", 1.0f), "B");
    myGrades11.put(new Course("Algebra II", 1.0f), "A");
    myGrades11.put(new Course("Marine Biology w/lab", 1.0f), "A");
    myGrades11.put(new Course("American Government", 0.5f), "A");
    myGrades11.put(new Course("Economics", 0.5f), "A");
    myGrades11.put(new Course("Latin II", 1.0f), "A");
    myGrades11.put(new Course("Web Design", 1.0f), "A");

    HashMap<Course, String> myGrades12 = new HashMap<Course, String>();
    // 12th Grade
    myGrades12.put(new Course("English 12", 1.0f), "B");
    myGrades12.put(new Course("Calculus", 1.0f), "A");
    myGrades12.put(new Course("Physics w/lab", 1.0f), "A");
    myGrades12.put(new Course("Photography", 0.5f), "A");
    myGrades12.put(new Course("Yearbook", 0.5f), "A");
    myGrades12.put(new Course("Driver's Education", 0.5f), "A");
    myGrades12.put(new Course("Studio Art", 1.0f), "A");
    myGrades12.put(new Course("Piano", 0.5f), "A");

    Transcript myGrades = new Transcript(myGrades9, myGrades10, myGrades11, myGrades12);
    myGrades.printGrades();
  }

}
class Course{
  String name;
  Float credits;

  public Course(String name, Float credits) {
    this.name = name;
    this.credits = credits;
  }
}
