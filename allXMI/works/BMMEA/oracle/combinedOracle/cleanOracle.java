
public class Assessment extends MotivationElement {
    public OrganizationUnit assessingOrganizationUnit;

    public List<AssessmentCategory> categorizingAssessmentCategory = new ArrayList<AssessmentCategory>();

    public List<Assessment> usingAssessment = new ArrayList<Assessment>();

    public List<Means> affectedMeans = new ArrayList<Means>();

    public List<Directive> motivatedDirective = new ArrayList<Directive>();

    public List<End> affectedEnd = new ArrayList<End>();

    public List<Assessment> usedAssessment = new ArrayList<Assessment>();

    public Influencer judgedInfluencer;

    public List<PotentialImpact> identifiedPotentialImpact = new ArrayList<PotentialImpact>();

}

public class AssessmentCategory extends MotivationElement {
    public List<Assessment> categorizedAssessment = new ArrayList<Assessment>();

    public List<AssessmentCategory> broaderAssessmentCategory = new ArrayList<AssessmentCategory>();

    public List<AssessmentCategory> narrowerAssessmentCategory = new ArrayList<AssessmentCategory>();

}

public class Asset extends MotivationElement {
    public List<BusinessProcess> deliveredOffering = new ArrayList<BusinessProcess>();

    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit>();

    public List<Directive> governingDirective = new ArrayList<Directive>();

    public List<CourseOfAction> deployingCourseOfAction = new ArrayList<CourseOfAction>();

}

public class BusinessPolicy extends Directive {
    public List<BusinessPolicy> broaderBusinessPolicy = new ArrayList<BusinessPolicy>();

    public List<BusinessRule> derivedBusinessRule = new ArrayList<BusinessRule>();

    public List<BusinessPolicy> moreSpecificBusinessPolicy = new ArrayList<BusinessPolicy>();

    public List<BusinessProcess> governedBusinessProcess = new ArrayList<BusinessProcess>();

}

public class BusinessProcess extends MotivationElement {
    public List<Asset> managedAsset = new ArrayList<Asset>();

    public List<BusinessPolicy> governingBusinessPolicy = new ArrayList<BusinessPolicy>();

    public List<BusinessRule> guidingBusinessRule = new ArrayList<BusinessRule>();

    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit>();

    public List<CourseOfAction> realizedCourseOfAction = new ArrayList<CourseOfAction>();

    public List<Offering> deliveredOffering = new ArrayList<Offering>();

}

public class BusinessRule extends Directive {
    public List<BusinessPolicy> baseBusinessPolicy = new ArrayList<BusinessPolicy>();

    public List<BusinessProcess> guidedBusinessProcess = new ArrayList<BusinessProcess>();

    public List<Tactic> effectingTactic = new ArrayList<Tactic>();

}

public class CourseOfAction extends Means {
    public List<Asset> deployedAsset = new ArrayList<Asset>();

    public List<BusinessProcess> realizingBusinessProcess = new ArrayList<BusinessProcess>();

    public List<Directive> governingDirective = new ArrayList<Directive>();

    public List<CourseOfAction> enablingCourseOfAction = new ArrayList<CourseOfAction>();

    public List<CourseOfAction> broaderCourseOfAction = new ArrayList<CourseOfAction>();

    public List<Directive> baseDirective = new ArrayList<Directive>();

    public List<DesiredResult> supportedDesiredResult = new ArrayList<DesiredResult>();

    public List<CourseOfAction> enabledCourseOfAction = new ArrayList<CourseOfAction>();

    public List<Liability> dischargedLiability = new ArrayList<Liability>();

    public List<Offering> definedOffering = new ArrayList<Offering>();

    public List<CourseOfAction> moreSpecificCourseOfAction = new ArrayList<CourseOfAction>();

}

public class DesiredResult extends End {
    public List<CourseOfAction> supportingCourseOfAction = new ArrayList<CourseOfAction>();

    public List<DesiredResult> broaderDesiredResult = new ArrayList<DesiredResult>();

    public List<Directive> supportingDirective = new ArrayList<Directive>();

    public List<DesiredResultCategory> categorizingDesiredResultCategory = new ArrayList<DesiredResultCategory>();

    public List<DesiredResult> moreSpecficDesiredResult = new ArrayList<DesiredResult>();

}

public class DesiredResultCategory extends MotivationElement {
    public List<DesiredResult> categorizedDesiredResult = new ArrayList<DesiredResult>();

    public List<DesiredResultCategory> broaderDesiredResultCategory = new ArrayList<DesiredResultCategory>();

    public List<DesiredResultCategory> moreSpecificDesiredResultCategory = new ArrayList<DesiredResultCategory>();

}

public class Directive extends Means {
    public List<Assessment> motivatingAssessment = new ArrayList<Assessment>();

    public List<Asset> governedAsset = new ArrayList<Asset>();

    public List<CourseOfAction> governedCourseOfAction = new ArrayList<CourseOfAction>();

    public List<CourseOfAction> derivedCourseOfAction = new ArrayList<CourseOfAction>();

    public List<DesiredResult> supportedDesiredResult = new ArrayList<DesiredResult>();

    public List<PotentialImpact> motivatingPotentialImpact = new ArrayList<PotentialImpact>();

    public List<Regulation> directiveRegulation = new ArrayList<Regulation>();

}

public class End extends MotivationElement {
    public List<Assessment> judgingAssessment = new ArrayList<Assessment>();

