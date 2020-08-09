import scala.math.sqrt

object MyApp extends App {
  val p1 = new Point(3, 2)
  val p2 = new Point(9, 10)
  val p3= p1 + p2
  val p4 = p1.move(1, 1)


  println(p1)
  println(p2)
  println(" ")

  //Question 1   
  println("Adding two points : " + p1 + " + " + p2 + " = " + p3)
  println(" ")

  //Question 2   
  println("Moving point :" + p1 + " to (1,1)" + " = " + p4)
  println(" ")

  //Question 3 d
  println("Distance between " + p1 + " , " + p2 + "= " + p1.distance(p2))
  println(" ")

  //Question 4 invert a point
  println("Invert " + p1 + " = " + p1.invert)
  println(" ")

}

case class Point(a: Int, b: Int) {
  def x: Int = a; 
  def y: Int = b;

  // Que1
  def +(p: Point) = Point(this.x + p.x, this.y + p.y)

  //Que2
  def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

  //Que3
  def distance(p: Point) =
    sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y))

  //Que4
  def invert = Point(this.y, this.x)

}