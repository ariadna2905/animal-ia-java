package animal;

import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.FontMetrics;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicCheckBoxUI;

public class jftv1 extends javax.swing.JFrame {

    // Instanciamos nuestra clase principal del sistema experto
    ReptileTaxonomyBR objbr = new ReptileTaxonomyBR();
    String c;

    public jftv1() {
        initComponents();
        setupInitialVisibility();
    }

    // Variables de la interfaz de usuario
    private javax.swing.JButton jButton2; // Solo queda el botón de Salir
    private javax.swing.JLabel jLabel1;

    // Paneles para agrupar las casillas por nivel taxonómico
    private JPanel pnlReino;
    private JPanel pnlFilo;
    private JPanel pnlClase;
    private JPanel pnlOrden;
    private JPanel pnlFamilia;
    private JPanel pnlGenero;
    private JPanel pnlEspecie;
    private JPanel pnlAdicionales;

    // REINO
    private JCheckBox jCheckBoxUnicelulares;
    private JCheckBox jCheckBoxFotosintesis;
    private JCheckBox jCheckBoxEsporas;
    private JCheckBox jCheckBoxAmbientesExtremos;
    private JCheckBox jCheckBoxMovilidadActiva;

    // FILO
    private JCheckBox jCheckBoxSimetriaRadial;
    private JCheckBox jCheckBoxTejidosVerdaderos;
    private JCheckBox jCheckBoxSegmentacion;
    private JCheckBox jCheckBoxDigestivoCompleto;
    private JCheckBox jCheckBoxNotocorda;
    private JCheckBox jCheckBoxConchaCalcarea;
    private JCheckBox jCheckBoxQuetas;

    // CLASE
    private JCheckBox jCheckBoxSangreFria;
    private JCheckBox jCheckBoxHuevoAmniotico;
    private JCheckBox jCheckBoxGarrasDedos;
    private JCheckBox jCheckBoxCorazonTresCamaras;
    private JCheckBox jCheckBoxPielSecaEscamosa;
    private JCheckBox jCheckBoxMandibulas;
    private JCheckBox jCheckBoxAletasLobuladas;
    private JCheckBox jCheckBoxRadiosOseosAletas;
    private JCheckBox jCheckBoxEsqueletoOseo;

    // ORDEN
    private JCheckBox jCheckBoxFecundacionInterna;
    private JCheckBox jCheckBoxCaparazonOseo;
    private JCheckBox jCheckBoxMudaPiel;
    private JCheckBox jCheckBoxTercerOjoParietal;
    private JCheckBox jCheckBoxCuidadoParental;

    // FAMILIA
    private JCheckBox jCheckBoxDientesPleurodontes;
    private JCheckBox jCheckBoxLenguaCortaNoBifida;
    private JCheckBox jCheckBoxTermorregulador;
    private JCheckBox jCheckBoxEscamasEspinosas;
    private JCheckBox jCheckBoxExtremidadesReducidas;
    private JCheckBox jCheckBoxOjosParpadosMoviles;
    private JCheckBox jCheckBoxPupilasVerticales;
    private JCheckBox jCheckBoxVenenoPotente;
    private JCheckBox jCheckBoxAutotomiaCaudal;
    private JCheckBox jCheckBoxHabitosArboricolas;
    private JCheckBox jCheckBoxCarnivoros;
    private JCheckBox jCheckBoxHuevosCascaraCalcarea;
    private JCheckBox jCheckBoxMarino;
    private JCheckBox jCheckBoxTerrestre;
    private JCheckBox jCheckBoxEscudosAusentes;
    private JCheckBox jCheckBoxCaparazonAlto;
    private JCheckBox jCheckBoxCaparazonAplanado;
    private JCheckBox jCheckBoxCabezaGrandeAlargada;
    private JCheckBox jCheckBoxHabitatPrincipalUSA;
    private JCheckBox jCheckBoxHabitatPrincipalAustralia;

    // GÉNERO
    private JCheckBox jCheckBoxDosPatasTraseras;
    private JCheckBox jCheckBoxOjosReducidos;
    private JCheckBox jCheckBoxAdaptadoExcavar;
    private JCheckBox jCheckBoxCuerpoAlargadoCilindrico;
    private JCheckBox jCheckBoxSinPatas;
    private JCheckBox jCheckBoxVenenoso;
    private JCheckBox jCheckBoxPielOsteodermos;
    private JCheckBox jCheckBoxLagartosParpadosMoviles;
    private JCheckBox jCheckBoxGeckos;
    private JCheckBox jCheckBoxEspolonesPelvicos;
    private JCheckBox jCheckBoxEscamasVertHilerasTransv;
    private JCheckBox jCheckBoxEscamasDorsalesQuilladas;

    // ESPECIE
    private JCheckBox jCheckBoxEndemicoMexico;
    private JCheckBox jCheckBoxPeninsulaBajaCalifornia;
    private JCheckBox jCheckBoxEstadoGuerrero;
    private JCheckBox jCheckBoxEstadoMichoacan;
    private JCheckBox jCheckBoxChiapasGuatemala;
    private JCheckBox jCheckBoxHastaCostaRica;
    private JCheckBox jCheckBoxTamanoAdulto24cm;
    private JCheckBox jCheckBoxTamanoAdulto18cm;
    private JCheckBox jCheckBoxColorUniformeOscuro;
    private JCheckBox jCheckBoxColoracionRosadaPalida;

