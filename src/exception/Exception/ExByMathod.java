

public class ExByMathod {
void method1(){
    int res = 5/0;

}
 void method2(){
    method1();
}


    public void main(String[] args){
    try{
        method2();
    }
    catch(ArithmeticException e){
            System.out.println("Expection Handaling" +e);
        }
        System.out.println("program continuou...");

    }
}

