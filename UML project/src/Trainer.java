public class Trainer {
    private String name;
    private double rating;

    // Constructor
    public Trainer(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Bonus Functions

    // Calculate the Trainer's rating category based on their rating value
    public String getRatingCategory() {
        if (rating >= 9.0) {
            return "GOD";
        } else if (rating >= 7.0) {
            return "Good";
        } else if (rating >= 5.0) {
            return "ok";
        } else {
            return "noob";
        }
    }

    // Increase the Trainer's rating by a given increment
    public void increaseRating(double increment) {
        rating += increment;
    }

    // Decrease the Trainer's rating by a given decrement
    public void decreaseRating(double decrement) {
        rating -= decrement;
    }
}

