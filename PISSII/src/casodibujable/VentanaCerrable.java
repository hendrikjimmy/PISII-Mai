package casodibujable;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class VentanaCerrable extends Frame implements WindowListener {
	// constructores
	public VentanaCerrable() {
		super();
	}

	public VentanaCerrable(String title) {
		super(title);
		setSize(500, 500);
		addWindowListener(this);
	}

	// métodos de la interface WindowsListener
	@Override
	public void windowActivated(WindowEvent e) {
		//metodo inactivo
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//metodo inactivo
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		//metodo inactivo
	}

	
	@Override
	public void windowDeiconified(WindowEvent e) {
		//metodo inactivo
	}

	@Override
	public void windowIconified(WindowEvent e) {
		//metodo inactivo
	}

	@Override
	public void windowOpened(WindowEvent e) {
		//metodo inactivo
	}
}
