public class SOFT252 {

    public static void main(String[] args) {
        
        patient p = new patient();
        
        for (int i = 0; i < 5; i++) {
             
             prescription pre = new prescription();
             pre.setNotes("e");
             p.addPrescription(pre);
        }

        p.viewPrescriptions();
    }
}
