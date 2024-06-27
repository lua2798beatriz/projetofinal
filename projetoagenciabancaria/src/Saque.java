import java.util.ArrayList;

public class Saque {

static ArrayList<PessoaFísica> contasF = new ArrayList<>();
static double valor_saque;
public static double Saque(double valor_saldo){
valor_saque =
Double.parseDouble(JOptionPane.showInputDialog("Qual será o valor do
saque?"));
if (valor_saldo > valor_saque){
valor_saldo -= valor_saque;
JOptionPane.showMessageDialog(null, "Saque realizado.");
return valor_saldo;
} 
else {
JOptionPane.showMessageDialog(null, "O saque não pode ser
realizado. Saldo insuficiente.");
int Saque_inesperado =
JOptionPane.showConfirmDialog(null, "Deseja trocar o valor do
saque?", "Selecione uma opção:", JOptionPane.YES_NO_OPTION);
if (Saque_inesperado == -1){
valor_saldo = Saque(valor_saldo);
return valor_saldo;
} 
else {
return valor_saldo;
}
if(quantidade_de_saque<=4x){
return taxa R$0,00;    
}
else{taxa R$6,50
}


}
}
}

