package kh.edu.rupp.fe.dse.quiz.model

data class ProfileResponse(
    val code: Int,
    val message: String,
    val data: ProfileData
)

data class ProfileData(
    val firstName: String,
    val lastName: String,
    val bio: String,
    val profileImage: String,
    val coverImage: String,
    val friendCount: Int,
    val job: String,
    val workPlace: String,
    val maritalStatus: String
)
