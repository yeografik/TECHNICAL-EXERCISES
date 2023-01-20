package Java.exercise_4.documents.HumanResources;

import Java.exercise_4.documents.Document;

public class Contract extends Document {

    private String type;
    private String charge;

    public Contract(String name) {
        super(name);
        type = "contract";
        charge = "junior developer";
    }

    public String toString() {
        String str = super.toString();
        return str + ", type: " + type + ", charge: " + charge;
    }

}