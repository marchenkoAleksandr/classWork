package november16.collect;

public class Note /*implements Comparable<Note>*/{

    int id;
    String name;

    public Note(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*@Override
    public int compareTo(Note o) {
        if (id > o.id) {
            return 1;
        } else if (id == o.id) {
            return 0;
        } else {
            return -1;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (id != note.id) return false;
        return name != null ? name.equals(note.name) : note.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
