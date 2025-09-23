package animal;

<<<<<<< HEAD:src/main/java/animal/animalBR.java
import animal.rule.*;
=======
import Rule.*;

/*public class animalBR {

    // Base de reglas
    BooleanRuleBase br = new BooleanRuleBase("especies_reptiles");
    
    // Variables taxonómicas
    RuleVariable Reino;
    RuleVariable Filo;
    RuleVariable Clase;
    RuleVariable Orden;
    RuleVariable Familia;
    RuleVariable Genero;
    
    // Variables morfológicas
    RuleVariable Extremidades;
    RuleVariable Ojos;
    RuleVariable Escamas;
    RuleVariable Habitat;
    
    // Variables de resultado
    RuleVariable Especie;
    RuleVariable NombreComun;
    String resultadoEspecie;
    String resultadoNombreComun;

    public void BaseReglas() {
    }

    public String identificarEspecie(String reino, String filo, String clase, 
                                   String orden, String familia, String genero,
                                   String extremidades, String ojos, String escamas, 
                                   String habitat) {
        staterBR();
        Reino.setValue(reino);
        Filo.setValue(filo);
        Clase.setValue(clase);
        Orden.setValue(orden);
        Familia.setValue(familia);
        Genero.setValue(genero);
        Extremidades.setValue(extremidades);
        Ojos.setValue(ojos);
        Escamas.setValue(escamas);
        Habitat.setValue(habitat);

        br.forwardChain();
        resultadoEspecie = Especie.getValue();
        resultadoNombreComun = NombreComun.getValue();

        return resultadoEspecie + " - " + resultadoNombreComun;
    }

    public void staterBR() {
        // Instancias de variables de regla
        Reino = new RuleVariable(br, "Reino");
        Filo = new RuleVariable(br, "Filo");
        Clase = new RuleVariable(br, "Clase");
        Orden = new RuleVariable(br, "Orden");
        Familia = new RuleVariable(br, "Familia");
        Genero = new RuleVariable(br, "Genero");
        Extremidades = new RuleVariable(br, "Extremidades");
        Ojos = new RuleVariable(br, "Ojos");
        Escamas = new RuleVariable(br, "Escamas");
        Habitat = new RuleVariable(br, "Habitat");
        Especie = new RuleVariable(br, "Especie");
        NombreComun = new RuleVariable(br, "NombreComun");

        // Definición de operadores lógicos
        Condition igual = new Condition("=");

        // REGLAS PARA IDENTIFICACIÓN DE ESPECIES
        
        // Bipes biporus - Lagarto topo mexicano
        new Rule(br, "BIPES_BIPORUS",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(Genero, igual, "Bipes"),
                new Clause(Extremidades, igual, "2 patas delanteras"),
                new Clause(Ojos, igual, "reducidos"),
                new Clause(Escamas, igual, "anilladas"),
                new Clause(Habitat, igual, "subterraneo")
            },
            new Clause[]{new Clause(Especie, igual, "Bipes biporus"),
                        new Clause(NombreComun, igual, "Lagarto topo mexicano")});

        // Amphisbaena alba - Culebrilla ciega
        new Rule(br, "AMPHISBAENA_ALBA",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(Genero, igual, "Amphisbaena"),
                new Clause(Extremidades, igual, "ausentes"),
                new Clause(Ojos, igual, "reducidos"),
                new Clause(Escamas, igual, "anilladas"),
                new Clause(Habitat, igual, "subterraneo")
            },
            new Clause[]{new Clause(Especie, igual, "Amphisbaena alba"),
                        new Clause(NombreComun, igual, "Culebrilla ciega")});

        // Iguana iguana - Iguana verde
        new Rule(br, "IGUANA_IGUANA",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Genero, igual, "Iguana"),
                new Clause(Extremidades, igual, "4 patas desarrolladas"),
                new Clause(Ojos, igual, "desarrollados"),
                new Clause(Escamas, igual, "quilladas"),
                new Clause(Habitat, igual, "arboricola")
            },
            new Clause[]{new Clause(Especie, igual, "Iguana iguana"),
                        new Clause(NombreComun, igual, "Iguana verde")});

        // Crocodylus acutus - Cocodrilo americano
        new Rule(br, "CROCODYLUS_ACUTUS",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Crocodylia"),
                new Clause(Familia, igual, "Crocodylidae"),
                new Clause(Genero, igual, "Crocodylus"),
                new Clause(Extremidades, igual, "4 patas desarrolladas"),
                new Clause(Ojos, igual, "desarrollados"),
                new Clause(Escamas, igual, "osteodermos"),
                new Clause(Habitat, igual, "acuatico")
            },
            new Clause[]{new Clause(Especie, igual, "Crocodylus acutus"),
                        new Clause(NombreComun, igual, "Cocodrilo americano")});

        // Regla por defecto para reptiles no identificados
        new Rule(br, "REPTIL_NO_IDENTIFICADO",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia")
            },
            new Clause[]{new Clause(Especie, igual, "Desconocida"),
                        new Clause(NombreComun, igual, "Reptil no identificado")});
    }
}*/
//prueba
>>>>>>> 777d0e8657932a4b7dd0fdded53a534dbf0c386b:src/animal/animalBR.java

