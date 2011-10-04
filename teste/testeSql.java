import static org.junit.Assert.*;

import org.junit.Test;

public class testeSql {

	@Test
	public void insertInto() {
		String tabela = "clientes";
		String[] colunas = { "id", "cod"};
		String[] valores = {"001", "002"};
		String comando = Cria.comandoInsert(tabela, colunas, valores);
		assertEquals("INSERT INTO clientes (id, cod) VALUES(001, 002);",
				comando);
	}
	
	@Test
	public void tabUpdate() {
		String tabela = "clientes";
		String colunas = "id";
		String valores = "30";
		String comando = Cria.comandoUpdate(tabela, colunas, valores);
		assertEquals("UPDATE clientes SET id = 30;",
				comando);
	}
	
	@Test
	public void tabDelete() {
		String tabela = "clientes";
		String comando = Cria.comandoDelete(tabela);
		assertEquals("DELETE FROM clientes;",
				comando);
	}
	
	@Test
	public void tabSelect() {
		String tabela = "clientes";
		String[] colunas = {"id", "cod"};
		String comando = Cria.comandoSelect(tabela, colunas);
		assertEquals("SELECT id, cod FROM clientes;", comando);
	}

}
