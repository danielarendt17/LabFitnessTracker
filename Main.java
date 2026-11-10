import java.util.Scanner;

class Workout {
    String type;
    int duration;

    Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    void showWorkout() {
        System.out.println("--- Workout Summary ---\nWorkout: " + type
                + "\nDuration: " + duration + " minutes");
    }
}

class RunningWorkout extends Workout {
    double distance;

    RunningWorkout(String type, int duration, double distance) {
        super(type, duration);
        this.distance = distance;
    }

    void showDetails() {
        showWorkout();
        double caloriesBurned = distance*60;
        System.out.println("Distance: " + distance + " km" + "\nCalories Burned: "
                + caloriesBurned + " calories");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter workout type: ");
        String workoutType = input.nextLine();
        System.out.print("Enter duration (minutes): ");
        int workoutDuration = input.nextInt();
        input.nextLine();
        System.out.print("Enter distance (km): ");
        double workoutDistance = input.nextDouble();
        input.nextLine();

        RunningWorkout r1 = new RunningWorkout(workoutType, workoutDuration, workoutDistance);

        r1.showDetails();
    }
}