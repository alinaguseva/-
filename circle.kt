class Circle (var x: Int, var y: Int, var r: Int) : Figure(0), Movable, Transforming {
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        r = zoom * r
    }
    override fun area(): Float {
        return (3.14 * r * r).toFloat()
    }



    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        when (direction) {
            RotateDirection.Clockwise -> y = centerY + (centerX - (x + r))
            RotateDirection.Clockwise -> x = centerX
            RotateDirection.Counterclockwise -> y = centerY - (centerX - (x + r))
            RotateDirection.Counterclockwise -> x = centerX
        }
    }
}