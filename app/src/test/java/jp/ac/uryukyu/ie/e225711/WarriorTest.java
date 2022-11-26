package jp.ac.uryukyu.ie.e225711;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
  @Test
  void attackTest() {
  int defaultWarriorAttack = 100;
  int defaultEnemyHP = 200;
  for (int i=0; i<5; i++) {
  Warrior demoWarrior = new Warrior("テスト戦士", 100, defaultWarriorAttack);
  Enemy demoEnemy = new Enemy("テストスライム", 200, 10);
  demoWarrior.attackWithWeponSkill(demoEnemy);
  int damage = defaultEnemyHP - demoEnemy.getHitPoint();
  assertEquals(defaultWarriorAttack * 1.5, damage); //エネミーのHPの初期状態との差分が戦士が与えたダメージ
  }
  }
  }
