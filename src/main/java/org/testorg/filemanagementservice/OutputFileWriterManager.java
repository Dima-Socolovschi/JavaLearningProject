package org.testorg.filemanagementservice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class OutputFileWriterManager {
    public static void writeContentIntoFileUsingFileWriter(String path, String text){
        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(path);
            fileWriter.write(text);
        }
        catch (Exception e){
            System.out.println("Cannot write into a file, next error appears: " + e.getMessage() );
        }
        finally {
            try {
                if(fileWriter != null){
                    fileWriter.close();
                }
            }
            catch (Exception e){
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }

    public static void writeContentIntoFileUsingBufferWriter(String path, String text){
        BufferedWriter fileBufferedWriter = null;

        try{
            fileBufferedWriter = new BufferedWriter(new FileWriter(path));
            fileBufferedWriter.write(text);
        }
        catch (Exception e){
            System.out.println("Cannot write into a file, next error appears: " + e.getMessage() );
        }
        finally {
            try {
                if(fileBufferedWriter != null){
                    fileBufferedWriter.close();
                }
            }
            catch (Exception e){
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }
}
