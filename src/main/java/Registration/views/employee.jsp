<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <div align="center">
        <h1>Employee Register Form</h1>
        <form action="<%= request.getContextPath() %>/register" method="post">
            <table style="with: 80%">
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstname"/></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastName"/></td>
                </tr>
                 <tr>
                      <td>User Name</td>
                      <td><input type="text" name="userName"/></td>
                 </tr>
                  <tr>
                       <td>Password</td>
                       <td><input type="text" name="user_password"/></td>
                  </tr>
                   <tr>
                        <td>Address</td>
                        <td><input type="text" name="address"/></td>
                   </tr>
                    <tr>
                        <td>Contact No</td>
                         <td><input type="text" name="contact"/></td>
                    </tr>
            </table>
            <input type="submit" value="submit"/>
    </form>
    </div>
</body>
</html>