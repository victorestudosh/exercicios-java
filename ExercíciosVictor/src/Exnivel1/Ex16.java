package Exnivel1;

import javax.swing.JOptionPane;

public class Ex16 {
	    public static void main(String[] args) {
	    	JOptionPane.showMessageDialog(null, "Inverter String", "Ex16", JOptionPane.INFORMATION_MESSAGE, null);
	        String original = "Java";
	        String invertida = new StringBuilder(original).reverse().toString();
	        System.out.println(invertida);
	    }
	}