import java.util.HashMap;
class Transcript{
  public Transcript(){

  }
  public void transcriptMethod(HashMap<String, Float, String> classGrades){
    if(transcriptMethod.size() <= 0){
      System.out.println("There are no grades.");
    }

  }
  public static void main(String[] args) {
HashMap<String, Float, String> myGrades9 = new HashMap<String, Float, String>();

// 9th Grade
myGrades9.put("English 9", 1.0, "A");
myGrades9.put("Algebra I", 1.0, "A");
myGrades9.put("Biology w/lab", 1.0, "A");
myGrades9.put("American History", 1.0, "A");
myGrades9.put("Drawing", 1.0, "A");
myGrades9.put("Martial Arts I", 0.5, "A");
myGrades9.put("MS Office", 0.5, "A");

HashMap<String, Float, String> myGrades10 = new HashMap<String, Float, String>();
// 10th Grade
myGrades10.put("English 10", 1.0, "A");
myGrades10.put("Algebra II", 1.0, "A");
myGrades10.put("Chemistry w/lab", 1.0, "A");
myGrades10.put("World History", 1.0, "A");
myGrades10.put("Latin I", 1.0, "A");
myGrades10.put("Martial Arts II", 0.5, "A");
myGrades10.put("Piano", 0.5, "A");

HashMap<String, Float, String> myGrades11 = new HashMap<String, Float, String>();
// 11th Grade
myGrades11.put("English 11", 1.0, "B");
myGrades11.put("Algebra II", 1.0, "A");
myGrades11.put("Marine Biology w/lab", 1.0, "A");
myGrades11.put("American Government", 0.5, "A");
myGrades11.put("Economics", 0.5, "A");
myGrades11.put("Latin II", 1.0, "A");
myGrades11.put("Web Design", 1.0, "A");

HashMap<String, Float, String> myGrades12 = new HashMap<String, Float, String>();
// 12th Grade
myGrades12.put("English 12", 1.0, "B");
myGrades12.put("Calculus", 1.0, "A");
myGrades12.put("Physics w/lab", 1.0, "A");
myGrades12.put("Photography", 0.5, "A");
myGrades12.put("Yearbook", 0.5, "A");
myGrades12.put("Driver's Education", 0.5, "A");
myGrades12.put("Studio Art", 1.0, "A");
myGrades12.put("Piano", 0.5, "A");

Transcript myGrades = new Transcript();
transcriptMethod.get(myGrades);
  }
}
