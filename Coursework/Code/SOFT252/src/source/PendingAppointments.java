package source;

public final class PendingAppointments {
    private static Appointment[] pendingAppointments;

    private PendingAppointments() {

    }

    public static void addAppointment(Appointment item) {
        int NumOfAppointments;
        if (pendingAppointments == null) {
            NumOfAppointments = 0;
        }
        else {
            NumOfAppointments = pendingAppointments.length;
        }

        Appointment[] newArray = new Appointment[NumOfAppointments + 1];
        for (int i = 0; i < NumOfAppointments; i++) {
            newArray[i] = pendingAppointments[i];
        }
        newArray[NumOfAppointments] = item;
        pendingAppointments = newArray;

    }
}
