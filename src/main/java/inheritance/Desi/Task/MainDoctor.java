package inheritance.Desi.Task;

import inheritance.Desi.Cat;

public class MainDoctor {
    public static void main(String[] args) {
        Doctor physician = new Doctor();
        physician.treatPatient();

        Surgeon eor = new Surgeon();
        eor.performSurgery();
    }
}
