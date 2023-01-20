package Java.exercise_4.documents;

public enum DocumentEnum {
    INVOICE, ORDER, URGENTORDER, CV, CONTRACT;

    public static DocumentEnum stringToEnum(String type) {
        type.toLowerCase();
        switch (type) {
            case "invoice":
                return INVOICE;
            case "order":
                return ORDER;
            case "urgentorder":
                return URGENTORDER;
            case "cv":
                return CV;
            case "contract":
                return CONTRACT;
            default:
                throw new IllegalArgumentException("Couldn't match type '" + type + "' to any enum");
        }
    }
}