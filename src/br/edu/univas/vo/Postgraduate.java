package br.edu.univas.vo;

public class Postgraduate extends Student{

    Postgraduate postgraduate;

    public Postgraduate(int cpf, String name, String email) {
        super(cpf, name, email);
    }

    public Postgraduate getPostgraduate() {
        return postgraduate;
    }

    public void setPostgraduate(Postgraduate postgraduate) {
        this.postgraduate = postgraduate;
    }

    @Override
    public String toString() {
        return "Postgraduate{" +
                "postgraduate=" + postgraduate +
                '}';
    }
}
