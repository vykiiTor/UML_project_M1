import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

// Main.java
public class Main {
    public static void main(String[] args) {
        //TrainingManager trainingManager = new TrainingManager();

        List<String> datesOfcourses = Arrays.asList("23/07/2023", "24/07/2023", "25/07/2023");
        List<String> locations = Arrays.asList("distance");
        Course c1 = new Course("UML", "UML in java", 50.0, datesOfcourses, locations);
        Course c2 = new Course("Bio chromosomes", "speciality chromosomes", 55.0, datesOfcourses, locations);;
        List<Course> itCourses = new ArrayList<>();
        itCourses.add(c1);
        itCourses.add(c2);
        c1.subtopic = Subtopic.JAVA;
        c1.theme = Theme.COMPUTER_SCIENCE;

        Client cl1 = new Client( "Benj",Arrays.asList("Gym"),"EFREI",itCourses);
        Client cl2 = new Client("Vic",Arrays.asList("Gym"),"EFREI",itCourses);
        List<Client> clientsList= new ArrayList<>();
        clientsList.add(cl1);
        clientsList.add(cl2);


        Trainer t = new Trainer("HuGOD", 10);

        Session s1 = new Session(c1,"24/07/2023", t);
        s1.addTrainee(cl1);
        s1.addTrainee(cl2);
        s1.sessionDetails();

        System.out.println("your tutor is at :" + t.getRating());



        // Evaluate a training session
        //TrainingEvaluation evaluation = new TrainingEvaluation(session.getSessionId(), 5, 4, 5, 4, "The trainer was knowledgeable and engaging.");
        //trainingManager.evaluateTrainingSession(evaluation);
    }
}
