fun main() {
    val figures: Array<Transforming>
    val movable: Movable = Rect(0,0,1,1)
    movable.move(1,1)


    val transforming1: Transforming = Rect(0, 0, 1, 1)
    transforming1.move(1,3)
    transforming1.resize(2)
    transforming1.rotate(RotateDirection.Clockwise, 10, 4 )

    val f1: Figure = Rect(0,0,1,1)
    val f2: Figure = Circle(1, 1, 1)
    val f3: Figure = Square(1, 1, 1)

    val transforming: Transforming = Rect(4,4,4,4)
    println(transforming.rotate(direction = RotateDirection.Clockwise, centerX = 7, centerY = 7))
    println(transforming.resize(3))

    println(f1.area())
    println(f2.area())
    println(f3.area())
}