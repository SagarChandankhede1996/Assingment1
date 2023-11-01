package w2Assignment3;

import javax.swing.JOptionPane;

public class A3 {

	public static void main(String[] args) {
		
		//I have not understood question properly if there is wrong interpritation of code by any chance infrom me 1st
		x:while(true) {
			try {

				int n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1st value"));
				y:while(true) {
				try {
					
					int n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 2nd value"));
					JOptionPane.showMessageDialog(null, n1+" + "+n2+" = "+(n1+n2));
					
					
					if(true)
					{
						break x;
					}
					break y;
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Read the number again!", "Exception", JOptionPane.ERROR_MESSAGE);

				}
				}

			} catch (Exception e){
				JOptionPane.showMessageDialog(null, "Read the number again!", "Exception", JOptionPane.ERROR_MESSAGE);
				
			}

		}
	}
}
