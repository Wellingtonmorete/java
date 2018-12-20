/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadeclientes;

/**
 *
 * @author wellington
 */
public class Telefone {
   private String Tipo;
   private int DDD;
   private int Num;
                    public void setTipo(String tipo){
                        this.Tipo=tipo;
                    }
                    public String getTipo(){
                        return this.Tipo;
                    }
                    public void setDDD(int ddd){
                        this.DDD=ddd;
                    }
                    public int  getDDD(){
                        return this.DDD;
                    }
                    public void setNum(int num){
                        this.Num=num;
                    }
                    public int getNum(){
                        return this.Num;
                    }
                    
   
    
}
