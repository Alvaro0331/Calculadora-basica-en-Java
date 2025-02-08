package practica2_calculadorabasica;

/**
 *
 * @author Alvaro Davila Gomez
 */
public class Operaciones {
    private Double numero1;
    private Double numero2;
    private Double resultado;

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setOperaciones(String operador) {
        if(operador.equals("+")){
            this.resultado = this.numero1 + this.numero2;
        }
        if(operador.equals("-")){
            this.resultado = this.numero1 - this.numero2;
        }
        if(operador.equals("X")){
            this.resultado = this.numero1 * this.numero2;
        }
        if(operador.equals("/")){
            this.resultado = this.numero1 / this.numero2;
        }
    }
    
    
}
