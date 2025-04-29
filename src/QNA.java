public class QNA {
    String[] questions = {"Is your teacher a male?", "What department is your teacher?", 
    "What house does your teacher belong to?", "Does your teacher have hair?",
    "What color hair does your teacher have?", "Does your teacher wear glasses?", 
    "Does your teacher have a beard?"};

    String[] atts = {"male", "dept","house", "hasHair", "hairColor", "hasGlasses", "hasBeard"};

    public QNA(){
    }

    public String askQuestion(int q){
        return questions[q];
    }

    public Answer Sanswer(int q, String input){
        if (input.equals("null")){
            return new Answer(atts[q], null);
        }
        Answer sanswer = new Answer(atts[q], input);
        return sanswer;
    }

    public Answer Banswer(int q, boolean input){
        Answer banswer = new Answer(atts[q], input);
        return banswer;
    }
}
