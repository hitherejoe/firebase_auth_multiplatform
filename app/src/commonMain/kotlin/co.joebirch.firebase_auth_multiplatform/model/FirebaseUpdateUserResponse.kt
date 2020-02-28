package co.joebirch.firebase_auth_multiplatform.model

import kotlinx.serialization.Serializable

@Serializable
data class FirebaseUpdateUserResponse(
    val localId: String? = null,
    val email: String? = null,
    val passwordHash: String? = null,
    val idToken: String? = null,
    val refreshToken: String? = null,
    val expiresIn: String? = null,
    val code: Int? = null,
    val message: String? = null
)