
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class act_3_2 extends JFrame {


    // variables 
    double Tax = .08;
    double Tip = .20;
    public static void main(String[] args) {
        
        act_3_2 app = new act_3_2();

        app.setSize( 200, 60 );
        app.setTitle("Activity 3.2");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible( true ); 

    }

    act_3_2(){

        String billTotal = JOptionPane.showInputDialog("Bill Total:"); 
        double total = Double.parseDouble(billTotal.trim()); 

        String nDiners = JOptionPane.showInputDialog("Number of Diners:"); 
        int N_diner = Integer.parseInt(nDiners.trim()); 

        // calcuated tax and tip
        total = total + total * Tax + total * Tip;
        
        double payEach = total/N_diner; 
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        JOptionPane.showMessageDialog(null, 
        "Each diner pays (include tax and tip):" + nf.format(payEach)); 

    }
}
