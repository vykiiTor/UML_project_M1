import java.util.List;

// Course.java
public class Course {
    private String name;
    private String description;
    private double price;
    private List<String> dates;
    private List<String> locations;

    public Subtopic subtopic;
    public Theme theme;

    // Constructor, getters, and setters
    public Course(String name, String description, double price, List<String> dates, List<String> locations) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.dates = dates;
        this.locations = locations;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }
}
