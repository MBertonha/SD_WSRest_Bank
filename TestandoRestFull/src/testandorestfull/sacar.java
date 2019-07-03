/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandorestfull;

import org.classes.Clientes;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.Scanner;

/**
 *
 * @author cc44800199875
 */
public class sacar {
    public static void main(String[] args) {
       Clientes c = new Clientes();
       Scanner ler = new Scanner(System.in);
       System.out.println("Insira o ID: ");
       Integer idEnter = ler.nextInt();
       c.setIdCliente(idEnter);
        
      System.out.println("Insira o valor de SAQUE: "); 
       Integer valorEnter = ler.nextInt();
       
       
       Client cl = Client.create();
       WebResource wr = cl.resource("http://localhost:8080/WSbakREST/webresources/Clientes/saque/" + idEnter + "," + valorEnter);

       String response = wr.get(String.class);        
                
       System.out.println(response);
       
    }
}
