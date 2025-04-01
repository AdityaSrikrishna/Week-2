import java.util.ArrayList;
import java.util.List;

public class Hospital{
    public static void main(String[] args) {
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        Doctor d1 = new Doctor("Andy");
        Doctor d2 = new Doctor("Brandy");

        d1.addPatient(p1);
        d2.addPatient(p2);

        p1.addDoctor(d1);
        p2.addDoctor(d2);

        d1.consult(p1);
        d1.consult(p2);
    }
}
class Patient{
    private String name;
    private List<Doctor> doctors;

    public Patient(String name){
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addDoctor(Doctor doctor){
        if(!doctors.contains(doctor)){
            doctors.add(doctor);
            doctor.addPatient(this);
        }
    }
    public List<Doctor> listDoctors(){
        return doctors;
    }
}
class Doctor{
    private String name;
    private List<Patient> patients;
    public Doctor(String name){
        this.name = name;
        this.patients = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addPatient(Patient patient){
        if(!patients.contains(patient)){
            patients.add(patient);
            patient.addDoctor(this);
        }
    }
    public void consult(Patient patient){
        if(patients.contains(patient)){
            System.out.println("Dr. " + name + " is consulting " + patient.getName());
        }
        else{
            System.out.println("Dr. " + name + " is not consulting " + patient.getName());
        }
    }
    public List<Patient> listPatients(){
        return patients;
    }
}