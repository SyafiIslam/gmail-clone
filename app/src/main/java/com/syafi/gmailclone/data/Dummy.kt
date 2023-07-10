package com.syafi.gmailclone.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.BookOnline
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material.icons.outlined.*
import com.syafi.gmailclone.model.DrawerMenuData

val drawerList = listOf<DrawerMenuData>(
    DrawerMenuData(
        Icons.Filled.BookOnline,
        "Active",
    ),
    DrawerMenuData(
        Icons.Outlined.Edit,
        "Add a status",
    ),
    DrawerMenuData(
        isDivider = true
    ),
    DrawerMenuData(
        Icons.Outlined.AllInbox,
        "All inboxes",
    ),
    DrawerMenuData(
        isDivider = true
    ),
    DrawerMenuData(
        Icons.Outlined.Inbox,
        "Inbox",
        99
    ),
    DrawerMenuData(
        name = "All labels",
        isHeader = true
    ),
    DrawerMenuData(
        Icons.Outlined.StarOutline,
        "Starred",
        17,
    ),
    DrawerMenuData(
        Icons.Outlined.Snooze,
        "Snoozed",
    ),
    DrawerMenuData(
        Icons.Outlined.LabelImportant   ,
        "Important",
    ),
    DrawerMenuData(
        Icons.Outlined.Send,
        "Sent",
    ),
    DrawerMenuData(
        Icons.Outlined.Schedule,
        "Scheduled",
        3
    ),DrawerMenuData(
        Icons.Outlined.Outbox,
        "Outbox",
    ),
    DrawerMenuData(
        Icons.Outlined.Drafts,
        "Drafts",
    ),
    DrawerMenuData(
        Icons.Outlined.Mail,
        "All mail",
        99
    ),
    DrawerMenuData(
        Icons.Outlined.Warning,
        "Spam",
    ),
    DrawerMenuData(
        Icons.Outlined.Delete,
        "Sent",
    ),
    DrawerMenuData(
        name = "Google apps",
        isHeader = true
    ),
    DrawerMenuData(
        Icons.Outlined.CalendarMonth,
        "Calender"
    ),
    DrawerMenuData(
        Icons.Outlined.Contacts,
        "Contacts"
    ),
    DrawerMenuData(
        isDivider = true
    ),
    DrawerMenuData(
        Icons.Outlined.Settings,
        "Settings"
    ),
    DrawerMenuData(
        Icons.Outlined.HelpOutline,
        "Help & feedback"
    ),
)