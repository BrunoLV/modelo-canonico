package com.valhala.universidade.canonico;

import lombok.Data;

import java.io.Serializable;
import java.util.Collection;

@Data
public class ErroDto implements Serializable {

    private String mensagem;
    private String descricao;

    private Collection<ErroValidacaoDto> erros;

}
