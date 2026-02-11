package com.sd.lib.compose.drawable

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext

@Composable
fun rememberDrawablePainter(@DrawableRes id: Int): Painter {
  val context = LocalContext.current
  val drawable = remember(context, id) { runCatching { context.getDrawable(id) }.getOrNull() }
  return drawablePainter(drawable)
}

@Composable
fun rememberDrawablePainter(drawable: Drawable?): Painter {
  return drawablePainter(drawable)
}