package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dateNow = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry: eventoTreeMap.entrySet()){
            if(entry.getKey().isEqual(dateNow) || entry.getKey().isAfter(dateNow)){
                System.out.println("O proximo evento: "+ entry.getValue()+" acontecera na data "+entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,15),"Evento 1","Amendoin");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 11,15),"Evento 2","Patati");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 5,15),"Evento 3","Bozo");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11,25),"Niver","Eu");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9,7),"Evento 4","Eu");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
