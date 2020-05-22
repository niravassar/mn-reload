package mn.reload

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class SampleServiceSpec extends Specification implements ServiceUnitTest<SampleService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
