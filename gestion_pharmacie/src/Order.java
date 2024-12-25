import java.util.List;

public class Order {
    private String supplierName;
    private List<Medication> medications;
    private List<Integer> quantities;

    public Order(String supplierName, List<Medication> medications, List<Integer> quantities) {
        this.supplierName = supplierName;
        this.medications = medications;
        this.quantities = quantities;
    }

    // Getters and Setters

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }

}
