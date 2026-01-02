package healthcareApp.domain;

import healthcareApp.exceptions.InvalidDoctorDataException;
import healthcareApp.exceptions.InvalidPatientDataException;

public class Patient implements IPatient{

    private int id;
    private String name;
    private Integer age;
    private String disease;


    public Patient(int id, String name, Integer age, String disease) {
        setId(id);
        setName(name);
        setAge(age);
        setDisease(disease);
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
            throw new InvalidPatientDataException("Patient name cannot be empty");
        this.name = name.trim();
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age <= 0 || age == null){
            throw new InvalidPatientDataException("Patient Age cannot be negative and it should not be null");
        }


        this.age = age;
    }

    @Override
    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        if(disease == null || disease.isEmpty()){
            throw new InvalidPatientDataException("Disease cannot be empty");
        }
        this.disease = disease.trim();
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                '}';
    }
}