public class animalBR {

    // Base de reglas
    BooleanRuleBase br = new BooleanRuleBase("especies_reptiles");
    
    // Variables taxonómicas
    RuleVariable Reino;
    RuleVariable Filo;
    RuleVariable Clase;
    RuleVariable Orden;
    RuleVariable Familia;
    RuleVariable Subfamilia;
    RuleVariable Genero;
    
    // Variables morfológicas y de comportamiento
    RuleVariable Extremidades;
    RuleVariable Ojos;
    RuleVariable Escamas;
    RuleVariable Habitat;
    RuleVariable PatronColor;
    RuleVariable Tamano;
    RuleVariable Dieta;
    
    // Variables de resultado
    RuleVariable Especie;
    RuleVariable NombreComun;
    String resultadoEspecie;
    String resultadoNombreComun;

    public animalBR() {
        staterBR();
    }

    public String identificarEspecie(String reino, String filo, String clase, 
                                   String orden, String familia, String subfamilia,
                                   String genero, String extremidades, String ojos, 
                                   String escamas, String habitat, String patronColor,
                                   String tamano, String dieta) {
        
        // Establecer valores de entrada
        Reino.setValue(reino);
        Filo.setValue(filo);
        Clase.setValue(clase);
        Orden.setValue(orden);
        Familia.setValue(familia);
        Subfamilia.setValue(subfamilia);
        Genero.setValue(genero);
        Extremidades.setValue(extremidades);
        Ojos.setValue(ojos);
        Escamas.setValue(escamas);
        Habitat.setValue(habitat);
        PatronColor.setValue(patronColor);
        Tamano.setValue(tamano);
        Dieta.setValue(dieta);

        // Ejecutar inferencia
        br.forwardChain();
        
        // Obtener resultados
        resultadoEspecie = Especie.getValue();
        resultadoNombreComun = NombreComun.getValue();

        return resultadoEspecie + " - " + resultadoNombreComun;
    }

    private void staterBR() {
        // Inicializar variables de regla
        Reino = new RuleVariable(br, "Reino");
        Filo = new RuleVariable(br, "Filo");
        Clase = new RuleVariable(br, "Clase");
        Orden = new RuleVariable(br, "Orden");
        Familia = new RuleVariable(br, "Familia");
        Subfamilia = new RuleVariable(br, "Subfamilia");
        Genero = new RuleVariable(br, "Genero");
        Extremidades = new RuleVariable(br, "Extremidades");
        Ojos = new RuleVariable(br, "Ojos");
        Escamas = new RuleVariable(br, "Escamas");
        Habitat = new RuleVariable(br, "Habitat");
        PatronColor = new RuleVariable(br, "PatronColor");
        Tamano = new RuleVariable(br, "Tamano");
        Dieta = new RuleVariable(br, "Dieta");
        Especie = new RuleVariable(br, "Especie");
       // NombreComun = new RuleVariable(br, "NombreComun");

        Condition igual = new Condition("=");

        // ========== REGLAS PARA AMPHISBAENIDAE ==========
        
        // Bipes biporus - Lagarto topo mexicano
        new Rule(br, "BIPES_BIPORUS",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(Genero, igual, "Bipes"),
                new Clause(Extremidades, igual, "2 patas delanteras"),
                new Clause(Ojos, igual, "reducidos"),
                new Clause(Escamas, igual, "anilladas"),
                new Clause(Habitat, igual, "subterraneo"),
                new Clause(PatronColor, igual, "rosado palido")
            },
            new Clause[]{new Clause(Especie, igual, "Bipes biporus"),
                        new Clause(NombreComun, igual, "Lagarto topo mexicano")});

