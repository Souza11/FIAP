package br.com.fiap.sprint2;

import javax.swing.JOptionPane;

public class missao {
	public static void main(String[] args) {
		int distancia, bateria=100;
		int x= 0, y=15;
		String comando; 
		
		
		JOptionPane.showMessageDialog(null, "Ol� voc� est� no comando do bittoss numa grande miss�o, voc� deve chegar na estrela localizada no x19 e no y3, antes da bateria acabar, usando os comandos (cima), (baixo), (esquerda) e (direita) e informar a dist�ncia que voc� deseja percorrer");
		JOptionPane.showMessageDialog(null,"O bittoss � representado pelo cora��o e est� na casa x0 e y15, caso voc� saia do per�metro da pista programa reiniciar�");
		JOptionPane.showMessageDialog(null,"Boa Sorte Piloto");
		
		while ((bateria > 0) ||( x!=19 && y!=3) ) {
			comando = JOptionPane.showInputDialog("Para qual dire��o voc� vai piloto?");
			distancia = Integer.parseInt(JOptionPane.showInputDialog("E qual � a dist�ncia que tu ir� percorrer?"));
			
			if (comando.equals("cima")) {
				y += distancia;
				bateria -= distancia;
				}
			if (comando.equals("baixo")) {
				y -= distancia;
				bateria -= distancia;
				}
			if (comando.equals("esquerda")) {
				x -= distancia;
				bateria -= distancia;
				}
			if (comando.equals("direita")) {
				x += distancia;
				bateria -= distancia;
				}
			
			if(x>19 || y>15 ) {
				JOptionPane.showMessageDialog(null,"Voc� saiu do per�metro da pista.");
				JOptionPane.showMessageDialog(null,"tente novamente");
				return;
			}
			if(x<0 || y<0 ) {
				JOptionPane.showMessageDialog(null,"Voc� saiu do per�metro da pista.");
				JOptionPane.showMessageDialog(null,"tente novamente");
				return;
			}
			
			if (bateria <= 0) {
				JOptionPane.showMessageDialog(null,"a bateria do bittoss acabou.");
				JOptionPane.showMessageDialog(null,"tente novamente");
				return;
			}
			
			
			if (x==19 && y==3) {
				JOptionPane.showMessageDialog(null,"Parab�ns, voc� completou a miss�o!");
				JOptionPane.showMessageDialog(null,"Clique no ok para sair.");
				return;
			}
		
		}
	}
}
