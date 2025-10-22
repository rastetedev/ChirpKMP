package com.raulastete.core.designsystem.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import chirpkmp.core.designsystem.generated.resources.Res
import chirpkmp.core.designsystem.generated.resources.logo_chirp
import org.jetbrains.compose.resources.vectorResource

@Composable
fun ChirpBrandLogo(
    modifier: Modifier = Modifier
) {
    Icon(
        imageVector = vectorResource(Res.drawable.logo_chirp),
        contentDescription = null,
        tint = MaterialTheme.colorScheme.primary,
        modifier = modifier
    )
}