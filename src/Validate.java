import java.sql.*;
import java.util.Scanner;

public class Validate {
    public void validateUser(){


        String url = "jdbc:postgresql://localhost:5432/myUsers";
        String user = "student101";
        String password = "read";

        try {

            System.out.println("Name? ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();

            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();;

            String sql = "SELECT * FROM usrs WHERE usr='" + name + "'  ";
            ResultSet rs = stmt.executeQuery(sql);

            if(rs.next()) {
                System.out.println("Yes. You are on the list.");

                // Update attempt
                Update myUpdate = new Update();
                myUpdate.updateUser(name, "2perry@fakeemail.com", "new1234");

            }
            else
                System.out.println("No. You are not on the list.");


        }
        catch(SQLException e){
            System.out.println("ERROR: " + e.getMessage());
//            e.printStackTrace();

        }

    }
}
