package source;

public class Appointment {

    Object patient;
    Object doctor;
    String notes;
    String time;

    public Object getPatient() {
        return patient;
    }

    public void setPatient(Object patient) {
        this.patient = patient;
    }

    public Object getDoctor() {
        return doctor;
    }

    public void setDoctor(Object doctor) {
        this.doctor = doctor;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
