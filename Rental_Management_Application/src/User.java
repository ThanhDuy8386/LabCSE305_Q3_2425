import java.util.ArrayList;

public class User {
    int UserID;
    String Password;
    String Email;
    String UserType;
    ArrayList<User> Users = new ArrayList<>();

    public User(int userID, String password, String email, String userType) {
        UserID = userID;
        Password = password;
        Email = email;
        UserType = userType;
    }

    public void CreateUser(int userID, String password, String email, String userType) {
        var user = new User(userID, password, email, userType);
        Users.add(user);
    }

    public void ResetPassword(String newPasswork) {
        this.Password = newPasswork;
    }

    public int getUserID() {
        return UserID;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getUserType() {
        return UserType;
    }

    public ArrayList<User> getUsers() {
        return Users;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public void setUsers(ArrayList<User> users) {
        Users = users;
    }
}
