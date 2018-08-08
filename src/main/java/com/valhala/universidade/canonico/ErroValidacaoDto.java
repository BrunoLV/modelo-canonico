package com.valhala.universidade.canonico;

import lombok.Data;

import java.io.Serializable;

@Data
public class ErroValidacaoDto implements Serializable {

    private String campo;
    private String mensagem;

}
