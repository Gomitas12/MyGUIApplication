import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame
{
    private JPanel MainPanel;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    private JButton button_exit;

    //constructor
    public MenuForm()
    {
       setContentPane(MainPanel);
       setTitle("Hello");
       setDefaultCloseOperation( EXIT_ON_CLOSE );
       setSize( 300, 600);
       setLocationRelativeTo( null );
       setVisible( true );


        button_exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0); //close the app
            }
        });


        button_1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //JOptionPane.showMessageDialog(null, "You pressed Button 1");
                new FormOne();
            }
        });


        button_2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "You pressed Button 2");

            }
        });


        button_3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "You pressed Button 3");
            }
        });


        button_4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "You pressed Button 4");
            }
        });
    }

    public static void main(String[] args )
    {
        //entry point to program
        new MenuForm();

    }
}
