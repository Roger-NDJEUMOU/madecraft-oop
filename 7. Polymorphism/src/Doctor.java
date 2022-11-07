import java.util.List;

public class Doctor {

    protected String name;

    public Doctor() {
        this.name = "Doctor" ;
    }

    public void doMedicine(){
        System.out.printf("A %s performs general consultations. \n", name);
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        GeneralPractitioner practitioner = new GeneralPractitioner();
        Surgeon surgeon = new Surgeon();

        List<Doctor> doctors = List.of(doctor, practitioner, surgeon) ;
        doctors.forEach(Doctor::doMedicine);
    }

}

class GeneralPractitioner extends Doctor{

    public GeneralPractitioner() {
        this.name = "General Practitioner";
        System.out.println("We have a " + this.name);
    }

    @Override
    public void doMedicine(){
        System.out.printf("A %s makes house calls. \n", name);
    }

    public void makeHouseCalls(){

    }
}

class Surgeon extends Doctor {

    public Surgeon() {
        this.name = "Surgeon";
        System.out.println("We have a " + this.name);
    }

    @Override
    public void doMedicine(){
        System.out.printf("A %s performs surgery. \n", name);
    }

    public void performSurgery(){

    }
}
