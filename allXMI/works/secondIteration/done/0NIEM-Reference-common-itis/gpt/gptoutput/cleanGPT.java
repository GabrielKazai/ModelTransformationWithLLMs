public enum LightingCodeSimpleType {
    LIGHTING_UNKNOWN, ARTIFICIAL_INTERIOR_LIGHT, ARTIFICIAL_EXTERIOR_LIGHT, MOONLIGHT, DUSK, DAYLIGHT, DARKNESS, DAWN
}

public class NamespaceElementPropertyHolder {
}

public enum LightingCodeType extends
    LightingCodeSimpleType {
        }

    public enum WeatherConditionsCodeSimpleType {
        UV_INDEX_LOW, CLEAR_SKIES, OVERCAST, DRY, MOSTLY_CLOUDY, MOSTLY_SUNNY, UV_INDEX_VERY_LOW, FAIR_SKIES,
        MOSTLY_CLEAR, OZONE_ALERT, UV_INDEX_MODERATE, BAROMETRIC_PRESSURE, PARTLY_CLOUDY, UV_INDEX_HIGH,
        UV_INDEX_VERY_HIGH, SUNNY, PARTLY_SUNNY, CLOUDY, MOSTLY_DRY
    }public enum WeatherConditionsCodeType extends WeatherConditionsCodeSimpleType {}