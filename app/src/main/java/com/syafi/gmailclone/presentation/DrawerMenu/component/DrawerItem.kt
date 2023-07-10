package com.syafi.gmailclone.presentation.DrawerMenu.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.syafi.gmailclone.data.drawerList
import com.syafi.gmailclone.model.DrawerMenuData
import com.syafi.gmailclone.presentation.DrawerMenu
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerItem(data: DrawerMenuData, scaffoldState: ScaffoldState, scope: CoroutineScope) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable {
                scope.launch {
                    scaffoldState.drawerState.close()
                }
            }
    ) {
        Icon(
            imageVector = data.icon!!,
            contentDescription = data.name,
            Modifier
                .padding(end = 20.dp)
                .size(25.dp)
        )

        Text(text = data.name!!, Modifier.weight(2f), fontSize = 16.sp)

        if (data.notif != 0) {
            Text(text = data.notif.toString(), fontSize = 10.sp, color = Color.DarkGray)
        }
    }
}