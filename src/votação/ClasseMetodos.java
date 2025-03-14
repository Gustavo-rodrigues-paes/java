
package votação;

import java.io.*;	
import javax.swing.*;
import java.util.Random;
public class ClasseMetodos {
     public Votação[ ] FCADRASTRAVOTAÇÃO (Votação[ ] Votação  ) throws IOException {	
     int i;	
     String fileName = "ArquivoVotação.txt";	
     BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
     for (i = 0 ; i < 200 ; i++)	{
          Votação[i] = new Votação();
     }
 
     for (i = 0 ; i < 200 ; i++)  {	
           Votação[i].NumeroSeção = (int) (Math.random()*11+0);	
           writer.write(Integer.toString( Votação[i].NumeroSeção ));  	
           writer.newLine();	
           Votação[i].NumeroCandidato = (int) (Math.random()*301+0);		
           writer.write(Integer.toString(Votação[i].NumeroCandidato));   	
          writer.newLine();  } 
      System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
    writer.close();
  return Votação;
  }	
 public void FCLASSIFICASEÇÃO(Votação[] Votação) {
     int i,k,aux;
     
     for(i=0;i<200;i++){
         if (Votação[i].NumeroSeção > Votação[k].NumeroSeção){
            aux= Votação[i].NumeroSeção;
            Votação[i].NumeroSeção = Votação[k].NumeroSeção;
            Votação[k].NumeroSeção = aux;    
     }
         for(i=0;i<200;i++){
         System.out.println("Numero da secção: "+Votação[i].NumeroSeção + " numero candidato  :" + Votação[i].NumeroCandidato) ;
         }
     }
         
 }
  public Votação[ ] FGRAVAVOTAÇÃO (Votação[ ] Votação  ) throws IOException {	
     int i;	
     String fileName = "ArquivoAluno.txt";	
     BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
     for (i = 0 ; i < 20 ; i++)	{
          Votação[i] = new Votação();
     }
 
     for (i = 0 ; i < 20 ; i++)  {	
           Votação[i].NumeroSeção = (int) (Math.random()*11+0);	
           writer.write(Integer.toString( Votação[i].NumeroSeção ));  	
           writer.newLine();	
           Votação[i].NumeroCandidato = (int) (Math.random()*301+0);		
           writer.write(Integer.toString(Votação[i].NumeroCandidato));   	
          writer.newLine();  } 
      System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
    writer.close();
  return Votação;
  }	
 
 
 
  public void MostrarIndicadores(Votação[] Votação)throws IOException {
    	
     ClasseMetodos m = new ClasseMetodos(); 
      int opc=0      ;
      while (opc!=9){
 opc = Integer.parseInt(JOptionPane.showInputDialog("-----------------------------------------------------------------------\n" +
"|	    Mostrar Indicadores			                  |\n" +
"|        Estatísticas de Votação em 2021		          |\n" +
"| 1 – Quantidade Eleitores por Seção	                          |\n" +
"| 2 – Seção com Maior e Menor número de Eleitores                 |\n" +
"| 3 – Quantidade de votos por candidato                          |\n" +
"| 4 – 10 primeiros colocadas (nro cand. e qtd votos)             |\n" +
"| 9 – Finaliza consulta	                		          |\n" +
"------------------------------------------------------------------------"));
      switch (opc)     {
            case 1: QuantidadeEleitoresporSeção(Votação);
                         break;
            case 2:SeçãocomMaioreMenornúmerodeEleitores (Votação);
                         break;
            case 3:FGRAVAVOTAÇÃO(Votação);
                         break;
            case 4:MostrarIndicadores (Votação);
                         break;   
            case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
                         break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }   }  } 
    
public void QuantidadeEleitoresporSeção(Votação[] Votação) {
    int i,k;
    int vetor[]=new int [20];
    
    for(i=0;i<20;i++){
        for(k=0;k<11;k++){
        if(Votação[i].NumeroSeção==k){
            vetor[k]=vetor[i]+1;
        }
        }
        
    }
    for(k=0;k<11;k++){
    System.out.println("a quantidade de eleitores na seção "+k+" é : "+vetor[k]);
    }
    }
 public void SeçãocomMaioreMenornúmerodeEleitores(Votação[] Votação) {
     int i,maior,menor,k;
     int vetor[]=new int [20];
    
     for(i=0;i<20;i++){
         for(k=0;k<11;k++){
        if(Votação[i].NumeroSeção==k){
            vetor[k]=vetor[i]+1;
        }
        }
        maior=vetor[0];
        menor=vetor[0];
        for(k=1;k<11;k++){
            if(menor<vetor[k]){
                menor=vetor[k];
            }
            else{
                if(maior>vetor[k]){
                    maior=vetor[k];
                }
            }
        }
        System.out.println("a seção com maior numero de eleitores è : "+maior);
        System.out.println("a seção com menor numero de eleitores è : "+menor);
     }
     
 }
 
 
    
}
