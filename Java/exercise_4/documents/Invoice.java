package Java.exercise_4.documents;

public class Invoice extends Document {
    
    private String type;

    public Invoice(String name) {
        super(name);
        type = "invoice";
    }

    public String toString() {
        String str = super.toString();
        return str + ", type: " + type;
    }

}