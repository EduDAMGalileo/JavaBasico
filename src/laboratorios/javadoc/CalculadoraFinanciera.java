package laboratorios.javadoc;
/**
 * Provee herramientas matemáticas especializadas para cálculos financieros y contables.
 * Esta clase incluye operaciones de interés, impuestos y divisiones seguras.
 * 
 * @author Departamento de Desarrollo <dev@financiera.com>
 * @version 2.0 (2025-01-15)
 */
public class CalculadoraFinanciera {

    /**
     * El porcentaje de Impuesto sobre el Valor Añadido (IVA) vigente.
     * Valor actual: 21% (0.21).
     */
    public static final double TASA_IVA = 0.21;

    /**
     * Calcula el precio final de un producto aplicando el IVA.
     * 
     * @param precioBase El precio del producto sin impuestos. Debe ser mayor o igual a 0.
     * @return El precio total con el IVA sumado.
     */
    public double aplicarIva(double precioBase) {
        return precioBase * (1 + TASA_IVA);
    }

    /**
     * Calcula el interés simple generado por un capital durante un periodo de tiempo.
     * <p>
     * La fórmula utilizada es: <code>I = C * i * t</code>
     * </p>
     * 
     * @param capital El monto inicial de la inversión.
     * @param tasa La tasa de interés anual (en formato decimal, ej: 0.05 para 5%).
     * @param años El tiempo de la inversión en años.
     * @return El beneficio (interés) generado.
     * @see #aplicarIva(double)
     */
    public double calcularInteresSimple(double capital, double tasa, int años) {
        return capital * tasa * años;
    }

    /**
     * Realiza una división segura entre dos cantidades monetarias.
     * 
     * @param dividendo La cantidad total a dividir.
     * @param divisor El número de partes.
     * @return El resultado de la división.
     * @throws IllegalArgumentException Si el divisor es 0, para evitar indeterminaciones.
     */
    public double dividirPresupuesto(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir el presupuesto entre cero.");
        }
        return dividendo / divisor;
    }

    /**
     * Calcula el interés usando una fórmula antigua y menos precisa.
     * 
     * @param capital El monto inicial.
     * @return Un valor aproximado del interés.
     * @deprecated Este método no contempla los decimales con precisión.
     *             Utilizar en su lugar {@link #calcularInteresSimple(double, double, int)}.
     */
    @Deprecated
    public double calcularInteresLegacy(double capital) {
        return capital * 0.03; // Tasa fija antigua
    }
}