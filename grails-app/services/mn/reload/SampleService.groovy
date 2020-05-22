package mn.reload

import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired

@Transactional
class SampleService {

    @Autowired
    MicronautClient client

    String serviceMethod() {
        println "in sampleService"
        client.getCall()
    }
}
