package practica2_calculadorabasica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
        
        //Cajas de texto
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
        
        //Botones
        btnSuma=new JButton();
        btnSuma.setBounds(10, 50, 50, 30);
        btnSuma.setName("btnSuma");
        btnSuma.setText("+");
        btnSuma.setVisible(true);
        btnSuma.addActionListener(this);
        this.add(btnSuma);
        
        btnResta=new JButton();
        btnResta.setBounds(70, 50, 50, 30);
        btnResta.setName("btnResta");
        btnResta.setText("-");
        btnResta.setVisible(true);
        btnResta.addActionListener(this);
        this.add(btnResta);
        
        btnMult=new JButton();
        btnMult.setBounds(130, 50, 50, 30);
        btnMult.setName("btnMult");
        btnMult.setText("X");
        btnMult.setVisible(true);
        btnMult.addActionListener(this);
        this.add(btnMult);
        
        btnDiv=new JButton();
        btnDiv.setBounds(190, 50, 50, 30);
        btnDiv.setName("btnDiv");
        btnDiv.setText("/");
        btnDiv.setVisible(true);
        btnDiv.addActionListener(this);
        this.add(btnDiv);
    }
    
    public static void main(String[] args) {
        Practica2_CalculadoraBasica obj=new Practica2_CalculadoraBasica();
        obj.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Test de botones
        if(e.getSource()==btnSuma){
            JOptionPane.showMessageDialog(null, "Suma");
        }
        if(e.getSource()==btnResta){
            JOptionPane.showMessageDialog(null, "Resta");
        }
        if(e.getSource()==btnMult){
            JOptionPane.showMessageDialog(null, "Mutliplicacion");
        }
        if(e.getSource()==btnDiv){
            JOptionPane.showMessageDialog(null, "Division");
        }
    }
    
}
