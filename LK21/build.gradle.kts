// use an integer for version numbers
version = 4


cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

    // description = "Lorem Ipsum"
     authors = listOf("Hexated")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
        "Anime",
        "AsianDrama",
    )

    iconUrl = "https://images.dwncdn.net/images/t_app-icon-m/p/e83384b0-0fe9-4f46-939e-cbdad5dc20bb/2548036024/31711_4-78624899-imgingest-4278046119853529974.jpg"
}
