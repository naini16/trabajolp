
/**
 * @author JNAINI AMIRI
 * 
 * 
*/


import javax.swing.*;
public class formulario1 extends JFrame {
    private JLabel label1;
    public formulario1() {
        setLayout(null);
        label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        add(label1);
    }
    
    public static void main(String[] ar) {
        formulario1 formulario1=new formulario1();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
    
