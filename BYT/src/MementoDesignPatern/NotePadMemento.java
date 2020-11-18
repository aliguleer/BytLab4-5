package MementoDesignPatern;

public class NotePadMemento {

    private String text;

    public NotePadMemento() {

        text = "";
    }

    public String getText() {
        return text;
    }

    public NotePadMemento(String text){
        this.text=text;
    }



}
