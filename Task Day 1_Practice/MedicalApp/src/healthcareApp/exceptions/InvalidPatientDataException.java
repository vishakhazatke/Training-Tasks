package healthcareApp.exceptions;

public class InvalidPatientDataException extends MedicalException{
    public InvalidPatientDataException(String message){
        super(message);
    }
}
