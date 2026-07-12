import java.util.Scanner;

public class StudentMarks {

    static void checkMark(int mark) throws InvalidMarkException {

        if (mark < 0)
            throw new InvalidMarkException("Negative marks are not allowed");

        if (mark > 100)
            throw new InvalidMarkException("Marks should be between 0 and 100");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter 3 marks");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    checkMark(mark);

                    total += mark;
                }

                System.out.println("Average = " + (total / 3.0));
            }

        }

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }
    }
}