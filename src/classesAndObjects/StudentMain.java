package classesAndObjects;

public class StudentMain {
    public static void main(String[] args) {
        double[] studentGrades = {85.5 , 90.0, 78.3, 92.7};
        Student student1 = new Student("Alice",20,studentGrades);

        double averageGrade = student1.calculateAverageGrade();
        System.out.println("Average grade: " + averageGrade);

        student1.updateAge(21);
        student1.updateName("Sufiyan");

        student1.displayStudentInfo();
    }
}
