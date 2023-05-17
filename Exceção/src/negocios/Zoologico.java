package negocios;

import java.util.ArrayList;
import java.util.List;

import dados.Viveiro;
import exception.EspacoIndisponivelException;
import dados.Animal;
import dados.Aquario;

public class Zoologico {

    private List<Animal> animais = new ArrayList<Animal>();
    private List<Viveiro> viveiros = new ArrayList<Viveiro>();
    
    public void cadastrarViveiro(Viveiro viveiro){
        viveiros.add(viveiro);
    }

    public void cadastrarAnimais(Animal animal){
        animais.add(animal);
    }

    //Exceções
    public void alocarAnimal(Animal animal,Viveiro viveiro) throws EspacoIndisponivelException{
        viveiro.adicionarAnimal(animal);
    }

    public List<Aquario> getSoAquarios(){
        
        List<Aquario> soAquarios = new ArrayList<Aquario>();    
    
        for(int i = 0 ; i < viveiros.size() ; i++){
            if(viveiros.get(i) instanceof Aquario){
                soAquarios.add((Aquario)viveiros.get(i));
            }
        }

        return soAquarios;
    }

    public List<Viveiro> getSoViveiros(){

        List<Viveiro> soViveiros = new ArrayList<Viveiro>();    
    
        for(int i = 0 ; i < viveiros.size() ; i++){
            if(viveiros.get(i) instanceof Viveiro){
                soViveiros.add((Viveiro)viveiros.get(i));
            }
        }

        return soViveiros;
    }

    public String mostraAnimal() {
        return "--Animais--\n" + animais.toString();
    }

    public String mostraViveiro() {
        return "--Viveiro--\n" + viveiros;
    }



    //Getters and Setters


    //1°

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public void setViveiros(List<Viveiro> viveiros) {
        this.viveiros = viveiros;
    }


    //2°

    public List<Animal> getAnimais() {
        return animais;
    }

    public List<Viveiro> getViveiros() {
        return viveiros;
    }

}