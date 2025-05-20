package br.com.alura;

import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetCommand implements Command{
    @Override
    public void execute() {
        try{
            PetService petService = new PetService();

            petService.listarPets();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
