public class Assessment extends MotivationElement {
    public OrganizationUnit assessingOrganizationUnit;
    public AssessmentCategory[] categorizingAssessmentCategory;
    public Assessment[] usingAssessment;
    public Means[] affectedMeans;
    public Directive[] motivatedDirective;
    public End[] affectedEnd;
    public Assessment[] usedAssessment;
    public Influencer[] judgedInfluencer;
    public PotentialImpact[] identifiedPotentialImpact;
}

public class AssessmentCategory extends MotivationElement {
    public Assessment[] categorizedAssessment;
    public AssessmentCategory[] broaderAssessmentCategory;
    public AssessmentCategory[] narrowerAssessmentCategory;
}

public class Asset extends MotivationElement {
    public Offering[] deliveredOffering;
    public OrganizationUnit[] responsibleOrganizationUnit;
    public Directive[] governingDirective;
    public CourseOfAction[] deployingCourseOfAction;
}

public class BusinessPolicy extends MotivationElement {
    public BusinessPolicy[] broaderBusinessPolicy;
    public BusinessRule[] derivedBusinessRule;
    public BusinessPolicy[] moreSpecificBusinessPolicy;
    public BusinessProcess[] governedBusinessProcess;
}

public class BusinessProcess extends MotivationElement {
    public Asset[] managedAsset;
    public BusinessPolicy[] governingBusinessPolicy;
    public BusinessRule[] guidingBusinessRule;
    public OrganizationUnit responsibleOrganizationUnit;
    public CourseOfAction[] realizedCourseOfAction;
    public Offering[] deliveredOffering;
}

public class BusinessRule extends MotivationElement {
    public BusinessPolicy baseBusinessPolicy;
    public BusinessProcess[] guidedBusinessProcess;
    public Tactic[] effectingTactic;
}

public class CourseOfAction extends MotivationElement {
    public Asset[] deployedAsset;
    public BusinessProcess[] realizingBusinessProcess;
    public Directive[] governingDirective;
    public CourseOfAction[] enablingCourseOfAction;
    public CourseOfAction[] broaderCourseOfAction;
    public Directive[] baseDirective;
    public DesiredResult[] supportedDesiredResult;
    public CourseOfAction[] enabledCourseOfAction;
    public Liability[] dischargedLiability;
    public Offering[] definedOffering;
    public CourseOfAction[] moreSpecificCourseOfAction;
}

public class DesiredResult extends MotivationElement {
    public CourseOfAction[] supportingCourseOfAction;
    public DesiredResult[] broaderDesiredResult;
    public Directive[] supportingDirective;
    public DesiredResultCategory categorizingDesiredResultCategory;
    public DesiredResult[] moreSpecficDesiredResult;
}

public class DesiredResultCategory extends MotivationElement {
    public DesiredResult[] categorizedDesiredResult;
    public DesiredResultCategory[] broaderDesiredResultCategory;
    public DesiredResultCategory[] moreSpecificDesiredResultCategory;
}

public class Directive extends MotivationElement {
    public Assessment[] motivatingAssessment;
    public Asset[] governedAsset;
    public CourseOfAction[] governedCourseOfAction;
    public CourseOfAction[] derivedCourseOfAction;
    public DesiredResult[] supportedDesiredResult;
    public PotentialImpact[] motivatingPotentialImpact;
    public Regulation[] directiveRegulation;
}

public class End extends MotivationElement {
    public Assessment[] judgingAssessment;
    public OrganizationUnit definingOrganizationUnit;
}

public class ExternalInfluencer extends Influencer {
}

public class FixedAsset extends Asset {
    public Offering[] usingOffering;
    public Resource[] providedResource;
}

public class Goal extends DesiredResult {
    public Objective[] quantifyingObjective;
    public Vision[] amplifiedVision;
}

public class Influencer extends MotivationElement {
    public Assessment[] judgingAssessment;
    public InfluencerCategory[] categorizingInfluencerCategory;
    public OrganizationUnit[] recognizingOrganizationUnit;
    public InfluencingOrganization[] sourceInfluencingOrganization;
}

public class InfluencerCategory extends MotivationElement {
    public Influencer[] categorizedInfluencer;
    public InfluencerCategory[] broaderInfluencerCategory;
    public InfluencerCategory[] narrowerInfluencerCategory;
}

public class InfluencingOrganization extends MotivationElement {
    public Influencer[] providedInfluencer;
    public OrganizationCategory[] categorizingOrganizationCategory;
    public OrganizationUnit[] influencingOrganizationUnit;
}

public class InternalInfluencer extends Influencer {
}

public class Liability extends MotivationElement {
    public CourseOfAction[] dischargingCourseOfAction;
    public OrganizationUnit[] responsibleOrganizationUnit;
    public Resource[] claimedResource;
}

public class Means extends MotivationElement {
    public Assessment[] judgingAssessment;
    public OrganizationUnit[] establishingOrganizationUnit;
}

public class Mission extends Means {
    public Strategy[] missionComponent;
    public Vision[] operativeVision;
}

public class MotivationElement {
    protected String name;
    protected String description;
}

public class Objective extends DesiredResult {
    public Goal[] quantifiedGoal;
}

public class Offering extends Asset {
    public BusinessProcess[] deliveringBusinessProcess;
    public CourseOfAction[] definingCourseOfAction;
    public FixedAsset[] usedFixedAsset;
    public Resource[] requiredResource;
}

public class OrganizationCategory extends MotivationElement {
    public InfluencingOrganization[] categorizedInfluencingOrganization;
    public OrganizationCategory[] broaderOrganizationCategory;
    public OrganizationCategory[] narrowerOrganizationCategory;
}

public class OrganizationUnit extends MotivationElement {
    public Assessment[] madeAssessment;
    public Asset[] managedAsset;
    public BusinessProcess[] managedBusinessProcess;
    public End[] definedEnd;
    public Influencer[] recognizedInfluencer;
    public InfluencingOrganization[] internalInfluencingOrganization;
    public Liability[] managedLiability;
    public Means[] establishedMeans;
    public Strategy[] determiningStrategy;
}

public class PotentialImpact extends MotivationElement {
    public Assessment[] identifyingAssessment;
    public Directive[] motivatedDirective;
}

public class PotentialReward extends PotentialImpact {
}

public class Regulation extends ExternalInfluencer {
    public Directive[] regulatingDirective;
}

public class Resource extends Asset {
    public FixedAsset[] providingFixedAsset;
    public Liability[] claimingLiability;
    public Offering[] requiringOffering;
}

public class Risk extends PotentialImpact {
}

public class Strategy extends CourseOfAction {
    public Mission[] plannedMission;
    public OrganizationUnit[] determinedOrganizationUnit;
    public Tactic[] implementingTactic;
}

public class Tactic extends CourseOfAction {
    public BusinessRule[] enforcedBusinessRule;
    public Strategy[] implementedStrategy;
}

public class Vision extends End {
    public Goal[] amplifyingGoal;
    public Mission[] deliveringMission;
}