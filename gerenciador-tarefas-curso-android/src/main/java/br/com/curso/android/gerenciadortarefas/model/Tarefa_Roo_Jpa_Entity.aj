// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package br.com.curso.android.gerenciadortarefas.model;

import br.com.curso.android.gerenciadortarefas.model.Tarefa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Tarefa_Roo_Jpa_Entity {
    
    declare @type: Tarefa: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Tarefa.id;
    
    @Version
    @Column(name = "version")
    private Integer Tarefa.version;
    
    public Long Tarefa.getId() {
        return this.id;
    }
    
    public void Tarefa.setId(Long id) {
        this.id = id;
    }
    
    public Integer Tarefa.getVersion() {
        return this.version;
    }
    
    public void Tarefa.setVersion(Integer version) {
        this.version = version;
    }
    
}
