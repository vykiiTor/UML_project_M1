import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Session {
    private Course course;
    private String date;
    private List<Client> trainees;
    private Trainer trainer;

    public Session(Course course, String date, Trainer trainer) {
        this.course = course;
        this.date = date;
        this.trainees = new ArrayList<>();
        this.trainer = trainer;
    }

    // Getters and Setters
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public List<Client> getTrainees() {
        return trainees;
    }

    public void setTrainees(List<Client> trainees) {
        this.trainees = trainees;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    // Additional methods
    public void addTrainee(Client client) {
        trainees.add(client);
    }

    public void removeTrainee(Client client) {
        trainees.remove(client);
    }

    // reste

    public void sessionDetails() {
        System.out.println("Session Details:");
        System.out.println("Course: " + course.getName());
        System.out.println("Date: " + date);
        System.out.println("Trainer: " + trainer.getName());
        System.out.println("Trainees: ");
        for (Client trainee : trainees) {
            System.out.println("- " + trainee.getUserName());
        }
    }
}
