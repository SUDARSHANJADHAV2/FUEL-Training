package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 8 students:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("\nMarks entered:");
        System.out.println(marks);

        System.out.print("\nEnter index to update (0 to " + (marks.size() - 1) + "): ");
        int updateIndex = sc.nextInt();

        if (updateIndex >= 0 && updateIndex < marks.size()) {
            System.out.print("Enter new mark: ");
            int newMark = sc.nextInt();
            marks.set(updateIndex, newMark);
            System.out.println("Mark updated successfully.");
        } else {
            System.out.println("Invalid index. Update skipped.");
        }

        System.out.print("\nEnter index to remove (0 to " + (marks.size() - 1) + "): ");
        int removeIndex = sc.nextInt();

        if (removeIndex >= 0 && removeIndex < marks.size()) {
            marks.remove(removeIndex);
            System.out.println("Mark removed successfully.");
        } else {
            System.out.println("Invalid index. Removal skipped.");
        }

        System.out.print("\nEnter a mark to search: ");
        int searchMark = sc.nextInt();

        if (marks.contains(searchMark)) {
            System.out.println("Mark found in the list.");
        } else {
            System.out.println("Mark not found in the list.");
        }

        System.out.println("\nFinal list of marks:");
        System.out.println(marks);

        sc.close();
    }
}
