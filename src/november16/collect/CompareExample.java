package november16.collect;

import java.util.TreeSet;

public class CompareExample {

    public static void main(String[] args) {

        TreeSet<Note> notes = new TreeSet<>(new NoteComparator());

        Note first = new Note(1, "X");
        Note second = new Note(2, "A");
        Note third = new Note(3, "R");


        // здесь добавляется по NoteComparator и кто больше тот и первый
        notes.add(third);
        notes.add(second);
        notes.add(first);

        System.out.println(notes);

    }

}
