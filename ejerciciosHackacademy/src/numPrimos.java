
import javax.swing.JOptionPane;


public class numPrimos {
    
    public void sumaPrimos(int limite){
      int nPrimosSumados = 0;
        for (int i = 0; i < limite; i++) {
            if((i%3==0) || (i%5==0)){
                nPrimosSumados=nPrimosSumados+i;   
            }            
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros: "+nPrimosSumados); 
    }
    
    public void lugarPrimo(int limite){
        int lugar=1;
        int z = 3;
        boolean divisor = false;

        while (lugar < limite) {
            divisor = true;
            for (int i = 2; i < z; i++) {
                if (z % i == 0) {
                    divisor = false;

                }
            }
            if (divisor == true) {
                lugar++;
            }
            z++;
        }
        z--;
        JOptionPane.showMessageDialog(null, "El numero en la posición "+lugar+": "+z);
    }
}
