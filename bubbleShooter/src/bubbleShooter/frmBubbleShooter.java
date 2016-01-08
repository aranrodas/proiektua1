package bubbleShooter;

import java.awt.BorderLayout;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.RenderingHints.Key;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;

public class frmBubbleShooter extends JFrame {

	private JPanel contentPane;
	private ArrayList<clscarita>[][] bolas;
	private clscarita miBola; 
	private JLabel bola;
	private JPanel panel;
	private String[] dibujoBolas = {"C:\\temp\\bola.png","C:\\temp\\bolaRosa.png","C:\\temp\\bolaRoja.png"};
	private int nivel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBubbleShooter frame = new frmBubbleShooter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmBubbleShooter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel = new JPanel();
		
		contentPane.add(panel);
		panel.setLayout(null);
		
//		bola = new JLabel("");
//		bola.setIcon(new ImageIcon("C:\\temp\\bola.png"));
//		bola.setBounds(200, 209, 31, 32);
//		panel.add(bola);
		
		crearMatriz();
		crearBola();
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				moverMola(arg0.getX(), arg0.getY());		
			}
		});
	}
		
	private void crearBola (){
		miBola = new clscarita(200, 209, 0, "");
		bola = new JLabel("");
		Random indImagen = new Random();
		int x = indImagen.nextInt(dibujoBolas.length);
		bola.setIcon(new ImageIcon(dibujoBolas[x].toString()));
		bola.setBounds(200, 209, 31, 32);
		panel.add(bola);  
	}
	
	
	
	private void moverMola (int posXRaton, int posYRaton ){
		bola.setLocation(posXRaton, posYRaton);
		crearBola();
	}
	
	private void crearMatriz ()	{
		
		
		//bolas = new ArrayList<clscarita>[x][y];
		
		nivel=1;
		int x = 0; //matrizek zenbat ilara izango ditun
		int y=10;//matrizean luzera (zenbat bola kabituko dian luzeran)
		
		int i;
		
		if (nivel== 1)
			{
			x= 2; //hiru ilara sortzeko
			}
	
		if (nivel== 2)
			{
				x=3; //lau ilara sortzeko
			}
		 if(nivel == 3)
			 {
				 x=5; //bost ilara sortzeko
			 }
		 
		 
		 for (i=0;i <y;i++)
		 {
			 for(i=0; i <x ; i++)
			 {
//				
//				Random indImagen = new Random();
//				int a= indImagen.nextInt(dibujoBolas.length);
//				bolas[x][y].setIcon(new ImageIcon(dibujoBolas[a].toString()));
				
			 }
		 }
	}
}