    // Variables adicionales de características
    private JCheckBox jCheckBoxHerbivoro;
    private JCheckBox jCheckBoxOmnivoro;
    private JCheckBox jCheckBoxCrestaDorsal;
    private JCheckBox jCheckBoxEspinosasCola;
    private JCheckBox jCheckBoxAdaptacionDesierto;
    private JCheckBox jCheckBoxEndemicoIslas;
    private JCheckBox jCheckBoxPeligroExtincion;

    // Variables para anolis
    private JCheckBox jCheckBoxTieneLamelas;
    private JCheckBox jCheckBoxEscamasEspecializadas;
    private JCheckBox jCheckBoxPapadaSuperReducida;
    private JCheckBox jCheckBoxCapacidadAutotomiaCaudal;
    private JCheckBox jCheckBoxPapadaExtensible;
    private JCheckBox jCheckBoxPapadaGrande;
    private JCheckBox jCheckBoxPorosFemorales;
    private JCheckBox jCheckBoxColorVerdePredominante;
    private JCheckBox jCheckBoxHabitatUrbano;
    private JCheckBox jCheckBoxDewlapRojo;
    private JCheckBox jCheckBoxEscamasRugosas;

    // Variables para tortugas
    private JCheckBox jCheckBoxDistribucionTropical;
    private JCheckBox jCheckBoxDietaHerbivora;
    private JCheckBox jCheckBoxPicoFuerteCrustaceos;
    private JCheckBox jCheckBoxDietaPastosMarinos;

    // Variables para elápidos
    private JCheckBox jCheckBoxCuerpoCilindrico;
    private JCheckBox jCheckBoxPupilaRedonda;
    private JCheckBox jCheckBoxPatronAnillo;
    private JCheckBox jCheckBoxHabitatAcuatico;
    private JCheckBox jCheckBoxHabitatArboreo;
    private JCheckBox jCheckBoxExpandeCuello;
    private JCheckBox jCheckBoxColaComprimida;
    private JCheckBox jCheckBoxEscamasVentralesDesarrolladas;
    private JCheckBox jCheckBoxActividadNocturna;

    // Variables para anguidos
    private JCheckBox jCheckBoxPatasReducidasAusentes;
    private JCheckBox jCheckBoxColaMuyFragil;
    private JCheckBox jCheckBoxEscamasEnFila;
    private JCheckBox jCheckBoxPliegueLateral;
    private JCheckBox jCheckBoxColaPrensil;
    private JCheckBox jCheckBoxHabitatAsiatico;
    private JCheckBox jCheckBoxTamanoPequeno;
    private JCheckBox jCheckBoxCuerpoDelgado;
    private JCheckBox jCheckBoxTamanoGrande;
    private JCheckBox jCheckBoxCuerpoLiso;

    // Variables para ctenosauras
    private JCheckBox jCheckBoxColaEspinosa;
    private JCheckBox jCheckBoxCorredoresVeloces;
    private JCheckBox jCheckBoxDiurnos;
    private JCheckBox jCheckBoxColoracionOscura;
    private JCheckBox jCheckBoxCrestaAlta;
    private JCheckBox jCheckBoxColaLarga;
    private JCheckBox jCheckBoxEspinasCortas;
    private JCheckBox jCheckBoxCincoCrestas;
    private JCheckBox jCheckBoxCrestaDividida;
    private JCheckBox jCheckBoxEscamasGrandes;
    private JCheckBox jCheckBoxDietaCarnivora;
    private JCheckBox jCheckBoxBandaPectoral;
    private JCheckBox jCheckBoxDorsoAmarillo;

    // Variable para caretta
    private JCheckBox jCheckBoxCabezaMuyGrande;

    // Variables para micrurus
    private JCheckBox jCheckBoxAnillosTricolor;
    private JCheckBox jCheckBoxAnillosNegrosAnchos;
    private JCheckBox jCheckBoxCabezaNegra;
    private JCheckBox jCheckBoxColaCorta;
    private JCheckBox jCheckBoxDistribucionCentroamerica;
    private JCheckBox jCheckBoxDistribucionSudamerica;
    private JCheckBox jCheckBoxDistribucionMexico;
    private JCheckBox jCheckBoxEstadoOaxaca;
    private JCheckBox jCheckBoxHabitatSelva;
    private JCheckBox jCheckBoxHabitatBosqueSeco;
    private JCheckBox jCheckBoxHabitatAcuario;
    private JCheckBox jCheckBoxAnilloBlancoPresente;

    // Variables para Abronia
    private JCheckBox jCheckBoxColoracionRojiza;
    private JCheckBox jCheckBoxColoracionVerde;
    private JCheckBox jCheckBoxColoracionEsmeralda;
    private JCheckBox jCheckBoxLabiosRojos;
    private JCheckBox jCheckBoxColaOscura;
    private JCheckBox jCheckBoxBandaDorsal;
    private JCheckBox jCheckBoxCabezaAncha;
    private JCheckBox jCheckBoxOrejasVisibles;
    private JCheckBox jCheckBoxEscamasQuilladas;
    private JCheckBox jCheckBoxOjosGrandes;

