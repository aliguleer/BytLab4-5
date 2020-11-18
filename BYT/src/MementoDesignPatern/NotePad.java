package MementoDesignPatern;

public class NotePad {

    private String text;

    public NotePad() {

        text = "";
    }
    public NotePad(String text){
        this.text=text;
    }


    public void add(String textToAdd){

        text=text+textToAdd;
    }

    public NotePadMemento save(){
        return  new NotePadMemento(text);

    }

    public void ctrlz(NotePadMemento momento){

        text=momento.getText();

    }
    public void print(){
        System.out.println(text);

    }


}
