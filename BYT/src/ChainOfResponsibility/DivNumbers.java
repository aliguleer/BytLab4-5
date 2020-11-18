package ChainOfResponsibility;


public class DivNumbers implements Chain {



    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain=nextChain;
    }

    @Override
    public void caculate(Numbers request) {

        if(request.getOperator()=="/"){

            System.out.println(request.getNumber1()+"/"+request.getNumber2() +"="+request.getNumber1()/ request.getNumber2() );

        }
        else {
            System.out.println("you can choose only + , - , * , / ");

        }

    }

}
