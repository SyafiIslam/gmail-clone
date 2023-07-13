package com.syafi.gmailclone.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import com.syafi.gmailclone.model.AccountData
import com.syafi.gmailclone.model.BottomNavData
import com.syafi.gmailclone.model.DrawerMenuData
import com.syafi.gmailclone.model.MailData

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

val bottomList= listOf<BottomNavData>(
    BottomNavData(
        Icons.Outlined.MailOutline,
        Icons.Filled.Mail,
        "Mail"
    ),
    BottomNavData(
        Icons.Outlined.Chat,
        Icons.Filled.Chat,
        "Chat"
    ),
    BottomNavData(
        Icons.Outlined.Group,
        Icons.Filled.Group,
        "Group"
    ),
    BottomNavData(
        Icons.Outlined.Videocam,
        Icons.Filled.Videocam,
        "Meet"
    ),
)

val mailList= listOf<MailData>(
    MailData(
        "Railway",
        "Deploy Docker images, new Pricing",
        "Its friday and you know what that means",
        "July 4"
    ),
    MailData(
        "Slack",
        "You're invited: Slack pioneers of Champions",
        "Learn how to top companies like google, meta, etc",
        "August 14"
    ),
    MailData(
        "PSIK FILKOM UB",
        "Undangan Webinar TIF #41",
        "Yth. Mahasiswa Program Studi Teknik Informatika",
        "August 14"
    ),
    MailData(
        "ResearchGate",
        "Faizatul Amalia published an article",
        "This week's research from your department",
        "December 31"
    ),
    MailData(
        "Github",
        "[Github] An email address was arrested",
        "Hey SyafIislam An email address",
        "January 21"
    ),
    MailData(
        "Netlify Team",
        "More BIG News from Netlify",
        "We are excited to announce that netlify",
        "January 21"
    ),
    MailData(
        "Taco from Trello",
        "🔥 This just in: Trello Dark Mode",
        "Plus, tips on better decision-making",
        "March 9"
    ),
    MailData(
        "Railway",
        "Deploy Docker images, new Pricing",
        "Its friday and you know what that means",
        "July 4"
    ),
    MailData(
        "Slack",
        "You're invited: Slack pioneers of Champions",
        "Learn how to top companies like google, meta, etc",
        "August 14"
    ),
    MailData(
        "PSIK FILKOM UB",
        "Undangan Webinar TIF #41",
        "Yth. Mahasiswa Program Studi Teknik Informatika",
        "August 14"
    ),
    MailData(
        "ResearchGate",
        "Faizatul Amalia published an article",
        "This week's research from your department",
        "December 31"
    ),
    MailData(
        "Github",
        "[Github] An email address was arrested",
        "Hey SyafIislam An email address",
        "January 21"
    ),
    MailData(
        "Netlify Team",
        "More BIG News from Netlify",
        "We are excited to announce that netlify",
        "January 21"
    ),
    MailData(
        "Taco from Trello",
        "🔥 This just in: Trello Dark Mode",
        "Plus, tips on better decision-making",
        "March 9"
    ),
    MailData(
        "Hello from Trello",
        "🔥 This just in: Trello Dark Mode",
        "Plus, tips on better decision-making",
        "March 9"
    ),
)

val accountList= listOf<AccountData>(
    AccountData(
        "Muhammad Syafi islam",
        "muhammadsyafi@student.ub.ac.id",
        11
    ),
    AccountData(
        "Muhammad Syafi",
        "muhammadsyafiislam@gmail.com",
        99
    ),
    AccountData(
        "End 1902",
        "mrend19022003@gmail.com",
        30,
    ),
    AccountData(
        "sapi",
        "akunvalosapi@gmail.com",
        8,
    ),
)