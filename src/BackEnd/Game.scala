package BackEnd

object Game {

  var borders: Boundary = new Boundary(new Vector(0.0, 0.0), new Vector(5000.0,5000.0))


  def detectWall(player: Player, loc: Vector, edge: Boundary):  Boolean = {
    var ans: Boolean = true

    if(loc.xLoc -  + player.radius <= edge.start.xLoc || loc.xLoc + player.radius >= edge.end.xLoc){
      ans =  false
    }
    else if(loc.yLoc - player.radius <= edge.start.yLoc || loc.yLoc + player.radius >= edge.end.yLoc){
      ans = false
    }

    ans
  }

  def updateLocation(player2: Player, time: Double): Unit = {
    val temp: Vector = new Vector(0.0, 0.0)
    temp.xLoc = player2.center.xLoc + (player2.velocity.xLoc * time)
    temp.yLoc = player2.center.yLoc + (player2.velocity.yLoc * time)

    if(detectWall(player2, temp, borders)){
      player2.center.xLoc = temp.xLoc
      player2.center.yLoc = temp.yLoc
    }
  }

  def eatCrystals(player: Player): Unit = {
      player.radius += 0.25
  }

  def eatPlayer(p1: Player, p2: Player): Unit = {
    p1.radius += p2.radius / 2.0
  }



}
