/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandorestfull;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.util.Scanner;
import org.classes.Clientes;

/**
 *
 * @author DELL-Fabio
 */
public class inserir {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        Clientes c = new Clientes();
        
        System.out.println("Insira o NOME: ");
        String nomeEnter = ler.nextLine();
        c.setNome(nomeEnter);
        
        System.out.println("Insira o SALDO: ");
        Integer saldoEnter = ler.nextInt();
        c.setSaldo(saldoEnter);
        
        System.out.println("Insira a SENHA: ");
        Integer senhaEnter = ler.nextInt();
        c.setSenha(senhaEnter);

        Client cl = Client.create();
        WebResource wr = cl.resource("http://localhost:8080/WSbakREST/webresources/Clientes");
        
        Gson gson = new Gson();
        String response = wr.type("application/json").post(String.class, gson.toJson(c));                
        System.out.println(response);                
    }  
}
