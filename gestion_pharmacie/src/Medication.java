import java.util.Date;

// Medication.java
public abstract class Medication {
    private String name;
    private String reference;
    private int stockQuantity;
    private Date expirationDate;

    public Medication(String name, String reference, int stockQuantity, Date expirationDate) {
        this.name = name;
        this.reference = reference;
        this.stockQuantity = stockQuantity;
        this.expirationDate = expirationDate;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}