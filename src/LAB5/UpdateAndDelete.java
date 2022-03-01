package LAB5;

import java.util.Scanner;
import java.sql.*;

public class UpdateAndDelete {
    public static void main(String[] args) throws Exception {

        Scanner inp = new Scanner(System.in);

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost/College";
        String user = "postgres";
        String password = "pass";

        Connection con = DriverManager.getConnection(url, user, password);

        if (con == null) {
            System.out.println("Connection Error.");
        } else {
            System.out.println("Connection Success.");
        }

        System.out.println("-------------------------------");

        Statement stmt = con.createStatement();

        while (true) {
            System.out.println("What do you want to do?\n1. Update\n2. Delete\n3. Quit");
            int choice = inp.nextInt();
            inp.nextLine(); // to read enter key

            System.out.println("-------------------------------");

            if (choice == 1) {

                System.out.println("Enter Roll for Operation: ");
                int roll = inp.nextInt();
                inp.nextLine(); // to read enter key

                System.out.println("-------------------------------");

                System.out.println("Enter Name: ");
                String name = inp.nextLine();
                System.out.println("Enter Address: ");
                String address = inp.nextLine();
                System.out.println("Enter College: ");
                String college = inp.nextLine();

                String sql = "UPDATE public.\"Student\" SET \"Name\"='" + name + "', \"Address\"='" + address
                        + "', \"College\"='" + college + "' WHERE \"Roll\"=" + roll + ";";

                boolean status = stmt.execute(sql);

                System.out.println("-------------------------------");

                if (!status) {
                    System.out.println("Record Updated Successfully.");
                } else {
                    System.out.println("Update Error.");
                }

                System.out.println("-------------------------------");

            } else if (choice == 2) {

                System.out.println("Enter Roll for Operation: ");
                int roll = inp.nextInt();
                inp.nextLine(); // to read enter key

                System.out.println("-------------------------------");

                String sql = "DELETE FROM public.\"Student\" WHERE \"Roll\" = " + roll + ";";

                boolean status = stmt.execute(sql);

                if (!status) {
                    System.out.println("Record Deleted Successfully.");
                } else {
                    System.out.println("Deletion Error.");
                }

                System.out.println("-------------------------------");

            } else if (choice == 3) {

                break;

            } else {

                continue;

            }

        }

        inp.close();

    }
}
