package trans.pipe.input_output;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
    public void readMethod(PipedInputStream input){
        try {
            System.out.println("read:");

            byte[] byteArray = new byte[20];
            int readLen = input.read(byteArray);

            while (readLen != -1){
                String newData = new String(byteArray, 0, readLen);
                System.out.println(newData);
                readLen = input.read(byteArray);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
