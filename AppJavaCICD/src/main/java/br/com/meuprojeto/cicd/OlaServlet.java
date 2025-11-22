package br.com.meuprojeto.cicd;

 

import java.io.IOException;
// IMPORTANTE: Tomcat 10 usa jakarta.*
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Essa anotação define o "endereço" do servlet no navegador
@WebServlet("/ola")
public class OlaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Configura a resposta para ser lida corretamente com acentos
		response.setContentType("text/html;charset=UTF-8");
		
		// Escreve a resposta na tela
		response.getWriter().append("<h1>Funcionou!</h1>");
		response.getWriter().append("<p>O Tomcat 10 respondeu usando Jakarta EE.</p>");
		response.getWriter().append("<h1>Versão Automática 2.0!</h1>");
		response.getWriter().append("<a href='index.jsp'>Voltar</a>");
	}
}
