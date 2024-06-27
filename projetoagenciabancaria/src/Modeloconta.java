import java.util.*;
    public abstract class Modeloconta {
    private String senha;
    private String nome;
    private String cpf;
    private String email;
    private String endereço;
    private double saldo = 0;
    private ArrayList<Transações> listaT = new ArrayList<>();

    public String getSenha() {
    return senha;
    }
    public void setSenha(String senha) {
    this.senha = senha;
    }
    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
    this.nome = nome;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String Cpf) {
        this.cpf = cpf;}

    public String getEndereço() {
        return Endereço;    
    }
    public void setEndereço(String Endereço) {
        this.Endereço = Endereço; 
    }
    public String getEmail() {
        return Email; }
        public void setEmail(String Email) {
            this.Email = Email; }
    public double getSaldo() {
        return saldo;
        }
        public void setSaldo(double saldo) {
        this.saldo = saldo;
        }
        public ArrayList<Transações> getListaT() {
        return listaT;
        }
        public void setListaT(Transações transação) 
        this.listaT.add(transação);
        
}
public Modelo_Conta(String senha, String nome, String Cpf, String Email, String Endereço) {
this.senha = senha;
this.nome = nome;
this.Cpf = Cpf;
this.Email = Email;
this.Endereço = Endereço;
}
}

