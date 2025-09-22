package animal;

import java.util.concurrent.locks.Condition;
import Rule.*;

public class ReptileTaxonomyBR {

    BooleanRuleBase br = new BooleanRuleBase("reptileTaxonomy");
    
    // Variables para todos los niveles taxonómicos
    // REINO
    RuleVariable Unicelulares, Fotosintesis, Esporas, AmbientesExtremos, MovilidadActiva;
    RuleVariable Reino;
    
    // FILO
    RuleVariable SimetriaRadial, TejidosVerdaderos, Segmentacion, DigestivoCompleto;
    RuleVariable Notocorda, ConchaCalcarea, Quetas;
    RuleVariable Filo;
    
    // CLASE
    RuleVariable SangreFria, HuevoAmniotico, GarrasDedos, CorazonTresCamaras;
    RuleVariable PielSecaEscamosa, Mandibulas, AletasLobuladas, RadiosOseosAletas, EsqueletoOseo;
    RuleVariable Clase;
    
    // ORDEN
    RuleVariable FecundacionInterna, CaparazonOseo, MudaPiel, TercerOjoParietal, CuidadoParental;
    RuleVariable Orden;
    
    // FAMILIA
    RuleVariable DientesPleurodontes, LenguaCortaNoBifida, Termorregulador;
    RuleVariable EscamasEspinosas, ExtremidadesReducidas, OjosParpadosMoviles;
    RuleVariable PupilasVerticales, VenenoPotente, AutotomiaCaudal, HabitosArboricolas;
    RuleVariable Carnivoros, HuevosCascaraCalcarea;
    // VARIABLES PARA TESTUDINES (R40-R49)
    RuleVariable Marino, Terrestre, EscudosAusentes, CaparazonAlto, CaparazonAplanado;
    RuleVariable CabezaGrandeAlargada, HabitatPrincipalUSA, HabitatPrincipalAustralia;
    RuleVariable Familia;
    
    // GÉNERO
    RuleVariable DosPatasTraseras, OjosReducidos, AdaptadoExcavar, CuerpoAlargadoCilindrico;
    RuleVariable SinPatas, Venenoso, PielOsteodermos, LagartosParpadosMoviles, Geckos;
    RuleVariable EspolonesPelvicos, EscamasVertHilerasTransv, EscamasDorsalesQuilladas;
    RuleVariable Genero;
    
    // ESPECIE
    RuleVariable EndemicoMexico, PeninsulaBajaCalifornia, EstadoGuerrero, EstadoMichoacan;
    RuleVariable ChiapasGuatemala, HastaCostaRica, TamanoAdulto24cm, TamanoAdulto18cm;
    RuleVariable ColorUniformeOscuro, ColoracionRosadaPalida;
    RuleVariable Especie;
    
    String resultadoClasificacion;

