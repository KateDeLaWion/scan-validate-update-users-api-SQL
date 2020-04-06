import java.sql.*;


public class Update {

        public void updateUser(String user2, String email2, String password2 ){
            String url = "jdbc:postgresql://localhost:5432/myUsers";
            String user = "student101";
            String password = "read";

            PreparedStatement pst = null;

            try {
                Connection conn = DriverManager.getConnection(url,user,password);
                pst = conn. prepareStatement("UPDATE usrs SET email=?, password=? WHERE usr=?");
                pst.setString(1,email2);
                pst.setString(2,password2);
                pst.setString(3,user2);
                pst.executeUpdate();

                System.out.println("Updated Successfully");
            }catch (Exception ex){
                ex.printStackTrace();
            }


        }
    }


