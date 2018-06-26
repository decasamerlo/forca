package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import modelo.Usuario;

public class Dao {

	public Usuario findOne(String cpf) {
		Usuario usuario = new Usuario();
		
		File file = new File("src/usuarios/" + cpf + ".ser");
		
		if (!file.exists()) {
			return null;
		}
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("/usuarios/" + cpf + ".ser"));
			usuario = (Usuario) in.readObject();
			in.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		
		return usuario;
	}

	public void salvar(Usuario usuario) {
		System.out.println("Salvoou!");
	}
	
}
