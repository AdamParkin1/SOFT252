package source;

public class Patient extends User {

    private Appointment[] appointments;
    private Prescription[] prescriptions;


    public Patient() {
        setId(getNewID("Patient"));
    }
    
    public Patient(String option) {
        if (option == "request") {
            //dont assign id
        }
    }

    private void reviewDoctor(Doctor doc, String feedback, int rating) {
        Review review = new Review();
        review.setDoctor(doc);
        review.setFeedback(feedback);
        review.setPatient(this);
        review.setRating(rating);
    }

    public void viewDoctor(Doctor doc) {

    }

    public void requestAppointment(Doctor doc, String notes, String time) {
        Appointment appnt = new Appointment();
        appnt.setDoctor(doc);
        appnt.setNotes(notes);
        appnt.setTime(time);
        appnt.setPatient(this);
        PendingAppointments.addAppointment(appnt);
    }

    public void addPrescription(Prescription input) {
        int Length;
        if (prescriptions == null) {
            Length = 0;
        }
        else {
            Length = prescriptions.length;
        }

        Prescription[] newArray = new Prescription[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = prescriptions[i];
        }
        newArray[Length] = input;
        prescriptions = newArray;
    }

    public void viewHistory() {

    }

    public String viewPrescription() {
        return prescriptions[0].getNotes();
    }

    public void requestTermination() {

    }

    public void viewPatient() {

    }
    
    public String getId() {
        return id;
    }
}
