import java.util.HashMap;
import java.util.Map;

public class Document {
    private String id;
    private String name;
    private String location;

    private Map<String, Object> tags = new HashMap<>();

    public Document(String id, String name, String location){
        this.id = id;
        this.name = name;
        this.location = location;

    }

    public void addTag(String key, Object obj){
        tags.put(key, obj);
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public String getLocation(){
        return this.location;
    }

}