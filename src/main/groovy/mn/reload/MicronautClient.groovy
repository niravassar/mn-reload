package mn.reload

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("http://httpbin.org/get?foo=fromMyClient")
interface MicronautClient {
    @Get
    String getCall()
}
