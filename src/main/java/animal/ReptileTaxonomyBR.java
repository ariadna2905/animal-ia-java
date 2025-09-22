package animal;

import animal.rule.*;
import animal.rule.Condition;

public class ReptileTaxonomyBR {

    private static final String SI = "si";
    private static final String NO = "no";

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

    // Variables adicionales de características
    RuleVariable Herbivoro, Omnivoro, CrestaDorsal, EspinosasCola, AdaptacionDesierto, EndemicoIslas, PeligroExtincion;

    // Variables para anolis
    RuleVariable TieneLamelas, EscamasEspecializadas, PapadaSuperReducida;
    RuleVariable CapacidadAutotomiaCaudal, PapadaExtensible, PapadaGrande, PorosFemorales;
    RuleVariable ColorVerdePredominante, HabitatUrbano, DewlapRojo, EscamasRugosas;

    // Variables para tortugas
    RuleVariable DistribucionTropical, DietaHerbivora, PicoFuerteCrustaceos, DietaPastosMarinos;

    // Variables para elápidos
    RuleVariable CuerpoCilindrico, PupilaRedonda, PatronAnillo, HabitatAcuatico;
    RuleVariable HabitatArboreo, ExpandeCuello, ColaComprimida, EscamasVentralesDesarrolladas;
    RuleVariable ActividadNocturna;

    // Variables para anguidos
    RuleVariable PatasReducidasAusentes, ColaMuyFragil, EscamasEnFila, PliegueLateral;
    RuleVariable ColaPrensil, HabitatAsiatico, TamanoPequeno, CuerpoDelgado, TamanoGrande, CuerpoLiso;

    // Variables para ctenosauras
    RuleVariable ColaEspinosa, CorredoresVeloces, Diurnos, ColoracionOscura, CrestaAlta;
    RuleVariable ColaLarga, EspinasCortas, CincoCrestas, CrestaDividida, EscamasGrandes;
    RuleVariable DietaCarnivora, BandaPectoral, DorsoAmarillo;

    // Variable para caretta
    RuleVariable CabezaMuyGrande;

    // Variables para micrurus
    RuleVariable AnillosTricolor, AnillosNegrosAnchos, CabezaNegra, ColaCorta;
    RuleVariable DistribucionCentroamerica, DistribucionSudamerica, DistribucionMexico, EstadoOaxaca;
    RuleVariable HabitatSelva, HabitatBosqueSeco, HabitatAcuario, AnilloBlancoPresente;

