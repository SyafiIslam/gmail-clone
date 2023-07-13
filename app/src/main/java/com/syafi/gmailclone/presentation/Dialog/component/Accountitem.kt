package com.syafi.gmailclone.presentation.Dialog.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.syafi.gmailclone.model.AccountData

@Composable
fun AccountItem(account: AccountData) {
    Row() {
        Card(
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier.size(40.dp),
            elevation = 6.dp,
            backgroundColor = Color.Gray
        ) {
            Text(
                text = account.name[0].toString(),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp),
                color = Color.White,
                fontSize = 18.sp
            )
        }

        Column(
            Modifier.padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = account.name, fontSize = 14.sp, fontWeight = FontWeight.Bold)

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = account.email, fontSize = 13.sp)

                Text(text = account.notif.toString(), fontSize = 10.sp)
            }
        }
    }
}