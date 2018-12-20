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
public class Endereco {
   private String Tipo;
   private String Rua;
   private String Cidade;
   private String Bairro;
   private String CEP;
   
   
                        public void setTipo(String tipo){
                            this.Tipo=tipo;
                        }
                        public String GetTipo(){
                            return this.Tipo;
                        }
                        public void setRua(String rua){
                            this.Rua=rua;
                         }
                        public String getRua(){
                            return this.Rua;
                        }
                        public void setCidade(String cidade){
                            this.Cidade=cidade;
                        }
                        public String getCidade(){
                            return this.Cidade;
                            
                        }
                        public void setBairro(String bairro){
                            this.Bairro=bairro;
                        }
                        public String getBairro(){
                            return this.Bairro;
                        }
                        public void setCEP(String cep){
                            this.CEP=cep;
                        }
                        public String getCep(){
                            return this.CEP;
                        }
                     //   public void apagaELemento( ){
                       //     this.
                        //}
                        
                       
   
   
    
}
