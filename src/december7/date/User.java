package december7.date;

import java.util.Date;

/**
 * Created by kovalchuk on 07.12.2016.
 */
public class User {

    private String name;
    private Date registered;

    public User(String name, Date registered) {
        this.name = name;
        this.registered = registered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registered=" + registered +
                '}';
    }
}
