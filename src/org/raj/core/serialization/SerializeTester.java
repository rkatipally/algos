package org.raj.core.serialization;

import java.io.*;

/**
 * Created by RJK on 10/21/2016.
 */
public class SerializeTester {

    public static void main(String[] args) {

        SerializeTester serializeTester = new SerializeTester();
        User userIn = new User();
        userIn.setEmail("rkatipally@xyz.org");
        userIn.setUserName("rkatipally");
        serializeTester.serializeUser(userIn);
        User userOut = serializeTester.deserializeUser("obj2.txt");

        System.out.println("Email :" + userOut.getEmail());
        System.out.println("Username :" + userOut.getUserName());

        System.out.println("Deserializing before change");

        //java.io.InvalidClassException: if the class is change after serialization
        User userOutPre = serializeTester.deserializeUser("obj1.txt");
        System.out.println("Email :" + userOutPre.getEmail());
        System.out.println("Username :" + userOutPre.getUserName());

    }

    public void serializeUser(User user) {
        try (FileOutputStream fileOut = new FileOutputStream(new File("obj2.txt"));
             ObjectOutputStream out = new ObjectOutputStream(fileOut);
        ) {
            System.out.println("Serializing");
            out.writeObject(user);
            out.flush();
            return;

        } catch (IOException ie) {
            ie.printStackTrace();
        }
        return;

    }

    public User deserializeUser(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(new File(fileName));
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            System.out.println("De-serializing");
            User user = (User) in.readObject();
            return user;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
