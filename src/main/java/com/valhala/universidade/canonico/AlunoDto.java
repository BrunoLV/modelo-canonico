package com.valhala.universidade.canonico;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AlunoDto implements Serializable {

    private String uuid;
    private String nome;
    private String documento;
    private Long matricula;

    private Date dataCadastro;

    private String telefone;
    private String email;
    private Boolean ativo = Boolean.TRUE;

}
