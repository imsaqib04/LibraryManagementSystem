public class User {
    private String name;
    private int userId;
    private boolean isAdmin;

    public User(int userId, String name, boolean isAdmin) {
        this.userId = userId;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name + ", Role: " + (isAdmin ? "Admin" : "User");
    }
}
