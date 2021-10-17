package singleton.serialize;

import java.io.*;

public class SaveAndRead {
    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();

            System.out.println("序列化Object= " + myObject.hashCode());

            FileOutputStream fosRef = new FileOutputStream(new File("myObject.txt"));
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(myObject);
            oosRef.close();
            fosRef.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fisRef = new FileInputStream(new File("myObject.txt"));
            ObjectInputStream iosRef = new ObjectInputStream(fisRef);
            MyObject myObject = (MyObject) iosRef.readObject();
            iosRef.close();
            fisRef.close();

            System.out.println("序列化Object= " + myObject.hashCode());
        }catch (FileNotFoundException | ClassNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
