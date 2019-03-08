package tests

import org.scalatest._
import BackEnd._

class TestLocation extends FunSuite{

  test("location change"){
    var l1: Vector = new Vector(150.0, 180.0)
    var pin: Player = new Player(l1)

    var l2: Vector = new Vector(800.0, 600.0)
    var pin2: Player = new Player(l2)

    var time: Double = 3.0

    Game.updateLocation(pin, time)
    Game.updateLocation(pin2, time)


    assert(pin.center.x == 180.0)
    assert(pin.center.y == 210.0)

    assert(pin2.center.x == 800.0)
    assert(pin2.center.y == 600.0)

  }
}
