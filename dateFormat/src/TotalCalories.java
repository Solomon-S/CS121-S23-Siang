import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TotalCalories {
    public static int getTotalCalories(int caloriesPerDay, String startDateStr, String endDateStr) {
        // Convert start and end date strings to LocalDate objects
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        LocalDate endDate = LocalDate.parse(endDateStr, formatter);

        // Calculate the number of days on the diet
        int daysOnDiet = endDate.compareTo(startDate) + 1;

        // Calculate the total calories consumed over the days of the diet
        int totalCalories = caloriesPerDay * daysOnDiet;
        return totalCalories;
    }
}
