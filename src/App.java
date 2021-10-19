import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        metodo metodo = new metodo();
        metodo.preguntas();
        metodo.Genero();
        metodo.Ordenar();

        JOptionPane.showMessageDialog(null,"el promeniodio de las notas es: "+metodo.PromedioNota()+"\n"+"el procentage de las mejers que pasaron el curso son: "+metodo.ProcenMjMate()+"%\n"+"el promedio de notas del los hombres es: "+metodo.PromedioNotaHom());

        metodo.NotaAltaBaja();

        JOptionPane.showMessageDialog(null,"Procenta de los Hombres son: "+metodo.ProcentajeHombre()+"%");
    }
}
