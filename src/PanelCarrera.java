import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelCarrera extends JPanel{
	
	private int x1;
	private int x2;
	private Image coche1 = new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-gris.png")).getImage();
	private Image coche2 = new ImageIcon(VentanaPpal.class.getResource("/imagenes/coche-gris.png")).getImage();
	
	
	public void ponerCoche2(Image imagen2) {
		
		this.coche2 = imagen2;
		
	}
	
	public void ponerCoche1(Image imagen1) {
		
		this.coche1 = imagen1;
		
	}
	
	@Override
	public void paintComponent(Graphics grafico) {
		
		Graphics g = grafico.create();
		
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, this.getWidth(), 40);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 40, this.getWidth(), 70);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 100, this.getWidth(), 10);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 110, this.getWidth(), 80);
		
		g.setColor(Color.GREEN);
		g.fillRect(0, 190, this.getWidth(), getHeight()-190);
		
		g.drawImage(coche1, this.x1, getHeight()/5, null);
		g.drawImage(coche2, this.x2, getHeight()/5*3, null);
		
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX1() {
		return x1;
	}

	public int getX2() {
		return x2;
	}
	
}
