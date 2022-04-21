public class Mercado{
    static float preco;
    static int qte;
    private float total;

    public float getpreco(){
        return preco;

        public int getqte(){
        return qte;
    }

    public float getTotal(){
        return total;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setqte(int qte){
        this.qte = qte;
    }

    public void setTotal(float total){
        this.total = total;
    }

    public mercado(float preco, int qte, float total){
        this.preco = 5;
        this.qte = 3;
        this.total = total;
    }

    public static float preco(float preco, int qte, float total){
        total = preco*qte;
        return total;
    }



    }