    @SuppressWarnings("unchecked")
    private void initComponents() {

        // Inicialización de los JCheckBox
        // **TODAS LAS VARIABLES ESTÁN INICIALIZADAS AQUÍ**
        jCheckBoxUnicelulares = new JCheckBox("Unicelular");
        jCheckBoxFotosintesis = new JCheckBox("Fotosíntesis");
        jCheckBoxEsporas = new JCheckBox("Se reproduce por esporas");
        jCheckBoxAmbientesExtremos = new JCheckBox("Vive en ambientes extremos");
        jCheckBoxMovilidadActiva = new JCheckBox("Movilidad activa");
        jCheckBoxSimetriaRadial = new JCheckBox("Simetría radial");
        jCheckBoxTejidosVerdaderos = new JCheckBox("Tiene tejidos verdaderos");
        jCheckBoxSegmentacion = new JCheckBox("Segmentación en el cuerpo");
        jCheckBoxDigestivoCompleto = new JCheckBox("Sistema digestivo completo");
        jCheckBoxNotocorda = new JCheckBox("Tiene notocorda");
        jCheckBoxConchaCalcarea = new JCheckBox("Concha calcárea");
        jCheckBoxQuetas = new JCheckBox("Tiene quetas");
        jCheckBoxSangreFria = new JCheckBox("Sangre fría");
        jCheckBoxHuevoAmniotico = new JCheckBox("Pone huevos amnióticos");
        jCheckBoxGarrasDedos = new JCheckBox("Garras en los dedos");
        jCheckBoxCorazonTresCamaras = new JCheckBox("Corazón de 3 cámaras");
        jCheckBoxPielSecaEscamosa = new JCheckBox("Piel seca y escamosa");
        jCheckBoxMandibulas = new JCheckBox("Tiene mandíbulas");
        jCheckBoxAletasLobuladas = new JCheckBox("Aletas lobuladas");
        jCheckBoxRadiosOseosAletas = new JCheckBox("Radios óseos en aletas");
        jCheckBoxEsqueletoOseo = new JCheckBox("Esqueleto óseo");
        jCheckBoxFecundacionInterna = new JCheckBox("Fecundación interna");
        jCheckBoxCaparazonOseo = new JCheckBox("Caparazón óseo");
        jCheckBoxMudaPiel = new JCheckBox("Muda de piel");
        jCheckBoxTercerOjoParietal = new JCheckBox("Tercer ojo parietal");
        jCheckBoxCuidadoParental = new JCheckBox("Cuidado parental");
        jCheckBoxDientesPleurodontes = new JCheckBox("Dientes pleurodontes");
        jCheckBoxLenguaCortaNoBifida = new JCheckBox("Lengua corta, no bífida");
        jCheckBoxTermorregulador = new JCheckBox("Termorregulador");
        jCheckBoxEscamasEspinosas = new JCheckBox("Escamas espinosas");
        jCheckBoxExtremidadesReducidas = new JCheckBox("Extremidades reducidas");
        jCheckBoxOjosParpadosMoviles = new JCheckBox("Ojos con párpados móviles");
        jCheckBoxPupilasVerticales = new JCheckBox("Pupilas verticales");
        jCheckBoxVenenoPotente = new JCheckBox("Veneno potente");
        jCheckBoxAutotomiaCaudal = new JCheckBox("Autotomía caudal");
        jCheckBoxHabitosArboricolas = new JCheckBox("Hábitos arborícolas");
        jCheckBoxCarnivoros = new JCheckBox("Carnívoro");
        jCheckBoxHuevosCascaraCalcarea = new JCheckBox("Huevos con cáscara calcárea");
        jCheckBoxMarino = new JCheckBox("Marino");
        jCheckBoxTerrestre = new JCheckBox("Terrestre");
        jCheckBoxEscudosAusentes = new JCheckBox("Escudos ausentes");
        jCheckBoxCaparazonAlto = new JCheckBox("Caparazón alto");
        jCheckBoxCaparazonAplanado = new JCheckBox("Caparazón aplanado");
        jCheckBoxCabezaGrandeAlargada = new JCheckBox("Cabeza grande y alargada");
        jCheckBoxHabitatPrincipalUSA = new JCheckBox("Hábitat en USA");
        jCheckBoxHabitatPrincipalAustralia = new JCheckBox("Hábitat en Australia");
        jCheckBoxDosPatasTraseras = new JCheckBox("Dos patas traseras");
        jCheckBoxOjosReducidos = new JCheckBox("Ojos reducidos");
        jCheckBoxAdaptadoExcavar = new JCheckBox("Adaptado para excavar");
        jCheckBoxCuerpoAlargadoCilindrico = new JCheckBox("Cuerpo alargado y cilíndrico");
        jCheckBoxSinPatas = new JCheckBox("Sin patas");
        jCheckBoxVenenoso = new JCheckBox("Venenoso");
        jCheckBoxPielOsteodermos = new JCheckBox("Piel con osteodermos");
        jCheckBoxLagartosParpadosMoviles = new JCheckBox("Lagarto con párpados móviles");
        jCheckBoxGeckos = new JCheckBox("Geckos");
        jCheckBoxEspolonesPelvicos = new JCheckBox("Espolones pélvicos");
        jCheckBoxEscamasVertHilerasTransv = new JCheckBox("Escamas verticales en hileras transversales");
        jCheckBoxEscamasDorsalesQuilladas = new JCheckBox("Escamas dorsales quilladas");
        jCheckBoxEndemicoMexico = new JCheckBox("Endémico de México");
        jCheckBoxPeninsulaBajaCalifornia = new JCheckBox("Península de Baja California");
        jCheckBoxEstadoGuerrero = new JCheckBox("Estado de Guerrero");
        jCheckBoxEstadoMichoacan = new JCheckBox("Estado de Michoacán");
        jCheckBoxChiapasGuatemala = new JCheckBox("Chiapas o Guatemala");
        jCheckBoxHastaCostaRica = new JCheckBox("Hasta Costa Rica");
        jCheckBoxTamanoAdulto24cm = new JCheckBox("Tamaño adulto de 24 cm");
        jCheckBoxTamanoAdulto18cm = new JCheckBox("Tamaño adulto de 18 cm");
        jCheckBoxColorUniformeOscuro = new JCheckBox("Color uniforme oscuro");
        jCheckBoxColoracionRosadaPalida = new JCheckBox("Coloración rosada pálida");
        jCheckBoxHerbivoro = new JCheckBox("Herbívoros");
        jCheckBoxOmnivoro = new JCheckBox("Omnívoros");
        jCheckBoxCrestaDorsal = new JCheckBox("Cresta dorsal");
        jCheckBoxEspinosasCola = new JCheckBox("Espinas en la cola");
        jCheckBoxAdaptacionDesierto = new JCheckBox("Adaptación al desierto");
        jCheckBoxEndemicoIslas = new JCheckBox("Endémico de islas");
        jCheckBoxPeligroExtincion = new JCheckBox("En peligro de extinción");
        jCheckBoxTieneLamelas = new JCheckBox("Tiene lamelas");
        jCheckBoxEscamasEspecializadas = new JCheckBox("Escamas especializadas");
        jCheckBoxPapadaSuperReducida = new JCheckBox("Papada super reducida");
        jCheckBoxCapacidadAutotomiaCaudal = new JCheckBox("Capacidad de autotomía caudal");
        jCheckBoxPapadaExtensible = new JCheckBox("Papada extensible");
        jCheckBoxPapadaGrande = new JCheckBox("Papada grande");
        jCheckBoxPorosFemorales = new JCheckBox("Poros femorales");
        jCheckBoxColorVerdePredominante = new JCheckBox("Color verde predominante");
        jCheckBoxHabitatUrbano = new JCheckBox("Hábitat urbano");
        jCheckBoxDewlapRojo = new JCheckBox("Dewlap rojo");
        jCheckBoxEscamasRugosas = new JCheckBox("Escamas rugosas");
        jCheckBoxDistribucionTropical = new JCheckBox("Distribución tropical");
        jCheckBoxDietaHerbivora = new JCheckBox("Dieta herbívora");
        jCheckBoxPicoFuerteCrustaceos = new JCheckBox("Pico fuerte para crustáceos");
        jCheckBoxDietaPastosMarinos = new JCheckBox("Dieta de pastos marinos");
        jCheckBoxPupilaRedonda = new JCheckBox("Pupila redonda");
        jCheckBoxPatronAnillo = new JCheckBox("Patrón de anillo");
        jCheckBoxHabitatAcuatico = new JCheckBox("Hábitat acuático");
        jCheckBoxHabitatArboreo = new JCheckBox("Hábitat arbóreo");
        jCheckBoxExpandeCuello = new JCheckBox("Expande cuello");
        jCheckBoxColaComprimida = new JCheckBox("Cola comprimida");
        jCheckBoxEscamasVentralesDesarrolladas = new JCheckBox("Escamas ventrales desarrolladas");
        jCheckBoxActividadNocturna = new JCheckBox("Actividad nocturna");
        jCheckBoxEscamasEnFila = new JCheckBox("Escamas en fila");
        jCheckBoxPliegueLateral = new JCheckBox("Pliegue lateral");
        jCheckBoxColaPrensil = new JCheckBox("Cola prensil");
        jCheckBoxHabitatAsiatico = new JCheckBox("Hábitat asiático");
        jCheckBoxTamanoPequeno = new JCheckBox("Tamaño pequeño");
        jCheckBoxCuerpoDelgado = new JCheckBox("Cuerpo delgado");
        jCheckBoxTamanoGrande = new JCheckBox("Tamaño grande");
        jCheckBoxCuerpoLiso = new JCheckBox("Cuerpo liso");
        jCheckBoxCorredoresVeloces = new JCheckBox("Corredores veloces");
        jCheckBoxDiurnos = new JCheckBox("Diurnos");
        jCheckBoxColoracionOscura = new JCheckBox("Coloración oscura");
        jCheckBoxCrestaAlta = new JCheckBox("Cresta alta");
        jCheckBoxColaLarga = new JCheckBox("Cola larga");
        jCheckBoxEspinasCortas = new JCheckBox("Espinas cortas");
        jCheckBoxCincoCrestas = new JCheckBox("Cinco crestas");
        jCheckBoxCrestaDividida = new JCheckBox("Cresta dividida");
        jCheckBoxEscamasGrandes = new JCheckBox("Escamas grandes");
        jCheckBoxDietaCarnivora = new JCheckBox("Dieta carnívora");
        jCheckBoxBandaPectoral = new JCheckBox("Banda pectoral");
        jCheckBoxDorsoAmarillo = new JCheckBox("Dorso amarillo");
        jCheckBoxCabezaMuyGrande = new JCheckBox("Cabeza muy grande");
        jCheckBoxAnillosTricolor = new JCheckBox("Anillos tricolor");
        jCheckBoxAnillosNegrosAnchos = new JCheckBox("Anillos negros anchos");
        jCheckBoxCabezaNegra = new JCheckBox("Cabeza negra");
        jCheckBoxColaCorta = new JCheckBox("Cola corta");
        jCheckBoxDistribucionCentroamerica = new JCheckBox("Distribución en Centroamérica");
        jCheckBoxDistribucionSudamerica = new JCheckBox("Distribución en Sudamérica");
        jCheckBoxDistribucionMexico = new JCheckBox("Distribución en México");
        jCheckBoxEstadoOaxaca = new JCheckBox("Estado de Oaxaca");
        jCheckBoxHabitatSelva = new JCheckBox("Hábitat en la selva");
        jCheckBoxHabitatBosqueSeco = new JCheckBox("Hábitat en el bosque seco");
        jCheckBoxHabitatAcuario = new JCheckBox("Hábitat en acuario");
        jCheckBoxAnilloBlancoPresente = new JCheckBox("Anillo blanco presente");
        jCheckBoxColoracionRojiza = new JCheckBox("Coloración rojiza");
        jCheckBoxColoracionVerde = new JCheckBox("Coloración verde");
        jCheckBoxColoracionEsmeralda = new JCheckBox("Coloración esmeralda");
        jCheckBoxLabiosRojos = new JCheckBox("Labios rojos");
        jCheckBoxColaOscura = new JCheckBox("Cola oscura");
        jCheckBoxBandaDorsal = new JCheckBox("Banda dorsal");
        jCheckBoxCabezaAncha = new JCheckBox("Cabeza ancha");
        jCheckBoxOrejasVisibles = new JCheckBox("Orejas visibles");
        jCheckBoxEscamasQuilladas = new JCheckBox("Escamas quilladas");
        jCheckBoxOjosGrandes = new JCheckBox("Ojos grandes");


        // Paneles y agrupaciones
        pnlReino = createPanel("Reino", jCheckBoxUnicelulares, jCheckBoxFotosintesis, jCheckBoxEsporas, jCheckBoxAmbientesExtremos, jCheckBoxMovilidadActiva);
        pnlFilo = createPanel("Filo", jCheckBoxSimetriaRadial, jCheckBoxTejidosVerdaderos, jCheckBoxSegmentacion, jCheckBoxDigestivoCompleto, jCheckBoxNotocorda, jCheckBoxConchaCalcarea, jCheckBoxQuetas);
        pnlClase = createPanel("Clase", jCheckBoxSangreFria, jCheckBoxHuevoAmniotico, jCheckBoxGarrasDedos, jCheckBoxCorazonTresCamaras, jCheckBoxPielSecaEscamosa, jCheckBoxMandibulas, jCheckBoxAletasLobuladas, jCheckBoxRadiosOseosAletas, jCheckBoxEsqueletoOseo);
        pnlOrden = createPanel("Orden", jCheckBoxFecundacionInterna, jCheckBoxCaparazonOseo, jCheckBoxMudaPiel, jCheckBoxTercerOjoParietal, jCheckBoxCuidadoParental);
        pnlFamilia = createPanel("Familia", jCheckBoxDientesPleurodontes, jCheckBoxLenguaCortaNoBifida, jCheckBoxTermorregulador, jCheckBoxEscamasEspinosas, jCheckBoxExtremidadesReducidas, jCheckBoxOjosParpadosMoviles, jCheckBoxPupilasVerticales, jCheckBoxVenenoPotente, jCheckBoxAutotomiaCaudal, jCheckBoxHabitosArboricolas, jCheckBoxCarnivoros, jCheckBoxHuevosCascaraCalcarea, jCheckBoxMarino, jCheckBoxTerrestre, jCheckBoxEscudosAusentes, jCheckBoxCaparazonAlto, jCheckBoxCaparazonAplanado, jCheckBoxCabezaGrandeAlargada, jCheckBoxHabitatPrincipalUSA, jCheckBoxHabitatPrincipalAustralia);
        pnlGenero = createPanel("Género", jCheckBoxDosPatasTraseras, jCheckBoxOjosReducidos, jCheckBoxAdaptadoExcavar, jCheckBoxCuerpoAlargadoCilindrico, jCheckBoxSinPatas, jCheckBoxVenenoso, jCheckBoxPielOsteodermos, jCheckBoxLagartosParpadosMoviles, jCheckBoxGeckos, jCheckBoxEspolonesPelvicos, jCheckBoxEscamasVertHilerasTransv, jCheckBoxEscamasDorsalesQuilladas);
        pnlEspecie = createPanel("Especie", jCheckBoxEndemicoMexico, jCheckBoxPeninsulaBajaCalifornia, jCheckBoxEstadoGuerrero, jCheckBoxEstadoMichoacan, jCheckBoxChiapasGuatemala, jCheckBoxHastaCostaRica, jCheckBoxTamanoAdulto24cm, jCheckBoxTamanoAdulto18cm, jCheckBoxColorUniformeOscuro, jCheckBoxColoracionRosadaPalida);
        pnlAdicionales = createPanel("Características Adicionales", jCheckBoxHerbivoro, jCheckBoxOmnivoro, jCheckBoxCrestaDorsal, jCheckBoxEspinosasCola, jCheckBoxAdaptacionDesierto, jCheckBoxEndemicoIslas, jCheckBoxPeligroExtincion, jCheckBoxTieneLamelas, jCheckBoxEscamasEspecializadas, jCheckBoxPapadaSuperReducida, jCheckBoxCapacidadAutotomiaCaudal, jCheckBoxPapadaExtensible, jCheckBoxPapadaGrande, jCheckBoxPorosFemorales, jCheckBoxColorVerdePredominante, jCheckBoxHabitatUrbano, jCheckBoxDewlapRojo, jCheckBoxEscamasRugosas, jCheckBoxDistribucionTropical, jCheckBoxDietaHerbivora, jCheckBoxPicoFuerteCrustaceos, jCheckBoxDietaPastosMarinos, jCheckBoxPupilaRedonda, jCheckBoxPatronAnillo, jCheckBoxHabitatAcuatico, jCheckBoxHabitatArboreo, jCheckBoxExpandeCuello, jCheckBoxColaComprimida, jCheckBoxEscamasVentralesDesarrolladas, jCheckBoxActividadNocturna, jCheckBoxEscamasEnFila, jCheckBoxPliegueLateral, jCheckBoxColaPrensil, jCheckBoxHabitatAsiatico, jCheckBoxTamanoPequeno, jCheckBoxCuerpoDelgado, jCheckBoxTamanoGrande, jCheckBoxCuerpoLiso, jCheckBoxCorredoresVeloces, jCheckBoxDiurnos, jCheckBoxColoracionOscura, jCheckBoxCrestaAlta, jCheckBoxColaLarga, jCheckBoxEspinasCortas, jCheckBoxCincoCrestas, jCheckBoxCrestaDividida, jCheckBoxEscamasGrandes, jCheckBoxDietaCarnivora, jCheckBoxBandaPectoral, jCheckBoxDorsoAmarillo, jCheckBoxCabezaMuyGrande, jCheckBoxAnillosTricolor, jCheckBoxAnillosNegrosAnchos, jCheckBoxCabezaNegra, jCheckBoxColaCorta, jCheckBoxDistribucionCentroamerica, jCheckBoxDistribucionSudamerica, jCheckBoxDistribucionMexico, jCheckBoxEstadoOaxaca, jCheckBoxHabitatSelva, jCheckBoxHabitatBosqueSeco, jCheckBoxHabitatAcuario, jCheckBoxAnilloBlancoPresente, jCheckBoxColoracionRojiza, jCheckBoxColoracionVerde, jCheckBoxColoracionEsmeralda, jCheckBoxLabiosRojos, jCheckBoxColaOscura, jCheckBoxBandaDorsal, jCheckBoxCabezaAncha, jCheckBoxOrejasVisibles, jCheckBoxEscamasQuilladas, jCheckBoxOjosGrandes);
        
        // Botones
        jButton2 = new JButton("Salir");
        jLabel1 = new JLabel("Sistema Experto de Reptiles");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        // Configuración de los listeners para el flujo secuencial y la llamada al sistema experto
        setupSequencialListeners();
        
        // Panel principal para el contenido, usa BoxLayout para apilar verticalmente
        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new BoxLayout(mainContentPanel, BoxLayout.Y_AXIS));
        mainContentPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Agrega un poco de margen
        mainContentPanel.add(jLabel1);
        mainContentPanel.add(pnlReino);
        mainContentPanel.add(pnlFilo);
        mainContentPanel.add(pnlClase);
        mainContentPanel.add(pnlOrden);
        mainContentPanel.add(pnlFamilia);
        mainContentPanel.add(pnlGenero);
        mainContentPanel.add(pnlEspecie);
        mainContentPanel.add(pnlAdicionales);

