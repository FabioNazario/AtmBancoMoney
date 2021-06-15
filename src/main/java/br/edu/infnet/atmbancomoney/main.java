package br.edu.infnet.atmbancomoney;

import br.edu.infnet.atmbancomoney.util.TelaUtil;
import br.edu.infnet.atmbancomoney.visao.TelaLogin;
import javax.rmi.CORBA.Util;

public class main 
{
    public static void main( String[] args )
    {
        TelaLogin login = new TelaLogin();
    	login.apresentar();
    }
}
