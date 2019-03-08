package tests

import org.scalatest._
import BackEnd._

class TestCrystals extends FunSuite {

  test("i hate life"){
    val player: Player = new Player(new Vector(100.0, 325.0))
    val crystal: Crystals = new Crystals(new Vector(110.0, 315.0))
    val player2: Player = new Player(new Vector(200.0, 500.0))

    Game.detectCrystalCollision(player, crystal)
    Game.detectCrystalCollision(player2, crystal)

    assert(player.radius == 20.25)
    assert(player2.radius == 20.0)

  }

}
