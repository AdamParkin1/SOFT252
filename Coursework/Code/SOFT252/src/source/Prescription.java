package source;

public class Prescription {

    private Object patient;

    private Object doctor;

    private Object medicine;

    private String notes;

    private int quantity;

    private String Dosage;

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

    public Object getMedicine() {
        return medicine;
    }

    public void setMedicine(Object medicine) {
        this.medicine = medicine;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }
    
}
