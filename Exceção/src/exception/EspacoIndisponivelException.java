package exception;

public class EspacoIndisponivelException extends Exception{

    private static final long serialVersionUID = 1L;

    public EspacoIndisponivelException() {
        super("Espaco de Alocação Indisponivel!!!");
    }
      
}