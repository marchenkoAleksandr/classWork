package december5.object;

import java.io.*;

public class UserDataIO {

    public static void main(String[] args) throws IOException {

        User created = new User(9, "Angela");

        File file = new File("D:/data.out");

        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(file));
        dataOut.writeInt(created.getId());
        dataOut.writeUTF(created.getName());
        dataOut.close();

        DataInputStream dataIn = new DataInputStream(new FileInputStream(file));
        int id = dataIn.readInt();
        String name = dataIn.readUTF();
        User user = new User(id, name);

        System.out.println(user.equals(created));

    }

}
