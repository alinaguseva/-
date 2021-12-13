class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable, Figure(0),Transforming {
    override fun move(dx: Int, dy: Int) {
        x=+dx; y=+dy
    }

        override fun area(): Float {
            return (width*height).toFloat()
        }

    override fun resize (zoom: Int){
        width = zoom * width
        height = zoom * height
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        when (direction){
            RotateDirection.Clockwise -> y = centerY + (centerX - (x + width))
            RotateDirection.Clockwise -> x = centerX - height/2
            RotateDirection.Counterclockwise -> y = centerY - (centerX - (x + width))
            RotateDirection.Counterclockwise -> x = centerX - width/2
        }
    }
}