package ru.db.annotations;

public class MainCarLombok {
    public static void main(String[] args) {
        CarLombok car1 = new CarLombok();                 // NoArgsConstructor
        CarLombok car2 = new CarLombok("Tesla", "2023");    // RequiredArgsConstructor (vin не указан, если final)
        CarLombok car3 = new CarLombok("Tesla", 2023, "XYZ123"); // AllArgsConstructor
        System.out.println("car 1:");
        System.out.println(car1);
        System.out.println("\n car 2:");
        System.out.println(car2);
        System.out.println("\n car 3:");
        System.out.println(car3);
    }
}
