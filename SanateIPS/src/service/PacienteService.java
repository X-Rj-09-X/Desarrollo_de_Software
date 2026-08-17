/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import modelo.Paciente;

/**
 *
 * @author Ricardo J
 */
public class PacienteService {
    
    private List<Paciente> pacientes;
    
    public PacienteService() {
        pacientes = new ArrayList<>();
    
    }
    
    public void crearPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
    
     public List<Paciente> listarPacientes() {
        return pacientes;
    }

    public Paciente buscarPaciente(String documento) {

        for (Paciente paciente : pacientes) {

            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }

        return null;
    }

    public boolean modificarPaciente(String documento, String nombre,
            String apellido, String telefono) {

        Paciente paciente = buscarPaciente(documento);

        if (paciente != null) {

            paciente.setNombre(nombre);
            paciente.setApellido(apellido);
            paciente.setTelefono(telefono);

            return true;
        }

        return false;
    }

    public boolean eliminarPaciente(String documento) {

        Paciente paciente = buscarPaciente(documento);

        if (paciente != null) {
            pacientes.remove(paciente);
            return true;
        }

        return false;
    }
    
}
