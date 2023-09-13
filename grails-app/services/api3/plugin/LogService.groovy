package api3.plugin

import java.time.LocalDate

class LogService {

    def salvarLog(LocalDate data, String descricao) {
        def novoLog = new LogEntry(data: data, descricao: descricao)
        novoLog.save(flush: true)
    }
}
