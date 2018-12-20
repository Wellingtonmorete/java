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
public class Interacao {
   private String Data;
   private String  Telefone;
   private String Endereco;
   private String Email;
   private int ContTel=0;
   private int ContVisita=0;
   private int ContEma=0;
   private String Texto;
            public void setData(String data){
                this.Data=data;
            }
            public String getData(){
               return  this.Data;
            }
            void SetInteracao(int TServico){
                    switch(TServico)
                    {
                            case 1: {this.ContVisita++; 
                                    break;
                                    }
                            case 2:{this.ContTel++;
                                    break;
                                    }
                            case 3:{this.ContEma++;
                                    break;
                                    }
                         
                    }
            }
            public int GetQtdVisitas(){
                return this.ContVisita;
            } 
            
            public int GetQtdTelefonemas(){
                return this.ContTel;
            }
            public int GetQtdEmail(){
                return this.ContEma;
            }
            
                public void ExcluirInteracao(int TServico){
                     switch(TServico){
                         case 1: {this.ContVisita--;
                                  break;
                                  }
                         case 2:{this.ContTel--;
                                break;
                                }
                         case 3:{this.ContEma--;
                                break;
                                }
                         
                     
                
                        }
                }
                 public void addInformacao(String texto){
                     this.Texto=texto;
                     
                 }
                 public String getInformacao(){
                      return this.Texto;                      
                     
                   }
                

    
                 
                 
                 
                 
                 
                 
    
    
}
