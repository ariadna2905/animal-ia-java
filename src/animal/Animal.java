package animal;

public class Animal {

    public static void main(String[] args) {
        animalBR obr = new animalBR();
        String resultado;
        
        // Ejemplo 1: Identificar Bipes biporus (Lagarto topo mexicano)
        resultado = obr.identificarEspecie(
            "Animalia", "Chordata", "Reptilia", "Squamata", 
            "Amphisbaenidae", "Bipes", "2 patas delanteras", 
            "reducidos", "anilladas", "subterraneo"
        );
        System.out.println("Especie identificada: " + resultado);
        
        // Ejemplo 2: Identificar Iguana iguana
        resultado = obr.identificarEspecie(
            "Animalia", "Chordata", "Reptilia", "Squamata", 
            "Iguanidae", "Iguana", "4 patas desarrolladas", 
            "desarrollados", "quilladas", "arboricola"
        );
        System.out.println("Especie identificada: " + resultado);
    }
}