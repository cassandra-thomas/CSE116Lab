package BackEnd

object Game {

  var borders: Boundary = new Boundary(new Vector(0.0, 0.0), new Vector(800.0, 600.0))

  def detectWall(player: Player, loc: Vector, edge: Boundary):  Boolean = {
    var ans: Boolean = true

    if(loc.x -  + player.radius <= edge.start.x || loc.x + player.radius >= edge.end.x){
      ans =  false
    }
    else if(loc.y - player.radius <= edge.start.y || loc.y + player.radius >= edge.end.y){
      ans = false
    }

    ans
  }

  def updateLocation(player: Player, time: Double): Unit = {
    val temp: Vector = new Vector(0.0, 0.0)
    temp.x = player.center.x + (player.velocity.x * time)
    temp.y = player.center.y + (player.velocity.y * time)

    if(detectWall(player, temp, borders)){
      player.center.x = temp.x
      player.center.y = temp.y
    }
  }

  def detectCollision(player1: Player, player2: Player, crystal: Crystals): Unit = {
    //detecting collision between a player and crystals
    if((player1.center.x + player1.radius) == crystal.location.x || (player1.center.y + player1.radius) == crystal.location.y){
      eatCrystals(player1)
    }
    if((player2.center.x + player2.radius) == crystal.location.x || (player2.center.y + player2.radius) == crystal.location.y){
      eatCrystals(player2)
    }
    //detecting collisions between players
    if(Math.abs(player1.center.x - player2.center.x) <= 20.0 || Math.abs(player1.center.y - player2.center.y) <= 20.0){
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
