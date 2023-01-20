package Java.exercise_4.documents.HumanResources;

import Java.exercise_4.documents.Document;

public class CV extends Document {

    private String type;

    public CV(String name) {
        super(name);
        type = "CV";
    }

    public String toString() {
        String str = super.toString();
        return str + ", type: " + type;
    }

}