package br.com.lucasramon.lrbiblioteca.enums;


public enum Reputacao {
   
    RUIM {
        @Override
        public int getDuracaoParaDevolucao() {
            return 1;
        }
    }, REGULAR {
        @Override
        public int getDuracaoParaDevolucao() {
            return 3;
        }
    }, BOA {
        @Override
        public int getDuracaoParaDevolucao() {
            return 5;
        }
    };

    public abstract int getDuracaoParaDevolucao();
}
