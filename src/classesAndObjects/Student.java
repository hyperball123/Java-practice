package classesAndObjects;

public class Student {
    private String name;
    private int age;
    private double[] grades;

    public Student(String name,int age,double[] grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public double calculateAverageGrade(){
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }

        return sum/grades.length;
    }

    public void updateAge(int newAge){
        this.age = newAge;
    }
    public void updateName(String newName){
        this.name = newName;
    }
    public void displayStudentInfo(){
        System.out.println(name + " is " + age + " years old has scored " + calculateAverageGrade());
    }
}
