
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

class VentanaInicio extends JFrame{
	
	public VentanaInicio() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setTitle("Layout NULO");
		setVisible(true);
		
		JLabel txtPrimerNumero = new JLabel("Ingresa un numero: ");
		txtPrimerNumero.setBounds(10, 10, 130, 20);
		add(txtPrimerNumero);
		JTextField cajaPrimerNum = new JTextField(10);
		cajaPrimerNum.setBounds(130, 10, 80, 20);
		
		cajaPrimerNum.setToolTipText("SOLO NUMEROS !!!!!!!");
		add(cajaPrimerNum);
		
		//...
		
		JLabel txtResultado = new JLabel("RESULTADO: ");
		txtResultado.setBounds(10, 50, 130, 20);
		add(txtResultado);
		
		JTextField cajaResultado = new JTextField("123456789");
		cajaResultado.setBounds(130, 50, 80, 20);
		
		cajaResultado.setFont(new Font("Roboto",Font.BOLD, 10));
		cajaResultado.setForeground(Color.RED);
		cajaResultado.setBackground(new Color(0, 255, 0));
		cajaResultado.setEditable(false);
		cajaResultado.setEnabled(false);
		
		
		add(cajaResultado);
		
		
		
	}	
}

public class PruebaNullLayout {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}
}
