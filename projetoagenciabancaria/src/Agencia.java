import java.util.ArrayList;

static ArrayList<PessoaFísica> contasF = new ArrayList<>();

static int indice_CLIENTE;
public static void login_ContaFísica(){
indice_CLIENTE = -1;
int login = JOptionPane.showConfirmDialog(null, "Já possui
conta?", "Selecione uma opção:", JOptionPane.YES_NO_OPTION);
if (login == 0){
String clienteNovoVelhoCPF =
JOptionPane.showInputDialog("Qual o CPF? ");
String clienteNovoVelhoSenha =
JOptionPane.showInputDialog("Qual a senha? ");
for (int k = 0; k < contasF.size(); k++){
if
((contasF.get(k).getNome().equals(clienteNovoVelhoNome)) &&
(contasF.get(k).getSenha().equals(clienteNovoVelhoSenha))){
JOptionPane.showMessageDialog(null, "Conta
confirmada!");
indice_CLIENTE = k;
break;
}
}
if (indice_CLIENTE == -1){
JOptionPane.showMessageDialog(null, "Essa conta
não existe!");
JOptionPane.showMessageDialog(null, "Seja bem
vindo " + newcontaF() + " !");
indice_CLIENTE = contasF.size() - 1;
}
} else {
JOptionPane.showMessageDialog(null, "Seja bem vindo "+ newcontaF() + " !");
indice_CLIENTE = contasF.size() - 1;
}
}
public static void login_ContaJurídica(){
indice_CLIENTE = -1;
int login = JOptionPane.showConfirmDialog(null, "Já possui
conta?", "Selecione uma opção:", JOptionPane.YES_NO_OPTION);
if (login == 0){
String clienteNovoVelhoNome =
JOptionPane.showInputDialog("Qual é o seu nome? ");
String clienteNovoVelhoSenha =
JOptionPane.showInputDialog("Qual é a sua senha? ");
for (int k = 0; k < contasJ.size(); k++){
if
((contasJ.get(k).getNome().equals(clienteNovoVelhoNome)) &&
(contasJ.get(k).getSenha().equals(clienteNovoVelhoSenha))){
JOptionPane.showMessageDialog(null, "Olá " +
contasJ.get(k).getNome() + " !");
indice_CLIENTE = k;
break;
}
}
if (indice_CLIENTE == -1){
JOptionPane.showMessageDialog(null, "Essa conta
não existe!");
JOptionPane.showMess


}
