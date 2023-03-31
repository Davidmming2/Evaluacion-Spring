package com.example.Evaluacion.Spring.Controlador;

import com.example.Evaluacion.Spring.Entidades.Productos;
import com.example.Evaluacion.Spring.Servicios.ServiciosProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorProductos {

    ServiciosProductos servicio = new ServiciosProductos();


    @GetMapping("/listarProductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @PostMapping("/agregarProducto")
    public String agregar(@RequestBody Productos productos){return servicio.agregarProductos(productos);}

    @GetMapping("/total")
    public ArrayList<Productos> total(){
        return servicio.total();
    }

    @GetMapping("/iva")
    public ArrayList<Productos> iva(){
        return servicio.iva();
    }

    @GetMapping("/totalIva")
    public ArrayList<Productos> totaliva(){
        return servicio.totalIva();
    }

    @GetMapping("/descuento")
    public ArrayList<Productos> descuento(){
        return servicio.descuento();
    }

    @GetMapping("/condescuento")
    public ArrayList<Productos> condescuento(){
        return servicio.condescuento();
    }

    @GetMapping("/actualizarDescuento")
    public ArrayList<Productos> actualizarDescuento(){
        return servicio.actualizarDescuento();
    }

    @GetMapping("/grandescuento...")
    public ArrayList<Productos> grandescuento(){
        return servicio.grandescuento();
    }

    @GetMapping("/buscar/{cate}")
    public ArrayList<Productos> buscar(@PathVariable("cate") String categoria){
        return servicio.buscarC(categoria);
    }

    @DeleteMapping("/eliminarCantidades/{canti}")
    public ArrayList<Productos> eliminar(@PathVariable("canti") Integer cantidad){return servicio.eliminar(cantidad);}
}

