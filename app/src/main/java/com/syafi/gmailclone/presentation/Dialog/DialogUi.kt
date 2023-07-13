package com.syafi.gmailclone.presentation.Dialog

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.syafi.gmailclone.data.accountList
import com.syafi.gmailclone.model.AccountData
import com.syafi.gmailclone.presentation.Dialog.component.AccountItem

@Composable
fun DialogUi(dialog: MutableState<Boolean>, account: List<AccountData>) {
    Column(
        Modifier
            .background(MaterialTheme.colors.background)
            .wrapContentWidth()
            .padding(8.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { dialog.value = false }) {
                Icon(imageVector = Icons.Outlined.Close, contentDescription = "")
            }

            Text(
                text = "Google",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(2f)
            )
        }

        Column(
            Modifier
                .fillMaxWidth()
                .padding(1.dp)
                .background(Color.LightGray, shape = RoundedCornerShape(20.dp))
                .clip(shape = RoundedCornerShape(20.dp))
                .padding(8.dp),
        ) {

            AccountItem(account = accountList[0])

            Button(
                onClick = {},
                Modifier.padding(top = 12.dp, start = 45.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                shape = RoundedCornerShape(13.dp),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Text(text = "Google Account", fontSize = 12.sp, color = Color.DarkGray)
            }

            Divider(Modifier.padding(vertical = 8.dp), color = Color.White)

            for (i in 1 until accountList.size) {
                AccountItem(account = accountList[i])

                if (i != accountList.size) {
                    Spacer(modifier = Modifier.padding(bottom = 16.dp))
                }
            }
            
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 6.dp)) {
                Icon(imageVector = Icons.Outlined.PersonAdd, contentDescription = "")
                Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                Text(text = "Add another account", Modifier.weight(2f))
            }
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 6.dp)) {
                Icon(imageVector = Icons.Outlined.SettingsAccessibility, contentDescription = "")
                Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                Text(text = "Manage account on this device", Modifier.weight(2f))
            }
        }
    }
}