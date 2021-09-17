import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

    private Map<Integer, List<Peca>> pecasGuardadas = new HashMap<>();
    private Integer cont = 1;

    public Integer guardarPecas(List<Peca> listaDePeca){
        pecasGuardadas.put(cont, listaDePeca);
        Integer contAnterior = cont;
        cont++;
        return (contAnterior);
    }

    public void mostrarPecas(){
        for(Integer chave : pecasGuardadas.keySet()){
            System.out.println(chave + ": ");
            List<Peca> pecas = pecasGuardadas.get(chave);
            for(Peca pecaIndividual: pecas){
                System.out.print("Marca: " + pecaIndividual.getMarca() + "; ");
                System.out.println("Modelo: " + pecaIndividual.getModelo());
            }
            System.out.println("");
        }
    }

    public void mostrarPecasEspecificas(Integer numero){
        System.out.println(numero + ": " + pecasGuardadas.get(numero));
    }

    public void devolverPecas(Integer numero){
        pecasGuardadas.remove(numero);
    }

}
