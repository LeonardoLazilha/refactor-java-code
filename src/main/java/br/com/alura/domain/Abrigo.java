package br.com.alura.domain;

public class Abrigo  {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets;


    public Abrigo(String nome, String telefone, String email, Pet[] pet) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.pets = pet;
    }

    public Abrigo(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }
}
