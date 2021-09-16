public class Principal {
    public static void main (String[]args){
        ContaRevisao minhaConta= new ContaRevisao();

        minhaConta.setNumero(5);
        System.out.println(minhaConta.getNumero());
        minhaConta.setTitular("Luan Angelo" );
        System.out.println(minhaConta.getTitular());
        minhaConta.setSaldo(5000);
        System.out.println(minhaConta.getSaldo());
        


    }

}
