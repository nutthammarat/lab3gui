import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtuserlogin;
    private JPasswordField pwduserpassword;
    private JButton btnSummit;
    private JButton btnClear;
    private JPanel mainPlanel;

    public Login() {
        btnSummit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtuserlogin.getText() + " " + new String (pwduserpassword.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtuserlogin.setText("");
                pwduserpassword.setText("");
            }
        });
    }
    public JPanel getMainPlanel(){
        return  mainPlanel;
    }
}
