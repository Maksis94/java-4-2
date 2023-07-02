public class BmiService {
    public int calculate(double heightMeters, int weightKgs) {
        // BMI = рост / (вес^2)
        // результат приводим к целому числу
        return (int)(weightKgs / (heightMeters * heightMeters));
    }
}
