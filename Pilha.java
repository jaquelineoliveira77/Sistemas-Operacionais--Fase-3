
package avaliacao2_sistemasoperacionais;

/**
 *
 * @author Jaqueline Oliveira
 */
public class Pilha {

    int value;
    

    public Pilha() {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

   

    //– incrementa o valor da variável value com um valor passado como parâmetro
    public int incrementa(int valor) {

   
        // código sincronizado
        synchronized (this) {
            
            if (valor !=0){
                
                
                 value = value + valor;
                 
            } else {
                
                value = value;
            }
            
            return value;
        }
    }

    //decrementa o valor da variável value com um valor passado como parâmetro;
    public int decrementa(int valor) {
        
        
        // código sincronizado
        synchronized (this) {
                
       
                
               value = value - valor;
                 
           
            return value;
        }
    }

    //– retorna o valor atual da variável value
    public int getValue() {

        synchronized (this) {
            // código sincronizado
            return value;
        }
    }
}
