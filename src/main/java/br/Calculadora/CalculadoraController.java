package br.Calculadora;

import br.Calculadora.Operacoes.Subtracao;
import br.Calculadora.Operacoes.Adicao;
import br.Calculadora.Operacoes.Multiplicacao;
import br.Calculadora.Operacoes.Divisao;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CalculadoraController {
	
	// Routes:
	// [1] GET /somar
	// [2] GET /subtrair
	// [3] GET /multiplicar
	// [4] GET /dividir
	
	
	// [1]
	@GetMapping("/somar")
	public double somar(@RequestParam double num_1, @RequestParam double num_2) {
		return Adicao.somar(num_1, num_2);
	}
	
	// [2]
	@GetMapping("/subtrair")
	public double subtrair(@RequestParam double num_1, @RequestParam double num_2) {
		return Subtracao.subtrair(num_1, num_2);
	}
	
	// [3]
	@GetMapping("/multiplicar")
	public double multiplicar(@RequestParam double num_1, @RequestParam double num_2) {
		return Multiplicacao.multiplicar(num_1, num_2);
	}
	
	// [4]
	@GetMapping("/dividir")
	public double dividir(@RequestParam double num_1, @RequestParam double num_2) {
		return Divisao.dividir(num_1, num_2);
	}
	
	
}
