package batalhanaval;

/**
* Arcabouço básico do jogo de Batalha Naval.
*
* @author (seu nome aqui)
* @version 0.1
*/
import java.awt.*;
import javax.swing.*;

public class BattleshipApp extends JFrame
{
private Board redBoard; // tabuleiro vermelho
private Board blueBoard; // tabuleiro vermelho
private FriendlyPlayer friendlyPlayer; // jogador aliado
private EnemyPlayer enemyPlayer; // jogador inimigo
// Dados adicionais do jogo entram aqui.
// Métodos da classe BattleshipApp entram aqui.
public static void main(String[] args) {
}
/**
* Construtor de objetos da classe BattleshipApp
* */
public BattleshipApp()
{
    this.setSize(600, 500);
    this.setVisible(true);
}
}
