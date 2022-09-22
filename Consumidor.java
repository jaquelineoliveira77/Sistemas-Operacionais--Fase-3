/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao2_sistemasoperacionais;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Consumidor extends Thread {
    
    Pilha pilha = new Pilha ();

    //instanciando a classe pilha
   // Pilha pilha = new Pilha();

    private static int valor;

    public Consumidor(int valor, Pilha pilha) {
        
        this.pilha = pilha;
        this.valor = valor;

    }

     //construtor
    Consumidor() {

    }

    public static int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Consumidor{" + "valor=" + valor + '}';
    }

    public void run(  ) {

        // System.out.println(" Executando a Thread! ");
        try {
           
                while(true) {
                

                //decrementa o valor
                pilha.decrementa(valor);

                if (valor !=0){
                    
                //System.out.println(" Thread dormindo! ");
                
                //thread vai dormir
                 Thread.sleep( valor * 1000);
                }
                else {
                   
                }
                }
                
            
            

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        //System.out.println(" Terminou a execução da Thread Consumidor! ");
    }

}
