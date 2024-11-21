import javax.swing.*;

public class FormOne extends JFrame
{
    private JPanel MainPanel;

    public FormOne()
    {
        setContentPane(MainPanel);
        setTitle("Hello");
        setDefaultCloseOperation( DISPOSE_ON_CLOSE);
        setSize( 300, 600);
        setLocation( 200, 100  );
        setVisible( true );

    }

}
