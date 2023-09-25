public class CatRunner
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("destroyer", 7, 20.3);
        cat1.introduce();
        cat1.printCatInfo();


        Cat cat2 = new Cat("wraith", 2, 19);
        cat2.printCatInfo();
        cat2.introduce();
    }
}