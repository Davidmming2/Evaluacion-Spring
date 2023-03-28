package com.example.Evaluacion.Spring.Controlador;


import com.example.Evaluacion.Spring.Entidades.Productos;
import com.example.Evaluacion.Spring.Servicios.ServiciosProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
public class ControladorProductos {

    ServiciosProductos servicio = new ServiciosProductos();


    @GetMapping("/listarProductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/total")
    public ArrayList<Productos> actualizartotal(){
        return servicio.total();
    }

    @GetMapping("/iva")
    public ArrayList<Productos> iva(){
        return servicio.iva();
    }

    @GetMapping("/buscar/{cate}")
    public Productos buscar(@PathVariable("cate") String categoria){
        return servicio.buscar(categoria);
    }

}
