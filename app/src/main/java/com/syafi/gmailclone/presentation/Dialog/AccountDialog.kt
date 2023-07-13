package com.syafi.gmailclone.presentation.Dialog

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.syafi.gmailclone.data.accountList

@Composable
fun AccountDialog(dialog: MutableState<Boolean>) {
        Dialog(onDismissRequest = { dialog.value = false }) {
            Surface(Modifier.padding(horizontal = 0.dp).width(600.dp), shape = RoundedCornerShape(20.dp)) {
                DialogUi(dialog, accountList)
            }
    }
}