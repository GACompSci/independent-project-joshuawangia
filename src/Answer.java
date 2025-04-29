public class Answer {
    String key = "";
    Boolean Bval = false;
    String Sval = "";
    Boolean isBoolean = false;
   
    public Answer(String k, boolean b){
        key = k;
        Bval = b;
        isBoolean = true;
    }

    public Answer(String k, String s){
        key = k;
        Sval = s;
    }

    public String getSval(){
        return Sval;
    }

    public boolean getBval(){
        return Bval;
    }

    public String getKey(){
        return key;
    }

    public Boolean checkBoolean(){
        return isBoolean;
    }
}
