package source;

public class Secretary extends User {

    public void approvePatientAccounts() {

    }

    public void viewAppointmentRequests() {

    }

    public void setupAppointment() {

    }

    public void giveMedicine() {

    }

    public void removePatient(Patient patient) {
        Data.popObject(Data.patients, patient);
    }

    public void approvePatientRemoval() {

    }
}
