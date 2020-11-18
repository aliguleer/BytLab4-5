package ChainOfResponsibility;


public class Test {

    public static void main(String[] args) {


        Chain chain1 = new AddNumbers();

        Chain chain2 = new SubstractNumbers();

        Chain chain3 = new MultNumbers();

        Chain chain4 = new DivNumbers();



        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Numbers request = new Numbers(10,12,"*");

        chain1.caculate(request);




    }


}
