package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.*;

@SuppressWarnings("serial")
public class PantallaCargaCinto extends JFrame {
		private JLabel lblCodigo;
		private JLabel lblLargo;
		private JLabel lblColor;
		private JLabel lblPrecio;
		private JTextField txtCodigo;
		private JTextField txtLargo;
		private JTextField txtColor;
		private JTextField txtPrecio;
		private JButton btnGuardar;
		private JButton btnBuscar;
		
		 
		public PantallaCargaCinto() {
			super("Cargar Cinto");
			setSize(500,100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel contenedor=new JPanel();
			contenedor.setLayout(new BorderLayout());
			add(contenedor);
			JPanel panelExtra = new JPanel();
			panelExtra.setLayout(new GridLayout(5,2));	
			contenedor.add(panelExtra,BorderLayout.CENTER);
			crearCentro(panelExtra);
			setVisible(true);
		}
		
		private void crearCentro(JPanel p) {
			lblCodigo= new JLabel("Codigo:");
			lblLargo= new JLabel("Largo:");
			lblColor= new JLabel("Color:");
			lblPrecio= new JLabel("Precio:");
			txtCodigo = new JTextField("");
			txtLargo = new JTextField("");
			txtColor = new JTextField("");
			txtPrecio = new JTextField("");
			btnGuardar = new JButton("Guardar");
			btnBuscar = new JButton("Buscar");
			p.add(lblCodigo);
			p.add(txtCodigo);
			p.add(lblLargo);
			p.add(txtLargo);
			p.add(lblColor);
			p.add(txtColor);
			p.add(lblPrecio);
			p.add(txtPrecio);
			p.add(btnGuardar);
			p.add(btnBuscar);
		
		}
			
		public static void main(String[] args) {
			new PantallaCargaCinto();
		}	
			
	}
