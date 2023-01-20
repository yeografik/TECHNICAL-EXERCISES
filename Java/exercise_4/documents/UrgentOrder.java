package Java.exercise_4.documents;

public class UrgentOrder extends Order {

    public UrgentOrder(String name) {
        super(name);
        type = "urgent order";
        priority = 5;
    }

    public String toString() {
        return super.toString();
    }

}