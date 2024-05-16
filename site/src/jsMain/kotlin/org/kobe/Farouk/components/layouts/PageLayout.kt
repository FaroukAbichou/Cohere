package org.faroukabichou.Cohere.components.layouts

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import kotlinx.browser.document
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.faroukabichou.Cohere.sections.Footer
import org.faroukabichou.Cohere.sections.NavHeader

@Composable
fun PageLayout(title: String, content: @Composable () -> Unit) {
    LaunchedEffect(title) {
        document.title = title
    }

    Box(Modifier
        .fillMaxWidth()
        .minHeight(100.percent)
        .gridTemplateRows("minmax(0, 1fr) min-content")
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize().
                textAlign(TextAlign.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavHeader()
            H1 { Text(title) }
            content()
        }
        Footer(Modifier.align(Alignment.Center).gridRowStart(2).gridRowEnd(3))
    }
}