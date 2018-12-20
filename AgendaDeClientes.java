/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadeclientes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author wellington
 */
public class AgendaDeClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam;
        Scanner scan;
        scan= new Scanner(System.in);
        System.out.println("insira quantidade de clientes:");
        tam=scan.nextInt();
        ArrayList<Cliente> clientes= new ArrayList();
//      ArrayList<Telefone> telefones= new ArrayList();
  //      ArrayList<Email> EMAIL= new ArrayList();
        //ArrayList<Endereco> endereco= new ArrayList();
        int ClienteX=0;
        int n=0;
        //@SuppressWarnings("UnusedAssignment")
        int op=0;
        int l = 0;
        int QEnd=0;
         Cliente C= new Cliente();
         Endereco E= new Endereco();
         Email    EM=new Email();
         Telefone T=new Telefone();
         Interacao I=new Interacao();

         do{
                        System.out.println("1) registrar atendimento ou ler atendimento.\n");// renomear para atendimento
			System.out.println("2) telefonar para cliente.\n");
			System.out.println("3) mandar email para cliente\n");
			System.out.println("4) inserir novo cliente\n");
			System.out.println("5)listar Clientes\n");
                        System.out.println("6) excluir Cliente ou algum item do mesmo: \n");
                        System.out.println("0) sair ");
                        op = scan.nextInt();
                        switch(op){
                                     case 1:{
                                                    System.out.println("Se deseja registar digite 1,\n para para ler registro digite 2 \n ");
                                                    int IDesejada=scan.nextInt();
                                                    if(IDesejada==1){
                                                                      System.out.println("Aperte\n (1)Para Visitas,\n (2)Para Telefonemas, \n (3)Para Emails");
                                                                          int OpAtend=scan.nextInt();
                                                        switch (OpAtend) {
                                                            case 1:
                                                                {
                                                                    I.SetInteracao(OpAtend);
                                                                    System.out.println("Insira o indice do cliente Visitado:\n");
                                                                    int CliVisitado=scan.nextInt();
                                                                    System.out.println("insira a data neste formato  dd/mm/aaaa");
                                                                    I.setData(scan.next());
                                                                    scan.nextLine();
                                                                    System.out.println("Relate o ocorrido brevemente");
                                                                    I.addInformacao(scan.nextLine());
                                                                    C.AddInteracao(I);
                                                                    clientes.add(CliVisitado, C);
                                                                    break;
                                                                }
                                                            case 2:
                                                                {
                                                                    I.SetInteracao(OpAtend);
                                                                    System.out.println("Insira o indice do cliente que recebeu o telefonema:\n");
                                                                    int CliTelefonema=scan.nextInt();
                                                                    System.out.println("insira a data neste formato  dd/mm/aaaa");
                                                                    I.setData(scan.next());
                                                                    scan.nextLine();
                                                                    System.out.println("Relate o ocorrido brevemente");
                                                                    I.addInformacao(scan.nextLine());
                                                                    C.AddInteracao(I);
                                                                    clientes.add(CliTelefonema, C);
                                                                    break;
                                                                }
                                                            case 3:
                                                                {
                                                                    I.SetInteracao(OpAtend);
                                                                    System.out.println("Insira o indice do cliente para qual o email foi enviado:\n");
                                                                    int CliEmail=scan.nextInt();
                                                                    System.out.println("insira a data neste formato  dd/mm/aaaa");
                                                                    I.setData(scan.next());
                                                                    scan.nextLine();
                                                                    System.out.println("Relate o ocorrido brevemente");
                                                                    I.addInformacao(scan.nextLine());
                                                                    C.AddInteracao(I);
                                                                    clientes.add(CliEmail, C);
                                                                    break;
                                                                }
                                                            default:
                                                                System.out.println("Botão Invalido!!");
                                                                break;
                                                        }


                                                        }
                                                    else if(IDesejada==2){
                                                                          System.out.println("Insira o indice do cliente:");
                                                                              int LRCli=scan.nextInt();
                                                                          System.out.println("Insira a Data desejada:");
                                                                              String DataDsj=scan.next();

                                                                          if(C.GetInteracao().get(LRCli).getData().equals(DataDsj)){
                                                                              int PosData=C.GetInteracao().indexOf(DataDsj);
                                                                              System.out.println("foram realizadas as seguintes acoes nesta data"+DataDsj);
                                                                              System.out.println("Total de "+C.GetInteracao().get(LRCli).GetQtdTelefonemas()+"telefonemas\n");
                                                                              System.out.println("Total de "+C.GetInteracao().get(PosData).GetQtdEmail()+"Emails");
                                                                              System.out.println("Total de "+C.GetInteracao().get(PosData).GetQtdTelefonemas()+"telefonemas\n");
                                                                              System.out.println("Total de "+C.GetInteracao().get(LRCli).GetQtdVisitas()+"Visitas\n");
                                                                              System.out.println("informacao "+C.GetInteracao().get(LRCli).getInformacao()+"\n");
                                                                           }
                                                                          else System.out.println("Data inexistete! \n");
                                                    }
                                                          else{
                                                              System.out.println("Valor ivalido!!!!!"); 
                                                              }

                                                  }





                                     
                                  
         
                                    case 2:{
                                
                                    }
                                    case 3:{
                                
                                    }
                                    case 4:{
                                
                                                if(ClienteX < tam)
                                                {
                                               
                                                
                                                System.out.println("Nome:\n");
                                                    C.setNome(scan.next());
                                                System.out.println("CPF:\n");
                                                    C.setCPF(scan.next());
                                                System.out.println("data de nascimento:\n");
                                                    C.setNascimento(scan.next());
                                                   
                                                do{
                                                System.out.println("ddd do telefone:\n");
                                                    T.setDDD(scan.nextInt());
                                                System.out.println("telefone:\n");
                                                    T.setNum(scan.nextInt());
                                                 System.out.println("tipo de telefone\n");
                                                    T.setTipo(scan.next());
                                                 System.out.println("Caso queira adicionar um novo numero digite 0 para continuar digite 1:\n");
                                                   n = scan.nextInt();
                                                   C.addNum(T);
                                                   
                                                   
                                                }while(n!=1);
                                             
                                                 do{
                                                  System.out.println(" Email:\n");
                                                 
                                                   EM.setEmail(scan.next());
                                                System.out.println("Tipo de email\n");
                                                   EM.setTipo(scan.next());
                                                System.out.println("Caso queira adicionar um novo email aperte 0 ou se deseja continuar aperte 1:\n");
                                                    l=scan.nextInt();
                                                    C.AddEmail(EM);
                                                    
                                                 }while(l!=1);
                                               
                                                 do{  
                                                
                                                 System.out.println("                  Endereco\n");
                                                System.out.println("Tipo");
                                                    E.setTipo(scan.next());
                                                System.out.println("Rua:\n");
                                                    E.setRua(scan.next());
                                                System.out.println("Bairro:\n");
                                                    E.setBairro(scan.next());
                                                System.out.println("Cidade:\n");
                                                    E.setCidade(scan.next());
                                                System.out.println("CEP");
                                                    E.setCEP(scan.next());
                                                System.out.println("Caso queira adicionar um novo endereco aperte 0 ou se deseja continuar aperte 1:\n");
                                                    QEnd=scan.nextInt();
                                                    C.AddEnd(E);
                                               
                                                 }while(QEnd!=1);
                                                clientes.add(ClienteX,C);
                                                ClienteX++;
                                                
                                                }
                                                else{ 
                                                    System.out.println("lista de cliente completamente cheia!!");
                                                
                                                    }
                                                break;
                                                }
                                       case 5:{
                                                for(int i=0;i<clientes.size();i++){
                                                        System.out.println("n° "+i+"Clientes: "+clientes.get(i).getNome()+"Nascimento: "+clientes.get(i).getNascimento()+"CPF:"+clientes.get(i).getCPF()+"\n");
                                                   for(int ContaEnd=0;ContaEnd<C.getEnd().size();ContaEnd++){ 
                                                        System.out.println("      Endereco n°\n"+ContaEnd);
                                                        System.out.println("tipo"+C.getEnd().get(ContaEnd).GetTipo());
                                                        System.out.println("Rua:"+C.getEnd().get(ContaEnd).getRua()+"\n");
                                                        System.out.println("Bairro:"+C.getEnd().get(ContaEnd).getBairro()+"\n");
                                                        System.out.println("Cidade:"+C.getEnd().get(ContaEnd).getCidade()+"\n");
                                                        System.out.println("CEP:"+C.getEnd().get(ContaEnd).getCep()+"\n");
                                                   }
                                                    //validar cpf , usar o contador para a quantidade de interacoes na classe interacoes
                                                    for(int j=0;j<C.GetNum().size();j++){
                                                            System.out.println("telefone n°: \n "+j);
                                                            System.out.println("Tipo:"+C.GetNum().get(j).getTipo()+"\n");
                                                            System.out.println("DDD:"+C.GetNum().get(j).getDDD()+"\n");
                                                            System.out.println("Numero:"+C.GetNum().get(j).getNum()+"\n");
                                                        
                                                    }
                                                    for(int k=0;k<C.LertEmail().size();k++){
                                                            System.out.println("           Email n° \n"+k);
                                                            System.out.println("Tipo:"+C.LertEmail().get(k).getTipo()+"\n");
                                                            System.out.println("E-mail:"+C.LertEmail().get(k).getEmail()+"\n");
                                                    }
                                                }break;
                                       }
                                       case 6:{ 
                                                int exc=scan.nextInt();
                                           int ExcluindoX=0;
                                           do{ 
                                               System.out.println("          Excluir:\n ");
                                               System.out.println("1)Cliente\n");
                                               System.out.println("          contatos\n");
                                               System.out.println("2)Email\n");
                                               System.out.println("3)Telefone\n");
                                               System.out.println("4)Endereco\n");
                                               System.out.println("0) para voltar ao menu princapal");
                                               ExcluindoX =scan.nextInt();
                                            switch(ExcluindoX){
                                               
                                                     case 1:{
                                                                 System.out.println("Insira o  indice do cliente que deseja excluir :\n");
                                                                 exc=scan.nextInt();
                                                                 if(exc<ClienteX)
                                                                 clientes.remove(exc);
                                                                 
                                                                break;               
                                                            }
                                                     case 2:{
                                                                System.out.println("Insira o  indice do cliente que deseja excluir :\n");
                                                                    exc=scan.nextInt();
                                                                System.out.println("insira o indice do email:\n");
                                                                    int ExcEmail=scan.nextInt();
                                                                if(exc<ClienteX && ExcEmail<C.LertEmail().size()){
                                                                    clientes.get(exc).RemoveEmail(ExcEmail);
                                                               
                                                                }
                                                                break;
                                                                    
                                                            }
                                                     case 3:{
                                                                System.out.println("Insira o  indice do cliente que deseja excluir :\n");
                                                                    exc=scan.nextInt();
                                                                System.out.println("insira o indice do telefone que deseja excluir:\n");
                                                                    int ExcTel=scan.nextInt();
                                                                if(exc<ClienteX && ExcTel<C.LertEmail().size()){
                                                                    clientes.get(exc).RemoveNum(ExcTel);
                                                                }
                                                                break;
                                                                
                                                            }
                                                     case 4: {
                                                                System.out.println("Insira o  indice do cliente que deseja excluir :\n");
                                                                    exc =scan.nextInt();
                                                                System.out.println("Insira o indice do endereco:\n ");
                                                                    int ExcEnd=scan.nextInt();
                                                                if(exc<ClienteX && ExcEnd<C.getEnd().size()){
                                                                    clientes.get(exc).RemoveEndereco(ExcEnd);
                                                                    
                                                                }
                                                                break;
                                                                        
                                                         
                                                              }
                                               } 
                                          }while(ExcluindoX!=0); 
                                       }
                        }
			
            }while(op!=0);
        
        scan.close();
         
         
    }
}