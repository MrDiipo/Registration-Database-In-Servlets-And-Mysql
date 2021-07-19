package Registration.servlet;

import Registration.dao.EmployeeDAO;
import Registration.model.Employee;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/request")
public class EmployeeServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;
    private EmployeeDAO employeeDAO;

    // Run constructor of HttpServlet class
    public EmployeeServlet(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().append("Served at: ").append(response.getContentType());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletResponse response, HttpServletRequest request){
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String user_password = request.getParameter("user_password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setAddress(address);
        employee.setContact(contact);
        employee.setLastName(lastName);
        employee.setPassword(user_password);
        employee.setUsername(username);

        try {
            employeeDAO.registerEmployee(employee);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            response.sendRedirect("");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
