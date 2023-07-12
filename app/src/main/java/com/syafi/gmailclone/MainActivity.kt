package com.syafi.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.syafi.gmailclone.presentation.BottomNav.BottomNav
import com.syafi.gmailclone.presentation.DrawerMenu
import com.syafi.gmailclone.presentation.TopBar
import com.syafi.gmailclone.ui.theme.GmailCloneTheme
import com.syafi.gmailclone.presentation.FloatingActionButton.FloatingActionButton
import com.syafi.gmailclone.presentation.MailList.MailList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {

    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val scroll = rememberScrollState()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar(scaffoldState, scope) },
        drawerContent = { DrawerMenu(scroll, scaffoldState, scope) },
        bottomBar = {
            if (scroll.isScrollInProgress) {
                false
            } else {
                BottomNav()
            }
        },
        floatingActionButton = { FloatingActionButton() }
    ) {
        MailList(padding = it, scroll)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailCloneTheme {
        App()
    }
}