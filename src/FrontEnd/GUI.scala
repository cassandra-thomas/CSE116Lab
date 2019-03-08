package FrontEnd

import BackEnd._
import javafx.event.ActionEvent
import javafx.scene.input.{KeyCode, KeyEvent, MouseEvent}
import scalafx.animation.AnimationTimer
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Rectangle, Shape}
import scalafx.scene._
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.shape.Rectangle
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.{BoundingBox, Insets, Pos}
import scalafx.scene.effect.DropShadow
import scalafx.scene.layout.{GridPane, HBox, VBox, Pane}
import scalafx.scene.paint.Color._
import scalafx.scene.paint.{LinearGradient, Stops}
import scalafx.scene.text.Text
import scalafx.stage.{Popup, PopupWindow, Stage}
import scalafx.scene.control._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.image.Image
import scalafx.scene.paint.{Color, PhongMaterial}
import scalafx.scene.shape.{TriangleMesh, Circle, MeshView}
import scalafx.scene.{Group, PerspectiveCamera, Scene, SceneAntialiasing}

import scala.language.postfixOps
import scala.math.random
import scalafx.Includes._
import scalafx.animation.Animation.Indefinite
import scalafx.animation.Timeline
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.effect.BoxBlur
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Circle


object GUI extends JFXApp {
  val windowWidth: Double = 800
  val windowHeight: Double = 600

  var playerRadius: Double = 30
  val playerSpeed: Double = 10

  val crystalRadius: Double = 5

  val sceneGraphics: Group = new Group {}
  //var allPlayers: Array[Circle] = new Array[Circle](20)

  val crystal: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal)
  val crystal1: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal1)
  val crystal2: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal2)
  val crystal3: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal3)
  val crystal4: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal4)
  val crystal69: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal69)
  val crystal5: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal5)
  val crystal6: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal6)
  val crystal7: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal7)
  val crystal8: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal8)
  val crystal9: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal9)
  val crystal10: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal10)
  val crystal11: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal11)
  val crystal12: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal12)
  val crystal13: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal13)
  val crystal14: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal14)
  val crystal15: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal15)
  val crystal16: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal16)
  val crystal17: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal17)
  val crystal18: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal18)
  val crystal19: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal19)
  val crystal20: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal20)
  val crystal21: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = crystalRadius
    fill = Color.Gold
  }
  sceneGraphics.children.add(crystal21)


  val Player: Circle = new Circle {
    centerX = Math.random() * windowWidth
    centerY = Math.random() * windowHeight
    radius = playerRadius
    fill = Color.Blue
  }
  sceneGraphics.children.add(Player)
  //allPlayers :+ Player

  val leaderboard: Rectangle = new Rectangle {
    width = 125
    height = 150
    translateX = 0
    translateY = 0
    fill = Color.rgb(0, 100, 100, 0.5)
  }
  sceneGraphics.children.add(leaderboard)


  def keyPressed(keyCode: KeyCode): Unit = {
    keyCode.getName match {
      case "W" => Player.translateY.value -= playerSpeed
      case "A" => Player.translateX.value -= playerSpeed
      case "S" => Player.translateY.value += playerSpeed
      case "D" => Player.translateX.value += playerSpeed
      case _ => println(keyCode.getName + " pressed with no action")
    }
  }


  val button = new Button {
    text = "Play"
    layoutX = 20
    layoutY = 50
  }
  val button2 = new Button {
    text = "Exit"
    layoutX = 750
    layoutY = 560
  }
  sceneGraphics.children.add(button2)


  new PrimaryStage {
    this.title = "Knockoff.io"
    scene = new Scene(windowWidth, windowHeight) {
      content = List(sceneGraphics)
      fill = Color.Black

      addEventHandler(KeyEvent.KEY_PRESSED, (event: KeyEvent) => keyPressed(event.getCode))
      //addEventHandler(MouseEvent.MOUSE_MOVED, (event: MouseEvent) => onMouseMoved)
    }
  }

  new PrimaryStage {
    scene = new Scene(windowWidth, windowHeight) {
      fill = Color.Black
      var boxV = new VBox(30) {
        alignment = Pos.Center
        padding = Insets(35)
        children = Seq(
          new Text {
            text = "Knockoff.io"
            style = "-fx-font-size: 90pt"
            fill = new LinearGradient(
              endX = 0,
              stops = Stops(Blue, DarkBlue))
          },
          new TextField {
            layoutX = 20
            layoutY = 50
            promptText = "Username"
            prefWidth = 50
          },
          button,
          new Text {
            text = "How to Play: Use WASD to move and eat other circles that are smaller than you"
            style = "-fx-font-size: 15pt"
            fill = new LinearGradient(
              endX = 0,
              stops = Stops(Blue, DarkBlue))
          }
        )
      }
      content = boxV
    }
  }

  button.onAction = (e:ActionEvent) => new PrimaryStage {
    this.title = "Knockoff.io"
    scene = new Scene(windowWidth, windowHeight) {
      content = List(sceneGraphics)
      fill = Color.Black

      addEventHandler(KeyEvent.KEY_PRESSED, (event: KeyEvent) => keyPressed(event.getCode))
      //addEventHandler(MouseEvent.MOUSE_MOVED, (event: MouseEvent) => onMouseMoved)
    }
  }

  button2.onAction = (e:ActionEvent) => new PrimaryStage {
    scene = new Scene(windowWidth, windowHeight) {
      fill = Color.Black
      var titleCircle = for(i <- 0 until 20) yield new Circle {
        centerX = Math.random * windowWidth
        centerY = Math.random * windowHeight
        radius = 50
        fill = color(random, random, random, .5)
      }
      var boxV = new VBox(30) {
        alignment = Pos.Center
        padding = Insets(35)
        children = Seq(
          new Text {
            text = "Knockoff.io"
            style = "-fx-font-size: 90pt"
            fill = new LinearGradient(
              endX = 0,
              stops = Stops(Blue, DarkBlue))
          },
          new TextField {
            layoutX = 20
            layoutY = 50
            promptText = "Username"
            prefWidth = 50
          },
          button,
          new Text {
            text = "How to Play: Use WASD to move and eat other circles that are smaller than you"
            style = "-fx-font-size: 15pt"
            fill = new LinearGradient(
              endX = 0,
              stops = Stops(Blue, DarkBlue))
          }
        )
      }
      content = boxV
    }
  }
}

