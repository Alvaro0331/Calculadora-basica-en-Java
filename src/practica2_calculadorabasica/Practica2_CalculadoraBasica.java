package practica2_calculadorabasica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Alvaro Davila Gomez
 */
public class Practica2_CalculadoraBasica extends JFrame implements ActionListener{
    
    JTextField txtDisplay1,txtDisplay2,txtDisplay3;
    JButton btnSuma,btnResta,btnMult,btnDiv;
    
    public Practica2_CalculadoraBasica(){//Constructor
        this.setBounds(0, 0, 600, 400);//Crear ventana
        this.setResizable(false);//Inhabilitar minimizar ventana
        this.setLayout(null);
        
        txtDisplay1=new JTextField();
        txtDisplay1.setBounds(10,10,80,30);
        txtDisplay1.setName("txtDisplay1");
        txtDisplay1.setText("");
        txtDisplay1.setVisible(true);
        this.add(txtDisplay1);
        
        txtDisplay2=new JTextField();
        txtDisplay2.setBounds(90,10,80,30);
        txtDisplay2.setName("txtDisplay2");
        txtDisplay2.setText("");
        txtDisplay2.setVisible(true);
        this.add(txtDisplay2);
        
        txtDisplay3=new JTextField();
        txtDisplay3.setBounds(180,10,80,30);
        txtDisplay3.setName("txtDisplay3");
        txtDisplay3.setText("");
        txtDisplay3.setVisible(true);
        this.add(txtDisplay3);
    }
    
    public static void main(String[] args) {
        Practica2_CalculadoraBasica obj=new Practica2_CalculadoraBasica();
        obj.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
