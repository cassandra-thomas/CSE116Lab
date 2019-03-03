package BackEnd

object Game {

  var borders: Boundary = new Boundary(new Vector(0.0, 0.0), new Vector(800.0,600.0))


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

  def detectCollision(player1: Player, player2: Player, crystal: Crystals): Unit = {
    //detecting collision between a player and crystals
    if((player1.center.xLoc + player1.radius) == crystal.location.xLoc || (player1.center.yLoc + player1.radius) == crystal.location.yLoc){
      eatCrystals(player1)
    }
    if((player2.center.xLoc + player2.radius) == crystal.location.xLoc || (player2.center.yLoc + player2.radius) == crystal.location.yLoc){
      eatCrystals(player2)
    }
    //detecting collisions between players
    if(Math.abs(player1.center.xLoc - player2.center.xLoc) <= 20.0 || Math.abs(player1.center.yLoc - player2.center.yLoc) <= 20.0){
      if(player1.radius > player2.radius){
        eatPlayer(player1, player2)
      }
      else if(player2.radius > player1.radius){
        eatPlayer(player2, player1)
      }
    }
  }

  def eatCrystals(player: Player): Unit = {
      player.radius += 0.25
  }

  def eatPlayer(p1: Player, p2: Player): Unit = {
    p1.radius += p2.radius / 2.0
  }



}
