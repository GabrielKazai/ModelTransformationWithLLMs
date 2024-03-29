public class TIMEX3 {
    public String tid;
    public String type;
    public int functionInDocument;
    public int temporalFunction;
    public String value;
    public int valueFromFunction;
    public int mod;
    public int anchorTimeID;
    public int beginPoint;
    public int endPoint;
    public int quant;
    public int freq;
}

public class EVENT {
    public String eid;
    public String clazz;
}

public class SLINK {
    public String lid;
    public String origin;
    public String eventInstanceID;
    public String subordinatedEventInstance;
    public int signalID;
    public String relType;
}

public class TLINK {
    public String lid;
    public String origin;
    public String eventInstanceID;
    public int timeID;
    public int signalID;
    public int relatedToTime;
    public int relatedToEventInstance;
    public String relType;
    public int magnitude;
}

public class TimeML {
}

public class CONFIDENCE {
    public String tagType;
    public String tagID;
    public int attributeName;
    public String confidenceValue;
}

public class SIGNAL {
    public String sid;
}

public class ALINK {
    public String lid;
    public String origin;
    public String eventInstanceID;
    public int signalID;
    public String relatedToEventInstance;
    public String relType;
}

public class MAKEINSTANCE {
    public String eiid;
    public String eventID;
    public int signalID;
    public int cardinality;
    public int modality;
    public int polarity;
    public String tense;
    public String aspect;
    public String nf_morph;
}