public class StudentRunner
{
    public static void main(String[] args)
    {
        Student Student1 = new Student("Shakib", 17, 170);
        Student1.introduce();
        Student1.printStudentInfo();


        Student Student2 = new Student("Muyun", 16, 186);
        Student2.printStudentInfo();
        Student2.introduce();
    }
}
