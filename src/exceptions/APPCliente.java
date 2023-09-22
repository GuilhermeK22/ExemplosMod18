package exceptions;

import javax.swing.*;

public class APPCliente {
    public static void main(String args[]) {
        String opcao = JOptionPane.showInputDialog(null,"Digite o código do cliente", "", JOptionPane.INFORMATION_MESSAGE);

    try {
        ClienteService.consultarCliente(opcao);
    } catch (ClienteNaoEncontrado2Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage(), "Sair", JOptionPane.INFORMATION_MESSAGE);
    }
    }
}
