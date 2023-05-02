package org.kobe.Farouk.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
import org.kobe.Farouk.components.layouts.PageLayout
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.kobe.Farouk.components.HeroImage

@Page
@Composable
fun AboutPage() {
    PageLayout("AAAAAAAA") {
        HeroImage()
    }
}