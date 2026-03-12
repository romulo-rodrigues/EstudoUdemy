package EqualsHashCode;

public class Usuario {
    String nome;
    String email;

    //Equals
    public boolean equals(Object objeto) {

        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
    //Hashcode
    public int hashCode() {
        return this.nome.length();
    }

    /*Pode ser gerado o HASCODE e o EQUALS através do ATALHO da IDE
    Botão direito > generate ou alt + shift > equals and hascode!!
     */
}
