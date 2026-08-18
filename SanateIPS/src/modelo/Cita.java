/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ricardo J
 */
public class Cita {
    
    private String documentoPaciente;
    private String documentoMedico;
    private String fecha;
    private String hora;

    public Cita(String documentoPaciente, String documentoMedico,
            String fecha, String hora) {

        this.documentoPaciente = documentoPaciente;
        this.documentoMedico = documentoMedico;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getDocumentoPaciente() {
        return documentoPaciente;
    }

    public void setDocumentoPaciente(String documentoPaciente) {
        this.documentoPaciente = documentoPaciente;
    }

    public String getDocumentoMedico() {
        return documentoMedico;
    }

    public void setDocumentoMedico(String documentoMedico) {
        this.documentoMedico = documentoMedico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
