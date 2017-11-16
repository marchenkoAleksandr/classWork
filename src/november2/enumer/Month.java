package november2.enumer;

public enum Month implements Enumable {

    January("Январь") {
        @Override
        String action() {
            return ruName.substring(0, 3);
        }
    },

    February("Февраль") {
        @Override
        String action() {
            return String.valueOf(ruName.length());
        }
    },

    March("Март") {
        @Override
        String action() {
            return ruName.toUpperCase();
        }
    };

    String ruName;

    abstract String action();

    void print() {
        System.out.println(ruName);
    }

    Month(String ruName) {
        this.ruName = ruName;
    }

    @Override
    public String toString() {
        return "Month{" +
                "ruName='" + ruName + '\'' +
                '}';
    }

    static Month getByName(String name) {
        for (Month month : values()) {
            if (month.name().equals(name)) {
                return month;
            }
        }
        return null;
    }
}
