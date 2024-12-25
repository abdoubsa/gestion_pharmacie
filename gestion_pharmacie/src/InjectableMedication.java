import java.util.Date;

public class InjectableMedication extends Medication {
    private double injectionSize;

    public InjectableMedication(String name, String reference, int stockQuantity, Date expirationDate, double injectionSize) {
        super(name, reference, stockQuantity, expirationDate);
        this.injectionSize = injectionSize;
    }

    public double getInjectionSize() {
        return injectionSize;
    }

}
