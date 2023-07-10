package com.syafi.gmailclone.model

import androidx.compose.ui.graphics.vector.ImageVector

data class DrawerMenuData(
    val icon: ImageVector?= null,
    val name: String?= null,
    val notif: Int= 0,
    val isHeader: Boolean= false,
    val isDivider: Boolean= false,
)
