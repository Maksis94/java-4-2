public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.87; // рост, в метрах
        int weightKgs = 98; // вес, в килограммах

        // рассчитываем BMI
        int bmi = service.calculate(heightMeters, weightKgs);
        System.out.println(bmi);
    }
}