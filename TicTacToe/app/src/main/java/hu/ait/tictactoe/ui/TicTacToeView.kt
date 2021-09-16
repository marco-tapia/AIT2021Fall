package hu.ait.tictactoe.ui

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class TicTacToeView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    lateinit var paintBackGround: Paint
    lateinit var paintLine: Paint

    init {
        paintBackGround = Paint()
        paintBackGround.color = Color.BLACK
        paintBackGround.style = Paint.Style.FILL

        paintLine = Paint()
        paintLine.color = Color.WHITE
        paintLine.style = Paint.Style.STROKE
        paintLine.strokeWidth = 5f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paintBackGround)

        canvas?.drawLine(0f, 0f, width.toFloat(), height.toFloat(), paintLine)
    }

}