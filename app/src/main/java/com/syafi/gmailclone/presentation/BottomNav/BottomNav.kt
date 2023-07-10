package com.syafi.gmailclone.presentation.BottomNav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.syafi.gmailclone.data.bottomList
import com.syafi.gmailclone.R

@Composable
fun BottomNav() {

    var active by remember {
        mutableStateOf("Mail")
    }

    BottomNavigation() {
        bottomList.forEach {
            BottomNavigationItem(
                selected = false,
                onClick = {
                    active = it.label
                },
                icon = {
                    if (it.label === active) {
                        Icon(
                            imageVector = it.iconAfter,
                            contentDescription = it.label,
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(colorResource(id = R.color.selected))
                                .padding(horizontal = 20.dp, vertical = 4.dp)
                        )
                    } else {
                        Icon(
                            imageVector = it.iconBefore,
                            contentDescription = it.label
                        )
                    }
                }
            )
        }
    }
}