import java.sql.*;

public class BigData {

    public void connectSample() {
        String url = "jdbc:postgresql://localhost:5432/myUsers";
        String user = "student101";
        String password = "read";

        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();;

            String sql = "SELECT id, usr, name, email, password FROM usrs";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String userN = rs.getString("usr");
                String fullName = rs.getString("name");
                String emailAd = rs.getString("email");
                String pass = rs.getString("password");

                System.out.println("id : " + id +
                                "    Usr : " + userN +
                                "    name: " + fullName +
                                "    email: " + emailAd +
                                "    password: " + pass);

            }
        }
        catch(SQLException e){
            e.printStackTrace();

        }


    }


}

