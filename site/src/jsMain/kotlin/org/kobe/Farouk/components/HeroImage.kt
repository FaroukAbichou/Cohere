package org.kobe.Farouk.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px
import org.kobe.Farouk.util.Res

@Composable
fun HeroImage(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(
            modifier = Modifier
                .size(16.px),
            src = Res.Image.heroImageBrush,
            desc = "Hero Image"
        )
        Image(
            modifier = Modifier
                .size(20.px),
            src = Res.Image.heroImage,
            desc = "Hero Image"
        )
    }
}