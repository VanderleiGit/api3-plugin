package api3.plugin

import java.time.LocalDate

class LogController {

    def logService

    def salvarLog() {
        LocalDate data = LocalDate.now()
        String descricao = "Isso é um registro de log."
        logService.salvarLog(data, descricao)
        render "Log salvo com sucesso!"
    }
}
