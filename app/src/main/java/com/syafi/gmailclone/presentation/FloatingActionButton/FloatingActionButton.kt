package com.syafi.gmailclone.presentation.FloatingActionButton

import android.graphics.drawable.shapes.RectShape
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.syafi.gmailclone.R

@Composable
fun FloatingActionButton() {
    FloatingActionButton(
        onClick = {},
        shape = RoundedCornerShape(20.dp),
        backgroundColor = colorResource(id = R.color.selected),
        modifier = Modifier.padding(8.dp)
    ) {
        Icon(imageVector = Icons.Outlined.Edit, contentDescription = "", tint = Color.White)
    }
}