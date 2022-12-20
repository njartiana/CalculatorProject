package Test;
import BaseCalcule.*;

public class TestCalcule {
    BaseCalcule base = new BaseCalcule();
    public void test_add(){
        if (base.add(2,2) == 4){
            System.out.println("Test addition passed");
        }
        else{
            System.out.println("Error for function addition");
        }
    }
    public void test_substract(){
        if (base.substraction(4,2) == 2){
            System.out.println("Test subtraction passed");
        }
        else{
            System.out.println("Error for function subtraction");
        }
    }
    public void test_multiplication(){
        if (base.multiplication(4,2) == 8){
            System.out.println("Test multiplication passed");
        }
        else{
            System.out.println("Error for function multiplication");
        }
    }

    public void test_division(){
        if(base.divide(4,2) == 2){
            System.out.println("Test division passed");
        }
        else{
            System.out.println("Error for function division");
        }
    }
}
