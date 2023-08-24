
class tabela {
	private String name;
	private String sobrenome;
	private int id;

	public tabela() {
		name = "";
		sobrenome = "";
		id = 0;
	}
	
	public String getName() {
		
	}
	
	public String setName() {
		
	}
	
	public String getSobrenome() {
		
	}
	
	public String setSobrenome() {
		
	}
	
	public int getId() {
		
	}
	
	public int setId() {
		
	}
	public boolean inserir(tabela cliente) {
		boolean status = false;
		String sql = "INSERT INTO cliente (nome,sobrenome,id)"
				+ "VALUES ('"+ cliente.getName() + "', "
				+ cliente.getSobrenome() + ", "+ cliente.getId();
	}
	
	public boolean delete(int id) {
		boolean status = false;
		
		
	}
	
	class principal {
		public static void main(String[] args) {
			
			String[] iniciar = new String[50];
			int count = 0;
			
			for(int i = 0; i < count; i++)
		}
	}
	
}


