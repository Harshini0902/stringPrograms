import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;

        try{
            fileWriter=new FileWriter("C:/sample/sample.txt",true);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Venkatesh : 789546");
//            bufferedWriter.flush();
            bufferedWriter.write("Harshini : 946349");
 //           bufferedWriter.flush();

        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            //don't close fileWriter first,bcos calling close() on bufferedWriter attempts to flush contents and is stopped if Filewriter its wrapping is closed first
            try{

                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
