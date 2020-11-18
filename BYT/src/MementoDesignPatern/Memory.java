package MementoDesignPatern;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Memory {

    private List<NotePadMemento> list;

    public Memory() {
        list = new ArrayList<>();
    }

    public void add(NotePadMemento memento) {

        list.add(memento);
    }

    public NotePadMemento lastVersionBring() {
        if (!list.isEmpty()) {

            NotePadMemento lastVersion = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return lastVersion;

        } else {
            throw new ArrayIndexOutOfBoundsException("No version");

        }
    }
}