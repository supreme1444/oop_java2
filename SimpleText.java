package convertor;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleText extends Writer {

    @Override
    public void gettextWriter() {
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
           // запись всей строки
            String text = "Иван Иванов=4.8\nМария Кузнецова=5.0\nСтепан Кузьмин=3.6";
            
            writer.write(text);

                      
            
           
           
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
     
        
    }

   

   

    
