package Java.exercise_4.documents;

public class Order extends Document{

    protected String type;
    protected int priority;

    public Order(String name) {
        super(name);
        type = "order";
        priority = 1;
    }

    public String toString() {
        String str = super.toString();
        return str + ", type: " + type + ", priority: " + priority;
    }

}