    public String clasificarReptilCompleto(
        // Parámetros Reino
        String unicelulares, String fotosintesis, String esporas, 
        String ambientesExtremos, String movilidadActiva,
        
        // Parámetros Filo
        String simetriaRadial, String tejidosVerdaderos, String segmentacion,
        String digestivoCompleto, String notocorda, String conchaCalcarea, String quetas,
        
        // Parámetros Clase
        String sangreFria, String huevoAmniotico, String garrasDedos, String corazonTresCamaras,
        String pielSecaEscamosa, String mandibulas, String aletasLobuladas, 
        String radiosOseosAletas, String esqueletoOseo,
        
        // Parámetros Orden
        String fecundacionInterna, String huevoAmnioticoOrd, String caparazonOseo, 
        String mudaPiel, String pielSecaEscamosaOrd, String tercerOjoParietal, String cuidadoParental,
        
        // Parámetros Familia
        String dientesPleurodontes, String lenguaCortaNoBifida, String termorregulador,
        String escamasEspinosas, String extremidadesReducidas, String ojosParpadosMoviles,
        String pupilasVerticales, String venenoPotente, String autotomiaCaudal, 
        String habitosArboricolas, String carnivoros, String huevosCascaraCalcarea,
        
        // Parámetros Testudines (R40-R49)
        String marino, String terrestre, String escudosAusentes, 
        String caparazonAlto, String caparazonAplanado, String cabezaGrandeAlargada,
        String habitatPrincipalUSA, String habitatPrincipalAustralia,
        
        // Parámetros Género
        String dosPatasTraseras, String ojosReducidos, String adaptadoExcavar, 
        String cuerpoAlargadoCilindrico, String sinPatas, String venenoso, 
        String pielOsteodermos, String lagartosParpadosMoviles, String geckos,
        String espolonesPelvicos, String escamasVertHilerasTransv, String escamasDorsalesQuilladas,
        
        // Parámetros Especie
        String endemicoMexico, String peninsulaBajaCalifornia, String estadoGuerrero,
        String estadoMichoacan, String chiapasGuatemala, String hastaCostaRica,
        String tamanoAdulto24cm, String tamanoAdulto18cm, String colorUniformeOscuro,
        String coloracionRosadaPalida) {
        
        inicializarBR();
        
        // Establecer valores REINO
        Unicelulares.setValue(unicelulares);
        Fotosintesis.setValue(fotosintesis);
        Esporas.setValue(esporas);
        AmbientesExtremos.setValue(ambientesExtremos);
        MovilidadActiva.setValue(movilidadActiva);
        
        // Establecer valores FILO
        SimetriaRadial.setValue(simetriaRadial);
        TejidosVerdaderos.setValue(tejidosVerdaderos);
        Segmentacion.setValue(segmentacion);
        DigestivoCompleto.setValue(digestivoCompleto);
        Notocorda.setValue(notocorda);
        ConchaCalcarea.setValue(conchaCalcarea);
        Quetas.setValue(quetas);
        
        // Establecer valores CLASE
        SangreFria.setValue(sangreFria);
        HuevoAmniotico.setValue(huevoAmniotico);
        GarrasDedos.setValue(garrasDedos);
        CorazonTresCamaras.setValue(corazonTresCamaras);
        PielSecaEscamosa.setValue(pielSecaEscamosa);
        Mandibulas.setValue(mandibulas);
        AletasLobuladas.setValue(aletasLobuladas);
        RadiosOseosAletas.setValue(radiosOseosAletas);
        EsqueletoOseo.setValue(esqueletoOseo);
        
        // Establecer valores ORDEN
        FecundacionInterna.setValue(fecundacionInterna);
        HuevoAmniotico.setValue(huevoAmnioticoOrd);
        CaparazonOseo.setValue(caparazonOseo);
        MudaPiel.setValue(mudaPiel);
        PielSecaEscamosa.setValue(pielSecaEscamosaOrd);
        TercerOjoParietal.setValue(tercerOjoParietal);
        CuidadoParental.setValue(cuidadoParental);
        
        // Establecer valores FAMILIA
        DientesPleurodontes.setValue(dientesPleurodontes);
        LenguaCortaNoBifida.setValue(lenguaCortaNoBifida);
        Termorregulador.setValue(termorregulador);
        EscamasEspinosas.setValue(escamasEspinosas);
        ExtremidadesReducidas.setValue(extremidadesReducidas);
        OjosParpadosMoviles.setValue(ojosParpadosMoviles);
        PupilasVerticales.setValue(pupilasVerticales);
        VenenoPotente.setValue(venenoPotente);
        AutotomiaCaudal.setValue(autotomiaCaudal);
        HabitosArboricolas.setValue(habitosArboricolas);
        Carnivoros.setValue(carnivoros);
        HuevosCascaraCalcarea.setValue(huevosCascaraCalcarea);
        
        // Establecer valores para Testudines (R40-R49)
        Marino.setValue(marino);
        Terrestre.setValue(terrestre);
        EscudosAusentes.setValue(escudosAusentes);
        CaparazonAlto.setValue(caparazonAlto);
        CaparazonAplanado.setValue(caparazonAplanado);
        CabezaGrandeAlargada.setValue(cabezaGrandeAlargada);
        HabitatPrincipalUSA.setValue(habitatPrincipalUSA);
        HabitatPrincipalAustralia.setValue(habitatPrincipalAustralia);
        
        // Establecer valores GÉNERO
        DosPatasTraseras.setValue(dosPatasTraseras);
        OjosReducidos.setValue(ojosReducidos);
        AdaptadoExcavar.setValue(adaptadoExcavar);
        CuerpoAlargadoCilindrico.setValue(cuerpoAlargadoCilindrico);
        SinPatas.setValue(sinPatas);
        Venenoso.setValue(venenoso);
        PielOsteodermos.setValue(pielOsteodermos);
        LagartosParpadosMoviles.setValue(lagartosParpadosMoviles);
        Geckos.setValue(geckos);
        EspolonesPelvicos.setValue(espolonesPelvicos);
        EscamasVertHilerasTransv.setValue(escamasVertHilerasTransv);
        EscamasDorsalesQuilladas.setValue(escamasDorsalesQuilladas);
        
        // Establecer valores ESPECIE
        EndemicoMexico.setValue(endemicoMexico);
        PeninsulaBajaCalifornia.setValue(peninsulaBajaCalifornia);
        EstadoGuerrero.setValue(estadoGuerrero);
        EstadoMichoacan.setValue(estadoMichoacan);
        ChiapasGuatemala.setValue(chiapasGuatemala);
        HastaCostaRica.setValue(hastaCostaRica);
        TamanoAdulto24cm.setValue(tamanoAdulto24cm);
        TamanoAdulto18cm.setValue(tamanoAdulto18cm);
        ColorUniformeOscuro.setValue(colorUniformeOscuro);
        ColoracionRosadaPalida.setValue(coloracionRosadaPalida);

        br.forwardChain();
        
        resultadoClasificacion = "Reino: " + Reino.getValue() + 
                                " | Filo: " + Filo.getValue() + 
                                " | Clase: " + Clase.getValue() + 
                                " | Orden: " + Orden.getValue() + 
                                " | Familia: " + Familia.getValue() + 
                                " | Género: " + Genero.getValue() + 
                                " | Especie: " + Especie.getValue();

        return resultadoClasificacion;
    }

