package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {
	

	public static void main(String[] args) {
		for (int trinn = 1; trinn <=6; trinn++) { 
		String inntektTxt = showInputDialog("Oppgi inntekt");
		int inntekt = parseInt(inntektTxt);
		String sats = "ugyldig";
		
		if (inntekt >= 0 && inntekt <= 190349) {
			sats= "0%";
			showMessageDialog(null,"Satsen er :" + sats);
		
	  } else if (inntekt >=19350 && inntekt <=267889);{
			sats= "1,7%";
			showMessageDialog(null,"Satsen er :" + sats);
			
	  } else if (inntekt >= 267900 && inntekt <=643799);{
			sats= "4%";
			showMessageDialog(null,"Satsen er :" + sats);
			
	  } else if (inntekt >= 643800 && inntekt <=969199);{
		    sats= "13,4%";
		    showMessageDialog(null,"Satsen er :" + sats);
		    
	  } else if (inntekt >= 969200 && inntekt <=1999999);{
		    sats= "16,4%";
		    showMessageDialog(null,"Satsen er :" + sats);
		  
	  } else if (inntekt >=2000000);{
		
	  } else {
		  showMessageDialog(null, sats);
		  while (inntekt < 0 && inntekt > 2000000) {
		     
		}
	  }
	}
}
}
		



