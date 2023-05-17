package dados;


public class Aquario extends Viveiro{

    private float altura;
    private float temperatura;


    //1°
    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setTemperatura(float temperatura){
        this.temperatura = temperatura;
    }

    //Funçãozinha

    public float calculaEspaco(){
        return altura*comprimento*largura;
    }

    //2°
    public float getAltura(){
        return altura;
    }
    public float getTemperatura(){
        return temperatura;
    }


}