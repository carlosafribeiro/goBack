import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class RestaurarBackup extends JFrame {

	RestaurarBackup(){
		super("  ..: goBack | Retaurar backup :.. ");
		
		JLabel lbl1 = new JLabel("Selecione o backup");
		final JTextField txtCaminho = new JTextField(30);
		JButton btCaminho = new JButton("Selecionar");
		JButton btRestaurar = new JButton("Restaurar backup");
		JButton btLimpar = new JButton("Limpar");
		JButton btSair = new JButton("Sair");
		
		this.add(lbl1);
		this.add(txtCaminho);
		this.add(btCaminho);
		this.add(btRestaurar);
		this.add(btLimpar);
		this.add(btSair);
		
		this.setLayout(null);
		this.setSize(600,410);
		this.setVisible(true);
		this.setResizable(false);
		
		Dimension dim = this.getToolkit().getScreenSize();      
	       int x = (int) (dim.getWidth() - this.getSize().getWidth()) / 2;
	       int y = (int) (dim.getHeight() - this.getSize().getHeight()) / 2;
	       
	    this.setLocation(x,y);
	    
	    JPanel radioPane1 = new JPanel();
		radioPane1.setLayout(null);
		
		radioPane1.setBorder(BorderFactory.createTitledBorder(
		           BorderFactory.createEtchedBorder(), " ARQUIVO DE BACKUP "));

		this.add(radioPane1);

		radioPane1.setSize(550, 300);
		radioPane1.setLocation(20, 20);
		radioPane1.setVisible(true);
		
		lbl1.setSize(180,25);
		lbl1.setLocation(50,45);
		
		txtCaminho.setSize(380,25);
		txtCaminho.setLocation(50,70);
		
		btCaminho.setSize(100,25);
		btCaminho.setLocation(440,70);
		
		btRestaurar.setSize(150,30);
		btRestaurar.setLocation(20,330);
		
		btLimpar.setSize(150,30);
		btLimpar.setLocation(180,330);
		
		btSair.setSize(90,30);
		btSair.setLocation(480,330);
		
		final JFileChooser arquivo = new JFileChooser();
		
		btCaminho.addActionListener (new ActionListener(){
			public void actionPerformed (ActionEvent e){
				int op = arquivo.showOpenDialog(arquivo); 
	            if(op == JFileChooser.APPROVE_OPTION){  
	               File arq = arquivo.getSelectedFile();  
	               String path = arq.toString();
	               txtCaminho.setText(path);
	                      //aqui você testa se a string recebeu o caminho do arquivo  
	                      JOptionPane.showMessageDialog(null,path);  
	            }  
			}
		});
		
		btSair.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new RestaurarBackup();
	}

}
