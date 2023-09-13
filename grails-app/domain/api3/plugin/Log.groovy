package api3.plugin

import grails.gorm.annotation.Entity
import grails.compiler.GrailsCompileStatic
import java.time.LocalDate
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@GrailsCompileStatic
@Entity
class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    LocalDate data

    @NotBlank
    @Size(max = 1000)
    String descricao

    static constraints = {
        data nullable: false
        descricao nullable: false
    }
}
