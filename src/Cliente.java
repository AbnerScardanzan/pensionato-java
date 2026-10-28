public class Cliente {
    private String Nome;
    private String Email;

    public Cliente (String Nome, String Email){
        this.Nome = Nome;
        this.Email = Email;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }
    
    @Override 
    public String toString() {
        return Nome + ", " + Email;
    }

}
