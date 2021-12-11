package com.rawlincrasto.compose_canvasshapes

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.nativeCanvas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawContext.canvas.nativeCanvas.apply {
                    drawText(
                        "This is my canvas text",
                        100f,
                        100f,
                        Paint().apply {
                            color = Color.RED
                            textSize = 100f
                        }
                    )
                }
            }
        }
    }
}
