import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class chapter_3_1_hw extends JFrame {

    JPanel p = new JPanel();
    JButton AddButton = new JButton( "Add Pizza" );
    JButton SubmitButton = new JButton( "Submit Order" );

    // set the sidth of the field to 3 characters 
    JTextField tf = new JTextField( 3 );

    //count 
    int count = 0;

    //here to create the app 
    public static void main(String[] args) {
        chapter_3_1_hw app = new chapter_3_1_hw();

        // generic class doesn't have these methods 
        // need to extend JFrame 
        app.setSize( 600, 60 );
        app.setTitle("Pizza");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible( true ); 
    }
    
    //constructor methods
    chapter_3_1_hw(){

        p.add(AddButton);
        p.add(SubmitButton);
        add(p);
    }


}