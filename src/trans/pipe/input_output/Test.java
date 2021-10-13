package trans.pipe.input_output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Test {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream input = new PipedInputStream();
            PipedOutputStream output = new PipedOutputStream();

            output.connect(input);


            ThreadRead threadRead = new ThreadRead(readData, input);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, output);
            threadWrite.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