        /*// Amphisbaena alba - Culebrilla ciega
        new Rule(br, "AMPHISBAENA_ALBA",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(Genero, igual, "Amphisbaena"),
                new Clause(Extremidades, igual, "ausentes"),
                new Clause(Ojos, igual, "reducidos"),
                new Clause(Escamas, igual, "anilladas"),
                new Clause(Habitat, igual, "subterraneo"),
                new Clause(PatronColor, igual, "blanco rosaceo")
            },
            new Clause[]{new Clause(Especie, igual, "Amphisbaena alba"),
                        new Clause(NombreComun, igual, "Culebrilla ciega")});

        // ========== REGLAS PARA IGUANIDAE ==========
        
        // Iguana iguana - Iguana verde
        new Rule(br, "IGUANA_IGUANA",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Genero, igual, "Iguana"),
                new Clause(Extremidades, igual, "4 patas desarrolladas"),
                new Clause(Ojos, igual, "desarrollados"),
                new Clause(Escamas, igual, "quilladas"),
                new Clause(Habitat, igual, "arboricola"),
                new Clause(PatronColor, igual, "verde con bandas"),
                new Clause(Dieta, igual, "herbivora")
            },
            new Clause[]{new Clause(Especie, igual, "Iguana iguana"),
                        new Clause(NombreComun, igual, "Iguana verde")});

        // Ctenosaura similis - Iguana negra de cola espinosa
        new Rule(br, "CTENOSAURA_SIMILIS",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(Extremidades, igual, "4 patas desarrolladas"),
                new Clause(Ojos, igual, "desarrollados"),
                new Clause(Escamas, igual, "espinosas cola"),
                new Clause(Habitat, igual, "terrestre"),
                new Clause(PatronColor, igual, "gris oscuro"),
                new Clause(Dieta, igual, "omnivora")
            },
            new Clause[]{new Clause(Especie, igual, "Ctenosaura similis"),
                        new Clause(NombreComun, igual, "Iguana negra de cola espinosa")});

        // ========== REGLAS PARA CROCODYLIDAE ==========
        
        // Crocodylus acutus - Cocodrilo americano
        new Rule(br, "CROCODYLUS_ACUTUS",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Crocodylia"),
                new Clause(Familia, igual, "Crocodylidae"),
                new Clause(Genero, igual, "Crocodylus"),
                new Clause(Extremidades, igual, "4 patas desarrolladas"),
                new Clause(Ojos, igual, "desarrollados"),
                new Clause(Escamas, igual, "osteodermos"),
                new Clause(Habitat, igual, "acuatico"),
                new Clause(PatronColor, igual, "verde oliva"),
                new Clause(Tamano, igual, "grande")
            },
            new Clause[]{new Clause(Especie, igual, "Crocodylus acutus"),
                        new Clause(NombreComun, igual, "Cocodrilo americano")});

        // ========== REGLAS PARA GEKKONIDAE ==========
        
        // Hemidactylus frenatus - Gecko casero
        new Rule(br, "HEMIDACTYLUS_FRENATUS",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Gekkonidae"),
                new Clause(Genero, igual, "Hemidactylus"),
                new Clause(Extremidades, igual, "4 patas con lamellas"),
                new Clause(Ojos, igual, "desarrollados"),
                new Clause(Escamas, igual, "granulares"),
                new Clause(Habitat, igual, "domestico"),
                new Clause(PatronColor, igual, "gris claro"),
                new Clause(Tamano, igual, "pequeno")
            },
            new Clause[]{new Clause(Especie, igual, "Hemidactylus frenatus"),
                        new Clause(NombreComun, igual, "Gecko casero")});

        // ========== REGLAS PARA VIPERIDAE ==========
        
        // Bothrops asper - Terciopelo
        new Rule(br, "BOTHROPS_ASPER",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Squamata"),
                new Clause(Familia, igual, "Viperidae"),
                new Clause(Subfamilia, igual, "Crotalinae"),
                new Clause(Genero, igual, "Bothrops"),
                new Clause(Extremidades, igual, "ausentes"),
                new Clause(Ojos, igual, "desarrollados"),
                new Clause(Escamas, igual, "quilladas"),
                new Clause(Habitat, igual, "tropical"),
                new Clause(PatronColor, igual, "patron X"),
                new Clause(Dieta, igual, "carnivora")
            },
            new Clause[]{new Clause(Especie, igual, "Bothrops asper"),
                        new Clause(NombreComun, igual, "Terciopelo")});

        // ========== REGLAS PARA TESTUDINIDAE ==========
        
        // Chelonoidis carbonarius - Morrocoy
        new Rule(br, "CHELONOIDIS_CARBONARIUS",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia"),
                new Clause(Orden, igual, "Testudines"),
                new Clause(Familia, igual, "Testudinidae"),
                new Clause(Genero, igual, "Chelonoidis"),
                new Clause(Extremidades, igual, "4 patas cortas"),
                new Clause(Ojos, igual, "desarrollados"),
                new Clause(Escamas, igual, "caparazon"),
                new Clause(Habitat, igual, "terrestre"),
                new Clause(PatronColor, igual, "negro amarillo"),
                new Clause(Dieta, igual, "herbivora")
            },
            new Clause[]{new Clause(Especie, igual, "Chelonoidis carbonarius"),
                        new Clause(NombreComun, igual, "Morrocoy")});
/* */
        // Regla por defecto para reptiles no identificados
        new Rule(br, "REPTIL_NO_IDENTIFICADO",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(Filo, igual, "Chordata"),
                new Clause(Clase, igual, "Reptilia")
            },
            new Clause[]{new Clause(Especie, igual, "Desconocida"),
                        new Clause(NombreComun, igual, "Reptil no identificado")});
    }
    //QUITAR 
    // Método para obtener resultados individuales
    public String getEspecie() {
        return resultadoEspecie;
    }

    public String getNombreComun() {
        return resultadoNombreComun;
    }
}