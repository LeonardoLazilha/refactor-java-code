package br.com.alura;

import br.com.alura.service.AbrigoService;
import br.com.alura.service.PetService;

import java.io.IOException;
import java.sql.SQLOutput;

public class ListarAbrigoCommand implements Command{

    @Override
    public void execute() {
        try{
            AbrigoService abrigoService = new AbrigoService();

            abrigoService.listarAbrigos();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
