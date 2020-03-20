import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/LincmG/IdeaProjects/TestDB/TestDB.db");
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email MESSAGE_TEXT)");

        }catch (SQLException e){
            System.out.println("Something went wrong: " + e);
        }
    }
}
