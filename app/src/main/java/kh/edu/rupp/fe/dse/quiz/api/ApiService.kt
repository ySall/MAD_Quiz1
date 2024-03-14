package kh.edu.rupp.fe.dse.quiz.api
import kh.edu.rupp.fe.dse.quiz.model.ProfileResponse

import retrofit2.http.GET

interface ApiService {
    @GET("fb-profile.json")
    suspend fun getProfile(): ProfileResponse
}
