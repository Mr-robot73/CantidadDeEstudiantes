import javax.swing.JOptionPane;
public class metodo {
    // declarar variables
    private int n;
    private String nombre[];
    private String sexo;
    char palabra;
    private char genero[];
    private Float nota[];

    // preguntar nombre || genero || nota
    public void preguntas(){
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"digite la cantidad de persona"));

        // creando vectores
        nombre = new String[n];
        genero = new char[n];
        nota = new Float[n];

        // guardando los nombre || genero || nota en los vectores
        for (int i = 0; i < n; i++){
            nombre[i] = JOptionPane.showInputDialog(null,"digite el nombres del estudiante");
            sexo = JOptionPane.showInputDialog(null,"digite tu genero 'Masculino' o 'Femenino'").toUpperCase();
            genero[i] = Genero();
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite las notas del estudiantes"));
        }
    }
    // tomando una letra de genero
    public char Genero(){
        for (int i = 0; i < sexo.length(); i++) {
            if(sexo == "F" || sexo == "M"){
                palabra = sexo.charAt(i);
            }
        }
        return palabra;
    }
    // metodo burbuja
    public void Ordenar(){
        String OrdeNombre;
        char OrdeGenero;
        float OrdeNota;

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -1; j++) {
                if(nota[j]>nota[j +1]) {
                    // organizando los nombre
                    OrdeNombre = nombre[j];
                    nombre[j] = nombre[j +1];
                    nombre[j+1] = OrdeNombre;

                    // organizando los generos
                    OrdeGenero = genero[j];
                    genero[j] = genero[j+1];
                    genero[j+1] = OrdeGenero;

                    // organizar las notas
                    OrdeNota = nota[j];
                    nota[j] = nota[j+1];
                    nota[j+1] = OrdeNota;
                }
            }
        }
    }
    // promedio de las notas para
    public float PromedioNota() {
        float suma = 0;
        float promedio;

        for (int i = 0; i < nota.length; i++) {
            suma = suma + nota[i];
        }
        promedio = suma/n;

        return promedio;
    }

    // procentage de mujers que gano la materia
    public float ProcenMjMate(){
        float suma = 0;
        float procentage;

        for (int i = 0; i < n; i++){
            if(nota[i] >= 3.0 || nota[i] <= 5.0 && genero[i] == 'M'){
                suma = suma + nota[i];
            }
        }
        procentage = (suma * 100) / n;

        return procentage;
    }
    // promedio de nota de los hombre
    public float PromedioNotaHom() {
        float suma = 0;
        float promedio;

        for (int i = 0; i < nota.length; i++) {
            if(genero[i] == 'H'){
                suma = suma + nota[i];
            }
        }
        promedio = suma/n;

        return promedio;
    }
    // nota la notas mas alta || baja
    public void NotaAltaBaja() {
        for (int i = 0; i <nota.length;i++){
            if(nota[i+1]>nota[i]){
                JOptionPane.showMessageDialog(null,i+" la nota Mas alta es: "+nota[i]);
            }else if(nota[i]<nota[i+1] && i == 5){
                JOptionPane.showMessageDialog(null,i+" la nota Mas baja es: "+nota[i]);
            }
        }
    }
    // procentaje de hombre del curso
    public float ProcentajeHombre() {
        int conatdor = 0;
        float procentaje;

        for (char i : genero) {
            if(i == 'M'){
                conatdor++;
            }
        }
        procentaje = (conatdor * 100) / n;
        return procentaje;
    }
}
