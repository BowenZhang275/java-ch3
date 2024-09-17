import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class chapter_3_4 extends JFrame {

    JPanel p = new JPanel();
    JTextField Number_pizza = new JTextField ("Enter the number of pizza ");
    JTextField SubmitButton = new JTextField( "Submit Order" );
    

    // set the sidth of the field to 3 characters 
    JTextField tf = new JTextField( 3 );

    //count 
    int count = 0;

    //here to create the app 
    public static void main(String[] args) {
        chapter_3_4 app = new chapter_3_4();

        // generic class doesn't have these methods 
        // need to extend JFrame 
        app.setSize( 600, 60 );
        app.setTitle("Pizza");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible( true ); 
    }
    
    //constructor methods
    chapter_3_4(){

        p.add(Number_pizza);
        p.add(SubmitButton);
        add(p);
    }


}

//7 yes the 2 methods are different, 