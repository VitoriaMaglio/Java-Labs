package br.fiap.com.dao;

import br.fiap.com.models.Filme;

import java.sql.*;
import java.time.LocalTime;

public class FilmeDao {
    private Connection conexao;

    public void cadastrarFilme(Filme filme) {
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        try {
            String sql = "INSERT INTO TBL_NAME(ID_FILME, tx_nome, nr_duracao, tp_genero" +
                    "tp_classificacao, nr_ano,  tx_capa,  tx_diretor, tx_elenco, tx_descricao, nr_avaliacao" +
                    "\n" + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setLong(1, filme.getId());
            comandoSQL.setDouble(2, filme.getAvaliacao());
            //quando vc tem um atributo LocalTime não pode declarar um LocalTime,
            // porque setTime espera um objeto do tipo java.sql.Time
            //é necessário converter LocalTime para java.sql.Time
            LocalTime duracao = filme.getDuracao();
            Time timeSQL = Time.valueOf(duracao);
            comandoSQL.setTime(3, timeSQL);
            //primeiro vc declara um java.sql.Time e passa obj.getAtributo do tipo LocalTime
            //depois declarar um obj to tipo Time que irá converter por meio de valueOf(objLocaltime);
            //para ler ele com bd ao invés de chamar obj.métodoget vc passa o obj convertido do tipo Time.
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public Filme buscarFilmeId(int id) {
        Filme filme = new Filme();
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps = null;
        try {
            ps = conexao.prepareStatement("SELECT * from TBL_NAME " +
                    "WHERE ID_CONTATO = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filme;
    }

}
