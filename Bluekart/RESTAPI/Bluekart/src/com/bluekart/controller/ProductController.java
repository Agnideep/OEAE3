package com.bluekart.controller;

import java.io.Reader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import com.bluekart.model.Product;
import com.bluekart.response.Response;
import com.google.gson.Gson;

@Path("/controller")
public class ProductController 
{
    @GET
	@Path("/getproducts")
    @Produces(MediaType.APPLICATION_JSON)
	public String getallproducts()
	{
    	
		Product product = new Product(1234,"keyboard","Dell","E");
		
    	Response response = new Response();
    	
    	for(int i=1 ; i<= 25 ; i++)
    	{
 
    	response.productlist.add(product);
    	response.setResults(response.productlist.size());
    	}
    	
    	Gson gson = new Gson();
    	String jsonresponse = gson.toJson(response);
    	
		
		return jsonresponse;
	}

}
