package tests

import org.scalatest._
import BackEnd._

class TestWall extends FunSuite{

  test("#mydickfelloff"){
    var l: Vector = new Vector(800.0, 600.0)
    var p: Player = new Player(l)

    var x: Vector = new Vector(0.0, 0.0)
    var y: Player = new Player(x)

    var a: Vector = new Vector(21.0, 21.0)
    var b: Player = new Player(a)

    var borders: Boundary = new Boundary(new Vector(0.0, 0.0), new Vector(800.0, 600.0))

    assert(Game.detectWall(p, l ,borders) == false)
    assert(Game.detectWall(y, x, borders) == false)
    assert(Game.detectWall(b, a, borders))

  }

}
