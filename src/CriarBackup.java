import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import javax.swing.*;


public class CriarBackup extends JFrame{
	
	CriarBackup(){
		super("  ..: goBack | Criar backup :..  ");
		
		JLabel lblTitulo = new JLabel(" Criar backup ");
		final JTextField txtCaminho = new JTextField(30);
		
		final JButton btCaminho = new JButton("Selecionar pasta");
		JButton btCriar = new JButton("Criar backup");
		JButton btLimpar = new JButton("Limpar");
		JButton btSair = new JButton("Sair");
		
		this.setLayout(null);
		this.add(lblTitulo);
		this.add(txtCaminho);
		this.add(btCaminho);
		this.add(btCriar);
		this.add(btLimpar);
		this.add(btSair);
		
		lblTitulo.setSize(100,25);
		lblTitulo.setLocation(30,15);
		
		//CheckBox
		final JCheckBox cbTodos = new JCheckBox("Todos os importantes");
		this.add(cbTodos);
		cbTodos.setSize(150, 20);
		cbTodos.setLocation(80, 120);
		
		final JCheckBox cbBin = new JCheckBox("bin");
		this.add(cbBin);
		cbBin.setSize(150, 20);
		cbBin.setLocation(80, 140);
		
		final JCheckBox cbBoot = new JCheckBox("boot");
		this.add(cbBoot);
		cbBoot.setSize(150, 20);
		cbBoot.setLocation(80, 160);
		
		final JCheckBox cbDev = new JCheckBox("dev");
		this.add(cbDev);
		cbDev.setSize(150, 20);
		cbDev.setLocation(80, 180);
		
		final JCheckBox cbEtc = new JCheckBox("etc");
		this.add(cbEtc);
		cbEtc.setSize(150, 20);
		cbEtc.setLocation(80, 200);
		
		final JCheckBox cbHome = new JCheckBox("home");
		this.add(cbHome);
		cbHome.setSize(150, 20);
		cbHome.setLocation(80, 220);
		
		final JCheckBox cbLib = new JCheckBox("lib");
		this.add(cbLib);
		cbLib.setSize(100, 20);
		cbLib.setLocation(250, 120);
		
		final JCheckBox cbProc = new JCheckBox("proc");
		this.add(cbProc);
		cbProc.setSize(100, 20);
		cbProc.setLocation(250, 140);
		
		final JCheckBox cbRoot = new JCheckBox("root");
		this.add(cbRoot);
		cbRoot.setSize(100, 20);
		cbRoot.setLocation(250, 160);
		
		final JCheckBox cbSbin = new JCheckBox("sbin");
		this.add(cbSbin);
		cbSbin.setSize(100, 20);
		cbSbin.setLocation(250, 180);
		
		final JCheckBox cbSelinux = new JCheckBox("selinux");
		this.add(cbSelinux);
		cbSelinux.setSize(100, 20);
		cbSelinux.setLocation(250, 200);
		
		final JCheckBox cbSrv = new JCheckBox("srv");
		this.add(cbSrv);
		cbSrv.setSize(100, 20);
		cbSrv.setLocation(250, 220);
		
		final JCheckBox cbSys = new JCheckBox("sys");
		this.add(cbSys);
		cbSys.setSize(150, 20);
		cbSys.setLocation(380, 120);
		
		final JCheckBox cbTmp = new JCheckBox("tmp");
		this.add(cbTmp);
		cbTmp.setSize(150, 20);
		cbTmp.setLocation(380, 140);
		
		final JCheckBox cbUsr = new JCheckBox("usr");
		this.add(cbUsr);
		cbUsr.setSize(150, 20);
		cbUsr.setLocation(380, 160);
		
		final JCheckBox cbVar = new JCheckBox("var");
		this.add(cbVar);
		cbVar.setSize(150, 20);
		cbVar.setLocation(380, 180);
		
		cbTodos.setEnabled(false);
		cbBin.setEnabled(false);
		cbBoot.setEnabled(false);
		cbDev.setEnabled(false);
		cbEtc.setEnabled(false);
		cbHome.setEnabled(false);
		cbLib.setEnabled(false);
		cbProc.setEnabled(false);
		cbRoot.setEnabled(false);
		cbSbin.setEnabled(false);
		cbSelinux.setEnabled(false);
		cbSrv.setEnabled(false);
		cbSys.setEnabled(false);
		cbTmp.setEnabled(false);
		cbUsr.setEnabled(false);
		cbVar.setEnabled(false);
		
		this.setSize(600,490);
		this.setVisible(true);
		this.setResizable(false);
		
		Dimension dim = this.getToolkit().getScreenSize();      
	       int x = (int) (dim.getWidth() - this.getSize().getWidth()) / 2;
	       int y = (int) (dim.getHeight() - this.getSize().getHeight()) / 2;
	       
	    this.setLocation(x,y);
	 		
	    JPanel radioPanel = new JPanel();
		radioPanel.setLayout(null);
		
		JPanel radioPane2 = new JPanel();
		radioPane2.setLayout(null);
	    
	    final ButtonGroup caixa1 = new ButtonGroup();
	    final JRadioButton rb1 = new JRadioButton("Selecione para mim");
		rb1.setSize(300, 20);
		rb1.setLocation(40, 70);
		
	    caixa1.add(rb1);
	    
	    final JRadioButton rb2 = new JRadioButton("Selecionar arquivos");
		rb2.setSize(300, 20);
		rb2.setLocation(40, 90);
		
	    caixa1.add(rb2);

	    this.add(rb1);
	    this.add(rb2);
	    
	    radioPanel.setBorder(BorderFactory.createTitledBorder(
		           BorderFactory.createEtchedBorder(), " ARQUIVOS PARA O BACKUP "));

		this.add(radioPanel);

		radioPanel.setSize(550, 220);
		radioPanel.setLocation(20, 40);
		radioPanel.setVisible(true);
		
		
		ButtonGroup caixa2 = new ButtonGroup();
	    final JRadioButton rb3 = new JRadioButton("Selecione para mim");
		rb3.setSize(300, 20);
		rb3.setLocation(40, 300);
		
	    caixa2.add(rb3);
	    
	    final JRadioButton rb4 = new JRadioButton("Selecionar onde salvar");
		rb4.setSize(300, 20);
		rb4.setLocation(40, 320);
		
	    caixa2.add(rb4);

	    this.add(rb3);
	    this.add(rb4);
		
		radioPane2.setBorder(BorderFactory.createTitledBorder(
		           BorderFactory.createEtchedBorder(), " ONDE SALVAR O BACKUP "));

		this.add(radioPane2);

		radioPane2.setSize(550, 140);
		radioPane2.setLocation(20, 270);
		radioPane2.setVisible(true);

		txtCaminho.setSize(350,25);
		txtCaminho.setLocation(60,360);
		txtCaminho.disable();
		txtCaminho.setText(null);
		
		btCaminho.setSize(130,25);
		btCaminho.setLocation(420,360);
		btCaminho.setEnabled(false);
		
		btCriar.setSize(130,30);
		btCriar.setLocation(20,420);
		
		btLimpar.setSize(130,30);
		btLimpar.setLocation(160,420);
		
		btSair.setSize(90,30);
		btSair.setLocation(480,420);
	
		final JFileChooser arquivo = new JFileChooser();
		
		btCaminho.addActionListener (new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String local;
				arquivo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		        	if(arquivo.showOpenDialog(arquivo) == JFileChooser.APPROVE_OPTION){   
		        		local = arquivo.getSelectedFile().getPath();   
		        	}          
		            else{   
		            	local = "";   
		            }
		        	if(local == ""){
		        		System.out.println("Escolha uma pasta");
		        		//JOptionPane.showMessageDialog("  Selecione uma pasta  ","Avido ",local);
		        	}
		        	
	                JOptionPane.showMessageDialog(null,local);
	                txtCaminho.setText(local);
	                txtCaminho.disable(); 	          
			}
		});
		
		btCriar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				if(!rb1.isSelected() && !rb2.isSelected()){
					JOptionPane.showMessageDialog(null, "  Selecione os arquivos para o backup  ",
							"Aviso", JOptionPane.WARNING_MESSAGE);
				}else{
					if(!rb3.isSelected() && !rb4.isSelected()){
						JOptionPane.showMessageDialog(null, "  Selecione onde salvar o backup  ",
								"Aviso", JOptionPane.WARNING_MESSAGE);
					}else{
						if(rb4.isSelected()){
							if(txtCaminho.getText().equals("")){
								JOptionPane.showMessageDialog(null, "  Selecione onde salvar o backup  ",
										"Aviso", JOptionPane.WARNING_MESSAGE);								
							}
						}
					}
				}
				
				String comando = "tar -cvpzf ";
				
				if ((rb1.isSelected() || cbTodos.isSelected()) && rb3.isSelected()){
					comando += "/backup-full.tgz " +
							"--exclude=/proc --exclude=/lost+found --exclude=/backup-full.tgz --exclude=/mnt --exclude=/sys /";
				}
				else{
					if(rb1.isSelected() && rb4.isSelected()){
						comando += txtCaminho.getText();
						comando += "/backup-full.tgz " +
						"--exclude=/proc --exclude=/lost+found --exclude=" +
						txtCaminho.getText() + "/backup-full.tgz --exclude=/mnt --exclude=/sys /";
					}
					else{
						if(rb2.isSelected() && rb3.isSelected()){
							comando += "/backup-`date +%Y%m%d`.tgz ";
						}
					}
				}
				System.out.println(comando);
				try {
					Runtime.getRuntime().exec(comando);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		rb1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				if (rb1.isSelected()){
					cbTodos.setEnabled(false);
					cbBin.setEnabled(false);
					cbBoot.setEnabled(false);
					cbDev.setEnabled(false);
					cbEtc.setEnabled(false);
					cbHome.setEnabled(false);
					cbLib.setEnabled(false);
					cbProc.setEnabled(false);
					cbRoot.setEnabled(false);
					cbSbin.setEnabled(false);
					cbSelinux.setEnabled(false);
					cbSrv.setEnabled(false);
					cbSys.setEnabled(false);
					cbTmp.setEnabled(false);
					cbUsr.setEnabled(false);
					cbVar.setEnabled(false);
				}
			}
		});
		
		rb2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				if (rb2.isSelected()){
					cbTodos.setEnabled(true);
					cbBin.setEnabled(true);
					cbBoot.setEnabled(true);
					cbDev.setEnabled(true);
					cbEtc.setEnabled(true);
					cbHome.setEnabled(true);
					cbLib.setEnabled(true);
					cbProc.setEnabled(true);
					cbRoot.setEnabled(true);
					cbSbin.setEnabled(true);
					cbSelinux.setEnabled(true);
					cbSrv.setEnabled(true);
					cbSys.setEnabled(true);
					cbTmp.setEnabled(true);
					cbUsr.setEnabled(true);
					cbVar.setEnabled(true);
				}
			}
		});
		
		rb3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				if(rb3.isSelected()){
					btCaminho.setEnabled(false);
				}
			}
		});
		
		rb4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				if(rb4.isSelected()){
					btCaminho.setEnabled(true);
				}
			}
		});
			
		btLimpar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				
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
		new CriarBackup();		

	}

}
