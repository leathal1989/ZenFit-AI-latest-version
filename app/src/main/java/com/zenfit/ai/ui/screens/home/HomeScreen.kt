package com.zenfit.ai.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsRun
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("ZenFit AI") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Welcome to ZenFit AI",
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Center
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Text(
                text = "Your AI-powered fitness and wellness companion",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )
            
            Spacer(modifier = Modifier.height(32.dp))
            
            Button(
                onClick = { /* Start workout */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    Icons.Filled.DirectionsRun,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Start Workout")
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Button(
                onClick = { /* Begin meditation */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    Icons.Filled.SelfImprovement,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Begin Meditation")
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Button(
                onClick = { /* Track nutrition */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    Icons.Filled.Restaurant,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Track Nutrition")
            }
        }
    }
}