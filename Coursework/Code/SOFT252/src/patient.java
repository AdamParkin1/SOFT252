import java.util.ArrayList;

public class patient extends user {

    private String sex;

    private int age;

    private Object[] appointments;

    private prescription prescriptions[];

    private Object[] reviewsMade;

    public patient() {
        prescriptions = new prescription[0];
    }
    
    private void reviewDoctor() {
    }

    private void viewDoctor() {
    }

    private void requestAppointment() {
    }

    private void viewHistory() {
    }

    public void viewPrescriptions() {
        for (int i = 0; i < (prescriptions.length); i++) {
            System.out.println(prescriptions[i].getNotes());
        }
    }

    private void requestTermination() {
    }

    public void viewPatient() {
    }

    public void addAppointment() {
    }
    
    public void addPrescription(prescription input) {
        int numOfPrescriptions;
        if (input == null) {
            numOfPrescriptions = 0;
        }
        else {
            numOfPrescriptions = prescriptions.length;
        }
         
        prescription newArray[] = new prescription[numOfPrescriptions+1];
        

        for (int i = 0; i < (numOfPrescriptions); i++){
           newArray[i] = prescriptions[i];
        }
        
        newArray[numOfPrescriptions] = input;
        prescriptions = newArray;
    }

    public void addReviewMade() {
        
        
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object[] getAppointments() {
        return appointments;
    }

    public prescription[] getPrescriptions() {
        return prescriptions;
    }

    public Object[] getReviewsMade() {
        return reviewsMade;
    }
    
    
}
