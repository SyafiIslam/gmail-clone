package com.syafi.gmailclone.presentation.DrawerMenu.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header(title: String) {
    Text(text = title, fontSize = 12.sp, modifier = Modifier.padding(vertical = 8.dp))
}