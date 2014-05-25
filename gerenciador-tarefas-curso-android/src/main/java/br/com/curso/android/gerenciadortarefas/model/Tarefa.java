package br.com.curso.android.gerenciadortarefas.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
public class Tarefa {

    /**
     */
    @NotNull
    @Column(unique = true)
    private String titulo;

    /**
     */
    @Enumerated
    private Prioridade prioridade;

    /**
     */
    @Enumerated
    private Status status;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data;
}
