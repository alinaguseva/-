class Square (var x: Int, var y: Int, var width: Int) : Transforming, Figure(1){
    override fun move (dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize (zoom: Int){
        width = zoom * width
    }

    override fun area(): Float {
        return (width*width).toFloat()
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        when (direction){
            RotateDirection.Clockwise -> y = centerY + (centerX - (x + width))
            RotateDirection.Clockwise -> x = centerX - width/2
            RotateDirection.Counterclockwise -> y = centerY - (centerX - (x + width))
            RotateDirection.Counterclockwise -> x = centerX - width/2
        }
    }
}