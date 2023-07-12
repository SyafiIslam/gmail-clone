package com.syafi.gmailclone.presentation.MailList

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.syafi.gmailclone.data.mailList
import com.syafi.gmailclone.presentation.MailList.component.MailItem

@Composable
fun MailList(padding: PaddingValues, scrollState: ScrollState) {
    LazyColumn(
        Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 60.dp)
            .scrollable(scrollState, Orientation.Vertical)
    ) {
        items(mailList) {
            MailItem(mail = it)
        }
    }
}