package CuidaPCD;

public class Usuario {
   private String nome;
   private String email;
   private String senha;
   private String telefone;
   private TipoUsuario tipoUsuario;
   
   public Usuario(String nome, String email,String senha, String telefone, String tipoUsuario) {
       this.nome=nome;
       this.email=email;
       this.senha=senha;
       this.telefone=telefone;
       this.tipoUsuario = TipoUsuario.valueOf(tipoUsuario.toUpperCase());
   
   
   }
   
   public enum TipoUsuario {
       CLIENTE,
       PROFISSIONAL
   }
     
	   
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	public void registrar(String nome, String email,String senha, String telefone, String tipoUsuario) {
	     if (Autenticador.validarEmail(email)) {
			System.out.println("Email já está em uso!");
			return;
		}
	     
	     
	     if(Autenticador.validarSenha(senha)) {
	    	 System.out.println("Senha não atende aos critérios de segurança!");
	            return;
	    	 
	     }
	     
	     
	     TipoUsuario tipo = TipoUsuario.valueOf(tipoUsuario.toUpperCase());
	     if(tipo == null) {
	    	 System.out.println("Tipo de usuário inválido!");
	            return;
	     }
	     
	     Usuario novoUsuario = new Usuario(nome,  email, senha,  telefone,  tipoUsuario);
	     
	

		 System.out.println("Usuario logado no sitema!");
	   
	}
	   
	
   
   
}
