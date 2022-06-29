//221256 - Ovando Gómez
package com.upchiapas.pizzeria.models;

import java.util.ArrayList;
import java.util.Iterator;

public class CatalogoPizza {
	private ArrayList<Pizza> catalogo = new ArrayList<>();
        
        public CatalogoPizza()
        {
            catalogo.add(new Pizza("Pepperoni", 100));
            catalogo.add(new Pizza("Hawaiana", 120));
            catalogo.add(new Pizza("Mexicana", 130));
            catalogo.add(new Pizza("Margarita", 150)); 
            catalogo.add(new Pizza("Carnes frias", 140));  
            catalogo.add(new Pizza("4 Quesos", 150));  
        }
        

	public ArrayList<Pizza> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(ArrayList<Pizza> catalogo) {
		this.catalogo = catalogo;
	}
        
        

	@Override
	public String toString() {
		String result = "";
                int i = 1;
		for (Iterator iterator = catalogo.iterator(); iterator.hasNext();) {
			Pizza pizza = (Pizza) iterator.next();
			result += i + ") " + pizza.getEspecialidad() + ": $" + pizza.getPrecio() + "\n"; 
                        i++;
		}
		return result;
	}		
	
	
}
