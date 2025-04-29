import java.util.Map;
import java.util.HashMap;

public class Teacher {
    Map<String, Object> attributes = new HashMap<>();

    public Teacher (Boolean male, String dept, String house, Boolean hasHair,
     String hairColor, Boolean hasGlasses, Boolean hasBeard, String name){
        attributes.put("male", male);
        attributes.put("dept", dept);
        attributes.put("house", house);
        attributes.put("hasHair", hasHair);
        attributes.put("hairColor", hairColor);
        attributes.put("hasGlasses", hasGlasses);
        attributes.put("hasBeard", hasBeard);
        attributes.put("name", name);



     }

     //precondition: assume getB is looking for a Boolean
    public Boolean getB(String var){
        Object value =  attributes.get(var);
          return (Boolean) value;
  
    }


    public String getS(String var){
        Object value = attributes.get(var);
        return (String) value;

    }

    public String toString(){
        return (String) attributes.get("name");
    }

    
}
