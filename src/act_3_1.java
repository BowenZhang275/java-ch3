//1. Create a new class using our simple template
//2. Create an app with an empty window
//3. Add a panel
// 4. Add a button to the panel
//5. Add a textfield to the pane 


//import classes 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// extends the class 
public class act_3_1 extends JFrame {

    
    JPanel p = new JPanel();
    JButton b = new JButton( "click here" );
    // set the sidth of the field to 3 characters 
    JTextField tf = new JTextField( 3 );

    //count 
    int count = 0;

    //here to create the app 
    public static void main(String[] args) {
        act_3_1 app = new act_3_1();

        // generic class doesn't have these methods 
        // need to extend JFrame 
        app.setSize( 200, 60 );
        app.setTitle("Activity 3.1");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible( true ); 
    }
    
    //constructor methods
    act_3_1(){

        b.addActionListener(e->{
            count++;
            tf.setText(Integer.toString(count)); 
        });
        p.add(b);
        p.add(tf);
        add(p);
    }
 
}
