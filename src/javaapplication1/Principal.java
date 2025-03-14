
package javaapplication1;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Principal {
     public static void main (String arg [ ]) throws IOException {
    Estatística[ ] Estatística = new Estatística[10];	
     ClasseMetodos m = new ClasseMetodos(); 
      int opc=0;
      while (opc!=9){
 opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Estatística "
         + "\n 2 - Consulta por quantidade de acidentes "
         + "\n 3-consulta por estatistica de acidentes "
         + "\n 4-acidentes acima da media nas 10 cidades  "
         + "\n  9 - Finaliza"));
      switch (opc)     {
            case 1: Estatística = m.FCADRASTRAESTATISTICA(Estatística);
                         break;
            case 2: m.PQTDACIDENTES (Estatística);
                         break;
            case 3:m.PMAIORMENOR(Estatística);
                         break;
            case 4:m.PACIMA(Estatística);
                         break;   
            case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
                         break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }   }  } 
    
    
}
