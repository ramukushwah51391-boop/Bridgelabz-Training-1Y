public class AddTwoNo{
    public static void main(String[] args) {
        Add obj = new Add();
        obj.sum();
    }
}

class Add{
    int a= 10; int b=20;
    void sum(){
        System.out.println(a+b);
    }
}
