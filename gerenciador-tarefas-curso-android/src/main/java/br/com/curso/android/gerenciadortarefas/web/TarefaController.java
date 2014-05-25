package br.com.curso.android.gerenciadortarefas.web;
import br.com.curso.android.gerenciadortarefas.model.Tarefa;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/tarefas")
@Controller
@RooWebScaffold(path = "tarefas", formBackingObject = Tarefa.class)
@RooWebJson(jsonObject = Tarefa.class)
public class TarefaController {
}
