package Java.exercise_4.documents;

public class Document {

    protected String name;

    public Document(String name) {
        this.name = name;
    }

    public String toString() {
        return "Document: " + name;
    }

}