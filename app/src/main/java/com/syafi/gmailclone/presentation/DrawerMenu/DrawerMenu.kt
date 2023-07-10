package com.syafi.gmailclone.presentation

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.syafi.gmailclone.data.drawerList
import com.syafi.gmailclone.presentation.DrawerMenu.component.DrawerItem
import com.syafi.gmailclone.presentation.DrawerMenu.component.Header

@Composable
fun DrawerMenu(scrollState: ScrollState) {
    Column(Modifier.padding(vertical = 12.dp, horizontal = 16.dp).verticalScroll(scrollState)) {
        Text(text = "Gmail", color = Color.Red, fontSize = 14.sp)

        Divider(Modifier.padding(vertical = 16.dp))

        drawerList.forEach { data ->

            when {
                data.isDivider -> Divider(Modifier.padding(vertical = 12.dp))
                data.isHeader -> Header(title = data.name!!)
                else -> DrawerItem(data = data)
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun DrawerMenuPreview() {
//    DrawerMenu()
}