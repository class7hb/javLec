package com.ui.pm;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex02 extends Frame implements WindowListener {

	public Ex02() {
		addWindowListener(this);
		setBounds(1800, 200, 300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02();
	}
	public void windowOpened(WindowEvent e) {System.out.println("오픈");}
	public void windowClosing(WindowEvent e) {System.out.println("닫기Closing");this.dispose();}
	public void windowClosed(WindowEvent e) {System.out.println("닫기Closed");}
	public void windowIconified(WindowEvent e) {System.out.println("최소화");}
	public void windowDeiconified(WindowEvent e) {System.out.println("최소화해제");}
	public void windowActivated(WindowEvent e) {System.out.println("활성화");}
	public void windowDeactivated(WindowEvent e) {System.out.println("비활성화");}
}
