


























































































































































































































import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Assignment {
	public static void main(String args[]){
	    HashMap<String,String> harry = new HashMap<>();

	    harry.put("AFG","Afghanistan");
		harry.put("RSA","South Africa (Republic of)");
		harry.put("AGO","Angola (Republic of)");
		harry.put("ALB","Albania (Republic of)");
		harry.put("ALG","Algeria (People's Democratic Republic of)");
		harry.put("AND","Andorra (Principality of)");
		harry.put("ARG","Argentine Republic");
		harry.put("ARM","Armenia (Republic of)");
		harry.put("ARS","Saudi Arabia (Kingdom of)");
		harry.put("ATG","Antigua and Barbuda");
		harry.put("AUS","Australia");
		harry.put("AUT","Austria");
		harry.put("AZE","Azerbaijani Republic");
		harry.put("BRA","Brazil (Federative Republic of)");
		harry.put("BHS","Bahamas (Commonwealth of the)");
		harry.put("BDI","Burundi (Republic of)");
		harry.put("BEL","Belgium");
		harry.put("BEN","Benin (Republic of)");
		harry.put("BFA","Burkina Faso");
		harry.put("BGD","Bangladesh (People's Republic of)");
		harry.put("BHR","Bahrain (Kingdom of)");
		harry.put("BIH","Bosnia and Herzegovina");
		harry.put("BLR","Belarus (Republic of)");
		harry.put("BLZ","Belize");
		harry.put("BOL","Bolivia (Republic of)");
		harry.put("BWA","Botswana (Republic of)");
		harry.put("BRB","Barbados");
		harry.put("BRM","Myanmar (Union of)");
		harry.put("BRU","Brunei Darussalam");
		harry.put("BTN","Bhutan (Kingdom of)");
		harry.put("BUL","Bulgaria (Republic of)");
		harry.put("CAF","Central African Republic");
		harry.put("CAN","Canada");
		harry.put("CBG","Cambodia (Kingdom of)");
		harry.put("CHL","Chile");
		harry.put("CHN","China (People's Republic of)");
		harry.put("CLM","Colombia (Republic of)");
		harry.put("CLN","Sri Lanka (Democratic Socialist Republic of)");
		harry.put("CME","Cameroon (Republic of)");
		harry.put("COD","Democratic Republic of the Congo");
		harry.put("COG","Congo (Republic of the)");
		harry.put("COM","Comoros (Union of the)");
		harry.put("CPV","Cape Verde (Republic of)");
		harry.put("CTI","Côte d'Ivoire (Republic of)");
		harry.put("CTR","Costa Rica");
		harry.put("CUB","Cuba");
		harry.put("CVA","Vatican City State");
		harry.put("CYP","Cyprus (Republic of)");
		harry.put("CZE","Czech Republic");
		harry.put("D","Germany (Federal Republic of)");
		harry.put("DJI","Djibouti (Republic of)");
		harry.put("DMA","Dominica (Commonwealth of)");
		harry.put("DNK","Denmark");
		harry.put("DOM","Dominican Republic");
		harry.put("ESP","Spain");
		harry.put("EGY","Egypt (Arab Republic of)");
		harry.put("EQA","Ecuador");
		harry.put("ERI","Eritrea");
		harry.put("EST","Estonia (Republic of)");
		harry.put("ETH","Ethiopia (Federal Democratic Republic of)");
		harry.put("FRA","France");
		harry.put("FIN","Finland");
		harry.put("FJI","Fiji (Republic of)");
		harry.put("FSM","Micronesia (Federated States of)");
		harry.put("G","United Kingdom of Great Britain and Northern Ireland");
		harry.put("GAB","Gabonese Republic");
		harry.put("GEO","Georgia");
		harry.put("GHA","Ghana");
		harry.put("GMB","Gambia (Republic of the)");
		harry.put("GNB","Guinea-Bissau (Republic of)");
		harry.put("GNE","Equatorial Guinea (Republic of)");
		harry.put("GRC","Greece");
		harry.put("GRD","Grenada");
		harry.put("GTM","Guatemala (Republic of)");
		harry.put("GUI","Guinea (Republic of)");
		harry.put("GUY","Guyana");
		harry.put("HND","Honduras (Republic of)");
		harry.put("HNG","Hungary (Republic of)");
		harry.put("HOL","Netherlands (Kingdom of the)");
		harry.put("HRV","Croatia (Republic of)");
		harry.put("HTI","Haiti (Republic of)");
		harry.put("I","Italy");
		harry.put("IND","India (Republic of)");
		harry.put("INS","Indonesia (Republic of)");
		harry.put("IRL","Ireland");
		harry.put("IRN","Iran (Islamic Republic of)");
		harry.put("IRQ","Iraq (Republic of)");
		harry.put("ISL","Iceland");
		harry.put("ISR","Israel (State of)");
		harry.put("J","Japan");
		harry.put("JMC","Jamaica");
		harry.put("JOR","Jordan (Hashemite Kingdom of)");
		harry.put("KAZ","Kazakhstan (Republic of)");
		harry.put("KEN","Kenya (Republic of)");
		harry.put("KGZ","Kyrgyz Republic");
		harry.put("KIR","Kiribati (Republic of)");
		harry.put("KNA","Saint Kitts and Nevis (Federation of)");
		harry.put("KOR","Korea (Republic of)");
		harry.put("KRE","Democratic People's Republic of Korea");
		harry.put("KWT","Kuwait (State of)");
		harry.put("LAO","Lao People's Democratic Republic");
		harry.put("LBN","Lebanon");
		harry.put("LBR","Liberia (Republic of)");
		harry.put("LBY","Socialist People's Libyan Arab Jamahiriya");	
		harry.put("LCA","Saint Lucia");
		harry.put("LIE","Liechtenstein (Principality of)");
		harry.put("LSO","Lesotho (Kingdom of)");
		harry.put("LTU","Lithuania (Republic of)");
		harry.put("LUX","Luxembourg");
		harry.put("LVA","Latvia (Republic of)");
		harry.put("MAU","Mauritius (Republic of)");
		harry.put("MCO","Monaco (Principality of)");
		harry.put("MDA","Moldova (Republic of)");
		harry.put("MDG","Madagascar (Republic of)");
		harry.put("MEX","Mexico");
		harry.put("MHL","Marshall Islands (Republic of the)");
		harry.put("MKD","Republic of Macedonia");
		harry.put("MLA","Malaysia");
		harry.put("MLD","Maldives (Republic of)");
		harry.put("MLI","Mali (Republic of)");
		harry.put("MLT","Malta");
		harry.put("MNE","Montenegro (Republic of)");
		harry.put("MNG","Mongolia");
		harry.put("MOZ","Mozambique (Republic of)");
		harry.put("MRC","Morocco (Kingdom of)");
		harry.put("MTN","Mauritania (Islamic Republic of)");
		harry.put("MWI","Malawi");
		harry.put("NCG","Nicaragua");
		harry.put("NGR","Niger (Republic of the)");
		harry.put("NIG","Nigeria (Federal Republic of)");
		harry.put("NMB","Namibia (Republic of)");
		harry.put("NOR","Norway");
		harry.put("NPL","Nepal");
		harry.put("NRU","Nauru (Republic of)");
		harry.put("NZL","New Zealand");
		harry.put("OMA","Oman (Sultanate of)");
		harry.put("PAK","Pakistan (Islamic Republic of)");
		harry.put("PHL","Philippines (Republic of the)");
		harry.put("PNG","Papua New Guinea");
		harry.put("PNR","Panama (Republic of)");
		harry.put("POL","Poland (Republic of)");
		harry.put("POR","Portugal");
		harry.put("PRG","Paraguay (Republic of)");
		harry.put("PRU","Peru");
		harry.put("QAT","Qatar (State of)");
		harry.put("ROU","Romania");
		harry.put("RRW","Rwandese Republic");
		harry.put("RUS","Russian Federation");
		harry.put("S","Sweden");
		harry.put("SDN","Sudan (Republic of the)");
		harry.put("SEN","Senegal (Republic of)");
		harry.put("SEY","Seychelles (Republic of)");
		harry.put("SLM","Solomon Islands");
		harry.put("SLV","El Salvador (Republic of)");
		harry.put("SMO","Samoa (Independent State of)");
		harry.put("SMR","San Marino (Republic of)");
		harry.put("SNG","Singapore (Republic of)");
		harry.put("SOM","Somali Democratic Republic");
		harry.put("SRB","Serbia (Republic of)");
		harry.put("SRL","Sierra Leone");
		harry.put("SSD","South Sudan (Republic of)");
		harry.put("STP","São Tomé and Príncipe (Democratic Republic of)");
		harry.put("SUI","Switzerland (Confederation of)");
		harry.put("SUR","Suriname (Republic of)");
		harry.put("SVK","Slovakia");
		harry.put("SVN","Slovenia (Republic of)");
		harry.put("SWZ","Swaziland (Kingdom of)");
		harry.put("SYR","Syrian Arab Republic");	
		harry.put("Tharry","Chad (Republic of)");
		harry.put("TGO","Togolese Republic");
		harry.put("THA","Thailand");
		harry.put("TJK","Tajikistan (Republic of)");
		harry.put("TKM","Turkmenistan");
		harry.put("TLS","Timor-Leste (Democratic Republic of)");
		harry.put("TON","Tonga (Kingdom of)");
		harry.put("TRD","Trinidad and Tobago");
		harry.put("TUN","Tunisia");
		harry.put("TUR","Turkey");
		harry.put("TUV","Tuvalu");
		harry.put("TZA","Tanzania (United Republic of)");
		harry.put("UAE","United Arab Emirates");
		harry.put("UGA","Uganda (Republic of)");
		harry.put("UKR","Ukraine");
		harry.put("URG","Uruguay (Eastern Republic of)");
		harry.put("USA","United States of America");
		harry.put("UZB","Uzbekistan (Republic of)");
		harry.put("VCT","Saint Vincent and the Grenadines");
		harry.put("VEN","Venezuela (Bolivarian Republic of)");
		harry.put("VTN","Vietnam (Socialist Republic of)");
		harry.put("VUT","Vanuatu (Republic of)");
		harry.put("YEM","Yemen (Republic of)");
		harry.put("ZMB","Zambia (Republic of)");
		harry.put("ZWE","Zimbabwe (Republic of)");
		harry.put("ABW","Aruba");
		harry.put("AIA","Anguilla");
		harry.put("ALS","Alaska (State of)");
		harry.put("AMS","Saint Paul and Amsterdam Islands");
		harry.put("AOE","Western Sahara");
		harry.put("ASC","Ascension Island");
		harry.put("ATA","Antarctic");
		harry.put("ATN","Netherlands Antilles");
		harry.put("AZR","Azores");
		harry.put("BER","Bermuda");
		harry.put("BIO","Chagos Islands (Indian Ocean)");
		harry.put("BVT","Bouvet Island");
		harry.put("CG7","CUB(Guantanamo) (7).[6]");
		harry.put("CHR","Christmas Island (Indian Ocean)");
		harry.put("CKH","Cook Islands");
		harry.put("CNR","Canary Islands");
		harry.put("CPT","Clipperton Island");
		harry.put("CRO","Crozet Archipelago");
		harry.put("CYM","Cayman Islands");
		harry.put("DGA","Diego Garcia");
		harry.put("FLK","Falkland Islands (Malvinas)");
		harry.put("FRO","Faroe Islands");
		harry.put("GCA","United Kingdom (Non-metropolitan) – Region 1");
		harry.put("GCC","United Kingdom – Region 3");
		harry.put("GDL","Guadeloupe (French Department of)");
		harry.put("GIB","Gibraltar");
		harry.put("GRL","Greenland");
		harry.put("GUF","Guiana (French Department of)");
		harry.put("GUM","Guam");
		harry.put("HKG","Hong Kong (Special Administrative Region of China)");
		harry.put("HMD","Heard and Mharryonald Islands");
		harry.put("HWA","Hawaii (State of)");
		harry.put("HWL","Howland Island");
		harry.put("ICO","Cocos (Keeling) Islands");
		harry.put("JAR","Jarvis Island");
		harry.put("JON","Johnston Island");
		harry.put("KER","Kerguelen Islands");
		harry.put("MAC","Macau (Special Administrative Region of China)");
		harry.put("MDR","Madeira");
		harry.put("MDW","Midway Islands");
		harry.put("MRA","Northern Mariana Islands (Commonwealth of the)");
		harry.put("MRN","Marion Island");
		harry.put("MRT","Martinique (French Department of)");
		harry.put("MSR","Montserrat");
		harry.put("MYT","Mayotte (Territorial Collectivity of)");
		harry.put("NCL","New Caledonia");
		harry.put("NFK","Norfolk Island");
		harry.put("NIU","Niue");
		harry.put("OCE","French Polynesia");
		harry.put("PAQ","Easter Island");
		harry.put("PHX","Phoenix Islands");
		harry.put("PLM","Palmyra Island");
		harry.put("PLW","Palau (Republic of)[7]");
		harry.put("PTC","Pitcairn Island");
		harry.put("PTR","Puerto Rico");
		harry.put("REU","Réunion (French Department of)");
		harry.put("RKS","Kosovo");
		harry.put("ROD","Rodrigues");
		harry.put("SCG","ex Serbia and Montenegro → SRB, MNE");
		harry.put("SHN","Saint Helena");
		harry.put("SMA","American Samoa");
		harry.put("SPM","Saint Pierre and Miquelon (Territorial Collectivity of)");
		harry.put("SWN","Swan Islands");
		harry.put("TCA","Turks and Caicos Islands");
		harry.put("TKL","Tokelau");
		harry.put("TRC","Tristan da Cunha");
		harry.put("VIR","United States Virgin Islands");
		harry.put("VRG","British Virgin Islands");
		harry.put("WAK","Wake Island");
		harry.put("WAL","Wallis and Futuna Islands");
		harry.put("XAA","shared throughout the world");
		harry.put("XAX","shared by several countries, but in a restricted area of the world");
		harry.put("XBR","special use");
		harry.put("XBY","Abyei area");
		harry.put("XCQ","ex Caroline Islands → FSM + PLW");
		harry.put("XCS","ex TCH Czechoslovakia → CZE + SVK");
		harry.put("XGZ","Gaza Strip");
		harry.put("XMM","inter-ship communications");
		harry.put("XOA","International Civil Aviation Organization");
		harry.put("XR1","Region 1 (RR 5.3)");
		harry.put("XR2","Region 2 (RR 5.4)");
		harry.put("XR3","Region 3 (RR 5.5)");
		harry.put("XRY","Antarctic Region (RR AP 26/5.2)");
		harry.put("XSC","ex SCG Serbia and Montenegro");
		harry.put("XSD","ex Republic of the Sudan before 14 July 2011 → SDN + SSD");
		harry.put("XSP","Spratly Islands");	
		harry.put("XSU","ex URS Soviet Union → RUS + …");
		harry.put("XUN","United Nations");
		harry.put("XWB","West Bank");
		harry.put("XWM","World Meteorological Organization");
		harry.put("XYU","ex YUG Yugoslavia → SCG… + HRV + BIH + SVN");
		harry.put("XYZ","pending further developments regarding the administration responsible");
		harry.put("XZZ","administrative status is subject to special arrangements");

		/*Iterator<Map.Entry<Integer,String>> it = harry.entrySet().iterator();
        while(it.hasNext()) {
        	Map.Entry<Integer,String> pair = it.next();
        	System.out.println(pair.getKey() + " is the country code of " + pair.getValue());
        }*/

        Scanner Input = new Scanner(System.in);
        String name = harry.get(Input.nextLine());
        System.out.println(name);
        
    }
}
	
