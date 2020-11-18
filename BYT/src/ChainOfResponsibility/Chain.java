package ChainOfResponsibility;

public interface Chain {


    public void setNextChain(Chain nextChain);

    public void caculate(Numbers request);

}
