public enum ContentCategoryCodeSimpleType {
    Accept, OfferUnsolicitedResources, NotifyAuxiliaryRecipients, Decline, Cancel, ResponseToOfferUnsolicitedResources,
    RequestReturn, RequisitionResource, ResponseToRequestResource, ResponseToRequestReturn,
    ResponseToRequestInformationRFI, ResponseToRequestQuote, ReleaseResource, Update, RequestResource, RequestQuote,
    Acknowledge, NotifyResourceRequestDisposition, RequestInformationRFI, CommitResource, RequestExtension,
    RequestResourceDisposition
}

public class NamespaceElementPropertyHolder {
}

public enum ContentCategoryCodeType {
    Accept, OfferUnsolicitedResources, NotifyAuxiliaryRecipients, Decline, Cancel, ResponseToOfferUnsolicitedResources,
    RequestReturn, RequisitionResource, ResponseToRequestResource, ResponseToRequestReturn,
    ResponseToRequestInformationRFI, ResponseToRequestQuote, ReleaseResource, Update, RequestResource, RequestQuote,
    Acknowledge, NotifyResourceRequestDisposition, RequestInformationRFI, CommitResource, RequestExtension,
    RequestResourceDisposition
}

public enum ResponseCodeSimpleType {
    Decline, Accept
}

public enum ResponseCodeType {
    Decline, Accept
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