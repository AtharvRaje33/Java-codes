import java.util.List;

public class Stat {

    public static Double min(List<Double> numbers) {
    	Double min = numbers.get(0);
        for (Double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    
    public static Double max(List<Double> numbers) {
        Double max = numbers.get(0);
        for (Double num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

   
    public static Double average(List<Double> numbers) {
        double sum = 0;
        for (Double num : numbers){
            sum += num;
        }
        return sum / numbers.size();
    }

    
    public static Double sd(List<Double> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return null;
        }

        double mean = average(numbers);
        double sumSquaredDiff = 0;

        for (Double num : numbers) {
            double diff = num - mean;
            sumSquaredDiff += diff * diff;
        }

        double variance = sumSquaredDiff / (numbers.size() - 1);
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        List<Double> numbers = List.of(10.5, 20.3, 15.7, 25.0, 18.2);

        System.out.println("Numbers: " + numbers);
        System.out.println("Minimum: " + min(numbers));
        System.out.println("Maximum: " + max(numbers));
        System.out.println("Average: " + average(numbers));
        System.out.println("Standard Deviation: " + sd(numbers));
    }
}

