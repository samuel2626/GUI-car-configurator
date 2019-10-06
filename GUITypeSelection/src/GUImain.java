import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GUImain extends JFrame{
    private JButton butSUV;
    private JButton butSED;
    private JButton butCON;

    public GUImain(String title) {
            super(title);
            this.setSize(930, 600);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            initButtons();
            setLayout(null);

        }

        private class ButtAction implements ActionListener {

            private JButton button;
            private ButtAction(JButton but) {
                this.button = but;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                changeFrameType(button);
            }
        }

        private void changeFrameType(JButton btn){
            this.dispose();
            GUItype type = new GUItype(btn.getText());
            type.setLocationRelativeTo(null);
            type.setVisible(true);
        }

        private void initButtons(){
            this.butSUV = new JButton("SUV")   ;
            this.add(butSUV);
            butSUV.setBounds(200, 200, 130, 100);

            this.butSED = new JButton("SEDAN");
            this.add(butSED);
            butSED.setBounds(400, 200, 130, 100);

            this.butCON = new JButton("CONVERTIBLE");
            this.add(butCON);
            butCON.setBounds(600, 200, 130, 100);

            butSUV.addActionListener(new ButtAction(butSUV));
            butSED.addActionListener(new ButtAction(butSED));
            butCON.addActionListener(new ButtAction(butCON));
        }


        public static void main(String args[]) {
            GUImain frame = new GUImain("CAR CONFIGURATOR");
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
}