    // Variables para Abronia
    RuleVariable ColoracionRojiza, ColoracionVerde, ColoracionEsmeralda, LabiosRojos;
    RuleVariable ColaOscura, BandaDorsal, CabezaAncha, OrejasVisibles, EscamasQuilladas, OjosGrandes;

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
        String fecundacionInterna, String caparazonOseo,
        String mudaPiel, String tercerOjoParietal, String cuidadoParental,
        // Parámetros Familia
        String dientesPleurodontes, String lenguaCortaNoBifida, String termorregulador,
        String escamasEspinosas, String extremidadesReducidas, String ojosParpadosMoviles,
        String pupilasVerticales, String venenoPotente, String autotomiaCaudal,
        String habitosArboricolas, String carnivoros, String huevosCascaraCalcarea,
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
        String coloracionRosadaPalida,
        // Variables adicionales
        String herbivoro, String omnivoro, String crestaDorsal, String espinosasCola,
        String adaptacionDesierto, String endemicoIslas, String peligroExtincion,
        // Variables Anolis
        String tieneLamelas, String escamasEspecializadas, String papadaSuperReducida,
        String capacidadAutotomiaCaudal, String papadaExtensible, String papadaGrande,
        String porosFemorales, String colorVerdePredominante, String habitatUrbano,
        String dewlapRojo, String escamasRugosas,
        // Variables Tortugas
        String distribucionTropical, String dietaHerbivora, String picoFuerteCrustaceos,
        String dietaPastosMarinos,
        // Variables Elápidos
        String cuerpoCilindrico, String pupilaRedonda, String patronAnillo,
        String habitatAcuatico, String habitatArboreo, String expandeCuello,
        String colaComprimida, String escamasVentralesDesarrolladas, String actividadNocturna,
        // Variables Anguidos
        String patasReducidasAusentes, String colaMuyFragil, String escamasEnFila,
        String pliegueLateral, String colaPrensil, String habitatAsiatico,
        String tamanoPequeno, String cuerpoDelgado, String tamanoGrande, String cuerpoLiso,
        // Variables Ctenosauras
        String colaEspinosa, String corredoresVeloces, String diurnos,
        String coloracionOscura, String crestaAlta, String colaLarga,
        String espinasCortas, String cincoCrestas, String crestaDividida,
        String escamasGrandes, String dietaCarnivora, String bandaPectoral,
        String dorsoAmarillo,
        // Variable Caretta
        String cabezaMuyGrande,
        // Variables Micrurus
        String anillosTricolor, String anillosNegrosAnchos, String cabezaNegra,
        String colaCorta, String distribucionCentroamerica, String distribucionSudamerica,
        String distribucionMexico, String estadoOaxaca, String habitatSelva, String habitatBosqueSeco,
        String habitatAcuario, String anilloBlancoPresente,
        // Variables Abronia
        String coloracionRojiza, String coloracionVerde, String coloracionEsmeralda,
        String labiosRojos, String colaOscura, String bandaDorsal,
        String cabezaAncha, String orejasVisibles, String escamasQuilladas,
        String ojosGrandes) {

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
        CaparazonOseo.setValue(caparazonOseo);
        MudaPiel.setValue(mudaPiel);
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

        // Establecer valores de variables adicionales
        Herbivoro.setValue(herbivoro);
        Omnivoro.setValue(omnivoro);
        CrestaDorsal.setValue(crestaDorsal);
        EspinosasCola.setValue(espinosasCola);
        AdaptacionDesierto.setValue(adaptacionDesierto);
        EndemicoIslas.setValue(endemicoIslas);
        PeligroExtincion.setValue(peligroExtincion);

        // Establecer valores Anolis
        TieneLamelas.setValue(tieneLamelas);
        EscamasEspecializadas.setValue(escamasEspecializadas);
        PapadaSuperReducida.setValue(papadaSuperReducida);
        CapacidadAutotomiaCaudal.setValue(capacidadAutotomiaCaudal);
        PapadaExtensible.setValue(papadaExtensible);
        PapadaGrande.setValue(papadaGrande);
        PorosFemorales.setValue(porosFemorales);
        ColorVerdePredominante.setValue(colorVerdePredominante);
        HabitatUrbano.setValue(habitatUrbano);
        DewlapRojo.setValue(dewlapRojo);
        EscamasRugosas.setValue(escamasRugosas);

        // Establecer valores Tortugas
        DistribucionTropical.setValue(distribucionTropical);
        DietaHerbivora.setValue(dietaHerbivora);
        PicoFuerteCrustaceos.setValue(picoFuerteCrustaceos);
        DietaPastosMarinos.setValue(dietaPastosMarinos);

        // Establecer valores Elápidos
        CuerpoCilindrico.setValue(cuerpoCilindrico);
        PupilaRedonda.setValue(pupilaRedonda);
        PatronAnillo.setValue(patronAnillo);
        HabitatAcuatico.setValue(habitatAcuatico);
        HabitatArboreo.setValue(habitatArboreo);
        ExpandeCuello.setValue(expandeCuello);
        ColaComprimida.setValue(colaComprimida);
        EscamasVentralesDesarrolladas.setValue(escamasVentralesDesarrolladas);
        ActividadNocturna.setValue(actividadNocturna);

        // Establecer valores Anguidos
        PatasReducidasAusentes.setValue(patasReducidasAusentes);
        ColaMuyFragil.setValue(colaMuyFragil);
        EscamasEnFila.setValue(escamasEnFila);
        PliegueLateral.setValue(pliegueLateral);
        ColaPrensil.setValue(colaPrensil);
        HabitatAsiatico.setValue(habitatAsiatico);
        TamanoPequeno.setValue(tamanoPequeno);
        CuerpoDelgado.setValue(cuerpoDelgado);
        TamanoGrande.setValue(tamanoGrande);
        CuerpoLiso.setValue(cuerpoLiso);

        // Establecer valores Ctenosauras
        ColaEspinosa.setValue(colaEspinosa);
        CorredoresVeloces.setValue(corredoresVeloces);
        Diurnos.setValue(diurnos);
        ColoracionOscura.setValue(coloracionOscura);
        CrestaAlta.setValue(crestaAlta);
        ColaLarga.setValue(colaLarga);
        EspinasCortas.setValue(espinasCortas);
        CincoCrestas.setValue(cincoCrestas);
        CrestaDividida.setValue(crestaDividida);
        EscamasGrandes.setValue(escamasGrandes);
        DietaCarnivora.setValue(dietaCarnivora);
        BandaPectoral.setValue(bandaPectoral);
        DorsoAmarillo.setValue(dorsoAmarillo);

        // Establecer valor Caretta
        CabezaMuyGrande.setValue(cabezaMuyGrande);

        // Establecer valores Micrurus
        AnillosTricolor.setValue(anillosTricolor);
        AnillosNegrosAnchos.setValue(anillosNegrosAnchos);
        CabezaNegra.setValue(cabezaNegra);
        ColaCorta.setValue(colaCorta);
        DistribucionCentroamerica.setValue(distribucionCentroamerica);
        DistribucionSudamerica.setValue(distribucionSudamerica);
        DistribucionMexico.setValue(distribucionMexico);
        EstadoOaxaca.setValue(estadoOaxaca);
        HabitatSelva.setValue(habitatSelva);
        HabitatBosqueSeco.setValue(habitatBosqueSeco);
        HabitatAcuario.setValue(habitatAcuario);
        AnilloBlancoPresente.setValue(anilloBlancoPresente);

        // Establecer valores Abronia
        ColoracionRojiza.setValue(coloracionRojiza);
        ColoracionVerde.setValue(coloracionVerde);
        ColoracionEsmeralda.setValue(coloracionEsmeralda);
        LabiosRojos.setValue(labiosRojos);
        ColaOscura.setValue(colaOscura);
        BandaDorsal.setValue(bandaDorsal);
        CabezaAncha.setValue(cabezaAncha);
        OrejasVisibles.setValue(orejasVisibles);
        EscamasQuilladas.setValue(escamasQuilladas);
        OjosGrandes.setValue(ojosGrandes);

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

        // Variables para Testudines
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

        // Variables adicionales y de taxonomía específica
        Herbivoro = new RuleVariable(br, "Herbivoro");
        Omnivoro = new RuleVariable(br, "Omnivoro");
        CrestaDorsal = new RuleVariable(br, "CrestaDorsal");
        EspinosasCola = new RuleVariable(br, "EspinosasCola");
        AdaptacionDesierto = new RuleVariable(br, "AdaptacionDesierto");
        EndemicoIslas = new RuleVariable(br, "EndemicoIslas");
        PeligroExtincion = new RuleVariable(br, "PeligroExtincion");
        
        TieneLamelas = new RuleVariable(br, "TieneLamelas");
        EscamasEspecializadas = new RuleVariable(br, "EscamasEspecializadas");
        PapadaSuperReducida = new RuleVariable(br, "PapadaSuperReducida");
        CapacidadAutotomiaCaudal = new RuleVariable(br, "CapacidadAutotomiaCaudal");
        PapadaExtensible = new RuleVariable(br, "PapadaExtensible");
        PapadaGrande = new RuleVariable(br, "PapadaGrande");
        PorosFemorales = new RuleVariable(br, "PorosFemorales");
        ColorVerdePredominante = new RuleVariable(br, "ColorVerdePredominante");
        HabitatUrbano = new RuleVariable(br, "HabitatUrbano");
        DewlapRojo = new RuleVariable(br, "DewlapRojo");
        EscamasRugosas = new RuleVariable(br, "EscamasRugosas");

        DistribucionTropical = new RuleVariable(br, "DistribucionTropical");
        DietaHerbivora = new RuleVariable(br, "DietaHerbivora");
        PicoFuerteCrustaceos = new RuleVariable(br, "PicoFuerteCrustaceos");
        DietaPastosMarinos = new RuleVariable(br, "DietaPastosMarinos");

        CuerpoCilindrico = new RuleVariable(br, "CuerpoCilindrico");
        PupilaRedonda = new RuleVariable(br, "PupilaRedonda");
        PatronAnillo = new RuleVariable(br, "PatronAnillo");
        HabitatAcuatico = new RuleVariable(br, "HabitatAcuatico");
        HabitatArboreo = new RuleVariable(br, "HabitatArboreo");
        ExpandeCuello = new RuleVariable(br, "ExpandeCuello");
        ColaComprimida = new RuleVariable(br, "ColaComprimida");
        EscamasVentralesDesarrolladas = new RuleVariable(br, "EscamasVentralesDesarrolladas");
        ActividadNocturna = new RuleVariable(br, "ActividadNocturna");

        PatasReducidasAusentes = new RuleVariable(br, "PatasReducidasAusentes");
        ColaMuyFragil = new RuleVariable(br, "ColaMuyFragil");
        EscamasEnFila = new RuleVariable(br, "EscamasEnFila");
        PliegueLateral = new RuleVariable(br, "PliegueLateral");
        ColaPrensil = new RuleVariable(br, "ColaPrensil");
        HabitatAsiatico = new RuleVariable(br, "HabitatAsiatico");
        TamanoPequeno = new RuleVariable(br, "TamanoPequeno");
        CuerpoDelgado = new RuleVariable(br, "CuerpoDelgado");
        TamanoGrande = new RuleVariable(br, "TamanoGrande");
        CuerpoLiso = new RuleVariable(br, "CuerpoLiso");

        ColaEspinosa = new RuleVariable(br, "ColaEspinosa");
        CorredoresVeloces = new RuleVariable(br, "CorredoresVeloces");
        Diurnos = new RuleVariable(br, "Diurnos");
        ColoracionOscura = new RuleVariable(br, "ColoracionOscura");
        CrestaAlta = new RuleVariable(br, "CrestaAlta");
        ColaLarga = new RuleVariable(br, "ColaLarga");
        EspinasCortas = new RuleVariable(br, "EspinasCortas");
        CincoCrestas = new RuleVariable(br, "CincoCrestas");
        CrestaDividida = new RuleVariable(br, "CrestaDividida");
        EscamasGrandes = new RuleVariable(br, "EscamasGrandes");
        DietaCarnivora = new RuleVariable(br, "DietaCarnivora");
        BandaPectoral = new RuleVariable(br, "BandaPectoral");
        DorsoAmarillo = new RuleVariable(br, "DorsoAmarillo");

        CabezaMuyGrande = new RuleVariable(br, "CabezaMuyGrande");

        AnillosTricolor = new RuleVariable(br, "AnillosTricolor");
        AnillosNegrosAnchos = new RuleVariable(br, "AnillosNegrosAnchos");
        CabezaNegra = new RuleVariable(br, "CabezaNegra");
        ColaCorta = new RuleVariable(br, "ColaCorta");
        DistribucionCentroamerica = new RuleVariable(br, "DistribucionCentroamerica");
        DistribucionSudamerica = new RuleVariable(br, "DistribucionSudamerica");
        DistribucionMexico = new RuleVariable(br, "DistribucionMexico");
        EstadoOaxaca = new RuleVariable(br, "EstadoOaxaca");
        HabitatSelva = new RuleVariable(br, "HabitatSelva");
        HabitatBosqueSeco = new RuleVariable(br, "HabitatBosqueSeco");
        HabitatAcuario = new RuleVariable(br, "HabitatAcuario");
        AnilloBlancoPresente = new RuleVariable(br, "AnilloBlancoPresente");

        ColoracionRojiza = new RuleVariable(br, "ColoracionRojiza");
        ColoracionVerde = new RuleVariable(br, "ColoracionVerde");
        ColoracionEsmeralda = new RuleVariable(br, "ColoracionEsmeralda");
        LabiosRojos = new RuleVariable(br, "LabiosRojos");
        ColaOscura = new RuleVariable(br, "ColaOscura");
        BandaDorsal = new RuleVariable(br, "BandaDorsal");
        CabezaAncha = new RuleVariable(br, "CabezaAncha");
        OrejasVisibles = new RuleVariable(br, "OrejasVisibles");
        EscamasQuilladas = new RuleVariable(br, "EscamasQuilladas");
        OjosGrandes = new RuleVariable(br, "OjosGrandes");

        // Definición de operadores lógicos
        Condition igual = new Condition("=");
        
        // REGLAS DE CLASIFICACIÓN
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

        Rule r60 = new Rule(br, "R60_Ctenosaura",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "si"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "si"),
                new Clause(AdaptacionDesierto, igual, "si"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "no"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero, igual, "Ctenosaura"));

        Rule r61 = new Rule(br, "R61_Iguana",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "no"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero, igual, "Iguana"));

        Rule r62 = new Rule(br, "R62_Dipsosaurus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "si"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "no"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero, igual, "Dipsosaurus"));

        Rule r63 = new Rule(br, "R63_Sauromalus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "si"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero, igual, "Sauromalus"));

        Rule r64 = new Rule(br, "R64_Brachylophus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(HabitosArboricolas, igual, "si"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "si")
            }, new Clause(Genero, igual, "Brachylophus"));

        Rule r65 = new Rule(br, "R65_Cyclura",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "si"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "si")
            }, new Clause(Genero, igual, "Cyclura"));

        Rule r66 = new Rule(br, "R66_Amblyrhynchus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "si"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "si")
            }, new Clause(Genero, igual, "Amblyrhynchus"));

        Rule r67 = new Rule(br, "R67_Conolophus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "si"),
                new Clause(Omnivoro, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "si")
            }, new Clause(Genero, igual, "Conolophus"));

        Rule r68 = new Rule(br, "R68_Oplurus",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "no"),
                new Clause(Omnivoro, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(EspinosasCola, igual, "si"),
                new Clause(AdaptacionDesierto, igual, "no"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "si"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero, igual, "Oplurus"));

        Rule r69 = new Rule(br, "R69_Phrynosoma",
            new Clause[]{
                new Clause(Familia, igual, "Iguanidae"),
                new Clause(Herbivoro, igual, "no"),
                new Clause(Omnivoro, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(EspinosasCola, igual, "no"),
                new Clause(AdaptacionDesierto, igual, "si"),
                new Clause(HabitosArboricolas, igual, "no"),
                new Clause(Terrestre, igual, "si"),
                new Clause(Marino, igual, "no"),
                new Clause(EndemicoIslas, igual, "no"),
                new Clause(PeligroExtincion, igual, "no")
            }, new Clause(Genero, igual, "Phrynosoma"));

        Rule r70 = new Rule(br, "R70_Anolis",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "si"),
                new Clause(PapadaExtensible, igual, "si"),
                new Clause(PapadaGrande, igual, "si"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Anolis"));

        Rule r71 = new Rule(br, "R71_Norops",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Norops"));

        Rule r72 = new Rule(br, "R72_Ctenonotus",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Ctenonotus"));

        Rule r73 = new Rule(br, "R73_Deyroptyx",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Deyroptyx"));

        Rule r74 = new Rule(br, "R74_Dactyloa",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "si"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Dactyloa"));

        Rule r75 = new Rule(br, "R75_Chamaelinorops",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "si"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Chamaelinorops"));

        Rule r76 = new Rule(br, "R76_Xiphosurus",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Xiphosurus"));

        Rule r77 = new Rule(br, "R77_Audantia",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "si"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Audantia"));

        Rule r78 = new Rule(br, "R78_Divinatus",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "si"),
                new Clause(LenguaCortaNoBifida, igual, "no"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "si"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Divinatus"));

        Rule r79 = new Rule(br, "R79_Phenacosaurus",
            new Clause[]{
                new Clause(Familia, igual, "Dactyloidae"),
                new Clause(TieneLamelas, igual, "no"),
                new Clause(LenguaCortaNoBifida, igual, "si"),
                new Clause(EscamasEspecializadas, igual, "no"),
                new Clause(PapadaSuperReducida, igual, "si"),
                new Clause(CapacidadAutotomiaCaudal, igual, "no"),
                new Clause(PapadaExtensible, igual, "no"),
                new Clause(PapadaGrande, igual, "no"),
                new Clause(PorosFemorales, igual, "no")
            }, new Clause(Genero, igual, "Phenacosaurus"));
        Rule r80 = new Rule(br, "R80_Eretmochelys",
            new Clause[]{
                new Clause(Familia, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "si"),
                new Clause(DietaHerbivora, igual, "no"),
                new Clause(PicoFuerteCrustaceos, igual, "no"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(DietaPastosMarinos, igual, "no")
            }, new Clause(Genero, igual, "Eretmochelys"));

        Rule r81 = new Rule(br, "R81_Chelonia",
            new Clause[]{
                new Clause(Familia, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "no"),
                new Clause(DietaHerbivora, igual, "si"),
                new Clause(PicoFuerteCrustaceos, igual, "no"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(DietaPastosMarinos, igual, "no")
            }, new Clause(Genero, igual, "Chelonia"));

        Rule r82 = new Rule(br, "R82_Caretta",
            new Clause[]{
                new Clause(Familia, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "no"),
                new Clause(DietaHerbivora, igual, "no"),
                new Clause(PicoFuerteCrustaceos, igual, "si"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(DietaPastosMarinos, igual, "no")
            }, new Clause(Genero, igual, "Caretta"));

        Rule r83 = new Rule(br, "R83_Lepidochelys",
            new Clause[]{
                new Clause(Familia, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "si"),
                new Clause(DietaHerbivora, igual, "no"),
                new Clause(PicoFuerteCrustaceos, igual, "no"),
                new Clause(CaparazonAplanado, igual, "si"),
                new Clause(DietaPastosMarinos, igual, "no")
            }, new Clause(Genero, igual, "Lepidochelys"));

        Rule r84 = new Rule(br, "R84_Natator",
            new Clause[]{
                new Clause(Familia, igual, "Cheloniidae"),
                new Clause(DistribucionTropical, igual, "no"),
                new Clause(DietaHerbivora, igual, "no"),
                new Clause(PicoFuerteCrustaceos, igual, "no"),
                new Clause(CaparazonAplanado, igual, "no"),
                new Clause(DietaPastosMarinos, igual, "si")
            }, new Clause(Genero, igual, "Natator"));
        Rule r85 = new Rule(br, "R85_Acanthophis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "no"),
                new Clause(PupilaRedonda, igual, "no"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "si"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Acanthophis"));

        Rule r86 = new Rule(br, "R86_Pseudechis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Pseudechis"));

        Rule r87 = new Rule(br, "R87_Notechis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "si"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Notechis"));

        Rule r88 = new Rule(br, "R88_Laticauda",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "si"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "si"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Laticauda"));

        Rule r89 = new Rule(br, "R89_Hydrophis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "si"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "si"),
                new Clause(EscamasVentralesDesarrolladas, igual, "no"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Hydrophis"));

        Rule r90 = new Rule(br, "R90_Bungarus",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "si")
            }, new Clause(Genero, igual, "Bungarus"));

        Rule r91 = new Rule(br, "R91_Naja",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "si"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Naja"));

        Rule r92 = new Rule(br, "R92_Micrurus",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "si"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "no"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Micrurus"));

        Rule r93 = new Rule(br, "R93_Ophiophagus",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ExpandeCuello, igual, "si"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Ophiophagus"));

        Rule r94 = new Rule(br, "R94_Dendroaspis",
            new Clause[]{
                new Clause(Familia, igual, "Elapidae"),
                new Clause(CuerpoCilindrico, igual, "si"),
                new Clause(PupilaRedonda, igual, "si"),
                new Clause(PatronAnillo, igual, "no"),
                new Clause(HabitatAcuatico, igual, "no"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ExpandeCuello, igual, "no"),
                new Clause(ColaComprimida, igual, "no"),
                new Clause(EscamasVentralesDesarrolladas, igual, "si"),
                new Clause(ActividadNocturna, igual, "no")
            }, new Clause(Genero, igual, "Dendroaspis"));

        Rule r95 = new Rule(br, "R95_Elgaria",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "si"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero, igual, "Elgaria"));

        Rule r96 = new Rule(br, "R96_Gerrhonotus",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "si"),
                new Clause(SinPatas, igual, "no"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero, igual, "Gerrhonotus"));

        Rule r97 = new Rule(br, "R97_Ophisaurus",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero, igual, "Ophisaurus"));

        Rule r98 = new Rule(br, "R98_Anguis",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "si")
            }, new Clause(Genero, igual, "Anguis"));

        Rule r99 = new Rule(br, "R99_Abronia",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero, igual, "Abronia"));

        Rule r100 = new Rule(br, "R100_Dopasia",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "si"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero, igual, "Dopasia"));
        Rule r101 = new Rule(br, "R101_Mesaspis",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas, igual, "no"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "si"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero, igual, "Mesaspis"));

        Rule r102 = new Rule(br, "R102_Hyalosaurus",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "si"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero, igual, "Hyalosaurus"));

        Rule r103 = new Rule(br, "R103_Pseudopus",
            new Clause[]{
                new Clause(Familia, igual, "Anguidae"),
                new Clause(PatasReducidasAusentes, igual, "si"),
                new Clause(CuerpoAlargadoCilindrico, igual, "si"),
                new Clause(ColaMuyFragil, igual, "si"),
                new Clause(EscamasEnFila, igual, "no"),
                new Clause(PliegueLateral, igual, "no"),
                new Clause(SinPatas, igual, "si"),
                new Clause(ColaPrensil, igual, "no"),
                new Clause(HabitatAsiatico, igual, "no"),
                new Clause(TamanoPequeno, igual, "no"),
                new Clause(CuerpoDelgado, igual, "no"),
                new Clause(TamanoGrande, igual, "si"),
                new Clause(CuerpoLiso, igual, "no")
            }, new Clause(Genero, igual, "Pseudopus"));
            
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

        Rule r109 = new Rule(br, "R109_LagartoTopoMexicano",
            new Clause[]{
                new Clause(Especie, igual, "Bipes biporus")
            }, new Clause(Especie, igual, "Lagarto Topo Mexicano"));

        Rule r110 = new Rule(br, "R110_Ctenosaura_defensor",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "si"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura defensor"));

        Rule r111 = new Rule(br, "R111_Ctenosaura_pectinata",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "si"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura pectinata"));

        Rule r112 = new Rule(br, "R112_Ctenosaura_similis",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "si"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura similis"));

        Rule r113 = new Rule(br, "R113_Ctenosaura_acanthura",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "si"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "si"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura acanthura"));

        Rule r114 = new Rule(br, "R114_Ctenosaura_quinquecarintata",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "si"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura quinquecarintata"));

        Rule r115 = new Rule(br, "R115_Ctenosaura_hemilopha",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "si"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura hemilopha"));

        Rule r116 = new Rule(br, "R116_Ctenosaura_oaxacana",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura oaxacana"));

        Rule r117 = new Rule(br, "R117_Ctenosaura_bakeri",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "si"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura bakeri"));

        Rule r118 = new Rule(br, "R118_Ctenosaura_melanosterna",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "si"),
                new Clause(DorsoAmarillo, igual, "no")
            }, new Clause(Especie, igual, "Ctenosaura melanosterna"));

        Rule r119 = new Rule(br, "R119_Ctenosaura_flavidorsalis",
            new Clause[]{
                new Clause(Genero, igual, "Ctenosaura"),
                new Clause(ColaEspinosa, igual, "si"),
                new Clause(CorredoresVeloces, igual, "si"),
                new Clause(Diurnos, igual, "si"),
                new Clause(ColoracionOscura, igual, "no"),
                new Clause(CrestaAlta, igual, "no"),
                new Clause(ColaLarga, igual, "no"),
                new Clause(EspinasCortas, igual, "no"),
                new Clause(CincoCrestas, igual, "no"),
                new Clause(CrestaDividida, igual, "no"),
                new Clause(EscamasGrandes, igual, "no"),
                new Clause(DietaCarnivora, igual, "no"),
                new Clause(BandaPectoral, igual, "no"),
                new Clause(DorsoAmarillo, igual, "si")
            }, new Clause(Especie, igual, "Ctenosaura flavidorsalis"));

        Rule r120 = new Rule(br, "R120_IguanaYucateca",
            new Clause[]{
                new Clause(Especie, igual, "Ctenosaura defensor")
            }, new Clause(Especie, igual, "Iguana Yucateca de Cola Espinosa"));

        Rule r121 = new Rule(br, "R121_Caretta_caretta",
            new Clause[]{
                new Clause(Genero, igual, "Caretta"),
                new Clause(CabezaMuyGrande, igual, "si")
            }, new Clause(Especie, igual, "Caretta caretta"));

        Rule r122 = new Rule(br, "R122_TortugaCaguama",
            new Clause[]{
                new Clause(Especie, igual, "Caretta caretta")
            }, new Clause(Especie, igual, "Tortuga caguama"));

        Rule r123 = new Rule(br, "R123_Micrurus_mipartitus",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "no"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "si"),
                new Clause(DistribucionSudamerica, igual, "si"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "no")
            }, new Clause(Especie, igual, "Micrurus mipartitus"));

        Rule r124 = new Rule(br, "R124_Micrurus_tener",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "si"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "si"),
                new Clause(HabitatSelva, igual, "no"),
                new Clause(HabitatBosqueSeco, igual, "si"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie, igual, "Micrurus tener"));

        Rule r125 = new Rule(br, "R125_Micrurus_fulvius",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie, igual, "Micrurus fulvius"));

        Rule r126 = new Rule(br, "R126_Micrurus_laticollaris",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "si"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "si"),
                new Clause(HabitatSelva, igual, "no"),
                new Clause(HabitatBosqueSeco, igual, "si"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "no")
            }, new Clause(Especie, igual, "Micrurus laticollaris"));

        Rule r127 = new Rule(br, "R127_Micrurus_nigrocinctus",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "si"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "si"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie, igual, "Micrurus nigrocinctus"));

        Rule r128 = new Rule(br, "R128_Micrurus_surinamensis",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "no"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "si"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "si"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie, igual, "Micrurus surinamensis"));

        Rule r129 = new Rule(br, "R129_Micrurus_frontalis",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "no"),
                new Clause(HabitatBosqueSeco, igual, "si"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie, igual, "Micrurus frontalis"));

        Rule r130 = new Rule(br, "R130_Micrurus_lemniscatus",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "no"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "si"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie, igual, "Micrurus lemniscatus"));

        Rule r131 = new Rule(br, "R131_Micrurus_diastema",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "si"),
                new Clause(CabezaNegra, igual, "si"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "si"),
                new Clause(DistribucionSudamerica, igual, "no"),
                new Clause(DistribucionMexico, igual, "si"),
                new Clause(HabitatSelva, igual, "si"),
                new Clause(HabitatBosqueSeco, igual, "no"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie, igual, "Micrurus diastema"));

        Rule r132 = new Rule(br, "R132_Micrurus_pyrrhocryptus",
            new Clause[]{
                new Clause(Genero, igual, "Micrurus"),
                new Clause(AnillosTricolor, igual, "si"),
                new Clause(AnillosNegrosAnchos, igual, "no"),
                new Clause(CabezaNegra, igual, "no"),
                new Clause(ColaCorta, igual, "si"),
                new Clause(DistribucionCentroamerica, igual, "no"),
                new Clause(DistribucionSudamerica, igual, "si"),
                new Clause(DistribucionMexico, igual, "no"),
                new Clause(HabitatSelva, igual, "no"),
                new Clause(HabitatBosqueSeco, igual, "si"),
                new Clause(HabitatAcuario, igual, "no"),
                new Clause(AnilloBlancoPresente, igual, "si")
            }, new Clause(Especie, igual, "Micrurus pyrrhocryptus"));

        Rule r133 = new Rule(br, "R133_CoralilloBalsas",
            new Clause[]{
                new Clause(Especie, igual, "Micrurus laticollaris")
            }, new Clause(Especie, igual, "Coralillo de balsas")); 

        Rule r134 = new Rule(br, "R134_Abronia_meledona",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "si"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia meledona"));

        Rule r135 = new Rule(br, "R135_Abronia_mixteca",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "si"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia mixteca"));

        Rule r136 = new Rule(br, "R136_Abronia_graminea",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "si"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia graminea"));

        Rule r137 = new Rule(br, "R137_Abronia_lythrochila",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "si"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia lythrochila"));

        Rule r138 = new Rule(br, "R138_Abronia_deppii",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "si"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia deppii"));

        Rule r139 = new Rule(br, "R139_Abronia_taeniata",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "si"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia taeniata"));

        Rule r140 = new Rule(br, "R140_Abronia_campbelli",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "si")
            }, new Clause(Especie, igual, "Abronia campbelli"));

        Rule r141 = new Rule(br, "R141_Abronia_frosti",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "si"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia frosti"));

        Rule r142 = new Rule(br, "R142_Abronia_aurita",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "si"),
                new Clause(EscamasQuilladas, igual, "no"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia aurita"));

        Rule r143 = new Rule(br, "R143_Abronia_salvadorensis",
            new Clause[]{
                new Clause(Genero, igual, "Abronia"),
                new Clause(ColaPrensil, igual, "si"),
                new Clause(EscamasGrandes, igual, "si"),
                new Clause(HabitatArboreo, igual, "si"),
                new Clause(ColoracionRojiza, igual, "no"),
                new Clause(ColoracionVerde, igual, "no"),
                new Clause(ColoracionEsmeralda, igual, "no"),
                new Clause(LabiosRojos, igual, "no"),
                new Clause(ColaOscura, igual, "no"),
                new Clause(BandaDorsal, igual, "no"),
                new Clause(CabezaAncha, igual, "no"),
                new Clause(OrejasVisibles, igual, "no"),
                new Clause(EscamasQuilladas, igual, "si"),
                new Clause(OjosGrandes, igual, "no")
            }, new Clause(Especie, igual, "Abronia salvadorensis"));

        Rule r144 = new Rule(br, "R144_DragonSierraMixteca",
            new Clause[]{
                new Clause(Especie, igual, "Abronia mixteca")
            }, new Clause(Especie, igual, "Dragon Sierra Mixteca"));

        Rule r145 = new Rule(br, "R145_Anolis_carolinensis",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanoGrande, igual, "si"),
                new Clause(HabitatUrbano, igual, "si"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie, igual, "Anolis carolinensis"));

        Rule r146 = new Rule(br, "R146_Anolis_sagrei",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "no"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "si"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie, igual, "Anolis sagrei"));

        Rule r147 = new Rule(br, "R147_Anolis_porcatus",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanoGrande, igual, "si"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "si"),
                new Clause(EscamasRugosas, igual, "no")
            }, new Clause(Especie, igual, "Anolis porcatus"));

        Rule r148 = new Rule(br, "R148_Anolis_cristatellus",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie, igual, "Anolis cristatellus"));

        Rule r149 = new Rule(br, "R149_Anolis_naufragus",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "si"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie, igual, "Anolis naufragus"));

        Rule r150 = new Rule(br, "R150_Anolis_equestris",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanoGrande, igual, "si"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie, igual, "Anolis equestris"));

        Rule r151 = new Rule(br, "R151_Anolis_cybotes",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "no"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(TamanoGrande, igual, "si"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "si")
            }, new Clause(Especie, igual, "Anolis cybotes"));

        Rule r152 = new Rule(br, "R152_Anolis_chlorocyanus",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "no"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "si"),
                new Clause(DewlapRojo, igual, "si"),
                new Clause(EscamasRugosas, igual, "no")
            }, new Clause(Especie, igual, "Anolis chlorocyanus"));

        Rule r153 = new Rule(br, "R153_Anolis_gorgonae",
            new Clause[]{
                new Clause(Genero, igual, "Anolis"),
                new Clause(ColorVerdePredominante, igual, "si"),
                new Clause(CrestaDorsal, igual, "si"),
                new Clause(TamanoGrande, igual, "no"),
                new Clause(HabitatUrbano, igual, "no"),
                new Clause(DewlapRojo, igual, "no"),
                new Clause(EscamasRugosas, igual, "no")
            }, new Clause(Especie, igual, "Anolis gorgonae"));

        Rule r154 = new Rule(br, "R154_AbaniquilloHidalgo",
            new Clause[]{
                new Clause(Especie, igual, "Anolis naufragus")
            }, new Clause(Especie, igual, "Abaniquillo de Hidalgo"));               
                            }
}