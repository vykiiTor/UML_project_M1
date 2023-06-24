import java.util.List;

public class Client {
    private String userName;
    private List<String> interests;
    private String company;
    private List<Course> coursesList;

    public Client(String userName, List<String> interests, String company, List<Course> coursesList) {
        this.userName = userName;
        this.interests = interests;
        this.company = company;
        this.coursesList = coursesList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }
}
