package Entity;


//import javax.comm.*;

import com.mysql.cj.xdevapi.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class try1 {

    public static Map m;
    static int a = 0;
    //public Scanner sc = new Scanner(System.in);
    static String URL = "jdbc:mysql://localhost/boudlerdash";
    static String LOGIN = "root";
    static Connection connection;
    static java.sql.Statement statement;
    static String PASSWORD = "1544azebaze";
    public try1() {


        //m = new Map();
        this.connection = null;
        this.statement = null;
    }


    /*
    *Voici la method qui permet louverture et l'insertion des données dans notre bdd
    * @authors Group1
     */
    public  void open() {
        //m.ask();
        m = new Map();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(try1.URL,
                    try1.LOGIN, try1.PASSWORD);
            statement = connection.createStatement();
            System.out.println("Inserting records");
            String sql = "Insert into BoudlerDash values("+m.getA()+")";
            statement.executeUpdate(sql);
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
            // return false;
        } catch (final SQLException e) {
            e.printStackTrace();
            // return false;
        }
        // return true;

    }
}







