package FrontEnd
import javafx.scene.input.{KeyCode, KeyEvent, MouseEvent}
import scalafx.animation.AnimationTimer
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Rectangle, Shape}
import scalafx.scene.{Group, Scene}
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.effect.DropShadow
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint.{Stops, LinearGradient}
import scalafx.scene.text.Text

object GUI extends JFXApp {
  val windowWidth: Double = 800
  val windowHeight: Double = 600

  var playerRadius: Double = 20
  val playerSpeed: Double = 10

  val crystalRadius: Double = 5

  val sceneGraphics: Group = new Group {}

  val crystal: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal)


  val player: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = playerRadius
    fill = Color.Green
  }
  sceneGraphics.children.add(player)


  stage = new PrimaryStage {
    title = "Circles Collide"
    scene = new Scene(windowWidth, windowHeight) {
      fill = Black
      content = new HBox {
        padding = Insets(20)
        children = Seq(
          new Text {
            text = "Circles Collide"
            style = "-fx-font-size: 48pt"
            fill = new LinearGradient(
              endX = 0,
              stops = Stops(Cyan, DodgerBlue)
            )
            }
        )
      }
    }
  }
}


