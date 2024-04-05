public enum ContentCategoryCodeSimpleType {
    Accept, OfferUnsolicitedResources, NotifyAuxiliaryRecipients, Decline, Cancel, ResponseToOfferUnsolicitedResources,
    RequestReturn, RequisitionResource, ResponseToRequestResource, ResponseToRequestReturn,
    ResponseToRequestInformationRFI, ResponseToRequestQuote, ReleaseResource, Update, RequestResource, RequestQuote,
    Acknowledge, NotifyResourceRequestDisposition, RequestInformationRFI, CommitResource, RequestExtension,
    RequestResourceDisposition
}public enum ContentCategoryCodeType {    // Inherits from ContentCategoryCodeSimpleType}public enum ResponseCodeSimpleType {    Decline,    Accept}public enum ResponseCodeType {    // Inherits from ResponseCodeSimpleType}public enum ContentKind {    Unspecified,    Empty,    Simple,    Mixed,    ElementOnly}public enum FeatureKind {    Unspecified,    Simple,    Attribute,    Element,    AttributeWildcard,    ElementWildcard,    Group}public enum VisibilityKind {    Unspecified,    None,    ReadOnly,    ReadWrite,    ReadOnlyUnsettable,    ReadWriteUnsettable}public class NamespaceElementPropertyHolder {    // No specified members}