package tw.east.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import tw.east.controller.UserDB;

class loginForm extends JFrame implements ActionListener{
	
	Container c;
	JLabel label1, label2;
	JTextField user;
	JPasswordField password;
	JButton btn;
	
	public loginForm() {
		setTitle("使用者登入");
		
		setSize(400, 300);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		
		label1 = new JLabel("帳號:");
		label2 = new JLabel("密碼:");
		
		label1.setBounds(10, 50, 100, 20);
		label2.setBounds(10, 100, 100, 20);
	
		c.add(label1);
		c.add(label2);
		
		user = new JTextField();
		user.setBounds(120, 50, 120, 20);
		c.add(user);
		
		password = new JPasswordField();
		password.setBounds(120, 100, 120, 20);
		c.add(password);
		
		btn = new JButton("登入");
		btn.setBounds(100, 150, 70, 30);
		c.add(btn);
		btn.addActionListener(this);
		
		setVisible(true);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		try {		
			String username = user.getText();
			String pass = password.getText();
						 	
			 Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/bookorder", "root","root");
			 Statement stmt = conn.createStatement();
			 String sql = "SELECT * From userlogin where user='"+username+"' and passwd='"+pass+"'";
			 ResultSet rs = stmt.executeQuery(sql);
			 
			 if(rs.next()) {
				 
				 dispose();
				 
				 MybookV2 mybookV2 = new MybookV2();
				 mybookV2.show();
			 }else {
				 JOptionPane.showMessageDialog(null,"登入失敗，重新輸入");
			}		
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
}





public class User {
	
	
	
	public static void main(String[] args) {
		
	loginForm lg =new loginForm();
	
	}

}
