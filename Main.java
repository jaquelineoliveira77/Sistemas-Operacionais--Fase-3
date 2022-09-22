
package avaliacao2_sistemasoperacionais;

import java.util.Scanner;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Main {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        Scanner input = new Scanner(System.in);

        System.out.println(" Digite a quatidade de posições da primeira matrícula: ");
        int matricula1 = Integer.valueOf(input.nextLine());

        System.out.println(" ");

        /*System.out.println(" Digite a quatidade de posições da seguda matrícula: ");
        int matricula2 = Integer.valueOf(input.nextLine());*/

        int[] vetorMatricula1 = new int[matricula1];
        //int[] vetorMatricula2 = new int[matricula2];

        Thread[] vetor = new Thread[matricula1];

        System.out.println(" ");

        System.out.println(" Matrícula 1: ");

        for (int i = 0; i < vetorMatricula1.length; i++) {

            System.out.println(" Preencha o vetor com os números da primeira matrícula, posição: " + i + " : ");
            vetorMatricula1[i] = input.nextInt();

        }

        System.out.println(" ");

       /* System.out.println(" Matrícula 2: ");

        for (int i = 0; i < vetorMatricula2.length; i++) {

            System.out.println(" Preencha o vetor com os números da segunda matrícula, posição: " + i + " : ");
            vetorMatricula2[i] = input.nextInt();

        }

        System.out.println(" ");
        */
       
       
        System.out.println(" Matrícula 1: ");

        //
        for (int i = 0; i < vetorMatricula1.length; i++) {

            System.out.print(vetorMatricula1[i] + " | ");

        }

        System.out.println(" ");
        System.out.println(" ");

        /*
        System.out.println(" Matrícula 2: ");

        for (int i = 0; i < vetorMatricula2.length; i++) {

            System.out.print(vetorMatricula2[i] + " | ");

        }

        System.out.println(" ");

        System.out.println(" ");
    */
        
        
          //matrícula 1
          
        for (int i = 0; i < vetorMatricula1.length; i++) {
            if (i%2==0){
              Produtor produtor = new Produtor(vetorMatricula1[i],pilha);
              vetor[i] = produtor;
              System.out.println("PRODUTOR: " + produtor);
                
            }else if(i%2==1){
              Consumidor consumidor = new Consumidor(vetorMatricula1[i],pilha);
              vetor[i] = consumidor;
               System.err.println("CONSUMIDOR: " + consumidor);
                
            }
            //valor i está sendo passado como parametro para multiplicar por 1000
            //tempo em que a thread vai dormir / instanciando a classe 
           
    
            

            
           
            //colocando a classe instanciada dentro do vetor
            

           

        }
        
         /*
        //matrícula 2
        for (int i = 0; i < vetorMatricula2.length; i++) {

            Produtor produtor = new Produtor(i);
            Consumidor consumidor = new Consumidor(1);

            //colocando a classe instanciada dentro do vetor
            vetor[i] = produtor;
            vetor[1] = consumidor;

        }
        */
        
         //matrícula 1
        try {
            for (int i = 0; i < vetorMatricula1.length; i++) {
                
                //iniciar a execução da Thread
                
                vetor[i].start();
               /* for (int l = 0; l < vetorMatricula1.length; l++) {

            System.out.print( vetor[l] + " | ");

        }*/

                 

            }
            
            Thread.sleep(1 * 1000); //thread vai dormir por 10 segundos
            for (int i = 0; i < vetorMatricula1.length; i++){
                vetor[i].stop();
            }

            
         /*  for (int i = 0; i < vetorMatricula1.length; i++) {

               if (i%2==0){
             System.out.println("Valores Produtor: " + Produtor.getValor() );
                
            }else if(i%2==1){
             System.out.println("Valores Consumidor: " + Consumidor.getValor() );
                
            }
        }
            */
         
            System.out.println("\nValores: " + pilha.getValue());
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        /*
         //matrícula 2
        try {
            for (int i = 0; i < vetorMatricula2.length; i++) {

                //iniciar a execução da Thread
                vetor[i].start();
                Thread.sleep(10 * 1000); //thread vai dormir por 10 segundos
                

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    */
    
    //Falta
    // imprima o valor final da pilha utilizando
    //o método getValue;


}
}
