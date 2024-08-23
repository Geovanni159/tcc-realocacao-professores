package br.senai.sp.recolocacaodeprof.enums;

public enum Cargo {
    PROFESSOR("Professor"),
    INSPETOR("Inspetor");

    private String descricao;

    Cargo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
