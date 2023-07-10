package com.syafi.gmailclone.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.syafi.gmailclone.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {
    Card(
        Modifier.padding(16.dp),
        elevation = 6.dp,
        shape = RoundedCornerShape(30.dp),
        backgroundColor = MaterialTheme.colors.surface
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 4.dp, start = 4.dp, bottom = 4.dp, end = 16.dp)
        ) {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "")
            }

            Text(text = "Search email here", Modifier.weight(2f))

            Image(
                painterResource(id = R.drawable.logo),
                contentDescription = "",
                Modifier
                    .size(35.dp)
                    .clip(CircleShape)
                    .clickable { }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppBar() {

    val scaffoldState= rememberScaffoldState()
    val scope= rememberCoroutineScope()
    TopBar(scaffoldState, scope)
}