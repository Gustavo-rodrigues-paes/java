
package votação;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Principal {
    public static void main (String arg [ ]) throws IOException {
    Votação[ ] Votação = new Votação[200];	
     ClasseMetodos m = new ClasseMetodos(); 
      int opc=0      ;
      while (opc!=9){
 opc = Integer.parseInt(JOptionPane.showInputDialog("----------------------------------------------------------------\n" +
"|	SISTEMA DE VOTAÇÃO			|\n" +
"|      1 – Carregar Seção/Número Eleitor 	|\n" +
"|      2 – Classificar por Seção      		|\n" +
"|      3 – Gravar Registros                                	|\n" +
"|      4 – Mostrar Indicadores                                   |\n" +
"|      9 – Finalizar                                           	|\n" +
"----------------------------------------------------------------  "
         + "\n  9 - Finaliza"));
      switch (opc)     {
            case 1: Votação = m.FCADRASTRAVOTAÇÃO(Votação);
                         break;
            case 2: m.FCLASSIFICASEÇÃO (Votação);
                         break;
            case 3:m.FGRAVAVOTAÇÃO(Votação);
                         break;
            case 4:m.MostrarIndicadores (Votação);
                         break;   
            case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
                         break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }   }  } 
    
    
}
