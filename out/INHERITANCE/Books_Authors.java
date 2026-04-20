public class Books_Authors {
    public static void main(String[] args) {
        auther a = new auther();
        a.name="Raj kushwah";
        a.title="sing";
        a.bio="A greatfull book";
        a.year=2025;
        a.disp();
        a.dis();

        
    }

}
class book{
    String title;
    int year;
    void dis(){
        System.out.println("title of the book  :  " +title);
        System.out.println("published year in which :  " +year);

    }
}
class auther extends book{
    String name;
    String bio;
    void disp(){
        System.out.println("name of the auther :  " +name);
        System.out.println("bio of the book  :   "+bio);
    }

}
