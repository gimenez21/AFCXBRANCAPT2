
/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método genérico que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Este projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Técnicas de revisão e melhoria (refatoração);</li>
 *     <li>Escrita de revisão (código limpo);</li>
 *     <li>Impacto da refatoração em código mal escrito;</li>
 *     <li>Documentação com Javadoc;</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *
 * @author Vitor Gimenez
 * @version 1.0
 */

public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a o primeiro operando
     * @param b o segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrair — com o devido comentário
        /**
     * Subtrai dois números inteiros.
     *
     * <p>Realiza a operação {@code a - b} e retorna o resultado.</p>
     *
     * @param a o primeiro operando (minuendo)
     * @param b o segundo operando (subtraendo)
     * @return o resultado da subtração entre {@code a} e {@code b}
     */
        public int subtrair(int a, int b) {
            return a - b;
        }
    
        /**
         * Multiplica dois números inteiros.
         *
         * <p>Realiza a operação {@code a * b} e retorna o produto.</p>
         *
         * @param a o primeiro operando
         * @param b o segundo operando
         * @return o produto da multiplicação entre {@code a} e {@code b}
         */
        public int multiplicar(int a, int b) {
            return a * b;
        }
    
        /**
         * Divide dois números inteiros.
         *
         * <p>Realiza a operação {@code a / b}, lançando uma exceção caso o divisor seja zero.</p>
         *
         * @param a o numerador (dividendo)
         * @param b o denominador (divisor)
         * @return o resultado da divisão entre {@code a} e {@code b}
         *
         * @throws IllegalArgumentException se {@code b} for igual a zero, pois divisão por zero não é permitida
         */
        public int dividir(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Divisão por zero não é permitida.");
            }
            return a / b;
        }
    

    /**
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>"+": Soma</li>
     *     <li>"-": Subtração</li>
     *     <li>"*": Multiplicação</li>
     *     <li>"/": Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resulta em exceção.</p>
     *
     * @param a o primeiro operando
     * @param b o segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     *
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
