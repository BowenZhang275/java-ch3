import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lab_1 extends JFrame {
    
    JPanel p = new JPanel();
    JButton b = new JButton( "Add Canon" );
    // set the sidth of the field to 3 characters 
    JTextField tf_enter = new JTextField( 3 );
    JTextField tf_show = new JTextField( 15 );

    JButton reseButton = new JButton( "Reset Canon Counter" );



    //count 
    int count = 0;
    
    int current_weight = 0;

    int Cannon = 4500;

    int Max_weight = 240000;

    //here to create the app 
    public static void main(String[] args) {
        lab_1 app = new lab_1();

        // generic class doesn't have these methods 
        // need to extend JFrame 
        app.setSize( 400, 120 );
        app.setTitle("Canon Calculator");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible( true ); 
    }
    
    //constructor methods
    lab_1(){
        tf_enter.setHorizontalAlignment(JTextField.CENTER);

        tf_show.setHorizontalAlignment(JTextField.CENTER);

        //set text
        tf_enter.setText("0"); 
        tf_show.setText("0 Ibs");

        // listen to count
        b.addActionListener(e->{

        count++;
        current_weight = Cannon * count;

            if (current_weight < Max_weight){
                
                tf_enter.setText(Integer.toString(count)); 

                tf_show.setText(Integer.toString(current_weight)+ " Ibs"); 

            }            
        });

        //reset and reset text
        reseButton.addActionListener(e->{
            tf_enter.setText("0"); 
            tf_show.setText("0 Ibs");
            
            count= 0 ;
            current_weight= 0;
        });

        p.add(b);
        p.add(tf_enter);
        p.add(tf_show);
        p.add(reseButton);
        add(p);
 
    }

}