import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class Json extends Writer {

    @Override
    public void gettextWriter() throws IOException {
        
        JSONObject object = new JSONObject();
        object.put("Иван Иванов", "4.8");
        object.put("Мария Кузнецова", "5.0");
        object.put(""Степан Кузьмин", "3.6");
        try (FileWriter writer = new FileWriter("C:/Users/supre/OneDrive/Рабочий стол/Новая папка (11)/convertor/Json1.json")){
            writer.write(object.toJSONString());
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(JsonSimpleExample.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
    }
    
}
