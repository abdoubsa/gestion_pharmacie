import java.util.Date;
import java.util.List;

public class Prescription {
    private Date perscriptionDate;
    private List<Medication> medications;
    private String frequency;
    private int treatmentDuration;

    public Prescription(Date perscriptionDate, List<Medication> medications, String frequency, int treatmentDuration) {
        this.perscriptionDate = perscriptionDate;
        this.medications = medications;
        this.frequency = frequency;
        this.treatmentDuration = treatmentDuration;
    }

    // Getters and Setters

    public Date getPerscriptionDate() {
        return perscriptionDate;
    }

    public void setPerscriptionDate(Date perscriptionDate) {
        this.perscriptionDate = perscriptionDate;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getTreatmentDuration() {
        return treatmentDuration;
    }

    public void setTreatmentDuration(int treatmentDuration) {
        this.treatmentDuration = treatmentDuration;
    }


}
