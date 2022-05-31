/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Enzo
 */
public class ContaCorrente {
    private int Agencia;
    private int Numero;
    private float Saldo;
    private ArrayList<Extrato> extrato;
    
    
    public ContaCorrente (){
        this.Saldo = 0;
        this.extrato = new ArrayList<Extrato>();
        
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public float getSaldo() {
        return Saldo;
    }
    
    public void setDeposito (float Valor){
        if (Valor > 0){
            this.Saldo = this.Saldo + Valor; 
            JOptionPane.showMessageDialog(null,"Deposito realizado com sucesso!"); 
            this.extrato.add(new Extrato(1, Valor));
        }else{
            JOptionPane.showMessageDialog(null,"Valor informado deve ser maior que 0. Deposito não realizado!");
             }
    }
    
    public void setSaque (float Valor){
    
        if(Saldo >= Valor){
            this.Saldo = this.Saldo - Valor; 
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!");
            this.extrato.add(new Extrato(2, Valor));
        }else{
            JOptionPane.showMessageDialog(null,"Saque não realizado! Não possui saldo!");
             }
        }
    
    public String getExtrato(){
    
        if(this.extrato.isEmpty()){
        
               return "Essa conta ainda não possui transações!";
        }else{
        
            String txt = "";
            for(int i = 0; i < this.extrato.size(); i++){
            
                txt = txt +  (1+i) + " " + this.extrato.get(i).getTipo() + ": " + this.extrato.get(i).getValor() + "\n" ;
            }
            txt = txt + "\n" + "Saldo: " + this.Saldo;
            return txt;
        }
        
        
    }

}
    
    

