import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Principal extends JFrame{

	Principal(){
		super("  ..: goBack :..  ");
		
		UIManager.put("Panel1.background", Color.blue);
		
		JMenuBar menu = new JMenuBar();
		JMenu menuArquivo = new JMenu(" Arquivo ");
		JMenu menuOpcoes = new JMenu(" Opções ");
		
		JMenuItem menuArquivoSair = new JMenuItem("  Sair  ");
		JMenuItem menuOpcoesCriar = new JMenuItem("  Criar backup  ");
		JMenuItem menuOpcoesRestaurar = new JMenuItem("  Restaurar backup  ");
	
		setJMenuBar(menu);
		menu.add(menuArquivo);
		menu.add(menuOpcoes);
				
		menuArquivo.add(menuArquivoSair);
		menuOpcoes.add(menuOpcoesCriar);
		menuOpcoes.add(menuOpcoesRestaurar);
		
		Container c = getContentPane();
	    c.setLayout(new FlowLayout(FlowLayout.LEFT));

	    // Define a cor de fundo
	    c.setBackground(Color.WHITE);
		
		Icon imagem = new ImageIcon("img/goBack.png");
		JLabel display = new JLabel("");
		display.setIcon(imagem);
		this.add(display);
		display.setSize(300, 205);
		display.setLocation(100, 10);  
		
		
		this.setLayout(null);
		
		this.setSize(500,300);
		this.setVisible(true);
		this.setResizable(false);
		
		Dimension dim = this.getToolkit().getScreenSize();      
	       int x = (int) (dim.getWidth() - this.getSize().getWidth()) / 2;
	       int y = (int) (dim.getHeight() - this.getSize().getHeight()) / 2;
	       
	    this.setLocation(x,y);
	    
	    menuOpcoesCriar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				new CriarBackup();
			}
		});
	    
	    menuOpcoesRestaurar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				new RestaurarBackup();
			}
		});
	    
	    menuArquivoSair.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
