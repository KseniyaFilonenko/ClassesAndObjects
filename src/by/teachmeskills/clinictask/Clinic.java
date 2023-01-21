package by.teachmeskills.clinictask;
/* Создать программу для имитации работы клиники (Clinic).

Пусть в клинике будет три врача: хирург , терапевт и дантист.
Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
Так же предусмотреть класс «Пациент» и класс «План лечения».
Создать объект класса «Пациент» и добавить пациенту план лечения.
Так же создать метод, который будет назначать врача пациенту согласно
плану лечения.
Если план лечения имеет код 1 – назначить хирурга и выполнить метод
лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод
лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод лечить.
*/
public class Clinic {
    String doctorType;
    String treatmentPlan;

    public Clinic(String doctorType, String treatmentPlan){
        this.doctorType = doctorType;
        this.treatmentPlan = treatmentPlan;
    }
    public void treat(String doctorType, String treatmentPlan){
        this.doctorType = doctorType;
        this.treatmentPlan = treatmentPlan;
    }
    public String assignDoctor(){
        if (treatmentPlan == "code1"){
            System.out.println(this.doctorType + " will use the following plan: ");
        } else if (treatmentPlan == "code2"){
            System.out.println(this.doctorType + " will use the following plan: ");
        } else {
            System.out.println(this.doctorType + " will use the following plan: ");
        }
        return treatmentPlan;
    }
}
