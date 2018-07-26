
package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RPRelatorio {
    
    private String relatorio;
    public void gerarRelatorioTotal (String caminhoRelatorio)
    {
        this.relatorio = caminhoRelatorio;
        InputStream dadosEntrada;
        try {
            dadosEntrada = new FileInputStream(new File(caminhoRelatorio));
            Map parametros = new HashMap();
            FabricaRelatorio.abreRelatorio("Relatório Geral", dadosEntrada, 
                parametros, FabricaConexao.conexao());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RPRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
