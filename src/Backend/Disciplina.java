package Backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Disciplina {
    private String nome;
    private Date horarioInicio;
    private Date horarioTermino;
    private List<String> diaSemana;
    
    public Disciplina(){
        this.nome="";
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        try {
            this.horarioInicio= formato.parse("00:00");
            this.horarioTermino= formato.parse("00:00");
        } catch (ParseException ex) {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        diaSemana=new ArrayList<>();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(Date horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public List<String> getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(List<String> diaSemana) {
        this.diaSemana = diaSemana;
    }
    
}
