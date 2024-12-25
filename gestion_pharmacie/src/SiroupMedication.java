import java.util.Date;

public class SiroupMedication extends Medication {
    private double volumePerBottle;

    public SiroupMedication(String name, String reference, int stockQuantity, Date expirationDate, double volumePerBottle) {
        super(name, reference, stockQuantity, expirationDate);
        this.volumePerBottle = volumePerBottle;
    }

    public double getVolumePerBottle() {
        return volumePerBottle;
    }

    
}
