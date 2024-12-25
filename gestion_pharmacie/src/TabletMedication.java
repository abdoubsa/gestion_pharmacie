import java.util.Date;

public class TabletMedication extends Medication {
    private int unitsPerBox;

    public TabletMedication(String name, String reference, int stockQuantity, Date expirationDate, int unitsPerBox) {
        super(name, reference, stockQuantity, expirationDate);
        this.unitsPerBox = unitsPerBox;
    }

    public int getUnitsPerBox() {
        return unitsPerBox;
    }
}