    public OrganizationUnit definingOrganizationUnit;

}

public class ExternalInfluencer extends Influencer {
}

public class FixedAsset extends Asset {
    public List<Offering> usingOffering = new ArrayList<Offering>();

    public List<Resource> providedResource = new ArrayList<Resource>();

}

public class Goal extends DesiredResult {
    public List<Objective> quantifyingObjective = new ArrayList<Objective>();

    public List<Vision> amplifiedVision = new ArrayList<Vision>();

}

public class Influencer extends MotivationElement {
    public List<Assessment> judgingAssessment = new ArrayList<Assessment>();

    public List<InfluencerCategory> categorizingInfluencerCategory = new ArrayList<InfluencerCategory>();

    public List<OrganizationUnit> recognizingOrganizationUnit = new ArrayList<OrganizationUnit>();

    public List<InfluencingOrganization> sourceInfluencingOrganization = new ArrayList<InfluencingOrganization>();

}

public class InfluencerCategory extends MotivationElement {
    public List<Influencer> categorizedInfluencer = new ArrayList<Influencer>();

    public List<InfluencerCategory> broaderInfluencerCategory = new ArrayList<InfluencerCategory>();

    public List<InfluencerCategory> narrowerInfluencerCategory = new ArrayList<InfluencerCategory>();

}

public class InfluencingOrganization extends MotivationElement {
    public List<Influencer> providedInfluencer = new ArrayList<Influencer>();

    public List<OrganizationCategory> categorizingOrganizationCategory = new ArrayList<OrganizationCategory>();

    public List<OrganizationUnit> influencingOrganizationUnit = new ArrayList<OrganizationUnit>();

}

public class InternalInfluencer extends Influencer {
}

public class Liability extends MotivationElement {
    public List<CourseOfAction> dischargingCourseOfAction = new ArrayList<CourseOfAction>();

    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit>();

    public List<Resource> claimedResource = new ArrayList<Resource>();

}

public class Means extends MotivationElement {
    public List<Assessment> judgingAssessment = new ArrayList<Assessment>();

    public List<OrganizationUnit> establishingOrganizationUnit = new ArrayList<OrganizationUnit>();

}

public class Mission extends Means {
    public List<Strategy> missionComponent = new ArrayList<Strategy>();

    public List<Vision> operativeVision = new ArrayList<Vision>();

}

public class Objective extends DesiredResult {
    public List<Goal> quantifiedGoal = new ArrayList<Goal>();

}

public class Offering extends FixedAsset {
    public List<BusinessProcess> deliveringBusinessProcess = new ArrayList<BusinessProcess>();

    public List<CourseOfAction> definingCourseOfAction = new ArrayList<CourseOfAction>();

    public List<FixedAsset> usedFixedAsset = new ArrayList<FixedAsset>();

    public List<Resource> requiredResource = new ArrayList<Resource>();

}

public class OrganizationCategory extends MotivationElement {
    public List<InfluencingOrganization> categorizedInfluencingOrganization = new ArrayList<InfluencingOrganization>();

    public List<OrganizationCategory> broaderOrganizationCategory = new ArrayList<OrganizationCategory>();

    public List<OrganizationCategory> narrowerOrganizationCategory = new ArrayList<OrganizationCategory>();

}

public class OrganizationUnit extends MotivationElement {
    public List<Assessment> madeAssessment = new ArrayList<Assessment>();

    public List<Asset> managedAsset = new ArrayList<Asset>();

    public List<BusinessProcess> managedBusinessProcess = new ArrayList<BusinessProcess>();

    public List<End> definedEnd = new ArrayList<End>();

    public List<Influencer> recognizedInfluencer = new ArrayList<Influencer>();

    public List<InfluencingOrganization> internalInfluencingOrganization = new ArrayList<InfluencingOrganization>();

    public List<Liability> managedLiability = new ArrayList<Liability>();

    public List<Means> establishedMeans = new ArrayList<Means>();

    public List<Strategy> determiningStrategy = new ArrayList<Strategy>();

}

public class PotentialImpact extends MotivationElement {
    public List<Assessment> identifyingAssessment = new ArrayList<Assessment>();

    public List<Directive> motivatedDirective = new ArrayList<Directive>();

}

public class PotentialReward extends PotentialImpact {
}

public class Regulation extends ExternalInfluencer {
    public List<Directive> regulatingDirective = new ArrayList<Directive>();

}

public class Resource extends Asset {
    public List<FixedAsset> providingFixedAsset = new ArrayList<FixedAsset>();

    public List<Liability> claimingLiability = new ArrayList<Liability>();

    public List<Offering> requiringOffering = new ArrayList<Offering>();

}

public class Risk extends PotentialImpact {
}

public class Strategy extends CourseOfAction {
    public List<Mission> plannedMission = new ArrayList<Mission>();

    public List<OrganizationUnit> determinedOrganizationUnit = new ArrayList<OrganizationUnit>();

    public List<Tactic> implementingTactic = new ArrayList<Tactic>();

}

public class Tactic extends CourseOfAction {
    public List<BusinessRule> enforcedBusinessRule = new ArrayList<BusinessRule>();

    public List<Strategy> implementedStrategy = new ArrayList<Strategy>();

}

public class Vision extends End {
    public List<Goal> amplifyingGoal = new ArrayList<Goal>();

    public List<Mission> deliveringMission = new ArrayList<Mission>();

}
