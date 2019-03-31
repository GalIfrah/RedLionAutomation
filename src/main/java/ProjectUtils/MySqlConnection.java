package ProjectUtils;

import java.sql.Connection;
import java.sql.DriverManager;


public class MySqlConnection {


    public static void main(String[] args) {

        MySqlConnection obj_DB_Connection = new MySqlConnection();


        Connection connection=obj_DB_Connection.get_connection();;


//        connection=obj_DB_Connection.get_connection();


        System.out.println(connection);
    }


    public Connection get_connection(){

        Connection connection=null;


        try{

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RedLionAutomation","user","");


        }catch (Exception e) {

            System.out.println(e);
        }


        return connection;
    }
}
