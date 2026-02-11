package com.sd.demo.compose.drawable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sd.demo.compose.drawable.theme.AppTheme
import com.sd.lib.compose.drawable.rememberDrawablePainter

class SampleActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      AppTheme {
        Content()
      }
    }
  }
}

@Composable
private fun Content(
  modifier: Modifier = Modifier,
) {
  Box(
    modifier = modifier.fillMaxSize(),
    contentAlignment = Alignment.Center,
  ) {
    Image(
      modifier = Modifier.fillMaxSize(),
      painter = rememberDrawablePainter(R.drawable.bg),
      contentDescription = null,
    )
  }
}

@Preview
@Composable
private fun Preview() {
  Content()
}