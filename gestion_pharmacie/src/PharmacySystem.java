import java.util.List;
import java.util.ArrayList;


public class PharmacySystem {
    private List<Client> clients = new ArrayList<>();
    private List<Supplier> suppliers = new ArrayList<>();
    private List<Medication> medications = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public void addMedication(Medication medication) {
        medications.add(medication);
    }

    // Other CRUD operations
}