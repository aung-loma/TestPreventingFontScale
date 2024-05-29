package co.just.simple.testfontscale

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import co.just.simple.testfontscale.ui.theme.TestFontScaleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestFontScaleTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    Greeting()
                }
            }
        }
    }
}


@FontScalePreviews
@Composable
fun Greeting() {
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = MaterialTheme.typography.bodyMedium.fontSize.nonScaledSp,
                color = Color.Cyan,
                lineHeight = MaterialTheme.typography.bodyMedium.lineHeight.nonScaledSp,
                textAlign = TextAlign.Justify
            ),
            text = "This is resizing text with font scale ${LocalDensity.current.fontScale} \npreventing font scale",
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "This is resizing text with font scale ${LocalDensity.current.fontScale} \nnot preventing font scale",
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
        )
    }
}