package classes;

import interfaces.Autenticavel;

public class Autenticador {
    private String[] autorizados = {"ABC1234", "10335723730-12345", "DEF5106"};

    public Boolean credenciado(Autenticavel autenticavel){
       String token = autenticavel.obterCredenciais();

       for (String autorizado : autorizados) {
            if (token.equals(autorizado)){
                return true;
            }
        }
        return false;
    }

}
