import javax.swing.JOptionPane;

public class Transferencia {
    
indice_pagamento = -1;
Object[] transferências = {"Transferência para Cliente
Físico", "Transferência para Cliente Jurídico"};
Object selectedTransfers =
 JOptionPane.showInputDialog(null, "Que tipo de transferência deseja
realizar?", "transferência", JOptionPane.INFORMATION_MESSAGE, null,
 transferências, transferências[0]);
if (selectedTransfers == transferências[0]){
String clientePagoNome =
JOptionPane.showInputDialog("Qual o nome do destinatário? ");
 String clientePagoCPF =
 JOptionPane.showInputDialog("Qual o CPF do destinatário? ");
for (int m = 0; m < contasF.size(); m++){
if
((contasF.get(m).getNome().equals(clientePagoNome)) &&
(contasF.get(m).getCPF().equals(clientePagoCPF))){
JOptionPane.showMessageDialog(null, "Conta
encontrada!");
indice_pagamento = m;
TransferênciaCF_CF(contasF.get(indice_CLIENTE),
contasF.get(indice_pagamento));
break;
}
}



 if (indice_pagamento == -1){
JOptionPane.showMessageDialog(null, "Essa conta
não existe!");
}
} else {
String clientePagoNome =
JOptionPane.showInputDialog("Qual o nome do destinatário? ");
String clientePagoCNPJ =
JOptionPane.showInputDialog("Qual o CNPJ do destinatário? ");
for (int m = 0; m < 10; m++){
if
((contasJ.get(m).getNome().equals(clientePagoNome)) &&
(contasJ.get(m).getCNPJ().equals(clientePagoCNPJ))){
JOptionPane.showMessageDialog(null, "Conta
encontrada!");
indice_pagamento = m;
TransferênciaCF_CJ(contasF.get(indice_CLIENTE),
contasJ.get(indice_pagamento));
break;
}
}

if (indice_pagamento == -1){
JOptionPane.showMessageDialog(null, "Essa conta
não existe!");
}
}
}

