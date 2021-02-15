package dalian.razvan.cucer.githubandroidrepos.baseClasses

interface RecyclerViewItemClickListener<T: BaseModel> {

    fun onItemClick(item: T)
}