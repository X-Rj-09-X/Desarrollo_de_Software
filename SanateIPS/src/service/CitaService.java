/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import modelo.Cita;


/**
 *
 * @author Ricardo J
 */
public class CitaService {
    
    private List<Cita> citas = new ArrayList<>();

    public void crearCita(Cita cita) {
        citas.add(cita);
    }

    public List<Cita> listarCitas() {
        return citas;
    }
    
}
