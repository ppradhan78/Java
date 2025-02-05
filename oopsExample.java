public class oopsExample {
    public static void main(String[] args) {
        Calculator objCalculator=new Calculator();
       System.out.println(objCalculator.Add(2, 5)); 
    }
}
 class Calculator {

    public int Add(int num1,int num2){
        return num1+num2;
    }
}