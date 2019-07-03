/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandorestfull;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.Scanner;

/**
 *
 * @author DELL-Fabio
 */
public class deletar {
    public static void main(String[] args) {
        // TODO code application logic here   
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um NOME para excluir: ");
        String postNumber = ler.nextLine();
        
        Client c = Client.create();
        WebResource wr = c.resource("http://localhost:8080/WSbakREST/webresources/Clientes/" + postNumber);
        String response = wr.delete(String.class);  
                
        System.out.println(response);   
    }
}
