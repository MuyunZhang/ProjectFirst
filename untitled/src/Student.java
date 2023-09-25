public class Student
{

    // instance variables
    private String name;
    private int age;
    private double height;

    // constructor
    public Student(String studentName, int studentAge, double studentHeight)
    {
        name = studentName;
        age = studentAge;
        height = studentHeight;
    }

    public void introduce()
    {
        System.out.println("Hello my name is " + name);
    }

    // method that prints Cat info
    public void printStudentInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "cm");
    }
}
