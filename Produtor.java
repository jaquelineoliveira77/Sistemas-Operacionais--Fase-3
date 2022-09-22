
package avaliacao2_sistemasoperacionais;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Produtor extends Thread {
 Pilha pilha = new Pilha ();
    //instanciando a classe pilha
    //Pilha pilha = new Pilha();

    private static int valor;

    public Produtor(int valor, Pilha pilha) {
        
        this.pilha = pilha;
        this.valor = valor;

    }

    //construtor
    Produtor() {
    }

    public static int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produtor{" + "valor=" + valor + '}';
    }

    public void run() {

        //System.out.println(" Executando a Thread! ");
        try {

           
                while(true) {
                   

                //incrementa o valor
                pilha.incrementa(valor);
                
                if( valor !=0){
                    
                     Thread.sleep(valor * 1000);
                } else {
                    
                    
                }

                //System.out.println(" Thread dormindo! ");
               
                //thread vai dormir 
                //depois volta e imprime o próximo
                
                }
                
                
        } catch (InterruptedException e) {

            e.printStackTrace();

            //System.out.println(" Terminou a execução da Thread Produtor! ");
        }

    }

}
