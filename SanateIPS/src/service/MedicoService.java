/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import modelo.Medicos;


/**
 *
 * @author Ricardo J
 */
public class MedicoService {
    
    private List<Medicos> medicos = new ArrayList<>();

    public void crearMedico(Medicos medico) {
        medicos.add(medico);
    }

    public List<Medicos> listarMedicos() {
        return medicos;
    }

    public Medicos buscarMedico(String documento) {

        for (Medicos medico : medicos) {

            if (medico.getDocumento().equals(documento)) {
                return medico;
            }
        }

        return null;
    }

    public boolean modificarMedico(String documento,
            String nombre, String apellido,
            String especialidad, String telefono) {

        Medicos medico = buscarMedico(documento);

        if (medico != null) {

            medico.setNombre(nombre);
            medico.setApellido(apellido);
            medico.setEspecialidad(especialidad);
            medico.setTelefono(telefono);

            return true;
        }

        return false;
    }

    public boolean eliminarMedico(String documento) {

        Medicos medico = buscarMedico(documento);

        if (medico != null) {
            medicos.remove(medico);
            return true;
        }

        return false;
    }
    
    
    
}
