import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// the class for the file and extends the jframe class 
public class chapter_3_1_hw_copy extends JFrame {

    //create new panel 
    JPanel p = new JPanel();
    
    //create new button for adding pizza
    JButton AddButton = new JButton( "Add Pizza" );
    //create new button for submit order
    JButton SubmitButton = new JButton( "Submit Order" );

    // set the sidth of the field to 3 characters 
    JTextField tf = new JTextField( 3 );

    //count 
    int count = 0;

    public static void main(String[] args) {

        //creating a new isntance of the class and assign it to the app variable
        chapter_3_1_hw_copy app = new chapter_3_1_hw_copy();

        //set size of the frame
        app.setSize( 600, 100 );
        //set title of the frame
        app.setTitle("Pizza");
        //set what happens to the frame after close 
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set to frame so we can see it 
        app.setVisible( true ); 
    }
    
    //constructor methods
    chapter_3_1_hw_copy(){

        // add the button to the panel
        p.add(AddButton);
        // add the button to the panel

        p.add(SubmitButton);

        // add the panel to the frame
        add(p);
    }


}