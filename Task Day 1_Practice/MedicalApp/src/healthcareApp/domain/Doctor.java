package healthcareApp.domain;

import healthcareApp.exceptions.InvalidDoctorDataException;

public class Doctor implements IDoctor {

    private int id;
    private String name;
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty())
            throw new InvalidDoctorDataException("Doctor name cannot be empty");
        this.name = name.trim();
    }

    @Override
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if(specialization == null || specialization.isEmpty())
            throw new InvalidDoctorDataException("Specialization cannot be empty");
        this.specialization = specialization.trim();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
