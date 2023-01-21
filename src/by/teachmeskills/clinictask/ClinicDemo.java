package by.teachmeskills.clinictask;

public class ClinicDemo {
    public static void main(String[] args) {
        Clinic firstDoctor = new Clinic("Surgeon", "Plan1");
        Clinic secondDoctor = new Clinic("Therapist", "Plan2");
        Clinic thirdDoctor = new Clinic("Dentist", "Plan3");

        firstDoctor.treatmentPlan = "code2";
        secondDoctor.treatmentPlan = "code1";
        thirdDoctor.treatmentPlan = "code3";

        System.out.println(firstDoctor.assignDoctor());
        System.out.println(secondDoctor.assignDoctor());
        System.out.println(thirdDoctor.assignDoctor());
    }
}
