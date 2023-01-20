package Java.exercise_4.documents;

import Java.exercise_4.documents.HumanResources.*;

public class DocumentFactory {

    public static Document create(DocumentEnum type, String name) {
        switch (type) {
            case INVOICE:
                return new Invoice(name);
            case ORDER:
                return new Order(name);
            case URGENTORDER:
                return new UrgentOrder(name);
            case CV:
                return new CV(name);
            case CONTRACT:
                return new Contract(name);
            default:
                throw new IllegalArgumentException("DocumentFactory received an invalid argument '" + type + "'");
        }
    }
}
