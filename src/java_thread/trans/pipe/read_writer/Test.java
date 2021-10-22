package java_thread.trans.pipe.read_writer;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader input = new PipedReader();
            PipedWriter output = new PipedWriter();

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
