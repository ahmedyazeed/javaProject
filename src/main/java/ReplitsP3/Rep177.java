package ReplitsP3;

 interface Outputs {
     void display(double result);
}
interface  Functions extends Outputs {
    double adding(double firstNumber,double SecondNumber);
    double subtracting(double firstNumber,double SecondNumber);
    double multiply(double firstNumber,double SecondNumber);
    double dividing(double firstNumber,double SecondNumber);
}
class OutputsTester implements Functions{


    public void display(double result) {
        System.out.println("Result is ::: "+result);
    }

    @Override
    public double adding(double firstNumber, double SecondNumber) {
        double result=firstNumber+SecondNumber;
       this.display(result);
        return result;
    }

    @Override
    public double subtracting(double firstNumber, double SecondNumber) {
        double result=firstNumber-SecondNumber;
        this.display(result);
        return result;
    }

    @Override
    public double multiply(double firstNumber, double SecondNumber) {
        double result=firstNumber*SecondNumber;
        this.display(result);
        return result;
    }

    @Override
    public double dividing(double firstNumber, double SecondNumber) {
        double result=firstNumber/SecondNumber;
        this.display(result);
        return result ;
    }

    public static void main(String[] args) {
        double firstNumber = 100.00;
        double secondNumber = 20.00;

        OutputsTester obj=new OutputsTester();
        obj.adding(firstNumber,secondNumber);
        obj.subtracting(firstNumber,secondNumber);
        obj.multiply(firstNumber,secondNumber);
        obj.dividing(firstNumber,secondNumber);

    }
    
}
