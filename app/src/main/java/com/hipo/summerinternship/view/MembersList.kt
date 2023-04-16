package com.hipo.summerinternship.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.hipo.summerinternship.model.CompanyModel
import com.hipo.summerinternship.ui.theme.MembersBackground
import com.hipo.summerinternship.ui.theme.SearchBackground

@Composable
fun MembersList(company: CompanyModel, searchQuery: String) {
    val members = company.members.filter { member ->
        member.name.contains(searchQuery, true)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        members.forEach { member ->
            MemberBox(name = member.name)
        }
    }
}

@Composable
fun MemberBox(name: String) {
    val shape = RoundedCornerShape(10.dp)
    Text(
        text = name,
        style = TextStyle(
            color = Color.Black,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .border(2.dp, SearchBackground, shape)
            .background(MembersBackground, shape)
            .padding(16.dp)
    )
}
