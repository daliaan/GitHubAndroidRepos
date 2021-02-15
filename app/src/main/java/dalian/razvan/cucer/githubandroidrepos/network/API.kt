package dalian.razvan.cucer.githubandroidrepos.network

import dalian.razvan.cucer.githubandroidrepos.network.model.ReposResponse
import retrofit2.Response
import retrofit2.http.*

interface API {

    @GET(Endpoints.SEARCH_TOPICS)
    suspend fun getRepos(@Query("page") pageNumber: Int): Response<ReposResponse>
}