package id.ra.myflix.home.impl.presentation.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.ra.myflix.home.impl.R

@Preview(name = "home", showBackground = true)
@Composable fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSection(
            name = "Diezy",
            modifier = Modifier.fillMaxWidth()
                .padding(top = 40.dp)
                .padding(horizontal = 24.dp)
        )
    }
}

@Composable
fun HeaderSection(
    name:String,
    modifier: Modifier
){

    val titleSpanable = buildAnnotatedString {
        withStyle(style = SpanStyle(fontWeight = FontWeight.SemiBold)){
            append(stringResource(id = R.string.hello_txt))
        }
        append(" ")
        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)){
            append(name)
        }

    }

    Row (
        modifier = modifier
    ){
        Column(modifier = modifier.weight(1f)) {
            Text(
                text=titleSpanable, fontSize = 24.sp
            )
        }
    }
}