package templatedesignPatern;

public class Basketball extends Game {

    @Override
    void endPlay(){
        System.out.println("Basketball game finished!");
    }
    @Override
    void initialize(){
        System.out.println("Basketball game initialized!");
    }
    @Override
    void startPlay(){
        System.out.println("Basketball game started!");
    }

}
