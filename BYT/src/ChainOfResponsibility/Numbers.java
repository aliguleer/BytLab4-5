package ChainOfResponsibility;


public class Numbers {

    private int number1;
    private int number2;

    private String operator;

    public Numbers(int newNumber1, int newNumber2, String newOperator){

        number1=newNumber1;
        number2=newNumber2;

        operator=newOperator;

    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getOperator() {
        return operator;
    }
}
