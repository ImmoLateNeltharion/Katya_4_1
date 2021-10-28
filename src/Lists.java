import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List comm = new ArrayList();
        int actionNum = 1;
        while (actionNum != 0) {
            System.out.println("\nAction:\n1. Show list of commodity\n2. Add commodity in list\nEnter num of action: ");
            actionNum = scanner.nextInt();
            switch (actionNum) {
                case 1:
                    show(comm);
                    break;
                case 2:
                    add(comm);
                    break;
                default:
                    System.out.println("Choose correct num\n");
                    break;
            }
        }
    }

    static void show(List list) {
        int counter = 1;

        for (int i = 0; i < list.size(); i++) {

            System.out.println(counter + " commodity " + list.get(i)+"\n");
            counter++;
        }

        if(list.isEmpty()) {System.out.println("Is empty!");}

    }
    static void add(List list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose type of commodity:\n1.Fragile\n2.Overall\n3.Scrapboarding\nEnter num: ");
        int num = scan.nextInt();
        switch(num) {
            case 1:
                System.out.print("Enter Id: ");
                int id1 = scan.nextInt();
                System.out.print("Enter productCode: ");
                int code1 = scan.nextInt();
                System.out.print("Enter name: ");
                String name1 = scan.next();
                System.out.print("Enter wholesalePrice: ");
                int wholesalePrice1 = scan.nextInt();
                System.out.print("Enter retailPrice: ");
                int retailPrice1 = scan.nextInt();
                System.out.print("Enter height: ");
                int height1 = scan.nextInt();
                System.out.print("Enter weight:");
                int weight1 = scan.nextInt();
                System.out.print("Enter width: ");
                int width1 = scan.nextInt();
                Overall item1 = new Overall(id1, code1, name1, wholesalePrice1, retailPrice1, height1, weight1, width1);
                list.add(item1);
                break;
            case 2:
                System.out.print("Enter Id: ");
                int id2 = scan.nextInt();
                System.out.print("Enter productCode: ");
                int code2 = scan.nextInt();
                System.out.print("Enter name: ");
                String name2 = scan.next();
                System.out.print("Enter wholesalePrice: ");
                int wholesalePrice2 = scan.nextInt();
                System.out.print("Enter retailPrice: ");
                int retailPrice2 = scan.nextInt();
                System.out.print("Enter time: ");
                String time3 = scan.next();

                Scrapboarding item2 = new Scrapboarding(id2, code2, name2, wholesalePrice2, retailPrice2, time3);
                list.add(item2);
                break;
            case 3:
                System.out.print("Enter Id: ");
                int id3 = scan.nextInt();
                System.out.print("Enter productCode: ");
                int code3 = scan.nextInt();
                System.out.print("Enter name: ");
                String name3 = scan.next();
                System.out.print("Enter wholesalePrice: ");
                int wholesalePrice3 = scan.nextInt();
                System.out.print("Enter retailPrice: ");
                int retailPrice3 = scan.nextInt();
                System.out.print("Enter coefficient: ");
                int coefficient3 = scan.nextInt();
                Fragile item3 = new Fragile(id3, code3, name3, wholesalePrice3, retailPrice3, coefficient3);
                list.add(item3);
                break;
            default:
                break;
        }
    }
}