        // Envuelve el mainContentPanel en un JScrollPane
        JScrollPane scrollPane = new JScrollPane(mainContentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Hace el scroll más suave

        // Panel para los botones
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(jButton2);

        // Configura el layout de la ventana principal usando BorderLayout
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
        pack();
        setSize(800, 600); // Establece un tamaño inicial razonable
    }

    private void setupInitialVisibility() {
        pnlReino.setVisible(true);
        pnlFilo.setVisible(false);
        pnlClase.setVisible(false);
        pnlOrden.setVisible(false);
        pnlFamilia.setVisible(false);
        pnlGenero.setVisible(false);
        pnlEspecie.setVisible(false);
        pnlAdicionales.setVisible(false);
    }
    
    private void setupSequencialListeners() {
        // Reino -> Filo
        jCheckBoxMovilidadActiva.addActionListener(e -> pnlFilo.setVisible(jCheckBoxMovilidadActiva.isSelected()));
        
        // Filo -> Clase
        jCheckBoxNotocorda.addActionListener(e -> pnlClase.setVisible(jCheckBoxNotocorda.isSelected()));
        
        // Clase -> Orden
        jCheckBoxPielSecaEscamosa.addActionListener(e -> pnlOrden.setVisible(jCheckBoxPielSecaEscamosa.isSelected()));
        
        // Orden -> Familia
        jCheckBoxFecundacionInterna.addActionListener(e -> pnlFamilia.setVisible(jCheckBoxFecundacionInterna.isSelected()));
        
        // Familia -> Género
        jCheckBoxVenenoPotente.addActionListener(e -> pnlGenero.setVisible(jCheckBoxVenenoPotente.isSelected()));

        // Género -> Especie
        jCheckBoxEndemicoMexico.addActionListener(e -> pnlEspecie.setVisible(jCheckBoxEndemicoMexico.isSelected()));
        
        // Especie -> Adicionales y llamada a la función principal
        jCheckBoxColoracionRosadaPalida.addActionListener(e -> {
            pnlAdicionales.setVisible(jCheckBoxColoracionRosadaPalida.isSelected());
            if (jCheckBoxColoracionRosadaPalida.isSelected()) {
                String resultado = objbr.clasificarReptilCompleto(
                    // ... todas las 100+ variables, como en tu código original ...
                    toSiNo(jCheckBoxUnicelulares), toSiNo(jCheckBoxFotosintesis), toSiNo(jCheckBoxEsporas), toSiNo(jCheckBoxAmbientesExtremos), toSiNo(jCheckBoxMovilidadActiva),
                    // Filo
                    toSiNo(jCheckBoxSimetriaRadial), toSiNo(jCheckBoxTejidosVerdaderos), toSiNo(jCheckBoxSegmentacion), toSiNo(jCheckBoxDigestivoCompleto), toSiNo(jCheckBoxNotocorda), toSiNo(jCheckBoxConchaCalcarea), toSiNo(jCheckBoxQuetas),
                    // Clase
                    toSiNo(jCheckBoxSangreFria), toSiNo(jCheckBoxHuevoAmniotico), toSiNo(jCheckBoxGarrasDedos), toSiNo(jCheckBoxCorazonTresCamaras), toSiNo(jCheckBoxPielSecaEscamosa), toSiNo(jCheckBoxMandibulas), toSiNo(jCheckBoxAletasLobuladas), toSiNo(jCheckBoxRadiosOseosAletas), toSiNo(jCheckBoxEsqueletoOseo),
                    // Orden
                    toSiNo(jCheckBoxFecundacionInterna), toSiNo(jCheckBoxCaparazonOseo), toSiNo(jCheckBoxMudaPiel), toSiNo(jCheckBoxTercerOjoParietal), toSiNo(jCheckBoxCuidadoParental),
                    // Familia
                    toSiNo(jCheckBoxDientesPleurodontes), toSiNo(jCheckBoxLenguaCortaNoBifida), toSiNo(jCheckBoxTermorregulador), toSiNo(jCheckBoxEscamasEspinosas), toSiNo(jCheckBoxExtremidadesReducidas), toSiNo(jCheckBoxOjosParpadosMoviles), toSiNo(jCheckBoxPupilasVerticales), toSiNo(jCheckBoxVenenoPotente), toSiNo(jCheckBoxAutotomiaCaudal), toSiNo(jCheckBoxHabitosArboricolas), toSiNo(jCheckBoxCarnivoros), toSiNo(jCheckBoxHuevosCascaraCalcarea), toSiNo(jCheckBoxMarino), toSiNo(jCheckBoxTerrestre), toSiNo(jCheckBoxEscudosAusentes), toSiNo(jCheckBoxCaparazonAlto), toSiNo(jCheckBoxCaparazonAplanado), toSiNo(jCheckBoxCabezaGrandeAlargada), toSiNo(jCheckBoxHabitatPrincipalUSA), toSiNo(jCheckBoxHabitatPrincipalAustralia),
                    // Genero
                    toSiNo(jCheckBoxDosPatasTraseras), toSiNo(jCheckBoxOjosReducidos), toSiNo(jCheckBoxAdaptadoExcavar), toSiNo(jCheckBoxCuerpoAlargadoCilindrico), toSiNo(jCheckBoxSinPatas), toSiNo(jCheckBoxVenenoso), toSiNo(jCheckBoxPielOsteodermos), toSiNo(jCheckBoxLagartosParpadosMoviles), toSiNo(jCheckBoxGeckos), toSiNo(jCheckBoxEspolonesPelvicos), toSiNo(jCheckBoxEscamasVertHilerasTransv), toSiNo(jCheckBoxEscamasDorsalesQuilladas),
                    // Especie
                    toSiNo(jCheckBoxEndemicoMexico), toSiNo(jCheckBoxPeninsulaBajaCalifornia), toSiNo(jCheckBoxEstadoGuerrero), toSiNo(jCheckBoxEstadoMichoacan), toSiNo(jCheckBoxChiapasGuatemala), toSiNo(jCheckBoxHastaCostaRica), toSiNo(jCheckBoxTamanoAdulto24cm), toSiNo(jCheckBoxTamanoAdulto18cm), toSiNo(jCheckBoxColorUniformeOscuro), toSiNo(jCheckBoxColoracionRosadaPalida),
                    // Características adicionales
                    toSiNo(jCheckBoxHerbivoro), toSiNo(jCheckBoxOmnivoro), toSiNo(jCheckBoxCrestaDorsal), toSiNo(jCheckBoxEspinosasCola), toSiNo(jCheckBoxAdaptacionDesierto), toSiNo(jCheckBoxEndemicoIslas), toSiNo(jCheckBoxPeligroExtincion),
                    // Variables para anolis
                    toSiNo(jCheckBoxTieneLamelas), toSiNo(jCheckBoxEscamasEspecializadas), toSiNo(jCheckBoxPapadaSuperReducida), toSiNo(jCheckBoxCapacidadAutotomiaCaudal), toSiNo(jCheckBoxPapadaExtensible), toSiNo(jCheckBoxPapadaGrande), toSiNo(jCheckBoxPorosFemorales), toSiNo(jCheckBoxColorVerdePredominante), toSiNo(jCheckBoxHabitatUrbano), toSiNo(jCheckBoxDewlapRojo), toSiNo(jCheckBoxEscamasRugosas),
                    // Variables para tortugas
                    toSiNo(jCheckBoxDistribucionTropical), toSiNo(jCheckBoxDietaHerbivora), toSiNo(jCheckBoxPicoFuerteCrustaceos), toSiNo(jCheckBoxDietaPastosMarinos),
                    // Variables para elápidos
                    toSiNo(jCheckBoxCuerpoCilindrico), toSiNo(jCheckBoxPupilaRedonda), toSiNo(jCheckBoxPatronAnillo), toSiNo(jCheckBoxHabitatAcuatico), toSiNo(jCheckBoxHabitatArboreo), toSiNo(jCheckBoxExpandeCuello), toSiNo(jCheckBoxColaComprimida), toSiNo(jCheckBoxEscamasVentralesDesarrolladas), toSiNo(jCheckBoxActividadNocturna),
                    // Variables para anguidos
                    toSiNo(jCheckBoxPatasReducidasAusentes), toSiNo(jCheckBoxColaMuyFragil), toSiNo(jCheckBoxEscamasEnFila), toSiNo(jCheckBoxPliegueLateral), toSiNo(jCheckBoxColaPrensil), toSiNo(jCheckBoxHabitatAsiatico), toSiNo(jCheckBoxTamanoPequeno), toSiNo(jCheckBoxCuerpoDelgado), toSiNo(jCheckBoxTamanoGrande), toSiNo(jCheckBoxCuerpoLiso),
                    // Variables para ctenosauras
                    toSiNo(jCheckBoxColaEspinosa), toSiNo(jCheckBoxCorredoresVeloces), toSiNo(jCheckBoxDiurnos), toSiNo(jCheckBoxColoracionOscura), toSiNo(jCheckBoxCrestaAlta), toSiNo(jCheckBoxColaLarga), toSiNo(jCheckBoxEspinasCortas), toSiNo(jCheckBoxCincoCrestas), toSiNo(jCheckBoxCrestaDividida), toSiNo(jCheckBoxEscamasGrandes), toSiNo(jCheckBoxDietaCarnivora), toSiNo(jCheckBoxBandaPectoral), toSiNo(jCheckBoxDorsoAmarillo),
                    // Variable para caretta
                    toSiNo(jCheckBoxCabezaMuyGrande),
                    // Variables para micrurus
                    toSiNo(jCheckBoxAnillosTricolor), toSiNo(jCheckBoxAnillosNegrosAnchos), toSiNo(jCheckBoxCabezaNegra), toSiNo(jCheckBoxColaCorta), toSiNo(jCheckBoxDistribucionCentroamerica), toSiNo(jCheckBoxDistribucionSudamerica), toSiNo(jCheckBoxDistribucionMexico), toSiNo(jCheckBoxEstadoOaxaca), toSiNo(jCheckBoxHabitatSelva), toSiNo(jCheckBoxHabitatBosqueSeco), toSiNo(jCheckBoxHabitatAcuario), toSiNo(jCheckBoxAnilloBlancoPresente),
                    // Variables para Abronia
                    toSiNo(jCheckBoxColoracionRojiza), toSiNo(jCheckBoxColoracionVerde), toSiNo(jCheckBoxColoracionEsmeralda), toSiNo(jCheckBoxLabiosRojos), toSiNo(jCheckBoxColaOscura), toSiNo(jCheckBoxBandaDorsal), toSiNo(jCheckBoxCabezaAncha), toSiNo(jCheckBoxOrejasVisibles), toSiNo(jCheckBoxEscamasQuilladas), toSiNo(jCheckBoxOjosGrandes));

                if (resultado != null) {
                    JOptionPane.showMessageDialog(null, "El reptil es: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo clasificar el reptil.");
                }
            }
        });
    }
    
