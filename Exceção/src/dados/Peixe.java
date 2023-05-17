package dados;

public class Peixe extends Animal{

    private float tempIdeal;


    //1°
    public void setTempIdeal(float TempIdeal) {
        this.tempIdeal = TempIdeal;
    }

    //Funçaozinha
    public float calculaEspacoOcupado(){
        return largura * altura * comprimento;
    }

    //2°
    public float getTempIdeal(){
        return tempIdeal;
    }
}