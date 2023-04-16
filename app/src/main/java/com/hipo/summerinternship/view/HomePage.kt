package com.hipo.summerinternship.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.hipo.summerinternship.viewmodel.MainViewModel
import androidx.compose.runtime.*
import androidx.compose.ui.unit.sp
import com.hipo.summerinternship.data.newMemberData
import com.hipo.summerinternship.ui.theme.ButtonGreen
import com.hipo.summerinternship.ui.theme.SearchBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage() {
    val viewModel = MainViewModel()
    val company = viewModel.companyLiveData.value ?: return
    var searchQuery by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            Surface(
                shadowElevation = 10.dp,
            ) {
                TopAppBar(
                    modifier = Modifier
                        .background(Color.White)
                        .border(0.dp, Color.LightGray),
                    title = {
                        Text(
                            modifier = Modifier.padding(16.dp),
                            text = "Members",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                            )
                        )
                    },
                )
            }
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(20.dp)
            ) {
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                        .background(SearchBackground, RoundedCornerShape(10.dp)),
                    leadingIcon = {
                        Icon(Icons.Rounded.Search, contentDescription = "search")
                    },
                    shape = RoundedCornerShape(10.dp),
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                )
                Box(modifier = Modifier.padding(5.dp))
                MembersList(company, searchQuery)
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier
                    .padding(30.dp)
                    .background(ButtonGreen, RoundedCornerShape(40.dp)),
                shape = RoundedCornerShape(40.dp),
                onClick = {
                    viewModel.addNewMember(newMemberData)
                    searchQuery = "a"
                    searchQuery = ""
                },
                content = {
                    Text(
                        text = "ADD NEW MEMBER",
                        style = TextStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(ButtonGreen, RoundedCornerShape(40.dp))
                            .padding(20.dp)
                    )
                },
            )
        },
        floatingActionButtonPosition = FabPosition.Center,
    )
}
