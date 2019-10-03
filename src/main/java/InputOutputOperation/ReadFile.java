package InputOutputOperation;

import java.io.*;
import java.util.Date;

public class ReadFile {
    public static void main(String[] args) throws InterruptedException, IOException {

        //Create Directory
        System.out.println("===================================");
        System.out.println( "Create new directory in /tmp" );
        File file1 = new File( "/tmp/newDir/" );
        if (!file1.exists()) {
            file1.mkdir();
            System.out.println( "Directory created here /tmp/newDir/" );
        } else System.out.println( "Directory already exist in /tmp/newDir/" );

        Thread.sleep( 1000 );
        //Create file
        File file = new File( "/tmp/newDir/javatestfile.txt" );
        System.out.println( "File Exist: "+file.exists() );

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println( "file /tmp/newDir/javatestfile.txt created!" );
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println( "path exist: " + file.exists() );
            System.out.println( "apath: " + file.getAbsolutePath() );
            System.out.println( "size: " + file.length() );
            System.out.println( "Last modified: " + file.lastModified() );
            Date date = new Date( file.lastModified() );
            System.out.println( "Readable date: " + date );
            System.out.println( "Is directory: " + file.isDirectory() );
        }

        Thread.sleep( 1000 );
        //Create another file
        System.out.println("===================================");
        File file2 = new File( "/tmp/newDir/javatestfile2.txt" );
        System.out.println( "File Exist: "+file2.exists() );

        if (!file2.exists()) {
            try {
                file2.createNewFile();
                System.out.println( "file /tmp/newDir/javatestfile2.txt created!" );
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println( "path exist: " + file2.exists() );

            Thread.sleep( 1000 );
            //List files
            System.out.println("===================================");
            File directory = new File( "/tmp/newDir/" );
            String[] filelist = directory.list();
            System.out.println("Listing file in directory "+directory);
            for (String listfile : filelist) {
                System.out.println( listfile );
            }
        }

        Thread.sleep( 1000 );
        // Read and Write files
        System.out.println("===================================");
        try {
            FileInputStream fileInputStream = new FileInputStream( "/tmp/newDir/javatestfile.txt" );
            System.out.println("Number of bytes to be read: "+ fileInputStream.available());
        } catch (Exception e){
            e.printStackTrace();
        }

        // Read a character
//        System.out.println("===================================");
//        FileInputStream fileInputStream = new FileInputStream( "/tmp/newDir/javatestfile.txt" );
//        System.out.println(fileInputStream.available());
//        System.out.println((char) (fileInputStream.read()));
//        System.out.println(fileInputStream.available());

        // Read the file
        System.out.println("===================================");
        FileInputStream fileInputStream = new FileInputStream( "/tmp/newDir/javatestfile.txt" );
        int count = fileInputStream.read();
        while (count != -1){
            System.out.print((char)(count));
            Thread.sleep( 100 );
            count = fileInputStream.read();
        }
        System.out.println("===================================");
        //Creating file Stream object
        FileInputStream fileInputStream1 = new FileInputStream( "/tmp/newDir/javatestfile.txt" );
        //Creating byte array
        byte [] readfile = new byte[fileInputStream1.available()];
        //Read file using Stream object
        fileInputStream1.read(readfile);
        //Put read file in a string
        String str = new String(readfile);
        Thread.sleep( 1000 );
        System.out.println(str);

        //Read file line by line
        System.out.println("===================================");
        FileInputStream fileInputStream2 = new FileInputStream( "/tmp/newDir/javatestfile.txt" );
        InputStreamReader insr = new InputStreamReader( fileInputStream2 );
        BufferedReader br = new BufferedReader( insr );
        String line = br.readLine();
        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }

        //Write into the file
        FileOutputStream fileOutputStream = new FileOutputStream( "/tmp/newDir/javatestfile3.txt",true );
        String line2 = "This is new line ";
        byte [] data = line2.getBytes();
        fileOutputStream.write( data );
        System.out.println("File created with data");

    }
}
