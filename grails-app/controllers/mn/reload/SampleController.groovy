package mn.reload

class SampleController {

    SampleService sampleService

    def index() {
        println "************************"
        String result = sampleService.serviceMethod()
        println "in sampleController"
        render result
    }
}
