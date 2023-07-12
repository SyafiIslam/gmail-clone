package com.syafi.gmailclone.presentation.MailList.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import com.syafi.gmailclone.data.mailList
import com.syafi.gmailclone.model.MailData

@Composable
fun MailItem(mail: MailData) {

    var clicked by remember {
        mutableStateOf(false)
    }

    Row(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .heightIn(min = 30.dp)
    ) {
        Card(
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier.size(45.dp),
            elevation = 6.dp,
            backgroundColor = Color.Gray
        ) {
            Text(
                text = mail.name[0].toString(),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(9.dp),
                color = Color.White,
                fontSize = 18.sp
            )
        }

        Column(Modifier.padding(horizontal = 8.dp), verticalArrangement = Arrangement.Top) {
            Row(
                Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = mail.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text(text = mail.date, fontSize = 12.sp)
            }

            Row(
                Modifier
                    .fillMaxWidth()
            ) {
                Text(text = mail.title, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            }

            Row(
                Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = mail.subject, fontSize = 12.sp)

                if (clicked) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "",
                        Modifier
                            .size(20.dp)
                            .clickable { clicked= false }
                    )
                } else {
                    Icon(
                        imageVector = Icons.Outlined.StarOutline,
                        contentDescription = "",
                        Modifier
                            .size(20.dp)
                            .clickable { clicked= true }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MailPreview() {
    MailItem(mail = mailList[0])
}