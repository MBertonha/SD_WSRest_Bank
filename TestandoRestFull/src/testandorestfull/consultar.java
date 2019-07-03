/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandorestfull;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.Scanner;
import org.classes.Clientes;

public class consultar {
    public static void main(String[] args) {
        // TODO code application logic here    
        Clientes c = new Clientes();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o NOME para a busca: ");
        String getNumber = ler.nextLine();
        
        Client cl = Client.create();
        WebResource wr = cl.resource("http://localhost:8080/WSbakREST/webresources/Clientes/" + getNumber);
        String response = wr.get(String.class);  
        Gson gson = new Gson();
        c = gson.fromJson(response, Clientes.class );
                
        System.out.println(c.getIdCliente());
        System.out.println(c.getNome());
        System.out.println(c.getSaldo());
        System.out.println(c.getSenha());
    }      
}