    // Método auxiliar para crear paneles usando GridBagLayout con un título
    private JPanel createPanel(String title, JCheckBox... checkBoxes) {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(2, 5, 2, 5); // Margen interno
        
        // Agregar el título con estilo CSS en línea para tamaño y color
        JLabel titleLabel = new JLabel("<html><h3 style='color:red;'>" + title + "</h3></html>");
        panel.add(titleLabel, gbc);

        for (JCheckBox cb : checkBoxes) {
            // Configurar para texto multilínea
            cb.setVerticalTextPosition(SwingConstants.TOP);
            cb.setHorizontalTextPosition(SwingConstants.LEFT);
            cb.setFocusPainted(false);
            cb.setBorderPaintedFlat(true);
            
            // Permitir que el texto se ajuste
            cb.setUI(new WrapCheckBoxUI());
            
            panel.add(cb, gbc);
        }
        
        return panel;
    }

    private String toSiNo(JCheckBox checkbox) {
        return checkbox.isSelected() ? "si" : "no";
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jftv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jftv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jftv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jftv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jftv1().setVisible(true);
            }
        });
    }
    
    // Clase personalizada para CheckBox con texto ajustado
    class WrapCheckBoxUI extends BasicCheckBoxUI {
        @Override
        public Dimension getPreferredSize(JComponent c) {
            JCheckBox cb = (JCheckBox) c;
            String text = cb.getText();
            FontMetrics fm = cb.getFontMetrics(cb.getFont());
            
            // Calcular el ancho necesario para el texto
            int textWidth = fm.stringWidth(text);
            int availableWidth = Math.min(750, c.getParent().getWidth() - 50); // Ancho disponible
            
            if (availableWidth > 0 && textWidth > availableWidth) {
                // Si el texto es muy largo, calcular altura necesaria
                int lines = (int) Math.ceil((double) textWidth / availableWidth);
                int height = fm.getHeight() * lines + 20; // Altura basada en líneas
                return new Dimension(availableWidth + 30, Math.max(25, height));
            }
            
            return super.getPreferredSize(c);
        }
    }
}