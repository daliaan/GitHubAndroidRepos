package dalian.razvan.cucer.githubandroidrepos.repository

import dalian.razvan.cucer.core.data.network.Result
import dalian.razvan.cucer.githubandroidrepos.models.Repo
import dalian.razvan.cucer.githubandroidrepos.network.model.ReposResponse

interface ReposRepository {

    suspend fun loadRepos(): Result<ReposResponse?>

    fun setRepos(list: ArrayList<Repo>)
    fun getRepos(): ArrayList<Repo>

    fun setSelectedRepo(repo: Repo?)
    fun getSelectedRepo(): Repo?
}