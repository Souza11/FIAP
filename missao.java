package br.com.fiap.sprint2;

import javax.swing.JOptionPane;

public class missao {
	public static void main(String[] args) {
		int distancia, bateria=100;
		int x= 0, y=15;
		String comando; 
		
		
		JOptionPane.showMessageDialog(null, "Olá você está no comando do bittoss numa grande missão, você deve chegar na estrela localizada no x19 e no y3, antes da bateria acabar, usando os comandos (cima), (baixo), (esquerda) e (direita) e informar a distância que você deseja percorrer");
		JOptionPane.showMessageDialog(null,"O bittoss é representado pelo coração e está na casa x0 e y15, caso você saia do perímetro da pista programa reiniciará");
		JOptionPane.showMessageDialog(null,"Boa Sorte Piloto");
		
		while ((bateria > 0) ||( x!=19 && y!=3) ) {
			comando = JOptionPane.showInputDialog("Para qual direção você vai piloto?");
			distancia = Integer.parseInt(JOptionPane.showInputDialog("E qual é a distância que tu irá percorrer?"));
			
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
				JOptionPane.showMessageDialog(null,"Você saiu do perímetro da pista.");
				JOptionPane.showMessageDialog(null,"tente novamente");
				return;
			}
			if(x<0 || y<0 ) {
				JOptionPane.showMessageDialog(null,"Vocé saiu do perímetro da pista.");
				JOptionPane.showMessageDialog(null,"tente novamente");
				return;
			}
			
			if (bateria <= 0) {
				JOptionPane.showMessageDialog(null,"a bateria do bittoss acabou.");
				JOptionPane.showMessageDialog(null,"tente novamente");
				return;
			}
			
			
			if (x==19 && y==3) {
				JOptionPane.showMessageDialog(null,"Parabéns, você completou a missâo!");
				JOptionPane.showMessageDialog(null,"Clique no ok para sair.");
				return;
			}
		
		}
	}
}
