package com.spartaglobal.IO_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteReaderManager {

    public void readStream(){
        try( InputStream input = new FileInputStream("Resources/TestFile.txt");){
            int data = 0;
            while (data != -1){
                data = input.read();
                System.out.println(data);
            }
        }catch (IOException error){
            error.printStackTrace();
        }
    }
    public void charReader(){
        try( InputStream input = new FileInputStream("Resources/TestFile.txt");){
            int data = 0;
            int Tcount = 0;
            int Acount = 0;
            int Bcount = 0;
            while (data != -1){
                data = input.read();
                System.out.println((char)data);
                if ((char)data == 'T'){
                    Tcount++;
                }
                if ((char)data == 'A'){
                    Acount++;
                }
                if ((char)data == 'B'){
                    Bcount++;
                }
            }
            System.out.println(Tcount);
            System.out.println(Acount);
            System.out.println(Bcount);
        }catch (IOException error){
            error.printStackTrace();
        }
    }
}