    public void inicializarBR() {
        // Instancias de todas las variables
        // REINO
        Unicelulares = new RuleVariable(br, "Unicelulares");
        Fotosintesis = new RuleVariable(br, "Fotosintesis");
        Esporas = new RuleVariable(br, "Esporas");
        AmbientesExtremos = new RuleVariable(br, "AmbientesExtremos");
        MovilidadActiva = new RuleVariable(br, "MovilidadActiva");
        Reino = new RuleVariable(br, "Reino");
        
        // FILO
        SimetriaRadial = new RuleVariable(br, "SimetriaRadial");
        TejidosVerdaderos = new RuleVariable(br, "TejidosVerdaderos");
        Segmentacion = new RuleVariable(br, "Segmentacion");
        DigestivoCompleto = new RuleVariable(br, "DigestivoCompleto");
        Notocorda = new RuleVariable(br, "Notocorda");
        ConchaCalcarea = new RuleVariable(br, "ConchaCalcarea");
        Quetas = new RuleVariable(br, "Quetas");
        Filo = new RuleVariable(br, "Filo");
        
        // CLASE
        SangreFria = new RuleVariable(br, "SangreFria");
        HuevoAmniotico = new RuleVariable(br, "HuevoAmniotico");
        GarrasDedos = new RuleVariable(br, "GarrasDedos");
        CorazonTresCamaras = new RuleVariable(br, "CorazonTresCamaras");
        PielSecaEscamosa = new RuleVariable(br, "PielSecaEscamosa");
        Mandibulas = new RuleVariable(br, "Mandibulas");
        AletasLobuladas = new RuleVariable(br, "AletasLobuladas");
        RadiosOseosAletas = new RuleVariable(br, "RadiosOseosAletas");
        EsqueletoOseo = new RuleVariable(br, "EsqueletoOseo");
        Clase = new RuleVariable(br, "Clase");
        
        // ORDEN
        FecundacionInterna = new RuleVariable(br, "FecundacionInterna");
        CaparazonOseo = new RuleVariable(br, "CaparazonOseo");
        MudaPiel = new RuleVariable(br, "MudaPiel");
        TercerOjoParietal = new RuleVariable(br, "TercerOjoParietal");
        CuidadoParental = new RuleVariable(br, "CuidadoParental");
        Orden = new RuleVariable(br, "Orden");
        
        // FAMILIA
        DientesPleurodontes = new RuleVariable(br, "DientesPleurodontes");
        LenguaCortaNoBifida = new RuleVariable(br, "LenguaCortaNoBifida");
        Termorregulador = new RuleVariable(br, "Termorregulador");
        EscamasEspinosas = new RuleVariable(br, "EscamasEspinosas");
        ExtremidadesReducidas = new RuleVariable(br, "ExtremidadesReducidas");
        OjosParpadosMoviles = new RuleVariable(br, "OjosParpadosMoviles");
        PupilasVerticales = new RuleVariable(br, "PupilasVerticales");
        VenenoPotente = new RuleVariable(br, "VenenoPotente");
        AutotomiaCaudal = new RuleVariable(br, "AutotomiaCaudal");
        HabitosArboricolas = new RuleVariable(br, "HabitosArboricolas");
        Carnivoros = new RuleVariable(br, "Carnivoros");
        HuevosCascaraCalcarea = new RuleVariable(br, "HuevosCascaraCalcarea");
        Familia = new RuleVariable(br, "Familia");
        
        // Variables para Testudines (R40-R49)
        Marino = new RuleVariable(br, "Marino");
        Terrestre = new RuleVariable(br, "Terrestre");
        EscudosAusentes = new RuleVariable(br, "EscudosAusentes");
        CaparazonAlto = new RuleVariable(br, "CaparazonAlto");
        CaparazonAplanado = new RuleVariable(br, "CaparazonAplanado");
        CabezaGrandeAlargada = new RuleVariable(br, "CabezaGrandeAlargada");
        HabitatPrincipalUSA = new RuleVariable(br, "HabitatPrincipalUSA");
        HabitatPrincipalAustralia = new RuleVariable(br, "HabitatPrincipalAustralia");
        
        // GÉNERO
        DosPatasTraseras = new RuleVariable(br, "DosPatasTraseras");
        OjosReducidos = new RuleVariable(br, "OjosReducidos");
        AdaptadoExcavar = new RuleVariable(br, "AdaptadoExcavar");
        CuerpoAlargadoCilindrico = new RuleVariable(br, "CuerpoAlargadoCilindrico");
        SinPatas = new RuleVariable(br, "SinPatas");
        Venenoso = new RuleVariable(br, "Venenoso");
        PielOsteodermos = new RuleVariable(br, "PielOsteodermos");
        LagartosParpadosMoviles = new RuleVariable(br, "LagartosParpadosMoviles");
        Geckos = new RuleVariable(br, "Geckos");
        EspolonesPelvicos = new RuleVariable(br, "EspolonesPelvicos");
        EscamasVertHilerasTransv = new RuleVariable(br, "EscamasVertHilerasTransv");
        EscamasDorsalesQuilladas = new RuleVariable(br, "EscamasDorsalesQuilladas");
        Genero = new RuleVariable(br, "Genero");
        
        // ESPECIE
        EndemicoMexico = new RuleVariable(br, "EndemicoMexico");
        PeninsulaBajaCalifornia = new RuleVariable(br, "PeninsulaBajaCalifornia");
        EstadoGuerrero = new RuleVariable(br, "EstadoGuerrero");
        EstadoMichoacan = new RuleVariable(br, "EstadoMichoacan");
        ChiapasGuatemala = new RuleVariable(br, "ChiapasGuatemala");
        HastaCostaRica = new RuleVariable(br, "HastaCostaRica");
        TamanoAdulto24cm = new RuleVariable(br, "TamanoAdulto24cm");
        TamanoAdulto18cm = new RuleVariable(br, "TamanoAdulto18cm");
        ColorUniformeOscuro = new RuleVariable(br, "ColorUniformeOscuro");
        ColoracionRosadaPalida = new RuleVariable(br, "ColoracionRosadaPalida");
        Especie = new RuleVariable(br, "Especie");

        // Definición de operadores lógicos
        Condition igual = new Condition("=");

        // REGLAS DE CLASIFICACIÓN
        // REINO (R1-R6)
        Rule r1 = new Rule(br, "R1_Eubacteria",
            new Clause[]{
                new Clause(Unicelulares, igual, "si"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Eubacteria"));

        Rule r2 = new Rule(br, "R2_Plantae",
            new Clause[]{
                new Clause(Unicelulares, igual, "no"),
                new Clause(Fotosintesis, igual, "si"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Plantae"));

        Rule r3 = new Rule(br, "R3_Animalia",
            new Clause[]{
                new Clause(Unicelulares, igual, "no"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "si")
            }, new Clause(Reino, igual, "Animalia"));

        Rule r4 = new Rule(br, "R4_Archaea",
            new Clause[]{
                new Clause(Unicelulares, igual, "si"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "si"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Archaea"));

        Rule r5 = new Rule(br, "R5_Eukarya",
            new Clause[]{
                new Clause(Unicelulares, igual, "no"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "no"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "si")
            }, new Clause(Reino, igual, "Eukarya"));

        Rule r6 = new Rule(br, "R6_Fungi",
            new Clause[]{
                new Clause(Unicelulares, igual, "no"),
                new Clause(Fotosintesis, igual, "no"),
                new Clause(Esporas, igual, "si"),
                new Clause(AmbientesExtremos, igual, "no"),
                new Clause(MovilidadActiva, igual, "no")
            }, new Clause(Reino, igual, "Fungi"));

        // FILO (R7-R15)
        Rule r7 = new Rule(br, "R7_Mollusca",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "si"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Mollusca"));

        Rule r8 = new Rule(br, "R8_Arthropoda",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "si"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Arthropoda"));

        Rule r9 = new Rule(br, "R9_Platyhelminthes",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "no"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Platyhelminthes"));

        Rule r10 = new Rule(br, "R10_Nematoda",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Nematoda"));

        Rule r11 = new Rule(br, "R11_Chordata",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "si"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "si"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Chordata"));

        Rule r12 = new Rule(br, "R12_Annelida",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "si"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "si")
            }, new Clause(Filo, igual, "Annelida"));

        Rule r13 = new Rule(br, "R13_Cnidaria",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "si"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "no"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Cnidaria"));

        Rule r14 = new Rule(br, "R14_Echinodermata",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "si"),
                new Clause(TejidosVerdaderos, igual, "si"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "si"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Echinodermata"));

        Rule r15 = new Rule(br, "R15_Porifera",
            new Clause[]{
                new Clause(Reino, igual, "Animalia"),
                new Clause(SimetriaRadial, igual, "no"),
                new Clause(TejidosVerdaderos, igual, "no"),
                new Clause(Segmentacion, igual, "no"),
                new Clause(DigestivoCompleto, igual, "no"),
                new Clause(Notocorda, igual, "no"),
                new Clause(ConchaCalcarea, igual, "no"),
                new Clause(Quetas, igual, "no")
            }, new Clause(Filo, igual, "Porifera"));

        // Reglas CLASE (R16-R18, R20-R25)
        Rule r16 = new Rule(br, "R16_Agnatha",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "no"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Agnatha"));

        Rule r17 = new Rule(br, "R17_Chondrichthyes",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "no")
            }, new Clause(Clase, igual, "Chondrichthyes"));

        Rule r18 = new Rule(br, "R18_Osteichthyes",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "si"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Osteichthyes"));
            
        // CLASE Reptilia (R16-R25)
        Rule r19 = new Rule(br, "R19_Reptilia",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(GarrasDedos, igual, "si"),
                new Clause(CorazonTresCamaras, igual, "si"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Reptilia"));

            Rule r20 = new Rule(br, "R20_Amphibia",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "si"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Amphibia"));

        Rule r21 = new Rule(br, "R21_Aves",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "no"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(GarrasDedos, igual, "si"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Aves"));

        Rule r22 = new Rule(br, "R22_Mammalia",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "no"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(GarrasDedos, igual, "si"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Mammalia"));

        Rule r23 = new Rule(br, "R23_Sarcopterygii",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "si"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Sarcopterygii"));

        Rule r24 = new Rule(br, "R24_Actinopterygii",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(Mandibulas, igual, "si"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "si"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Actinopterygii"));

        Rule r25 = new Rule(br, "R25_Cephalaspidomorphi",
            new Clause[]{
                new Clause(Filo, igual, "Chordata"),
                new Clause(SangreFria, igual, "si"),
                new Clause(HuevoAmniotico, igual, "no"),
                new Clause(GarrasDedos, igual, "no"),
                new Clause(CorazonTresCamaras, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "no"),
                new Clause(Mandibulas, igual, "no"),
                new Clause(AletasLobuladas, igual, "no"),
                new Clause(RadiosOseosAletas, igual, "no"),
                new Clause(EsqueletoOseo, igual, "si")
            }, new Clause(Clase, igual, "Cephalaspidomorphi"));
            
        // ORDEN Squamata (R26-R29)
        Rule r26 = new Rule(br, "R26_Squamata",
            new Clause[]{
                new Clause(Clase, igual, "Reptilia"),
                new Clause(FecundacionInterna, igual, "si"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(CaparazonOseo, igual, "no"),
                new Clause(MudaPiel, igual, "si"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(TercerOjoParietal, igual, "no"),
                new Clause(CuidadoParental, igual, "no")
            }, new Clause(Orden, igual, "Squamata"));

        Rule r27 = new Rule(br, "R27_Rhynchocephalia",
            new Clause[]{
                new Clause(Clase, igual, "Reptilia"),
                new Clause(FecundacionInterna, igual, "si"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(CaparazonOseo, igual, "no"),
                new Clause(MudaPiel, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(TercerOjoParietal, igual, "si"),
                new Clause(CuidadoParental, igual, "no")
            }, new Clause(Orden, igual, "Rhynchocephalia"));

        Rule r28 = new Rule(br, "R28_Crocodylia",
            new Clause[]{
                new Clause(Clase, igual, "Reptilia"),
                new Clause(FecundacionInterna, igual, "si"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(CaparazonOseo, igual, "no"),
                new Clause(MudaPiel, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(TercerOjoParietal, igual, "no"),
                new Clause(CuidadoParental, igual, "si")
            }, new Clause(Orden, igual, "Crocodylia"));

        Rule r29 = new Rule(br, "R29_Testudines",
            new Clause[]{
                new Clause(Clase, igual, "Reptilia"),
                new Clause(FecundacionInterna, igual, "si"),
                new Clause(HuevoAmniotico, igual, "si"),
                new Clause(CaparazonOseo, igual, "si"),
                new Clause(MudaPiel, igual, "no"),
                new Clause(PielSecaEscamosa, igual, "si"),
                new Clause(TercerOjoParietal, igual, "no"),
                new Clause(CuidadoParental, igual, "no")
            }, new Clause(Orden, igual, "Testudines"));

        // Reglas FAMILIA (R30-R33, R35-R39)
        Rule r30 = new Rule(br, "R30_Elapidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "si"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Elapidae"));

        Rule r31 = new Rule(br, "R31_Gekkonidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "no"),
                new Clause(PupilasVerticales, igual, "si"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "si"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Gekkonidae"));

        Rule r32 = new Rule(br, "R32_Varanidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "si"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Varanidae"));

        Rule r33 = new Rule(br, "R33_Anguidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "si"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "si"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Anguidae"));

        // FAMILIA Amphisbaenidae (R30-R39)
        Rule r34 = new Rule(br, "R34_Amphisbaenidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "si"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "si"),
                new Clause(OjosParpadosMoviles, igual, "no"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "si"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Amphisbaenidae"));

        Rule r35 = new Rule(br, "R35_Iguanidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "si"),
                new Clause(EscamasEspinosas, igual, "si"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "si"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Carnivoros, igual, "no"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Iguanidae"));

        Rule r36 = new Rule(br, "R36_Dactyloidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "si"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "no"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "no"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Dactyloidae"));

        Rule r37 = new Rule(br, "R37_Boidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "si"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Boidae"));

        Rule r38 = new Rule(br, "R38_Viperidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "si"),
                new Clause(VenenoPotente, igual, "si"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Viperidae"));

        Rule r39 = new Rule(br, "R39_Chamaelenidae",
            new Clause[]{
                new Clause(Orden, igual, "Squamata"),
                new Clause(DientesPleurodontes, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(Termorregulador, igual, "no"),
                new Clause(EscamasEspinosas, igual, "no"),
                new Clause(ExtremidadesReducidas, igual, "no"),
                new Clause(OjosParpadosMoviles, igual, "si"),
                new Clause(PupilasVerticales, igual, "no"),
                new Clause(VenenoPotente, igual, "no"),
                new Clause(AutotomiaCaudal, igual, "no"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Carnivoros, igual, "si"),
                new Clause(HuevosCascaraCalcarea, igual, "si")
            }, new Clause(Familia, igual, "Chamaelenidae"));

        Rule r40 = new Rule(br, "R40_Cheloniidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "si"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Cheloniidae"));

        Rule r41 = new Rule(br, "R41_Dermochelyidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "si"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "si"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Dermochelyidae"));

        Rule r42 = new Rule(br, "R42_Chelydridae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Chelydridae"));

        Rule r43 = new Rule(br, "R43_Trionychidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "si"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Trionychidae"));

        Rule r44 = new Rule(br, "R44_Carettochelyidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "si")
            }, new Clause(Familia, igual, "Carettochelyidae"));

        Rule r45 = new Rule(br, "R45_Kinosternidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Kinosternidae"));

        Rule r46 = new Rule(br, "R46_Emydidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "si"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "si"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Emydidae"));

        Rule r47 = new Rule(br, "R47_Geoemydidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "si"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Geoemydidae"));

        Rule r48 = new Rule(br, "R48_Testudinidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "si"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(CabezaGrandeAlargada, igual, "no"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Testudinidae"));

        Rule r49 = new Rule(br, "R49_Platysternidae",
            new Clause[]{
                new Clause(Orden, igual, "Testudines"),
                new Clause(Marino, igual, "no"),
                new Clause(Terrestre, igual, "no"),
                new Clause(EscudosAusentes, igual, "no"),
                new Clause(CaparazonAlto, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(CabezaGrandeAlargada, igual, "si"),
                new Clause(HabitatPrincipalUSA, igual, "no"),
                new Clause(HabitatPrincipalAustralia, igual, "no")
            }, new Clause(Familia, igual, "Platysternidae"));

        Rule r50 = new Rule(br, "R50_Colubridae",
            new Clause[]{
                new Clause(Familia, igual, "Colubridae"), // Nota: Esto parece un error en la tabla original
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(SinPatas, igual, "si"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Colubridae"));

        Rule r51 = new Rule(br, "R51_Boidae",
            new Clause[]{
                new Clause(Familia, igual, "Boidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(SinPatas, igual, "si"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "si"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Boidae"));

        Rule r52 = new Rule(br, "R52_Viperidae",
            new Clause[]{
                new Clause(Familia, igual, "Viperidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(SinPatas, igual, "si"),
                new Clause(Venenoso, igual, "si"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Viperidae"));

        Rule r53 = new Rule(br, "R53_Gekkonidae",
            new Clause[]{
                new Clause(Familia, igual, "Gekkonidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "si"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "si"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Gekkonidae"));

        Rule r54 = new Rule(br, "R54_Scincidae",
            new Clause[]{
                new Clause(Familia, igual, "Scincidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Scincidae"));

        Rule r55 = new Rule(br, "R55_Teiidae",
            new Clause[]{
                new Clause(Familia, igual, "Teiidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "si"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Teiidae"));

        Rule r56 = new Rule(br, "R56_Lacertidae",
            new Clause[]{
                new Clause(Familia, igual, "Lacertidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Lacertidae"));

        Rule r57 = new Rule(br, "R57_Helodermatidae",
            new Clause[]{
                new Clause(Familia, igual, "Helodermatidae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "si"),
                new Clause(PielOsteodermos, igual, "si"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Helodermatidae"));

        Rule r58 = new Rule(br, "R58_Tropiduridae",
            new Clause[]{
                new Clause(Familia, igual, "Tropiduridae"),
                new Clause(DosPatasTraseras, igual, "no"),
                new Clause(OjosReducidos, igual, "no"),
                new Clause(AdaptadoExcavar, igual, "no"),
                new Clause(CuerpoAlargadoCilindrico, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "si"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "si")
            }, new Clause(Genero, igual, "Tropiduridae"));

        // GÉNERO Bipes (R50-R59)
        Rule r59 = new Rule(br, "R59_Bipes",
            new Clause[]{
                new Clause(Familia, igual, "Amphisbaenidae"),
                new Clause(DosPatasTraseras, igual, "si"),
                new Clause(OjosReducidos, igual, "si"),
                new Clause(AdaptadoExcavar, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(SinPatas, igual, "no"),
                new Clause(Venenoso, igual, "no"),
                new Clause(PielOsteodermos, igual, "no"),
                new Clause(LagartosParpadosMoviles, igual, "no"),
                new Clause(Geckos, igual, "no"),
                new Clause(EspolonesPelvicos, igual, "no"),
                new Clause(EscamasVertHilerasTransv, igual, "no"),
                new Clause(EscamasDorsalesQuilladas, igual, "no")
            }, new Clause(Genero, igual, "Bipes"));

        // ESPECIE Bipes biporus (R104-R108)
        Rule r104 = new Rule(br, "R104_Bipes_biporus",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "si"),
                new Clause(PeninsulaBajaCalifornia, igual, "si"),
                new Clause(EstadoGuerrero, igual, "no"),
                new Clause(EstadoMichoacan, igual, "no"),
                new Clause(ChiapasGuatemala, igual, "no"),
                new Clause(HastaCostaRica, igual, "no"),
                new Clause(TamanoAdulto24cm, igual, "si"),
                new Clause(TamanoAdulto18cm, igual, "no"),
                new Clause(ColorUniformeOscuro, igual, "no"),
                new Clause(ColoracionRosadaPalida, igual, "si")
            }, new Clause(Especie, igual, "Bipes biporus"));

        Rule r105 = new Rule(br, "R105_Bipes_canaliculatus",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "si"),
                new Clause(PeninsulaBajaCalifornia, igual, "no"),
                new Clause(EstadoGuerrero, igual, "si"),
                new Clause(EstadoMichoacan, igual, "no"),
                new Clause(ChiapasGuatemala, igual, "no"),
                new Clause(HastaCostaRica, igual, "no"),
                new Clause(TamanoAdulto24cm, igual, "no"),
                new Clause(TamanoAdulto18cm, igual, "si"),
                new Clause(ColorUniformeOscuro, igual, "no"),
                new Clause(ColoracionRosadaPalida, igual, "no")
            }, new Clause(Especie, igual, "Bipes canaliculatus"));

        Rule r106 = new Rule(br, "R106_Bipes_tridactylus",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "si"),
                new Clause(PeninsulaBajaCalifornia, igual, "no"),
                new Clause(EstadoGuerrero, igual, "si"),
                new Clause(EstadoMichoacan, igual, "si"),
                new Clause(ChiapasGuatemala, igual, "no"),
                new Clause(HastaCostaRica, igual, "no"),
                new Clause(TamanoAdulto24cm, igual, "no"),
                new Clause(TamanoAdulto18cm, igual, "no"),
                new Clause(ColorUniformeOscuro, igual, "no"),
                new Clause(ColoracionRosadaPalida, igual, "no")
            }, new Clause(Especie, igual, "Bipes tridactylus"));

        Rule r107 = new Rule(br, "R107_Bipes_alvarezi",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "no"),
                new Clause(PeninsulaBajaCalifornia, igual, "si"),
                new Clause(EstadoGuerrero, igual, "no"),
                new Clause(EstadoMichoacan, igual, "no"),
                new Clause(ChiapasGuatemala, igual, "si"),
                new Clause(HastaCostaRica, igual, "no"),
                new Clause(TamanoAdulto24cm, igual, "no"),
                new Clause(TamanoAdulto18cm, igual, "no"),
                new Clause(ColorUniformeOscuro, igual, "no"),
                new Clause(ColoracionRosadaPalida, igual, "no")
            }, new Clause(Especie, igual, "Bipes alvarezi"));

        Rule r108 = new Rule(br, "R108_Bipes_fuliginosus",
            new Clause[]{
                new Clause(Genero, igual, "Bipes"),
                new Clause(EndemicoMexico, igual, "no"),
                new Clause(PeninsulaBajaCalifornia, igual, "no"),
                new Clause(EstadoGuerrero, igual, "no"),
                new Clause(EstadoMichoacan, igual, "no"),
                new Clause(ChiapasGuatemala, igual, "si"),
                new Clause(HastaCostaRica, igual, "si"),
                new Clause(TamanoAdulto24cm, igual, "no"),
                new Clause(TamanoAdulto18cm, igual, "no"),
                new Clause(ColorUniformeOscuro, igual, "si"),
                new Clause(ColoracionRosadaPalida, igual, "no")
            }, new Clause(Especie, igual, "Bipes fuliginosus"));
            }
}