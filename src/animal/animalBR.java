package animal;

import Rule.*;

public class animalBR {

    //    declaracion de base de reglas
    BooleanRuleBase br = new BooleanRuleBase("test");
    //    declaracion de variables de regla
    RuleVariable Sangrecaliente;
    RuleVariable Plumas;
    RuleVariable Metamorfosis;
    RuleVariable Respiracionbranquial;
RuleVariable Corre;
    RuleVariable Vuela;
    RuleVariable Vertebrado1;
    RuleVariable Vertebrado2;
    String svertebrado;

    public void BaseReglas() {
    }

    public String getVertebrado1(String sangrecaliente,
            String plumas, String respiracionbranquial,
            String metamorfosis) {
        staterBR();
        Sangrecaliente.setValue(sangrecaliente);
        Plumas.setValue(plumas);
        Respiracionbranquial.setValue(respiracionbranquial);
        Metamorfosis.setValue(metamorfosis);

        br.forwardChain();
        svertebrado = Vertebrado1.getValue();

        return svertebrado;
    }

    public String getVertebrado2(String v1,String corre, String vuela) {
        staterBR();
        Vertebrado1.setValue(v1);
        Corre.setValue(corre);
        Vuela.setValue(vuela);
       
        br.forwardChain();
        svertebrado = Vertebrado2.getValue();

        return svertebrado;
    }
    public void staterBR() {
        //        instancias de variables de regla
        Sangrecaliente = new RuleVariable(br, "Sangrecaliente");
        Plumas = new RuleVariable(br, "Plumas");
        Metamorfosis = new RuleVariable(br, "Metamorfosis");
        Respiracionbranquial = new RuleVariable(br, "Respiracionbranquial");
Corre= new RuleVariable(br, "Corre");
Vuela= new RuleVariable(br, "Vuela");
        Vertebrado1 = new RuleVariable(br, "Vertebrado1");
        Vertebrado2 = new RuleVariable(br, "Vertebrado2");

        //        definicion de operadores logicos (condicionales)
        Condition igual = new Condition("=");

        //        creacion de reglas de validacion (Base de Reglas)
        // VERTEBRADOS 1   
        Rule ave = new Rule(br, "AVE",
                new Clause[]{new Clause(Sangrecaliente, igual, "si"),
                    new Clause(Plumas, igual, "si"),
                    new Clause(Respiracionbranquial, igual, "no"),
                    new Clause(Metamorfosis, igual, "no")},
                new Clause(Vertebrado1, igual, "AVE"));
        Rule mamifero = new Rule(br, "MAMIFERO",
                new Clause[]{new Clause(Sangrecaliente, igual, "si"), 
                    new Clause(Plumas, igual, "no"), 
                    new Clause(Respiracionbranquial, igual, "no"), 
                    new Clause(Metamorfosis, igual, "no")},
                new Clause(Vertebrado1, igual, "MAMIFERO"));
        Rule reptil = new Rule(br, "REPTIL",
                new Clause[]{new Clause(Sangrecaliente, igual, "no"), 
                    new Clause(Plumas, igual, "no"), 
                    new Clause(Respiracionbranquial, igual, "no"), 
                    new Clause(Metamorfosis, igual, "no")},
                new Clause(Vertebrado1, igual, "REPTIL"));
        Rule pez = new Rule(br, "PEZ",
                new Clause[]{new Clause(Sangrecaliente, igual, "no"), 
                    new Clause(Plumas, igual, "no"), 
                    new Clause(Respiracionbranquial, igual, "si"), 
                    new Clause(Metamorfosis, igual, "no")},
                new Clause(Vertebrado1, igual, "PEZ"));
        Rule anfibio = new Rule(br, "ANFIBIO",
                new Clause[]{new Clause(Sangrecaliente, igual, "no"), 
                    new Clause(Plumas, igual, "no"), 
                    new Clause(Respiracionbranquial, igual, "no"), 
                    new Clause(Metamorfosis, igual, "si")},
                new Clause(Vertebrado1, igual, "ANFIBIO"));
        
         // VERTEBRADOS 2
         Rule paleognathae = new Rule(br, "PALEOGNATHAE",
                new Clause[]{new Clause(Vertebrado1, igual, "AVE"),
                    new Clause(Corre, igual, "si"),
                    new Clause(Vuela, igual, "no")},
                new Clause(Vertebrado2, igual, "PALEOGNATHAE"));
        Rule neognathae = new Rule(br, "NEOGNATHAE",
                new Clause[]{new Clause(Vertebrado1, igual, "AVE"),
                    new Clause(Corre, igual, "si"),
                    new Clause(Vuela, igual, "si")},
                new Clause(Vertebrado2, igual, "NEOGNATHAE"));
    }
}
