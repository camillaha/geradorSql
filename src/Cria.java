public class Cria {

	public static String comandoInsert(String tabela, String[] colunas,
			String[] valores) {
		String tab = tabela;
		String[] col = colunas;
		String[] valor = valores;
		return "INSERT INTO " + tab + " (" + col[0] + ", " + col[1]
				+ ") VALUES(" + valor[0] + ", " + valor[1] + ");";
	}

	public static String comandoUpdate(String tabela, String colunas,
			String valores) {
		String tab = tabela;
		String col = colunas;
		String valor = valores;
		return "UPDATE " + tab + " SET " + col + " = " + valor + ";";
	}

	public static String comandoDelete(String tabela) {
		String tab = tabela;
		return "DELETE FROM " + tab + ";";
	}

	public static String comandoSelect(String tabela, String[] colunas) {
		String tab = tabela;
		String[] col = colunas;
		return "SELECT " + col[0] + ", " + col[1] + " FROM " + tab + ";";
	}

}
