package Registration.dao;

import Registration.model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    public int registerEmployee(Employee employee) throws ClassNotFoundException{
        String INSERT_USERS_SQL = "INSERT INTO employee" +
                "   id, first_name VARCHAR(20) last_name VARCHAR(20) DEFAULT NULL, username, user_password, address, contact) VALUES" +
                " (?, ?, ?, ?, ?, ?, ?);";

        int result = 0;
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false","root","root")) {
           // We create a statement using connection
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, employee.getFirstName());
            preparedStatement.setString(3, employee.getLastName());
            preparedStatement.setString(4, employee.getUsername());
            preparedStatement.setString(5, employee.getPassword());
            preparedStatement.setString(6, employee.getAddress());
            preparedStatement.setString(7, employee.getContact());

            System.out.println(preparedStatement);
            // We execute the query or update query
            result = preparedStatement.executeUpdate()
        } catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }

}
