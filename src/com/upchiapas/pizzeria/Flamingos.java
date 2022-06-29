//221256 - Ovando Gómez
package com.upchiapas.pizzeria;
//Insertar las clases
import com.upchiapas.pizzeria.models.Pizza;
import com.upchiapas.pizzeria.models.CatalogoPizza;
import com.upchiapas.pizzeria.models.ItemCompra;
import com.upchiapas.pizzeria.models.OrdenCompra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Flamingos{   
    //private static especialidad;
    //enum especialidad{peperoni,hawaina}
	public static void main(String[] args) {	
		int idPizza = 0;
                int idCompra = 0;
                int con = 0;
                
		ArrayList<OrdenCompra> pedidos = new ArrayList<>();		
		CatalogoPizza catalogoPizza = new CatalogoPizza();
		
		boolean salir = false;
		int op = 0;
		do {
			Scanner Teclado = new Scanner(System.in);
			System.out.println(
                              "  \n  Flamingos Pizza´s \n"+
                              "1. visualizar catalogo \n"+
			      "2. Generar orden \n"+
			      "3. Imprimir ventas \n"+
                              "4. Salir \n"+
                              "   Opcion: ");
			op= Teclado.nextInt();
			switch (op) {
			case 1:
                                System.out.println("\n-----  Menu  -----");
				System.out.println(catalogoPizza.toString());	
				break;
			case 2:
                                int numP = 0;
				 Teclado= new Scanner(System.in);
				OrdenCompra orden = new OrdenCompra();
				orden.setId(idCompra+"");
				System.out.println("Ingresa el nombre del cliente: ");
				String nombreCliente =  Teclado.nextLine();
                                System.out.println("Ingresa el numero de telefono del cliente: ");
				String numeroCliente =  Teclado.nextLine();
				orden.setNombreCliente(nombreCliente);
                                orden.setNumeroCliente(numeroCliente);
				boolean AddPizza = false;
				do {
                                        System.out.println("\n-----  Menu  -----");
					System.out.println(catalogoPizza.toString());
                                        System.out.println("Si desea terminar orden marque (-1)");
                                        System.out.println("Que pizza de sea agregar: ");
					int pedido = Teclado.nextInt();
					if(pedido != -1) {
						try {
						ItemCompra itemCompra = new ItemCompra();
					        System.out.println("Cuantas desea añadir de " + catalogoPizza.getCatalogo().get(pedido-1).getEspecialidad());
					        numP = Teclado.nextInt();
                                                itemCompra.setCantidad(numP);
					        itemCompra.setProducto(catalogoPizza.getCatalogo().get(pedido-1));
					        itemCompra.setSubtotal(itemCompra.getCantidad() * catalogoPizza.getCatalogo().get(pedido-1).getPrecio());
						orden.getProductos().add(itemCompra);
						} catch (Exception e) {
							System.out.println("No se encontro esa opcion");
						}
					}else {						
						AddPizza = true;
						if(orden.getProductos().size() > 0) {
							pedidos.add(orden);}
					}
                                        System.out.println("----Pedido agregado----");
				}while(!AddPizza);
				break;
			case 3:
                                System.out.println("\n       Reporte de venta");
				System.out.println("      *Flamingos Pizza´s*\n");
				for (Iterator iterator = pedidos.iterator(); iterator.hasNext();) {
                                        con++;
                                        System.out.println("Pedido N° "+con);
					OrdenCompra ordenReporte = (OrdenCompra) iterator.next();
					System.out.println("Nombre del cliente: " + ordenReporte.getNombreCliente());
                                        System.out.println("Numero de telefono: " + ordenReporte.getNumeroCliente());
					System.out.println("\n      Productos");
					for (Iterator iterator2 = ordenReporte.getProductos().iterator(); iterator2.hasNext();) {
						ItemCompra itemCompra = (ItemCompra) iterator2.next();
						System.out.println("Pizza           " + itemCompra.getProducto().getEspecialidad() + "\n  Cantidad        " + itemCompra.getCantidad() + "\n  Subtotal      $" + itemCompra.getSubtotal());
					}
					System.out.println("\n Total\n\n         $" +  ordenReporte.getTotal());
				}
				break;
                        case 4:
                               System.out.println("SALIO DEL PROGRAMA");
			       salir = true;
                               break;
			default:
				System.out.println("OPCION NO VALIDA");
				break;
			}
		}while(!salir);
	}
	public void menu(){
            Pizza especialidad;
            }
        }