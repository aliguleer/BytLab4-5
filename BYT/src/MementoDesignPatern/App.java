package MementoDesignPatern;

public class App {
    public static void main(String[] args) {


        Memory memory = new Memory();
        NotePad notepad= new NotePad();

        notepad.add("A");
        notepad.add("L");
        notepad.add("I");

        NotePadMemento ali =notepad.save();

        memory.add(ali);

        notepad.print();

        notepad.add("X");

        NotePadMemento alix =notepad.save();
        memory.add(alix);

        notepad.print();

        memory.lastVersionBring();

        notepad.ctrlz(memory.lastVersionBring());

        NotePadMemento aliy =notepad.save();

        memory.add(aliy);

        notepad.print();








    }
}
