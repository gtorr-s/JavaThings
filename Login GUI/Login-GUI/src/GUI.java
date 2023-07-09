import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    private static JPanel panel;

    public static void main (String[] args) {

        panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80,90,25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,110);
        panel.add(success);



        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("admin") && password.equals("admin")){
            success.setText("Login feito com sucesso");

            BufferedImage foto;

            try {
                foto = ImageIO.read(new File("C:\\Users\\Gabri\\OneDrive\\Área de Trabalho\\Login GUI\\nosepass.png"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            int widht = 90;
            int height = 90;
            Image tmp = foto.getScaledInstance(widht,height, Image.SCALE_SMOOTH);
            foto = new BufferedImage(widht,height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D graphics2D = foto.createGraphics();
            graphics2D.drawImage(tmp, 0,0, null);
            graphics2D.dispose();

            JLabel calvo = new JLabel(new ImageIcon(foto));
            calvo.setBounds(190,120,widht,height);
            panel.add(calvo);

        }


    }

}
