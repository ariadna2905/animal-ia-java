package animal;

public class Animal {

    public static void main(String[] args) {
        ReptileTaxonomyBR taxonomy = new ReptileTaxonomyBR();
        String resultado;
        
        // Ejemplo de clasificación completa
        resultado = taxonomy.clasificarReptilCompleto(
            // Reino (R1-R6)
            "no",   // Unicelulares
            "no",   // Fotosíntesis
            "no",   // Esporas
            "no",   // Ambientes extremos
            "si",   // Movilidad activa
            
            // Filo (R7-R15)
            "no",   // Simetría radial
            "si",   // Tejidos verdaderos
            "si",   // Segmentación
            "si",   // Digestivo completo
            "si",   // Notocorda
            "no",   // Concha calcárea
            "no",   // Quetas
            
            // Clase (R16-R25)
            "no",   // Sangre Fría
            "si",   // Huevo Amniótico
            "si",   // Garras en los Dedos
            "si",   // Corazón de Tres Cámaras
            "si",   // Piel Seca o Escamosa
            "si",   // Mandíbulas
            "no",   // Aletas lobuladas
            "no",   // Radios óseos en aletas
            "si",   // Esqueleto óseo
            
            // Orden (R26-R29)
            "si",   // Fecundación Interna
            "si",   // Huevo Amniótico
            "no",   // Caparazón Óseo
            "si",   // Muda de Piel
            "si",   // Piel Seca o Escamosa
            "no",   // Tercer Ojo Parietal
            "no",   // Cuidado Parental
            
            // Familia (R30-R39)
            "no",   // Dientes Pleurodontes
            "si",   // Lengua corta y no bífida
            "si",   // Termorregulador
            "no",   // Escamas espinosas
            "no",   // Extremidades Reducidas
            "si",   // Ojos con parpados móviles
            "no",   // Pupilas verticales
            "no",   // Veneno Potente
            "si",   // Capacidad de autonomía caudal
            "si",   // Hábitos arborícolas
            "si",   // Carnívoros
            "si",   // Huevos con cáscara calcárea
            
            // Género (R50-R59)
            "no",   // Dos patas traseras
            "no",   // Ojos reducidos
            "no",   // Adaptado a excavar
            "si",   // Cuerpo alargado y cilíndrico
            "no",   // Sin patas
            "no",   // Venenoso
            "no",   // Piel con osteodermos
            "si",   // Lagartos con párpados móviles
            "no",   // Geckos
            "no",   // Espolones pelvicos
            "no",   // Escamas vertebrales en Hileras transversales
            "no",   // Escamas dorsales quilladas/espinosas
            
            // Especie (R104-R108)
            "si",   // Endémico de México
            "si",   // Península de Baja California
            "no",   // Estado de Guerrero
            "no",   // Estado de Michoacán
            "no",   // Chiapas / Guatemala
            "no",   // Hasta Costa Rica
            "si",   // Tamaño adulto (>24 cm)
            "no",   // Tamaño adulto (<18 cm)
            "no",   // Color uniforme oscuro (negruzco)
            "si"    // Coloración rosada pálida
        );
        
        System.out.println("Clasificación completa: " + resultado);
    }
}