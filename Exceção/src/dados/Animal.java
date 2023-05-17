package dados;

public class Animal {

    private String nome;
    private String cor;
    private String especie;
    private int idade;
    protected float largura;
    protected float comprimento;
    protected float altura;
    

    //Getters and Setters

    
    //1°

    public void setNome(String Nome){
        this.nome = Nome;
    }

    public void setCor(String Cor){
        this.cor = Cor;
    }

    public void setEspecie(String Especie){
        this.especie = Especie;
    }

    public void setIdade(int Idade){
        this.idade = Idade;
    }

    public void setLargura(float Largura){
        this.largura = Largura;
    }

    public void setAltura(float Altura){
        this.altura = Altura;
    }

    public void setComprimento(float Comprimento){
        this.comprimento = Comprimento;
    }

    //2°

    public String getNome(){
        return nome;
    }
    public String getCor(){
        return cor;
    }
    public String getEspecie(){
        return especie;
    }
    public int getIdade(){
        return idade;
    }
    public float getLargura(){
        return largura;
    }
    public float getAltura(){
        return altura;
    }
    public float getComprimento(){
        return comprimento;
    }

    //Funçãozinha

    public float calculaEspacoOcupado(){
       return largura*comprimento;
    }

    public String toString() {
        return "Nome = " + nome + "\nEspecie = " + especie + "\nAltura = " + altura + "\nComprimento = " + comprimento + "\nCor = " + cor + "\nEspecie = " + especie + "\nIdade = " + idade + "\nLargura = " + largura;
    }

    
}