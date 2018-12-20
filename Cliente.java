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
import java.util.ArrayList;
import java.util.List;
public class Cliente {
  private String Nome;
  private String Nascimento;
  private String CPF;
  private Telefone tel;
  private Email  E;
  private Endereco End;
  private List<Telefone>Telefones;
  private List<Email>Emails;
  private List<Endereco>Enderecos;
  private List<Interacao>Datas;
  public Cliente(){
      this.Datas=new ArrayList<>();
      this.Telefones=new ArrayList<>();
      this.Emails=new ArrayList<>();
      this.Enderecos=new ArrayList<>();
  }
                    public void setNome(String nome){
                        this.Nome = nome;
                    }
		
                        
                    public String getNome() {
                       	return Nome;
                    }
                    public void setNascimento(String data){
                        this.Nascimento=data;
                    }
                    public String getNascimento(){
                        return Nascimento;
                    }
                    public void setCPF(String num){
                        this.CPF=num;
                    }
                    public String getCPF(){
                        return CPF;
                    }
                  
                    
                    
                    public void addNum(Telefone telefone){
                           this.Telefones.add(telefone);
                    }
                    public List<Telefone> GetNum(){
                         
                         return Telefones;                        
                    }
                    public  void RemoveNum(int indice1){
                        this.Telefones.remove(indice1);
                    }
                  
                    
                   
                    public void AddEmail(Email ema){
                        this.Emails.add(ema);
                       
                    }
                    public List<Email>LertEmail(){
                         return Emails;
                    }
                     public void RemoveEmail(int indice2){
                        this.Emails.remove(indice2);
                    }

                   
                    
                    
                    public void AddEnd(Endereco endereco){
                        this.Enderecos.add(endereco);
                    
                    }
                    public List<Endereco> getEnd(){
                        return Enderecos;
                    }
                    public void RemoveEndereco(int indice){
                        this.Enderecos.remove(indice);
                    }
                    
                    
                    
                    
                    public void AddInteracao(Interacao data){
                        this.Datas.add(data);
                    }
                    public List<Interacao> GetInteracao(){
                        return Datas;
                    }
                   
                                       
        
    
}
