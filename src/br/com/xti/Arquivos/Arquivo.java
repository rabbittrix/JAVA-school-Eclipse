package br.com.xti.Arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException  {
		//Cria o diretorio Files
		File diretorio = new File("D:\\java\\Files");
		diretorio.mkdir();
		//Cria o arquivo textos
		Path path = Paths.get("D:/java/Files/textos.txt");						
		Charset utf8 = StandardCharsets.UTF_8;
//		BufferedWriter w = null;
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
		//w = Files.newBufferedWriter(path, utf8);
		w.write("Manipulando Arquivos no Java \n");
		w.write("Escrevendo no txt com Java \n");
		//w.flush();
		//w.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
//		finally { "NÃO SE USA MAIS A PARTIR DO JAVA 7"
//			if(w != null) {
//				w.close();
//			}
		//Leitura do arquivo criado
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}


