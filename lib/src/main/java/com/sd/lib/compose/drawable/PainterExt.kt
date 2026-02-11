package com.sd.lib.compose.drawable

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext

fun Modifier.fDrawablePainter(
  @DrawableRes id: Int,
  sizeToIntrinsics: Boolean = true,
  alignment: Alignment = Alignment.Center,
  contentScale: ContentScale = ContentScale.FillBounds,
  alpha: Float = DefaultAlpha,
  colorFilter: ColorFilter? = null,
): Modifier = composed {
  paint(
    painter = fRememberDrawablePainter(id),
    sizeToIntrinsics = sizeToIntrinsics,
    alignment = alignment,
    contentScale = contentScale,
    alpha = alpha,
    colorFilter = colorFilter,
  )
}

@Composable
fun fRememberDrawablePainter(
  @DrawableRes id: Int,
): Painter {
  val context = LocalContext.current
  val drawable = remember(context, id) { context.getDrawable(id) }
  return rememberDrawablePainter(drawable = drawable)
}