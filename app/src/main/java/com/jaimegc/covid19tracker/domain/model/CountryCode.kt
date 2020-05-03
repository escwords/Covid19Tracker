package com.jaimegc.covid19tracker.domain.model

/**
 *  Adapted from https://github.com/pablisco/virustrend/
 */
enum class CountryCode(val countryName: String, val slug: String, val code: String) {
    Afghanistan(countryName = "Afghanistan", slug = "afghanistan", code = "AF"),
    Albania(countryName = "Albania", slug = "albania", code = "AL"),
    Algeria(countryName = "Algeria", slug = "algeria", code = "DZ"),
    AntiguaAndBarbuda(countryName = "Antigua and Barbuda", slug = "antigua_and_barbuda", code = "AG"),
    Andorra(countryName = "Andorra", slug = "andorra", code = "AD"),
    Angola(countryName = "Angola", slug = "angola", code = "AO"),
    Argentina(countryName = "Argentina", slug = "argentina", code = "AR"),
    Armenia(countryName = "Armenia", slug = "armenia", code = "AM"),
    Australia(countryName = "Australia", slug = "australia", code = "AU"),
    Austria(countryName = "Austria", slug = "austria", code = "AT"),
    Azerbaijan(countryName = "Azerbaijan", slug = "azerbaijan", code = "AZ"),
    Bahamas(countryName = "Bahamas", slug = "bahamas", code = "BS"),
    Bahrain(countryName = "Bahrain", slug = "bahrain", code = "BH"),
    Bangladesh(countryName = "Bangladesh", slug = "bangladesh", code = "BD"),
    Barbados(countryName = "Barbados", slug = "barbados", code = "BB"),
    Belarus(countryName = "Belarus", slug = "belarus", code = "BY"),
    Belgium(countryName = "Belgium", slug = "belgium", code = "BE"),
    Belize(countryName = "Belize", slug = "belize", code = "BZ"),
    Benin(countryName = "Benin", slug = "benin", code = "BJ"),
    Bhutan(countryName = "Bhutan", slug = "bhutan", code = "BT"),
    Bolivia(countryName = "Bolivia", slug = "bolivia", code = "BO"),
    BosniaAndHerzegovina(
        countryName = "Bosnia and Herzegovina",
        slug = "bosnia_and_herzegovina",
        code = "BA"
    ),
    Brazil(countryName = "Brazil", slug = "brazil", code = "BR"),
    Brunei(countryName = "Brunei", slug = "brunei", code = "BN"),
    Bulgaria(countryName = "Bulgaria", slug = "bulgaria", code = "BG"),
    BurkinaFaso(countryName = "Burkina Faso", slug = "burkina_faso", code = "BF"),
    CaboVerde(countryName = "Cabo Verde", slug = "cabo_verde", code = "CV"),
    Cambodia(countryName = "Cambodia", slug = "cambodia", code = "KH"),
    Cameroon(countryName = "Cameroon", slug = "cameroon", code = "CM"),
    Canada(countryName = "Canada", slug = "canada", code = "CA"),
    CentralAfricanRepublic(
        countryName = "Central African Republic",
        slug = "central_african_republic",
        code = "CF"
    ),
    Chad(countryName = "Chad", slug = "chad", code = "TD"),
    Chile(countryName = "Chile", slug = "chile", code = "CL"),
    China(countryName = "China", slug = "china", code = "CN"),
    Colombia(countryName = "Colombia", slug = "colombia", code = "CO"),
    CongoBrazzaville(
        countryName = "Congo (Brazzaville)",
        slug = "congo_(brazzaville)",
        code = "CG"
    ),
    CongoKinshasa(countryName = "Congo (Kinshasa)", slug = "congo_(kinshasa)", code = "CD"),
    CostaRica(countryName = "Costa Rica", slug = "costa_rica", code = "CR"),
    CotedIvoire(countryName = "Cote d'Ivoire", slug = "cote_divoire", code = "CI"),
    Croatia(countryName = "Croatia", slug = "croatia", code = "HR"),
    Cuba(countryName = "Cuba", slug = "cuba", code = "CU"),
    Cyprus(countryName = "Cyprus", slug = "cyprus", code = "CY"),
    Czechia(countryName = "Czechia", slug = "czechia", code = "CZ"),
    Denmark(countryName = "Denmark", slug = "denmark", code = "DK"),
    Djibouti(countryName = "Djibouti", slug = "djibouti", code = "DJ"),
    Dominica(countryName = "Dominica", slug = "dominica", code = "DM"),
    DominicanRepublic(countryName = "Dominican Republic", slug = "dominican_republic", code = "DO"),
    Ecuador(countryName = "Ecuador", slug = "ecuador", code = "EC"),
    EastTimor(countryName = "East Timor", slug = "east_timor", code = "TP"),
    Egypt(countryName = "Egypt", slug = "egypt", code = "EG"),
    ElSalvador(countryName = "El Salvador", slug = "el_salvador", code = "SV"),
    EquatorialGuinea(countryName = "Equatorial Guinea", slug = "equatorial_guinea", code = "GQ"),
    Eritrea(countryName = "Eritrea", slug = "eritrea", code = "ER"),
    Estonia(countryName = "Estonia", slug = "estonia", code = "EE"),
    Eswatini(countryName = "Eswatini", slug = "eswatini", code = "SZ"),
    Ethiopia(countryName = "Ethiopia", slug = "ethiopia", code = "ET"),
    Fiji(countryName = "Fiji", slug = "fiji", code = "FJ"),
    Finland(countryName = "Finland", slug = "finland", code = "FI"),
    France(countryName = "France", slug = "france", code = "FR"),
    Gabon(countryName = "Gabon", slug = "gabon", code = "GA"),
    Gambia(countryName = "Gambia", slug = "gambia", code = "GM"),
    Georgia(countryName = "Georgia", slug = "georgia", code = "GE"),
    Germany(countryName = "Germany", slug = "germany", code = "DE"),
    Ghana(countryName = "Ghana", slug = "ghana", code = "GH"),
    Greece(countryName = "Greece", slug = "greece", code = "GR"),
    Grenada(countryName = "Grenada", slug = "grenada", code = "GD"),
    Guatemala(countryName = "Guatemala", slug = "guatemala", code = "GT"),
    Guernsey(countryName = "Guernsey", slug = "guernsey", code = "GG"),
    Guinea(countryName = "Guinea", slug = "guinea", code = "GN"),
    GuineaBissau(countryName = "Guinea_Bissau", slug = "guinea-bissau", code = "GW"),
    Guyana(countryName = "Guyana", slug = "guyana", code = "GY"),
    Haiti(countryName = "Haiti", slug = "haiti", code = "HT"),
    Honduras(countryName = "Honduras", slug = "honduras", code = "HN"),
    HolySee(countryName = "Holy See", slug = "holy_see", code = "VA"),
    Hungary(countryName = "Hungary", slug = "hungary", code = "HU"),
    Iceland(countryName = "Iceland", slug = "iceland", code = "IS"),
    India(countryName = "India", slug = "india", code = "IN"),
    Indonesia(countryName = "Indonesia", slug = "indonesia", code = "ID"),
    Iran(countryName = "Iran", slug = "iran", code = "IR"),
    Iraq(countryName = "Iraq", slug = "iraq", code = "IQ"),
    Ireland(countryName = "Ireland", slug = "ireland", code = "IE"),
    Israel(countryName = "Israel", slug = "israel", code = "IL"),
    Italy(countryName = "Italy", slug = "italy", code = "IT"),
    Jamaica(countryName = "Jamaica", slug = "jamaica", code = "JM"),
    Japan(countryName = "Japan", slug = "japan", code = "JP"),
    Jersey(countryName = "Jersey", slug = "jersey", code = "JE"),
    Jordan(countryName = "Jordan", slug = "jordan", code = "JO"),
    Kazakhstan(countryName = "Kazakhstan", slug = "kazakhstan", code = "KZ"),
    Kenya(countryName = "Kenya", slug = "kenya", code = "KE"),
    KoreaSouth(countryName = "Korea, South", slug = "korea,_south", code = "KR"),
    Kosovo(countryName = "Kosovo", slug = "kosovo", code = "XK"),
    Kuwait(countryName = "Kuwait", slug = "kuwait", code = "KW"),
    Kyrgyzstan(countryName = "Kyrgyzstan", slug = "kyrgyzstan", code = "KG"),
    Laos(countryName = "Laos", slug = "laos", code = "LA"),
    Latvia(countryName = "Latvia", slug = "latvia", code = "LV"),
    Lebanon(countryName = "Lebanon", slug = "lebanon", code = "LB"),
    Liberia(countryName = "Liberia", slug = "liberia", code = "LR"),
    Libya(countryName = "Libya", slug = "libya", code = "LY"),
    Liechtenstein(countryName = "Liechtenstein", slug = "liechtenstein", code = "LI"),
    Lithuania(countryName = "Lithuania", slug = "lithuania", code = "LT"),
    Luxembourg(countryName = "Luxembourg", slug = "luxembourg", code = "LU"),
    Madagascar(countryName = "Madagascar", slug = "madagascar", code = "MG"),
    Malaysia(countryName = "Malaysia", slug = "malaysia", code = "MY"),
    Maldives(countryName = "Maldives", slug = "maldives", code = "MV"),
    Mali(countryName = "Mali", slug = "mali", code = "ML"),
    Malta(countryName = "Malta", slug = "malta", code = "MT"),
    Mauritania(countryName = "Mauritania", slug = "mauritania", code = "MR"),
    Mauritius(countryName = "Mauritius", slug = "mauritius", code = "MU"),
    Mexico(countryName = "Mexico", slug = "mexico", code = "MX"),
    Moldova(countryName = "Moldova", slug = "moldova", code = "MD"),
    Monaco(countryName = "Monaco", slug = "monaco", code = "MC"),
    Mongolia(countryName = "Mongolia", slug = "mongolia", code = "MN"),
    Montenegro(countryName = "Montenegro", slug = "montenegro", code = "ME"),
    Morocco(countryName = "Morocco", slug = "morocco", code = "MA"),
    Mozambique(countryName = "Mozambique", slug = "mozambique", code = "MZ"),
    Namibia(countryName = "Namibia", slug = "namibia", code = "NA"),
    Nepal(countryName = "Nepal", slug = "nepal", code = "NP"),
    Netherlands(countryName = "Netherlands", slug = "netherlands", code = "NL"),
    NewZealand(countryName = "New Zealand", slug = "new_zealand", code = "NZ"),
    Nicaragua(countryName = "Nicaragua", slug = "nicaragua", code = "NI"),
    Niger(countryName = "Niger", slug = "niger", code = "NE"),
    Nigeria(countryName = "Nigeria", slug = "nigeria", code = "NG"),
    NorthMacedonia(countryName = "North Macedonia", slug = "north_macedonia", code = "MK"),
    Norway(countryName = "Norway", slug = "norway", code = "NO"),
    Oman(countryName = "Oman", slug = "oman", code = "OM"),
    Pakistan(countryName = "Pakistan", slug = "pakistan", code = "PK"),
    Panama(countryName = "Panama", slug = "panama", code = "PA"),
    PapuaNewGuinea(countryName = "Papua New Guinea", slug = "papua_new_guinea", code = "PG"),
    Paraguay(countryName = "Paraguay", slug = "paraguay", code = "PY"),
    Peru(countryName = "Peru", slug = "peru", code = "PE"),
    Philippines(countryName = "Philippines", slug = "philippines", code = "PH"),
    Poland(countryName = "Poland", slug = "poland", code = "PL"),
    Portugal(countryName = "Portugal", slug = "portugal", code = "PT"),
    Qatar(countryName = "Qatar", slug = "qatar", code = "QA"),
    Romania(countryName = "Romania", slug = "romania", code = "RO"),
    Russia(countryName = "Russia", slug = "russia", code = "RU"),
    Rwanda(countryName = "Rwanda", slug = "rwanda", code = "RW"),
    SaintKittsAndNevis(
        countryName = "Saint Kitts and Nevis",
        slug = "saint_kitts_and_nevis",
        code = "KN"
    ),
    SaintLucia(countryName = "Saint Lucia", slug = "saint_lucia", code = "LC"),
    SaintVincentAndTheGrenadines(
        countryName = "Saint Vincent and the Grenadines",
        slug = "saint_vincent_and_the_grenadines",
        code = "VC"
    ),
    SanMarino(countryName = "San Marino", slug = "san_marino", code = "SM"),
    SaudiArabia(countryName = "Saudi Arabia", slug = "saudi_arabia", code = "SA"),
    Senegal(countryName = "Senegal", slug = "senegal", code = "SN"),
    Serbia(countryName = "Serbia", slug = "serbia", code = "RS"),
    Seychelles(countryName = "Seychelles", slug = "seychelles", code = "SC"),
    Singapore(countryName = "Singapore", slug = "singapore", code = "SG"),
    Slovakia(countryName = "Slovakia", slug = "slovakia", code = "SK"),
    Slovenia(countryName = "Slovenia", slug = "slovenia", code = "SI"),
    Somalia(countryName = "Somalia", slug = "somalia", code = "SO"),
    SouthAfrica(countryName = "South Africa", slug = "south_africa", code = "ZA"),
    Spain(countryName = "Spain", slug = "spain", code = "ES"),
    SriLanka(countryName = "Sri Lanka", slug = "sri_lanka", code = "LK"),
    Sudan(countryName = "Sudan", slug = "sudan", code = "SD"),
    Suriname(countryName = "Suriname", slug = "suriname", code = "SR"),
    Sweden(countryName = "Sweden", slug = "sweden", code = "SE"),
    Switzerland(countryName = "Switzerland", slug = "switzerland", code = "CH"),
    Syria(countryName = "Syria", slug = "syria", code = "SY"),
    Taiwan(countryName = "Taiwan*", slug = "taiwan*", code = "TW"),
    Tanzania(countryName = "Tanzania", slug = "tanzania", code = "TZ"),
    Thailand(countryName = "Thailand", slug = "thailand", code = "TH"),
    TimorLeste(countryName = "Timor Leste", slug = "timor-leste", code = "TL"),
    Togo(countryName = "Togo", slug = "togo", code = "TG"),
    TrinidadAndTobago(
        countryName = "Trinidad and Tobago",
        slug = "trinidad_and_tobago",
        code = "TT"
    ),
    Tunisia(countryName = "Tunisia", slug = "tunisia", code = "TN"),
    Turkey(countryName = "Turkey", slug = "turkey", code = "TR"),
    US(countryName = "US", slug = "us", code = "US"),
    Uganda(countryName = "Uganda", slug = "uganda", code = "UG"),
    Ukraine(countryName = "Ukraine", slug = "ukraine", code = "UA"),
    UnitedArabEmirates(
        countryName = "United Arab Emirates",
        slug = "united_arab_emirates",
        code = "AE"
    ),
    UnitedKingdom(countryName = "United Kingdom", slug = "united_kingdom", code = "GB"),
    Uruguay(countryName = "Uruguay", slug = "uruguay", code = "UY"),
    Uzbekistan(countryName = "Uzbekistan", slug = "uzbekistan", code = "UZ"),
    Venezuela(countryName = "Venezuela", slug = "venezuela", code = "VE"),
    Vietnam(countryName = "Vietnam", slug = "vietnam", code = "VN"),
    WestBankandGaza(countryName = "West Bank and Gaza", slug = "west_bank_and_gaza", code = "PS"),
    Zambia(countryName = "Zambia", slug = "zambia", code = "ZM"),
    Zimbabwe(countryName = "Zimbabwe", slug = "zimbabwe", code = "ZW"),
    Unknown(countryName = "Unknown", slug = "unknown", code = "");

    companion object {
        operator fun invoke(countryId: String): CountryCode =
            values().firstOrNull {
                it.slug.toLowerCase() == countryId.toLowerCase()
            } ?: Unknown
    }

}