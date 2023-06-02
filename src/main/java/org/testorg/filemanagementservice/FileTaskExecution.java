package org.testorg.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {

        File file = new File("src/main/java/org/testorg/filemanagementservice/file.txt");

        FileManager.informIfTheFileExists(file);
        FileManager.createTheFileIfItDoesNotExist(file);
        FileManager.informIfTheFileExists(file);
        FileManager.printIfTheFileIsADirectoryOrNot(file);
        FileManager.printTheFileAbsolutePath(file);
        FileManager.printTheFileName(file);
        FileManager.deleteTheFileIfExists(file);

        String path = "src/main/java/org/testorg/filemanagementservice/textOutput.txt";
        String text1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String text2 = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(path, text1);
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(path, text2);

        File fileObject = new File(path);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObject);
        InputFileReadManager.printDataFromFileUsingFiles(fileObject);
        InputFileReadManager.printDataFromAFile(fileObject);
    }
}
