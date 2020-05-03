package bisiesto;

import javax.swing.JOptionPane;


public class Bisiesto {

    private int year;
    
    public Bisiesto(int year) {
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void calcularBisiesto() {
        
        if (getYear() % 4 == 0 && getYear() % 100 != 0 || getYear() % 400 == 0 ) {
            JOptionPane.showMessageDialog(null, getYear() + " Es Bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, getYear() + " No es bisisesto");
        }
    }
}
