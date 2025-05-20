package br.com.alura;

import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsCommand implements Command{
    @Override
    public void execute() {
        try{
            PetService petService = new PetService();

            petService.importarPets();
        }catch (IOException | InterruptedException e){
            System.out.printf(e.getMessage());
        }
    }
}
