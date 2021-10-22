package java_thread.singleton.enumTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyObject {

    public enum MyEnumSingleton{
        connectionFactory;

        private Connection connection;

        private MyEnumSingleton(){
            try {
                System.out.println("创建Object对象");
                String url = "";
                String username = "";
                String password = "";

                String driverName = "";
                Class.forName("driverName");
                connection = DriverManager.getConnection(url, username, password);
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        public Connection getConnection(){
            return connection;
        }
    }

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}
