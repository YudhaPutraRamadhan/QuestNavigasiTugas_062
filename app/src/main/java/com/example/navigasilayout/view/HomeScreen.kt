package com.example.navigasilayout.view

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.navigasilayout.R
import com.example.navigasilayout.ui.theme.LightBlue
import com.example.navigasilayout.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    OnToFormBtnClick : () -> Unit) {
    Surface (modifier = Modifier.fillMaxSize(), color = LightBlue) {
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(R.string.selamat_datang),
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Purple80
            )

            Spacer(modifier = Modifier.height(72.dp))

            Image(
                painter = painterResource(id = R.drawable.logo_form),
                contentDescription = "Logo",
                modifier = Modifier.height(200.dp)
            )

            Spacer(modifier = Modifier.height(96.dp))

            Text(text = stringResource(R.string.nama),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Purple80)
            Text(text = stringResource(R.string.NIM),
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                color = Purple80)

            Spacer(modifier = Modifier.height(108.dp))

            Button(
                onClick = OnToFormBtnClick,
                modifier = Modifier.fillMaxWidth(0.7f).height(50.dp)
            ) {
                Text(text = stringResource(R.string.submit))
            }
        }
    }
}