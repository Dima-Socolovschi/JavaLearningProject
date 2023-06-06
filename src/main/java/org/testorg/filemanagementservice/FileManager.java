package org.testorg.filemanagementservice;

import java.io.File;

public class FileManager {
    public static boolean createTheFileIfItDoesNotExist(File file){
        try{
            return file.createNewFile();
        }
        catch (Exception e){
            System.out.println("The next error appears - " + e.getMessage());
            return false;
        }
    }

    public static void informIfTheFileExists(File file){
        if(file.exists()){
            System.out.println("File exist");
        }
        else{
            System.out.println("File does not exist");
        }
    }

    public static void printTheFileName(File file){
        System.out.println("Name of the file is " + file.getName());
    }

    public static void printTheFileAbsolutePath(File file){
        System.out.println("The absolute path to file is " + file.getAbsolutePath());
    }

    public static void printIfTheFileIsADirectoryOrNot(File file){
        System.out.println(file.isFile() ? "The file is a file" : "The file is a directory");
    }

    public static void deleteTheFileIfExists(File file){
        System.out.println(file.delete() ? "The file was delited" : "The file cannot be delited");
    }
}
