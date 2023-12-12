package demo

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

@Client(value = 'https://meowfacts.herokuapp.com/')
interface MeowFactsClient {
    @Get
    MeowFacts fetch()

    @Get("{?count}")
    MeowFacts fetch(@QueryValue int count)
}
