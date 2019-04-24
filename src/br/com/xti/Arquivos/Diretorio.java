package br.com.xti.Arquivos;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class Diretorio {

	public static void main(String[] args) {
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path path : dirs) {
			System.out.println(path);
			
		}
		// Listar o conteudo do diretorio
		Path dir = Paths.get("D:/java/");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir);){
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		} catch (IOException | DirectoryIteratorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
