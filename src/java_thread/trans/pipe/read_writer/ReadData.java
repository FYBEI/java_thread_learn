package java_thread.trans.pipe.read_writer;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
    public void readMethod(PipedReader input){
        try {
            System.out.println("read:");

            char[] charArray = new char[20];
            int readLen = input.read(charArray);

            while (readLen != -1){
                String newData = new String(charArray, 0, readLen);
                System.out.println(newData);
                readLen = input.read(charArray);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
