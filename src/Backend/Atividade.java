package Backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade {

    private String nome;
    private Date horarioInicio;
    private Date horarioTermino;
    private Date data;

    public Atividade() {
        this.nome = "";
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        try {
            this.horarioInicio = formato.parse("00:00");
            this.horarioTermino = formato.parse("00:00");
            formato = new SimpleDateFormat("dd/MM/yyyy");
            this.data= formato.parse("01/01/0001");
        } catch (ParseException ex) {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
