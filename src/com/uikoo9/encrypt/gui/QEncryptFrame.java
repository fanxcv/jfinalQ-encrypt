/*
 * QEncryptFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package com.uikoo9.encrypt.gui;

import javax.swing.JOptionPane;

import com.uikoo9.encrypt.util.QDecryptClassUtil;
import com.uikoo9.encrypt.util.QEncryptClassUtil;

/**
 *
 * @author  __USER__
 */
@SuppressWarnings("serial")
public class QEncryptFrame extends javax.swing.JFrame {

	private String pDir;
	private String sDir;

	/** Creates new form QEncryptFrame */
	public QEncryptFrame() {
		initComponents();
		setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jFileChooser1 = new javax.swing.JFileChooser();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("jfinalQ\u52a0\u5bc6\u90e8\u7f72\u5de5\u5177by uikoo9");

		jLabel1.setText("\u5f85\u64cd\u4f5c\u6587\u4ef6\u5939");

		jButton1.setText("\u9009\u62e9");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u52a0\u5bc6");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u89e3\u5bc6");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										198,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton2)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton3)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1)
												.addComponent(jButton2)
												.addComponent(jButton3))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		String path = this.jTextField1.getText();
		if (path == null || path.trim().equals("")){
			JOptionPane.showMessageDialog(this, "请选择待操作文件夹！");
		} else {
			this.jButton1.setEnabled(false);
			this.jButton2.setEnabled(false);
			this.jButton3.setEnabled(false);

			JOptionPane.showMessageDialog(this, QDecryptClassUtil.decrypt(this.sDir, this.pDir));

			this.jButton1.setEnabled(true);
			this.jButton2.setEnabled(true);
			this.jButton3.setEnabled(true);
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String path = this.jTextField1.getText();
		if (path == null || path.trim().equals("")) {
			JOptionPane.showMessageDialog(this, "请选择待操作文件夹！");
		} else {
			this.jButton1.setEnabled(false);
			this.jButton2.setEnabled(false);
			this.jButton3.setEnabled(false);

			JOptionPane.showMessageDialog(this, QEncryptClassUtil.encrypt(this.sDir, this.pDir));

			this.jButton1.setEnabled(true);
			this.jButton2.setEnabled(true);
			this.jButton3.setEnabled(true);
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.jFileChooser1.showDialog(this, "选择文件夹");

		this.pDir = this.jFileChooser1.getCurrentDirectory().toString();
		this.sDir = this.jFileChooser1.getSelectedFile().toString();
		this.jTextField1.setText(this.sDir);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new QEncryptFrame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JFileChooser jFileChooser1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}