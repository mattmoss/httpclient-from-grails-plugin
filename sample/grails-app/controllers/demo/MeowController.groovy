package demo

import org.springframework.beans.factory.annotation.Autowired

class MeowController {

    @Autowired
    MeowFactsClient client

    def index() {
        MeowFacts facts = client.fetch(5)

        String out = 'Here are five facts about cats.\n'
        facts.data.eachWithIndex{ String entry, int i ->
            out += "${i+1}. ${entry}\n"
        }

        render text: out, contentType: 'text/plain'
    }
}
