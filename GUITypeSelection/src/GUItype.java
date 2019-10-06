import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class GUItype extends JFrame implements ActionListener{

    private JPanel panelSUV = new JPanel();
    private JPanel panelSED = new JPanel();
    private JPanel panelCON = new JPanel();
    private JLabel carLabel;
    private String[] suvSeats = {"4 seats", "5 seats", "7 seats", "8 seats"};
    private String[] suvDrive = {"2x4", "4x4"};
    private String[] suvEngine = {"type 3", "type 4", "type 5"};
    private String[] suvTires = {"type 3", "type 4", "type 5"};
    private String[] sedTrailerAttachment = {"With trailer attachment", "No trailer attachment"};
    private String[] sedInterior = {"Leather", "Plastic", "Wood", "Gold"};
    private String[] sedEngine = {"type 1", "type 2", "type 3"};
    private String[] sedTires = {"type 2", "type 2", "type 4"};
    private String[] conDoors = {"1 door", "2 doors", "4 doors"};
    private String[] conRoof = {"Aluminium", "Canvas", "Plastic", "Gold"};
    private String[] conEngine = {"type 2", "type 3", "type 4"};
    private String[] conTires = {"type 1", "type 2", "type 3"};
    private JComboBox<String> suvSeatsCB = new JComboBox<>(suvSeats);
    private JComboBox<String> suvDriveCB = new JComboBox<>(suvDrive);
    private JComboBox<String> suvEngineCB = new JComboBox<>(suvEngine);
    private JComboBox<String> suvTiresCB = new JComboBox<>(suvTires);
    private JComboBox<String> sedTrailerAttachmentCB = new JComboBox<>(sedTrailerAttachment);
    private JComboBox<String> sedInteriorCB = new JComboBox<>(sedInterior);
    private JComboBox<String> sedEngineCB = new JComboBox<>(sedEngine);
    private JComboBox<String> sedTiresCB = new JComboBox<>(sedTires);
    private JComboBox<String> conDoorsCB = new JComboBox<>(conDoors);
    private JComboBox<String> conRoofCB = new JComboBox<>(conRoof);
    private JComboBox<String> conEngineCB = new JComboBox<>(conEngine);
    private JComboBox<String> conTiresCB = new JComboBox<>(conTires);




    public GUItype(String title){
        super(title);
        System.out.println(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(930, 600);

        panelSUV.setBackground(Color.PINK);
        panelSED.setBackground(Color.ORANGE);
        panelCON.setBackground(Color.YELLOW);

        suvSeatsCB.addActionListener(this);
        suvDriveCB.addActionListener(this);
        suvEngineCB.addActionListener(this);
        suvTiresCB.addActionListener(this);
        sedTrailerAttachmentCB.addActionListener(this);
        sedInteriorCB.addActionListener(this);
        sedEngineCB.addActionListener(this);
        sedTiresCB.addActionListener(this);
        conDoorsCB.addActionListener(this);
        conRoofCB.addActionListener(this);
        conEngineCB.addActionListener(this);
        conTiresCB.addActionListener(this);
        this.setLayout(new GridLayout(3, 4));
        carLabel = new JLabel("This is your car: ");
        carLabel.setVerticalTextPosition(JLabel.BOTTOM);
        carLabel.setHorizontalTextPosition(JLabel.CENTER);
        initPanel(title);
        initType(title);

    }

    private void initPanel(String title){
        if (title.equals("SUV")){
            System.out.println("SUV working");
            changePanel(panelSUV);
        }
        else if (title.equals("SEDAN")){
            changePanel(panelSED);
        }
        else if (title.equals("CONVERTIBLE")){
            changePanel(panelCON);
        }
    }

    private void initType(String title){
        if (title.equals("SUV")){
            add(suvSeatsCB);
            add(suvDriveCB);
            add(suvEngineCB);
            add(suvTiresCB);
            add(carLabel);

        }
        else if (title.equals("SEDAN")){
            add(sedTrailerAttachmentCB);
            add(sedInteriorCB);
            add(sedEngineCB);
            add(sedTiresCB);
            add(carLabel);
        }
        else if (title.equals("CONVERTIBLE")){
            add(conDoorsCB);
            add(conRoofCB);
            add(conEngineCB);
            add(conTiresCB);
            add(carLabel);
        }
    }

    public void changePanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        setLayout(new GridLayout(3,4));
        getContentPane().doLayout();
        update(getGraphics());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Here should be the action listeners for the comboboxes to display the car choice

    }

    public static void main(String args[]){
        GUItype type = new GUItype("SUV");
        type.setLocationRelativeTo(null);
        type.setVisible(true);

    }


}
