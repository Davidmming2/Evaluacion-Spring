package com.example.Evaluacion.Spring.Servicios;

import com.example.Evaluacion.Spring.Controlador.ControladorProductos;
import com.example.Evaluacion.Spring.Entidades.Productos;

import java.util.ArrayList;

public class ServiciosProductos {

    private ArrayList<Productos> lista = new ArrayList<>();


    public ServiciosProductos(){

        lista.add(new Productos(1,"Espinaca","Verduras",4000,2,0, 0, 0 ));
        lista.add(new Productos(2,"Maracuya","Frutas",1200,6,0,0,0));
        lista.add(new Productos(3,"Salchica","Carnicos",800,5,0,0,0));
        lista.add(new Productos(4,"Mortadela","Carnicos",600,10, 0,0,0));
        lista.add(new Productos(5,"Arandanos","Frutas",200,14, 0,0,0));
        lista.add(new Productos(6,"Pepino","Verduras",1700,2, 0,0,0));
        lista.add(new Productos(7,"Pimenton","Verduras",1100,3, 0,0,0));
        lista.add(new Productos(8,"Fresas","Frutas",400,8, 0,0,0));
        lista.add(new Productos(9,"Jamon","Carnicos",400,10, 0,0,0));
        lista.add(new Productos(10,"Mango","Frutas",900,6, 0,0,0));

    }

    public ArrayList<Productos> mostrar(){
        return lista;
    }

    public String agregarProductos(Productos productos){
        lista.add(productos);
            return "El producto se registro exitosamente";
        }

    public ArrayList<Productos> total(){
        for(Productos productos:lista){
            productos.setTotal(productos.getCantidad()*productos.getPrecio());
        }
        return lista;
    }

    public ArrayList<Productos> iva(){
        for(Productos productos:lista){
            productos.setIva((productos.getTotal()*19)/100);
        }
        return lista;
    }

    public ArrayList<Productos> totalIva(){
        for(Productos productos:lista){
            productos.setTotal(productos.getTotal()+productos.getIva());
        }
        return lista;
    }

    public ArrayList<Productos> descuento(){
        for(Productos productos:lista){
            productos.setDescuento(productos.getTotal()*8/100);
        }
        return lista;
    }

    public ArrayList<Productos> condescuento(){
        for(Productos productos:lista){
            productos.setTotal(productos.getTotal()-productos.getDescuento());
        }
        return lista;
    }


    public ArrayList<Productos> actualizarDescuento(){
        for(Productos productos:lista){
            productos.setDescuento(productos.getTotal()*20/100);
        }
        return lista;
    }

    public ArrayList<Productos> grandescuento(){
        for(Productos productos:lista){
            productos.setTotal(productos.getTotal()-productos.getDescuento());
        }
        return lista;
    }


    public ArrayList<Productos> buscarC (String categoria){
        ArrayList<Productos>buscar = new ArrayList<>();
        for(Productos p: lista){
            if(p.getCategoria().equals(categoria)){
                buscar.add(p);
            }
        }
        return buscar;
    }

    public String eliminar (int cantidad){
        String valor="No se encontro el producto";
        for (Productos p: lista){
            if(p.getCantidad() <= cantidad){
                valor="Producto eliminado con exito";
            }
        }
        return valor;
    }

}