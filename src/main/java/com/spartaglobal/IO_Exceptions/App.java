package com.spartaglobal.IO_Exceptions;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        ByteReaderManager byteReaderManager = new ByteReaderManager();
//        byteReaderManager.readStream();
//        byteReaderManager.charReader();
        BufferedFileManager bufferedFileManager = new BufferedFileManager();
        try {
            bufferedFileManager.readerWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
