package modelo.bean;
public class Livro {
    
    
    private int id;
    private String descricao;
    private String codigo;
    private int pag;
    private String Status;
    private Setor setor;

    public Livro() {
    }

    public Livro(int id, String descricao, String codigo, int pag, String Status, Setor setor) {
        this.id = id;
        this.descricao = descricao;
        this.codigo = codigo;
        this.pag = pag;
        this.Status = Status;
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
    
}