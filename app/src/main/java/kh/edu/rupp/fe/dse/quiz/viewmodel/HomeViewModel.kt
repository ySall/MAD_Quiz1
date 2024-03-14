package kh.edu.rupp.fe.dse.quiz.viewmodel
import kh.edu.rupp.fe.dse.quiz.api.ApiService
import androidx.lifecycle.ViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class HomeViewModel : ViewModel() {
    fun loadData() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://smlp-pub.s3.ap-southeast-1.amazonaws.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(ApiService::class.java)

    }
}
