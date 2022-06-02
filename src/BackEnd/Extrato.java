/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author enzo.cardoso
 */
public class Extrato {
    
    private int Tipo;
    private float Valor;

    
    public Extrato (int Tipo, float Valor){
    
        this.Tipo = Tipo;
        this.Valor = Valor;
    }
    public String getTipo() {
        if(this.Tipo == 1){
            return "Deposito";
        }else if (this.Tipo == 2 ){
            return "Saque";
        }else if (this.Tipo == 3){
            return "Credito de transferência";
        }else{
            return "Debito de transferência";
             }
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
    
    
}
