package november16.collect;

import java.util.Comparator;

public class NoteComparator implements Comparator<Note> {

    @Override
    public int compare(Note o1, Note o2) {
        return o1.name.compareTo(o2.name);
    }
}
