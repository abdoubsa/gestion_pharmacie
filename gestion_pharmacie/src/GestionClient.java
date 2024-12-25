import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;


public class GestionClient {
    static LinkedList<Client> clients = new LinkedList<Client>();
    public static int height = 600;
    public static int width = 900;

    public static void main(String[] args) {
        showClient();
    }

    public static void showClient() {
        JFrame frame = new JFrame("Gestion des clients");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 90, width, height);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(242, 242, 247));
        frame.getContentPane().setLayout(null);

        JLabel title = new JLabel("Gestion des clients");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        frame.getContentPane().add(title);

        JLabel lastName = new JLabel("Nom: ");
        lastName.setFont(new Font("Arial", Font.PLAIN, 20));
        lastName.setSize(100, 20);
        lastName.setLocation(100, 100);
        frame.getContentPane().add(lastName);

        JTextField lastNameText = new JTextField();
        lastNameText.setFont(new Font("Arial", Font.PLAIN, 15));
        lastNameText.setSize(190, 20);
        lastNameText.setLocation(200, 100);
        frame.getContentPane().add(lastNameText);

        JLabel firstName = new JLabel("Prenom: ");
        firstName.setFont(new Font("Arial", Font.PLAIN, 20));
        firstName.setSize(100, 20);
        firstName.setLocation(100, 150);
        frame.getContentPane().add(firstName);

        JTextField firstNameText = new JTextField();
        firstNameText.setFont(new Font("Arial", Font.PLAIN, 15));
        firstNameText.setSize(190, 20);
        firstNameText.setLocation(200, 150);
        frame.getContentPane().add(firstNameText);

        JLabel phoneNumber = new JLabel("Tel : ");
        phoneNumber.setFont(new Font("Arial", Font.PLAIN, 20));
        phoneNumber.setSize(200, 20);
        phoneNumber.setLocation(100, 200);
        frame.getContentPane().add(phoneNumber);

        JTextField phoneNumberText = new JTextField();
        phoneNumberText.setFont(new Font("Arial", Font.PLAIN, 15));
        phoneNumberText.setSize(190, 20);
        phoneNumberText.setLocation(200, 200);
        frame.getContentPane().add(phoneNumberText);

        JLabel res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(((width/3)), height-100);
        frame.getContentPane().add(res);

        JLabel ClientNumber = new JLabel("Numero: ");
        ClientNumber.setFont(new Font("Arial", Font.PLAIN, 20));
        ClientNumber.setSize(200, 20);
        ClientNumber.setLocation(100, 350);
        frame.getContentPane().add(ClientNumber);

        JTextField ClientNumberText = new JTextField();
        ClientNumberText.setFont(new Font("Arial", Font.PLAIN, 15));
        ClientNumberText.setSize(190, 20);
        ClientNumberText.setLocation(200, 350);
        frame.getContentPane().add(ClientNumberText);

        JButton deleteClient = new JButton("Supprimer");
        deleteClient.setFont(new Font("Arial", Font.PLAIN, 15));
        deleteClient.setSize(150, 20);
        deleteClient.setLocation(100, 450);
        frame.getContentPane().add(deleteClient);
        deleteClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1){
                try{
                    int clientNumber = Integer.parseInt(ClientNumberText.getText().trim());
                    if (clientNumber < 0 || clientNumber >= clients.size()) {
                        throw new IllegalArgumentException("Numero de client invalide");
                    }
                    clients.remove((clientNumber - 1));
                    ClientNumberText.setText("");
                    res.setText("Client supprimé avec succès");
                } catch (IllegalArgumentException e2){
                    res.setText(e2.getMessage());
                }
            }
        });

        JButton updateClient = new JButton("Modifier");
        updateClient.setFont(new Font("Arial", Font.PLAIN, 15));
        updateClient.setSize(150, 20);
        updateClient.setLocation(300, 400);
        frame.getContentPane().add(updateClient);
        updateClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1){
                try{
                    int clientNumber = Integer.parseInt(ClientNumberText.getText().trim());
                    if (clientNumber < 0 || clientNumber > clients.size()) {
                        throw new IllegalArgumentException("Numero de client invalide");
                    }
                    String lastName = lastNameText.getText().trim();
                    String firstName = firstNameText.getText().trim();
                    String phoneNumber = phoneNumberText.getText().trim();

                    if (lastName.equals("") || firstName.equals("") || phoneNumber.equals("")) {
                        throw new IllegalArgumentException("Veuillez remplir tous les champs");
                    }

                    Client client = new Client(firstName, lastName, phoneNumber);
                    clients.set(((clientNumber - 1)), client);

                    firstNameText.setText("");
                    lastNameText.setText("");
                    phoneNumberText.setText("");
                    ClientNumberText.setText("");

                    res.setText("Client modifié avec succès");

                } catch (IllegalArgumentException e2){
                    res.setText(e2.getMessage());
                }
            }
        });

        JButton addClient = new JButton("Ajouter");
        addClient.setFont(new Font("Arial", Font.PLAIN, 15));
        addClient.setSize(100, 20);
        addClient.setLocation(150, 250);
        frame.getContentPane().add(addClient);
        addClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1){
                try{
                    String lastName = lastNameText.getText().trim();
                    String firstName = firstNameText.getText().trim();
                    String phoneNumber = phoneNumberText.getText().trim();

                    if (lastName.equals("") || firstName.equals("") || phoneNumber.equals("")) {
                        throw new IllegalArgumentException("Veuillez remplir tous les champs");
                    }

                    Client client = new Client(firstName, lastName, phoneNumber);
                    clients.add(client);

                    firstNameText.setText("");
                    lastNameText.setText("");
                    phoneNumberText.setText("");

                    res.setText("Client ajouté avec succès");

                } catch (IllegalArgumentException e2){
                    res.setText(e2.getMessage());
                }
            }
        });

        JTextArea show = new JTextArea();
		show.setFont(new Font("Arial", Font.PLAIN, 15));
		show.setSize(300, 400);
		show.setLocation(500, 100);
		show.setLineWrap(true);
        show.setWrapStyleWord(true);
		show.setEditable(false);

        JScrollPane scroll = new JScrollPane(show);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		frame.getContentPane().add(scroll);

        JButton showClients = new JButton("Afficher");
        showClients.setFont(new Font("Arial", Font.PLAIN, 15));
        showClients.setSize(150, 20);
        showClients.setLocation(100, 400);
        frame.getContentPane().add(showClients);
        showClients.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1){

                try {
                    if (clients.size() == 0) {
                        throw new IllegalArgumentException("Aucun client trouvé");
                    }
                    String clientsList = "";
                    int i = 1;
                    for (Client client : clients) {
                        clientsList += "Client " + i + "): \nNom: "+ client.getLastName().toString() + "\nPrenom: " + client.getLastName().toString() + "\nTel: " + client.getPhoneNumber().toString()+ "\n";
                        i++;
                    }
                    show.setText(clientsList);
                } catch (IllegalArgumentException e) {
                    show.setText(e.getMessage());
                }

            }
        });


}
}

