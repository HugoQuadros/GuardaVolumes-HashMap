import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GuardaVolumes guardaVolume = new GuardaVolumes();
        Peca peca1 = new Peca();
        peca1.setMarca("marca1");
        peca1.setModelo("modelo1");
        Peca peca2 = new Peca();
        peca2.setMarca("marca2");
        peca2.setModelo("modelo2");

        Peca peca3 = new Peca();
        peca3.setMarca("marca3");
        peca3.setModelo("modelo3");
        Peca peca4 = new Peca();
        peca4.setMarca("marca4");
        peca4.setModelo("modelo4");

        List<Peca> lista = new ArrayList<>();
        lista.add(peca1);
        lista.add(peca2);

        List<Peca> lista2 = new ArrayList<>();
        lista2.add(peca3);
        lista2.add(peca4);

        Integer codigo = guardaVolume.guardarPecas(lista);
        Integer codigo2 = guardaVolume.guardarPecas(lista2);

        guardaVolume.mostrarPecas();

        guardaVolume.mostrarPecasEspecificas(codigo2);

        guardaVolume.devolverPecas(codigo);

    }

}
