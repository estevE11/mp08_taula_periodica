package com.example.periodictable;

import java.util.Random;

public class Elements {

    private static Random r = new Random();

    public static Element[] elements = {
            new Element("H", 1, "no metàl·lic", "Hidrogen", "1.00794(4)", "1s1", "gas"),
            new Element("H", 1, "no metàl·lic", "Hidrogen", "1.00794(4)", "1s1", "gas"),
            new Element("He", 2, "gas noble", "Heli", "4.002602(2)", "1s2", "gas"),
            new Element("Li", 3, "metall alcalí", "Liti", "6.941(2)", "[He] 2s1", "sòlid"),
            new Element("Be", 4, "metall alcalino-terrós", "Beril·li", "9.012182(3)", "[He] 2s2", "sòlid"),
            new Element("B", 5, "metal·loide", "Bor", "10.811(7)", "[He] 2s2 2p1", "sòlid"),
            new Element("C", 6, "no metàl·lic", "Carboni", "12.0107(8)", "[He] 2s2 2p2", "sòlid"),
            new Element("N", 7, "no metàl·lic", "Nitrogen", "14.0067(2)", "[He] 2s2 2p3", "gas"),
            new Element("O", 8, "no metàl·lic", "Oxigen", "15.9994(3)", "[He] 2s2 2p4", "gas"),
            new Element("F", 9, "halògen", "Fluor", "18.9984032(5)", "[He] 2s2 2p5", "gas"),
            new Element("Ne", 10, "gas noble", "Neó", "20.1797(6)", "[He] 2s2 2p6", "gas"),
            new Element("Na", 11, "metall alcalí", "Sodi", "22.98976928(2)", "[Ne] 3s1", "sòlid"),
            new Element("Mg", 12, "metall alcalino-terrós", "Magnesi", "24.3050(6)", "[Ne] 3s2", "sòlid"),
            new Element("Al", 13, "metall post-transició", "Alumini", "26.9815386(8)", "[Ne] 3s2 3p1", "sòlid"),
            new Element("Si", 14, "metal·loide", "Silici", "28.0855(3)", "[Ne] 3s2 3p2", "sòlid"),
            new Element("P", 15, "no metàl·lic", "Fòsfor", "30.973762(2)", "[Ne] 3s2 3p3", "sòlid"),
            new Element("S", 16, "no metàl·lic", "Sofre", "32.065(5)", "[Ne] 3s2 3p4", "sòlid"),
            new Element("Cl", 17, "halògen", "Clor", "35.453(2)", "[Ne] 3s2 3p5", "gas"),
            new Element("Ar", 18, "gas noble", "Argó", "39.948(1)", "[Ne] 3s2 3p6", "gas"),
            new Element("K", 19, "metall alcalí", "Potassi", "39.0983(1)", "[Ar] 4s1", "sòlid"),
            new Element("Ca", 20, "metall alcalino-terrós", "Calci", "40.078(4)", "[Ar] 4s2", "sòlid"),
            new Element("Sc", 21, "metall de transició", "Scandium", "44.955912(6)", "[Ar] 3d1 4s2", "sòlid"),
            new Element("Ti", 22, "metall de transició", "Titani", "47.867(1)", "[Ar] 3d2 4s2", "sòlid"),
            new Element("V", 23, "metall de transició", "Vanadi", "50.9415(1)", "[Ar] 3d3 4s2", "sòlid"),
            new Element("Cr", 24, "metall de transició", "Crom", "51.9961(6)", "[Ar] 3d5 4s1", "sòlid"),
            new Element("Mn", 25, "metall de transició", "Manganès", "54.938045(5)", "[Ar] 3d5 4s2", "sòlid"),
            new Element("Fe", 26, "metall de transició", "Ferro", "55.845(2)", "[Ar] 3d6 4s2", "sòlid"),
            new Element("Co", 27, "metall de transició", "Cobalt", "58.933195(5)", "[Ar] 3d7 4s2", "sòlid"),
            new Element("Ni", 28, "metall de transició", "Níquel", "58.6934(4)", "[Ar] 3d8 4s2", "sòlid"),
            new Element("Cu", 29, "metall de transició", "Coure", "63.546(3)", "[Ar] 3d10 4s1", "sòlid"),
            new Element("Zn", 30, "metall de transició", "Zinc", "65.38(2)", "[Ar] 3d10 4s2", "sòlid"),
            new Element("Ga", 31, "metall post-transició", "Gal·li", "69.723(1)", "[Ar] 3d10 4s2 4p1", "sòlid"),
            new Element("Ge", 32, "metal·loide", "Germani", "72.64(1)", "[Ar] 3d10 4s2 4p2", "sòlid"),
            new Element("As", 33, "metal·loide", "Arsènic", "74.92160(2)", "[Ar] 3d10 4s2 4p3", "sòlid"),
            new Element("Se", 34, "no metàl·lic", "Seleni", "78.96(3)", "[Ar] 3d10 4s2 4p4", "sòlid"),
            new Element("Br", 35, "halògen", "Brom", "79.904(1)", "[Ar] 3d10 4s2 4p5", "líquid"),
            new Element("Kr", 36, "gas noble", "Krypton", "83.798(2)", "[Ar] 3d10 4s2 4p6", "gas"),
            new Element("Rb", 37, "metall alcalí", "Rubidi", "85.4678(3)", "[Kr] 5s1", "sòlid"),
            new Element("Sr", 38, "metall alcalino-terrós", "Estronci", "87.62(1)", "[Kr] 5s2", "sòlid"),
            new Element("Y", 39, "metall de transició", "Itri", "88.90585(2)", "[Kr] 4d1 5s2", "sòlid"),
            new Element("Zr", 40, "metall de transició", "Zirconi", "91.224(2)", "[Kr] 4d2 5s2", "sòlid"),
            new Element("Nb", 41, "metall de transició", "Niobi", "92.90638(2)", "[Kr] 4d4 5s1", "sòlid"),
            new Element("Mo", 42, "metall de transició", "Molibdè", "95.96(2)", "[Kr] 4d5 5s1", "sòlid"),
            new Element("Tc", 43, "metall de transició", "Tecneci", "98", "[Kr] 4d5 5s2", "sòlid"),
            new Element("Ru", 44, "metall de transició", "Ruteni", "101.07(2)", "[Kr] 4d7 5s1", "sòlid"),
            new Element("Rh", 45, "metall de transició", "Rodi", "102.90550(2)", "[Kr] 4d8 5s1", "sòlid"),
            new Element("Pd", 46, "metall de transició", "Pal·ladi", "106.42(1)", "[Kr] 4d10", "sòlid"),
            new Element("Ag", 47, "metall de transició", "Plata", "107.8682(2)", "[Kr] 4d10 5s1", "sòlid"),
            new Element("Cd", 48, "metall de transició", "Cadmi", "112.411(8)", "[Kr] 4d10 5s2", "sòlid"),
            new Element("In", 49, "metall post-transició", "Indi", "114.818(3)", "[Kr] 4d10 5s2 5p1", "sòlid"),
            new Element("Sn", 50, "metall post-transició", "Llauna", "118.710(7)", "[Kr] 4d10 5s2 5p2", "sòlid"),
            new Element("Sb", 51, "metal·loide", "Antimoni", "121.760(1)", "[Kr] 4d10 5s2 5p3", "sòlid"),
            new Element("Te", 52, "metal·loide", "Tel·luri", "127.60(3)", "[Kr] 4d10 5s2 5p4", "sòlid"),
            new Element("I", 53, "halògen", "Iode", "126.90447(3)", "[Kr] 4d10 5s2 5p5", "sòlid"),
            new Element("Xe", 54, "gas noble", "Xenó", "131.293(6)", "[Kr] 4d10 5s2 5p6", "gas"),
            new Element("Cs", 55, "metall alcalí", "Cesi", "132.9054519(2)", "[Xe] 6s1", "sòlid"),
            new Element("Ba", 56, "metall alcalino-terrós", "Bari", "137.327(7)", "[Xe] 6s2", "sòlid"),
            new Element("La", 57, "lanthanoide", "Lantà", "138.90547(7)", "[Xe] 5d1 6s2", "sòlid"),
            new Element("Ce", 58, "lanthanoide", "Ceri", "140.116(1)", "[Xe] 4f1 5d1 6s2", "sòlid"),
            new Element("Pr", 59, "lanthanoide", "Praseodimi", "140.90765(2)", "[Xe] 4f3 6s2", "sòlid"),
            new Element("Nd", 60, "lanthanoide", "Neodimi", "144.242(3)", "[Xe] 4f4 6s2", "sòlid"),
            new Element("Pm", 61, "lanthanoide", "Prometeu", "145", "[Xe] 4f5 6s2", "sòlid"),
            new Element("Sm", 62, "lanthanoide", "Samari", "150.36(2)", "[Xe] 4f6 6s2", "sòlid"),
            new Element("Eu", 63, "lanthanoide", "Europium", "151.964(1)", "[Xe] 4f7 6s2", "sòlid"),
            new Element("Gd", 64, "lanthanoide", "Gadolinium", "157.25(3)", "[Xe] 4f7 5d1 6s2", "sòlid"),
            new Element("Tb", 65, "lanthanoide", "Terbi", "158.92535(2)", "[Xe] 4f9 6s2", "sòlid"),
            new Element("Dy", 66, "lanthanoide", "Disprosi", "162.500(1)", "[Xe] 4f10 6s2", "sòlid"),
            new Element("Ho", 67, "lanthanoide", "Holmium", "164.93032(2)", "[Xe] 4f11 6s2", "sòlid"),
            new Element("Er", 68, "lanthanoide", "Erbi", "167.259(3)", "[Xe] 4f12 6s2", "sòlid"),
            new Element("Tm", 69, "lanthanoide", "Tuli", "168.93421(2)", "[Xe] 4f13 6s2", "sòlid"),
            new Element("Yb", 70, "lanthanoide", "Itterbi", "173.054(5)", "[Xe] 4f14 6s2", "sòlid"),
            new Element("Lu", 71, "lanthanoide", "Luteci", "174.9668(1)", "[Xe] 4f14 5d1 6s2", "sòlid"),
            new Element("Hf", 72, "metall de transició", "Hafnium", "178.49(2)", "[Xe] 4f14 5d2 6s2", "sòlid"),
            new Element("Ta", 73, "metall de transició", "Tàntal", "180.94788(2)", "[Xe] 4f14 5d3 6s2", "sòlid"),
            new Element("W", 74, "metall de transició", "Tungstè", "183.84(1)", "[Xe] 4f14 5d4 6s2", "sòlid"),
            new Element("Re", 75, "metall de transició", "Reni", "186.207(1)", "[Xe] 4f14 5d5 6s2", "sòlid"),
            new Element("Os", 76, "metall de transició", "Osmi", "190.23(3)", "[Xe] 4f14 5d6 6s2", "sòlid"),
            new Element("Ir", 77, "metall de transició", "Iridi", "192.217(3)", "[Xe] 4f14 5d7 6s2", "sòlid"),
            new Element("Pt", 78, "metall de transició", "Platí", "195.084(9)", "[Xe] 4f14 5d9 6s1", "sòlid"),
            new Element("Au", 79, "metall de transició", "Or", "196.966569(4)", "[Xe] 4f14 5d10 6s1", "sòlid"),
            new Element("Hg", 80, "metall de transició", "Mercuri", "200.59(2)", "[Xe] 4f14 5d10 6s2", "líquid"),
            new Element("Tl", 81, "metall post-transició", "Tal·li", "204.3833(2)", "[Xe] 4f14 5d10 6s2 6p1", "sòlid"),
            new Element("Pb", 82, "metall post-transició", "Dirigir", "207.2(1)", "[Xe] 4f14 5d10 6s2 6p2", "sòlid"),
            new Element("Bi", 83, "metall post-transició", "Bismut", "208.98040(1)", "[Xe] 4f14 5d10 6s2 6p3", "sòlid"),
            new Element("Po", 84, "metal·loide", "Polonium", "209", "[Xe] 4f14 5d10 6s2 6p4", "sòlid"),
            new Element("At", 85, "halògen", "Astàtic", "210", "[Xe] 4f14 5d10 6s2 6p5", "sòlid"),
            new Element("Rn", 86, "gas noble", "Radó", "222", "[Xe] 4f14 5d10 6s2 6p6", "gas"),
            new Element("Fr", 87, "metall alcalí", "Francium", "223", "[Rn] 7s1", "sòlid"),
            new Element("Ra", 88, "metall alcalino-terrós", "Ràdio", "226", "[Rn] 7s2", "sòlid"),
            new Element("Ac", 89, "actinoide", "Actinium", "227", "[Rn] 6d1 7s2", "sòlid"),
            new Element("Th", 90, "actinoide", "Tori", "232.03806(2)", "[Rn] 6d2 7s2", "sòlid"),
            new Element("Pa", 91, "actinoide", "Protactini", "231.03588(2)", "[Rn] 5f2 6d1 7s2", "sòlid"),
            new Element("U", 92, "actinoide", "Urani", "238.02891(3)", "[Rn] 5f3 6d1 7s2", "sòlid"),
            new Element("Np", 93, "actinoide", "Neptuni", "237", "[Rn] 5f4 6d1 7s2", "sòlid"),
            new Element("Pu", 94, "actinoide", "Plutoni", "244", "[Rn] 5f6 7s2", "sòlid"),
            new Element("Am", 95, "actinoide", "Americi", "243", "[Rn] 5f7 7s2", "sòlid"),
            new Element("Cm", 96, "actinoide", "Curium", "247", "[Rn] 5f7 6d1 7s2", "sòlid"),
            new Element("Bk", 97, "actinoide", "Berkelium", "247", "[Rn] 5f9 7s2", "sòlid"),
            new Element("Cf", 98, "actinoide", "Californium", "251", "[Rn] 5f10 7s2", "sòlid"),
            new Element("Es", 99, "actinoide", "Einsteinium", "252", "[Rn] 5f11 7s2", "sòlid"),
            new Element("Fm", 100, "actinoide", "Fermium", "257", "[Rn] 5f12 7s2", "sintètic"),
            new Element("Md", 101, "actinoide", "Mendelevi", "258", "[Rn] 5f13 7s2", "sintètic"),
            new Element("No", 102, "actinoide", "Nobelium", "259", "[Rn] 5f14 7s2", "sintètic"),
            new Element("Lr", 103, "metall de transició", "Lawrencium", "262", "[Rn] 5f14 7s2 7p1", "sintètic"),
            new Element("Rf", 104, "metall de transició", "Rutherfordium", "267", "[Rn] 5f14 6d2 7s2", "sintètic"),
            new Element("Db", 105, "metall de transició", "Dubnium", "268", "[Rn] 5f14 6d3 7s2", "sintètic"),
            new Element("Sg", 106, "metall de transició", "Seaborgium", "271", "[Rn] 5f14 6d4 7s2", "sintètic"),
            new Element("Bh", 107, "metall de transició", "Bohrium", "272", "[Rn] 5f14 6d5 7s2", "sintètic"),
            new Element("Hs", 108, "metall de transició", "Hassium", "270", "[Rn] 5f14 6d6 7s2", "sintètic"),
            new Element("Mt", 109, "metall de transició", "Meitnerium", "276", "[Rn] 5f14 6d7 7s2", "sintètic"),
            new Element("Ds", 110, "metall de transició", "Darmstadtium", "281", "[Rn] 5f14 6d9 7s1", "sintètic"),
            new Element("Rg", 111, "metall de transició", "Roentgenium", "280", "[Rn] 5f14 6d10 7s1", "sintètic"),
            new Element("Cn", 112, "metall de transició", "Copernicium", "285", "[Rn] 5f14 6d10 7s2", "sintètic"),
            new Element("Nh", 113, "metall post-transició", "Nihonium", "284", "[Rn] 5f14 6d10 7s2 7p1", "sintètic"),
            new Element("Fl", 114, "metall post-transició", "Flerovium", "289", "[Rn] 5f14 6d10 7s2 7p2", "sintètic"),
            new Element("Mc", 115, "metall post-transició", "Moscovium", "288", "[Rn] 5f14 6d10 7s2 7p3", "sintètic"),
            new Element("Lv", 116, "metall post-transició", "Livermorium", "293", "[Rn] 5f14 6d10 7s2 7p4", "sintètic"),
            new Element("Ts", 117, "metall post-transició", "Tennessina", "294", "[Rn] 5f14 6d10 7s2 7p5", "sintètic"),
            new Element("Og", 118, "gas noble", "Oganesson", "294", "[Rn] 5f14 6d10 7s2 7p6", "sintètic"),
    };

    public static String getParameterById(int elID, int param) {
        switch (param) {
            case 0:
                return elements[elID].getType();
            case 1:
                return elements[elID].getDefaultState();
            case 2:
                return elements[elID].getAtomicMass();
            case 3:
                return elements[elID].getElecConfig();
            default:
                return "Nan";
        }
    }

    public static String getParameterName(int param) {
        switch (param) {
            case 0:
                return "tipus";
            case 1:
                return "estat";
            case 2:
                return "massa atomica";
            case 3:
                return "configuració electica";
            default:
                return "Nan";
        }
    }

    public static Element getRandomElement() {
        return elements[r.nextInt(elements.length)];
    }
}
