package org.kobe.Farouk.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.CSSAnimation
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.attributes.AttrsScope
import org.kobe.Farouk.components.layouts.PageLayout
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.Attr

@Composable
fun test(){
    PageLayout("Welcome to Kobweb!") {
        Text("Please enter your name")
        var name by remember { mutableStateOf("") }
        Input(
            InputType.Text,
            attrs = {
                onInput { e -> name = e.value }
            }
        )
        P()
        Image(
            src = "favicon.ico",
            desc = ""
        )

    }
}


@Page
@Composable
fun HomePage() {
    Box (
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            src = "Background.jpeg",
            desc = "",
            modifier = Modifier
                .fillMaxSize()
        )

        Row (
            modifier = Modifier
                .padding(
                    4.cm
                )
                .fillMaxSize()

        ){
            H1(

            ) {
                Text("Welcome to Kobweb!")
                SpanText(
                    text = "Create rich, dynamic web apps with ease ",
                    modifier = Modifier
                        .animation(
                            CSSAnimation(
                                name = "slide",
                                750.ms ,
                                timingFunction = AnimationTimingFunction("ease-in-out") ,
                                delay = 250.ms,
                                iterationCount = AnimationIterationCount.Infinite,
                                direction = AnimationDirection.Reverse,
                                fillMode = AnimationFillMode("forwards"),
                                playState = AnimationPlayState("running")
                            )
                        )
                        .color(Colors.Blue)
                )
            }
            Spacer()
            P {
                Text("Hello World!")

                Text("Hello World!")
            }
            Text("Hello World!")
        }
    }

}