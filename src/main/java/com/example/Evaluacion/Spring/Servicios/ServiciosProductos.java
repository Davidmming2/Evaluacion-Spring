package com.example.Evaluacion.Spring.Servicios;

import com.example.Evaluacion.Spring.Entidades.Productos;

import java.util.ArrayList;

public class ServiciosProductos {

    private ArrayList<Productos> lista = new ArrayList<>();


    public ServiciosProductos(){

        lista.add(new Productos(1,"Espinaca","Verduras",4000,2,0));
        lista.add(new Productos(2,"Maracuya","Frutas",1200,6,0));
        lista.add(new Productos(3,"Salchica","Carnicos",800,5,0));
        lista.add(new Productos(4,"Mortadela","Carnicos",600,10, 0));
        lista.add(new Productos(5,"Arandanos","Frutas",200,14, 0));
        lista.add(new Productos(6,"Pepino","Verduras",1700,2, 0));
        lista.add(new Productos(7,"Pimenton","Verduras",1100,3, 0));
        lista.add(new Productos(8,"Fresas","Frutas",400,8, 0));
        lista.add(new Productos(9,"Jamon","Carnicos",400,10, 0));
        lista.add(new Productos(10,"Mango","Frutas",900,6, 0));

    }

    public ArrayList<Productos> mostrar(){
        return lista;
    }

}