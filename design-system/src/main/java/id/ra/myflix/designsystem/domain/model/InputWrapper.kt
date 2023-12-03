package id.ra.myflix.designsystem.domain.model

data class InputWrapper<T>(
    val value:T,
    val error : String? = null
)