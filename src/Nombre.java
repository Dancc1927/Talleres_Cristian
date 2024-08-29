import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Nombre extends JFrame implements ActionListener{
	JPanel miPanel;
	JTextField miTitulo;
	JButton btnMostrar, btnOcultar;
	JTextField nombreI;
	JLabel titulo;
	JLabel etinombre;
	
	
	public Nombre() {
	
		setSize(500, 400);
		setTitle("Ventana Nombre");
		setLocationRelativeTo(null);
		iniciarComponentes();
	}
		
		
		
		public void iniciarComponentes() {
			
			
			
			miPanel= new JPanel();
			miPanel.setLayout(null);
			miPanel.setBackground(Color.blue);
			
			
			nombreI= new JTextField();
			nombreI.setText("Ingrese su nombre");
			nombreI.setBounds(180,80,150,30);
			
			titulo= new JLabel();
			titulo.setText("Bienvenidos");
			titulo.setBounds(200,50,200,40);
			
			
			
			miTitulo= new JTextField();
			miTitulo.setText("Ingrese su nombre");
			miTitulo.setBounds(180,150,150,30);
			
			btnMostrar= new JButton();
			btnMostrar.setText("Mostrar");
			btnMostrar.setBounds(180, 200,150, 30);
			

			btnOcultar= new JButton();
			btnOcultar.setText("ocultar");
			btnOcultar.setBounds(180, 250,150, 30);
			
			miPanel.add(btnMostrar);
			miPanel.add(miTitulo);
			miPanel.add(nombreI);
			miPanel.add(btnOcultar);	
			miPanel.add(titulo);
			add(miPanel);
			
			
			
		}



		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnMostrar) {
				setVisible(true);
			}else if(e.getSource()==btnOcultar){
				setVisible(false);
			}
			
		}
	}
  

