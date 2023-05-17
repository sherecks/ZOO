package dados;

import java.util.ArrayList;
import java.util.List;

import exception.EspacoIndisponivelException;

public class Viveiro {
    
    protected String nome;
    protected float comprimento;
    protected float largura;
    protected float altura;
    List<Animal> animais = new ArrayList<Animal>();

    public float calculaEspaco(){
        return comprimento*largura;
    }

    private float espacoOcupado(){
        
        float espacoOcupado = 0;

        for(int i = 0 ; i < animais.size(); i++){
            espacoOcupado += animais.get(i).calculaEspacoOcupado();
        }

        return espacoOcupado;
    }

    public float espacoDisponivel(){

        float espacoTotal = calculaEspaco();

        return (espacoTotal - espacoOcupado());
    }


    //Exceções
    public void adicionarAnimal(Animal animal) throws EspacoIndisponivelException{

        if (espacoDisponivel() > animal.calculaEspacoOcupado() * 0.7) {
            animais.add(animal);
        }else{
            throw new EspacoIndisponivelException();
        }

    }

    //Getters and Setters

    //1°

    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public float getAltura(){
        return altura;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    //2°

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    //toString!!!

    public String toString() {
        return "Nome = "+ nome + "\nComprimento = " + comprimento + "\nLargura = " + largura +  "\nAltura = " + altura +  "\nAnimais = " + animais;
    }
    
}