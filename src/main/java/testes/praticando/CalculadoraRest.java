package testes.praticando;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraRest {
        @Autowired
        private Calculadora calc;

        @GetMapping("/somar")
        public ResponseEntity<?> somar(@RequestParam(required = true) int n1, @RequestParam(required = true) int n2) {
            if (n1 < 0 || n2 < 0) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("numero invalido");
            }
            double result = calc.somar(n1, n2);
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }

}


