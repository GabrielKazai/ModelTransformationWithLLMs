public enum LightingCodeSimpleType {
    lighting_unknown, artificial_interior_light, artificial_exterior_light, moonlight, dusk, daylight, darkness, dawn
}

public enum LightingCodeType {
    lighting_unknown, artificial_interior_light, artificial_exterior_light, moonlight, dusk, daylight, darkness, dawn
}

public enum WeatherConditionsCodeSimpleType {
    uV_index_low, clear_skies, overcast, dry, mostly_cloudy, mostly_sunny, uV_index_very_low, fair_skies, mostly_clear,
    ozone_alert, uV_index_moderate, barometric_pressure, partly_cloudy, uV_index_high, uV_index_very_high, sunny,
    partly_sunny, cloudy, mostly_dry
}

public enum WeatherConditionsCodeType {
    uV_index_low, clear_skies, overcast, dry, mostly_cloudy, mostly_sunny, uV_index_very_low, fair_skies, mostly_clear,
    ozone_alert, uV_index_moderate, barometric_pressure, partly_cloudy, uV_index_high, uV_index_very_high, sunny,
    partly_sunny, cloudy, mostly_dry
}

public enum ContentKind {
    Unspecified, Empty, Simple, Mixed, ElementOnly
}

public enum FeatureKind {
    Unspecified, Simple, Attribute, Element, AttributeWildcard, ElementWildcard, Group
}

public enum VisibilityKind {
    Unspecified, None, ReadOnly, ReadWrite, ReadOnlyUnsettable, ReadWriteUnsettable
}

public class NamespaceElementPropertyHolder {
}