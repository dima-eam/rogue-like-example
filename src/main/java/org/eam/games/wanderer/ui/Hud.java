package org.eam.games.wanderer.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import org.eam.games.wanderer.actor.Monster;
import org.eam.games.wanderer.actor.Player;
import org.eam.games.wanderer.drawable.Drawable;
import org.eam.games.wanderer.drawable.GraphicsContext;
import org.eam.games.wanderer.engine.GameController;

/**
 * Represents heads-up display with game statistics etc.
 */
public class Hud implements Drawable {

    private static final int STAT_WIDTH = 330;
    private static final int STAT_HEIGHT = 20;
    private static final int STAT_SIZE = 15;
    private static final int STAT_POSX = 500 - STAT_WIDTH;
    private static final int STAT_HERO_POSY = 15;
    private static final int STAT_MONSTER_POSY = STAT_HERO_POSY + STAT_HEIGHT;
    private static final int STAT_BOX_POSX = STAT_POSX - 5;
    private static final int STAT_BOX_POSY = 0;
    private static final int STAT_BOX_WIDTH = STAT_WIDTH + 5;
    private static final int STAT_BOX_HEIGHT = STAT_HEIGHT;
    private static final int GAMEOVER_BOX_POSX = 300;
    private static final int GAMEOVER_BOX_POSY = 270;
    private static final int GAMEOVER_BOX_WIDTH = 460;
    private static final int GAMEOVER_BOX_HEIGHT = 70;
    private static final int GAMEOVER_SIZE = 50;
    private static final int GAMEOVER_POSX = GAMEOVER_BOX_POSX + 5;
    private static final int GAMEOVER_POSY = GAMEOVER_BOX_POSY + GAMEOVER_SIZE;

    private GameController gameController;

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    @Override
    public void draw(GraphicsContext context) {
        context.process(g -> {
            g.setColor(Color.white);
            g.setFont(new Font("Courier", Font.PLAIN, STAT_SIZE));

            String statusTextHero = "";
            String statusTextMonster = "";

            g.fillRect(STAT_BOX_POSX, STAT_BOX_POSY, STAT_BOX_WIDTH, STAT_BOX_HEIGHT);
            g.setColor(Color.black);

            if (gameController.getHero().dead()) {
                gameOver(g);
            } else {
                Player player = gameController.getHero();
//            statusTextHero ="";
//                "Hero(" + player.getLevel() + ")" +
//                    "HP:" + player.healthPoint + "/" + player.maxHealthPoint +
//                    "|SP:" + player.strikePoint +
//                    "|DP:" + player.defendPoint +
//                    "|POS:" + player.x + ", " + player.y;

                for (Monster monster : gameController.getMonsterList()) {
//                if (player.x == monster.x && player.y == monster.y) {
//                    statusTextMonster = "Monster(Level_" + monster.getLevel() + ")HP:"
//                        + monster.healthPoint + "/" + monster.maxHealthPoint
//                        + "|SP:" + monster.strikePoint
//                        + "|DP:" + monster.defendPoint;
//                }
                }
            }

            g.drawString(statusTextHero, STAT_POSX, STAT_HERO_POSY);

            if (statusTextMonster.length() > 0) {
                g.setColor(Color.white);
                g.fillRect(STAT_BOX_POSX, STAT_BOX_POSY + STAT_BOX_HEIGHT,
                    STAT_BOX_WIDTH, STAT_BOX_HEIGHT);
            }

            g.setColor(Color.black);
            g.drawString(statusTextMonster, STAT_POSX, STAT_MONSTER_POSY);
        });
    }

    private void gameOver(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(GAMEOVER_BOX_POSX, GAMEOVER_BOX_POSY, GAMEOVER_BOX_WIDTH, GAMEOVER_BOX_HEIGHT);

        g.setColor(Color.RED);
        g.setFont(new Font("Courier", Font.PLAIN, GAMEOVER_SIZE));
        g.drawString("You are Dead!!!", GAMEOVER_POSX, GAMEOVER_POSY);

    }

}