import javax.swing.*;
import java.awt.*;

public class ihm {
	
	public static final double MAINCOMPONENTXSIZE = 1.0;
	public static final double MAINCOMPONENTYSIZE = 1.0;
	
//////////////////////////////////////////////////////////////////  MAIN  //////////////////////////////////////////////////////////////////////
	
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        
        frame.add(panel);
        addComponentToMainPanel(panel);
        frame.setVisible(true);
    }

////////////////////////////////////////////////////////////////  ON CLICK  ////////////////////////////////////////////////////////////////////
    
    private static void addComponentToMainPanel(JPanel panel) {
        
    	JLabel startLabel = new JLabel("Protégez votre peau avec la dose idéale de crème solaire !");
    	JButton startButton = new JButton("Commencer");
    	JLabel emptyLabel = new JLabel("");
   	
    	
    	startLabel.setForeground(Color.WHITE);
        startLabel.setFont(new Font("Arial", Font.BOLD, 30));
        startButton.setPreferredSize(new Dimension(200, 50));
        startButton.setBackground(Color.YELLOW);
        startButton.setFont(new Font("Arial", Font.BOLD, 18));
    	
    	panel.setLayout(new GridBagLayout());
        GridBagConstraints cp = new GridBagConstraints();
        
        cp.gridx = 1;
        cp.gridy = 0;
        cp.gridwidth = 3;
        cp.insets = new Insets(100, 0, 0, 0);
        cp.weightx = MAINCOMPONENTXSIZE;
        cp.weighty = MAINCOMPONENTYSIZE;
        panel.add(startLabel, cp);
        
        cp.gridy = 1;
        cp.gridwidth = 1;
        cp.insets = new Insets(0, 0, 100, 0);
        panel.add(startButton, cp);
        
        cp.gridy = 2;
        cp.gridwidth = 3;
        cp.weighty = 1.0-MAINCOMPONENTYSIZE;
        cp.insets = new Insets(0, 0, 0, 0);
        panel.add(emptyLabel, cp);
        
        /*
        JLabel userLabel = new JLabel("Entrez votre texte :");
        userLabel.setBounds(10, 20, 150, 25);
        panel.add(userLabel);


        JTextField userText = new JTextField(20);
        userText.setBounds(150, 20, 200, 25);
        panel.add(userText);


        JButton loginButton = new JButton("Cliquez ici");
        loginButton.setBounds(150, 60, 120, 25);
        panel.add(loginButton);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = userText.getText();
                JOptionPane.showMessageDialog(null, "Vous avez entré : " + text);
            }
        });*/
    }
}
