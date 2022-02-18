import br.com.proway.capgemini.Desafio;
import org.junit.jupiter.api.Test;

public class DesafioTest {

    Desafio desafio = new Desafio();

    @Test
    public void devePrintarNEstrelas(){
        desafio.questaoUm(8);
    }

    @Test
    public void devePrintarSenhaForte(){
        desafio.questaoDois("Teste@Charles");
    }

    @Test
    public void devePrintarSenhaFraca(){
        desafio.questaoDois("Charles2222");
    }

    @Test
    public void devePrintarQuatidadeFaltanteDeCharacteres(){
        desafio.questaoDois("CharlesCharles22");
    }

    @Test
    public void devePrintarQuantidadeDeAnagramas(){
        desafio.questaoTres("SoumTesteDeAnagrama");
    }

}
