package com.example.Evaluacion.Spring.Controlador;


import com.example.Evaluacion.Spring.Entidades.Productos;
import com.example.Evaluacion.Spring.Servicios.ServiciosProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
public class ControladorProductos {

    ServiciosProductos servicio = new ServiciosProductos();


    @GetMapping("/listarProductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

}
