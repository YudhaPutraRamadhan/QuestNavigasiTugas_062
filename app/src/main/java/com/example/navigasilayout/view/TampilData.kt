package com.example.navigasilayout.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.navigasilayout.R

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun TampilData(
    modifier: Modifier = Modifier,
    OnToFormBtnClick: () -> Unit,
    OnToHomeBtnClick: () -> Unit,
) {
    val items = listOf(
        stringResource(id = R.string.nama_lengkap) to "Yudha Putra Ramadhan",
        stringResource(id = R.string.jenis_kelamin) to "Laki-Laki",
        stringResource(id = R.string.alamat) to "Ringinharjo"
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {Text(text = stringResource(id = R.string.tampil),
                    color = Color.White
                )},
                colors = TopAppBarDefaults
                    .mediumTopAppBarColors(colorResource
                        (id = R.color.teal_700)
                    )
            )
        }){ isiRuang->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_small))) {
                items.forEach { item ->
                    Column {
                        Text(text = item.first.uppercase(),
                            fontSize = 16.sp)
                        Text(text = item.second,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 22.sp)
                    }
                    HorizontalDivider(thickness = 1.dp, color = Color.Cyan)
                }
                Spacer(modifier = Modifier.height(height = 10.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = OnToFormBtnClick) {
                    Text(text = stringResource(id=R.string.FormulirPendaftaran))
                }
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = OnToHomeBtnClick) {
                    Text(text = stringResource(id=R.string.home))
                }
            }
        }
    }
}