package Java.exercise_4;

import java.util.Scanner;
import Java.exercise_4.documents.*;

public class Printer {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("invoice file 1");
        Order order = new Order("order no. 3");
        System.out.println(invoice);
        System.out.println(order);

        Order urgentOrder = new UrgentOrder("urgent order no. 2");
        System.out.println(urgentOrder);

        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter file type: ");  
        String type = sc.nextLine();  
        System.out.print("Enter file name: ");  
        String name = sc.nextLine();  

        Document doc = DocumentFactory.create(DocumentEnum.stringToEnum(type), name);
        System.out.println(doc);
    }
}