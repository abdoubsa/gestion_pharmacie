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