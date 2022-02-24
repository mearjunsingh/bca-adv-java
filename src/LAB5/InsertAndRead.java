package LAB5;

import java.util.Scanner;
import java.sql.*;

public class InsertAndRead {
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
            System.out.println("What do you want to do?\n1. Insert\n2. Read\n3. Quit");
            int choice = inp.nextInt();
            inp.nextLine(); // to read enter key

            System.out.println("-------------------------------");

            if (choice == 1) {

                System.out.println("Enter Roll: ");
                int roll = inp.nextInt();
                inp.nextLine(); // to read enter key
                System.out.println("Enter Name: ");
                String name = inp.nextLine();
                System.out.println("Enter Address: ");
                String address = inp.nextLine();
                System.out.println("Enter College: ");
                String college = inp.nextLine();

                String sql = "INSERT INTO public.\"Student\"(\"Roll\", \"Name\", \"Address\", \"College\") VALUES ("
                        + roll + ", '" + name + "', '" + address + "', '" + college + "');";

                boolean status = stmt.execute(sql);

                System.out.println("-------------------------------");

                if (!status) {
                    System.out.println("Record Inserted Successfully.");
                } else {
                    System.out.println("Insertion Error.");
                }

                System.out.println("-------------------------------");

            } else if (choice == 2) {

                ResultSet rs = stmt.executeQuery("SELECT * FROM public.\"Student\";");

                while (rs.next()) {
                    System.out.println(rs.getInt("Roll") + " : " + rs.getString("Name") + " : "
                            + rs.getString("Address") + " : " + rs.getString("College"));
                }

                System.out.println("-------------------------------");

            } else if (choice == 3) {

                System.out.println("Exiting Application...");
                break;

            } else {

                continue;

            }
        }

        System.out.println("-------------------------------");

        inp.close();

    }
}