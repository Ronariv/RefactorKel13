import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// class that acts as our data access layer
public class QrData {
    public Map<String, String> savedData = new HashMap<>();
    
    public void store(String name, String content) {
        savedData.put(name, content);
    }

    public Optional<String> retrieve(String name){
        return Optional 
    }
}
