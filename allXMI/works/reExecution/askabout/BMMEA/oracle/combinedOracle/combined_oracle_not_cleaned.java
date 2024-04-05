import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a3e8ddb9-8b33-4b63-b56c-ccb015e22b34")
public class Assessment extends MotivationElement {
    @objid ("62dd4e57-6bb0-48ff-9085-6ec46f4659c7")
    public OrganizationUnit assessingOrganizationUnit;

    @objid ("91213e67-c779-4b79-9d54-98f3c9c68781")
    public List<AssessmentCategory> categorizingAssessmentCategory = new ArrayList<AssessmentCategory> ();

    @objid ("6818781a-08d4-41ae-a2f4-3b5d219035ca")
    public List<Assessment> usingAssessment = new ArrayList<Assessment> ();

    @objid ("4933c5aa-3a22-48d0-b2b4-21d75e4d14ca")
    public List<Means> affectedMeans = new ArrayList<Means> ();

    @objid ("ec211af1-988f-4ca9-b1b8-b3025aa576bf")
    public List<Directive> motivatedDirective = new ArrayList<Directive> ();

    @objid ("79f8f7e1-8a9b-481c-866a-465c71afca4d")
    public List<End> affectedEnd = new ArrayList<End> ();

    @objid ("0ad895b5-393d-40af-8ba0-1d1938c03030")
    public List<Assessment> usedAssessment = new ArrayList<Assessment> ();

    @objid ("683d9c10-8973-4797-a174-49dbadbce5a1")
    public Influencer judgedInfluencer;

    @objid ("e2d80a0e-1a42-4194-a40d-53b5b5d37288")
    public List<PotentialImpact> identifiedPotentialImpact = new ArrayList<PotentialImpact> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("20d14ba8-439d-4c86-9279-58ae0bfa4ff2")
public class AssessmentCategory extends MotivationElement {
    @objid ("9ce30d83-3260-4d26-8932-71ce13cd1970")
    public List<Assessment> categorizedAssessment = new ArrayList<Assessment> ();

    @objid ("cd311c46-eaa3-44f0-b097-1b9c69ffc3a7")
    public List<AssessmentCategory> broaderAssessmentCategory = new ArrayList<AssessmentCategory> ();

    @objid ("b779b749-9a41-4bb4-853f-4fb08b911a81")
    public List<AssessmentCategory> narrowerAssessmentCategory = new ArrayList<AssessmentCategory> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("acb729bc-16b4-4007-82e8-5cfaa2920437")
public class Asset extends MotivationElement {
    @objid ("dce4860e-27aa-4a19-a746-7fb587cfe2be")
    public List<BusinessProcess> deliveredOffering = new ArrayList<BusinessProcess> ();

    @objid ("9d54443d-fa8e-402f-a42a-8edd4df9b06b")
    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("e0e761e5-2634-4eeb-afa7-2c2cf26513c6")
    public List<Directive> governingDirective = new ArrayList<Directive> ();

    @objid ("da2bf98d-164e-4285-a820-bc0e37407537")
    public List<CourseOfAction> deployingCourseOfAction = new ArrayList<CourseOfAction> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("22cb9243-014f-4784-b78f-bf1ab7d0b0b9")
public class BusinessPolicy extends Directive {
    @objid ("496c99e7-6ab5-4e18-a605-56b2bed51e69")
    public List<BusinessPolicy> broaderBusinessPolicy = new ArrayList<BusinessPolicy> ();

    @objid ("0992af27-980f-481b-a296-7759d3068a69")
    public List<BusinessRule> derivedBusinessRule = new ArrayList<BusinessRule> ();

    @objid ("4872e6d6-5211-4da8-9982-ac56dba0b285")
    public List<BusinessPolicy> moreSpecificBusinessPolicy = new ArrayList<BusinessPolicy> ();

    @objid ("33fc3582-977c-4127-9275-7e47b3b1ec79")
    public List<BusinessProcess> governedBusinessProcess = new ArrayList<BusinessProcess> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("23eaf593-65a5-483e-8947-bc9950c3c214")
public class BusinessProcess extends MotivationElement {
    @objid ("aac38ae6-b81d-420a-9471-558cee15b6c6")
    public List<Asset> managedAsset = new ArrayList<Asset> ();

    @objid ("baadfc0a-12d7-473b-a54f-6da354b537d6")
    public List<BusinessPolicy> governingBusinessPolicy = new ArrayList<BusinessPolicy> ();

    @objid ("f1e42cd1-b064-494f-ad97-301d982e5e73")
    public List<BusinessRule> guidingBusinessRule = new ArrayList<BusinessRule> ();

    @objid ("10127e88-d2a3-46d3-b94c-0602cbfd312e")
    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("04c4df20-4fed-4ad1-beae-593cb1466769")
    public List<CourseOfAction> realizedCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("b22f1907-0295-4cde-ab92-a0377d94eaf0")
    public List<Offering> deliveredOffering = new ArrayList<Offering> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("97668dd5-6bdf-4845-bcf2-edff0883f8ee")
public class BusinessRule extends Directive {
    @objid ("d2cbb052-f47d-49ff-b54a-d1e99cd2d25a")
    public List<BusinessPolicy> baseBusinessPolicy = new ArrayList<BusinessPolicy> ();

    @objid ("4c1b935d-5785-4ade-838a-1a382c4d8c29")
    public List<BusinessProcess> guidedBusinessProcess = new ArrayList<BusinessProcess> ();

    @objid ("f9a33227-9329-4c6c-aaab-adaf27a066ae")
    public List<Tactic> effectingTactic = new ArrayList<Tactic> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3e11f7a3-dddc-4682-97fe-d8b1a7d70965")
public class CourseOfAction extends Means {
    @objid ("6e7da5f1-80a2-4a58-a514-cd92a312ba5c")
    public List<Asset> deployedAsset = new ArrayList<Asset> ();

    @objid ("a56af205-c0e7-4ad3-919f-dbb817e1fcc4")
    public List<BusinessProcess> realizingBusinessProcess = new ArrayList<BusinessProcess> ();

    @objid ("89e450db-0059-40a9-9add-76ea55f61aa9")
    public List<Directive> governingDirective = new ArrayList<Directive> ();

    @objid ("73b6d792-b0c9-441e-b4d1-32a8674f68c3")
    public List<CourseOfAction> enablingCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("b603fb17-259f-4b3d-958d-1c9d24259a25")
    public List<CourseOfAction> broaderCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("40df367b-8540-48cf-86e7-95c14f9955c5")
    public List<Directive> baseDirective = new ArrayList<Directive> ();

    @objid ("3b20d778-6426-4790-961a-94bbc59da172")
    public List<DesiredResult> supportedDesiredResult = new ArrayList<DesiredResult> ();

    @objid ("9c63be25-e5a2-4e2e-a4f8-2d1d6ae66ac0")
    public List<CourseOfAction> enabledCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("b454d632-90e8-4eec-b379-77c77ca16f55")
    public List<Liability> dischargedLiability = new ArrayList<Liability> ();

    @objid ("3c685cb0-4fba-429d-9c84-8d1b37d15c37")
    public List<Offering> definedOffering = new ArrayList<Offering> ();

    @objid ("46c95fdf-8b3d-4f42-91e2-8e874cc24402")
    public List<CourseOfAction> moreSpecificCourseOfAction = new ArrayList<CourseOfAction> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9fbe1a57-3253-447e-8d62-fda614a71511")
public class DesiredResult extends End {
    @objid ("d8c48e56-65b9-4f6d-9143-4b25bc95bcaf")
    public List<CourseOfAction> supportingCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("ec35b448-fd56-42f5-a265-18701db2680d")
    public List<DesiredResult> broaderDesiredResult = new ArrayList<DesiredResult> ();

    @objid ("124d5bef-530c-421f-9ac8-5eecb1037588")
    public List<Directive> supportingDirective = new ArrayList<Directive> ();

    @objid ("7e805d84-59e0-4f76-a6e1-39ac82d543b7")
    public List<DesiredResultCategory> categorizingDesiredResultCategory = new ArrayList<DesiredResultCategory> ();

    @objid ("98e21f41-7227-42dc-9f09-9a88a410fa61")
    public List<DesiredResult> moreSpecficDesiredResult = new ArrayList<DesiredResult> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("478b022f-45e5-472c-a925-7a6bf7d5e6c3")
public class DesiredResultCategory extends MotivationElement {
    @objid ("58f00afd-8dae-4334-a0b9-32ad71c03e8d")
    public List<DesiredResult> categorizedDesiredResult = new ArrayList<DesiredResult> ();

    @objid ("f51fc2d0-8470-429c-bbb4-a001633aabbb")
    public List<DesiredResultCategory> broaderDesiredResultCategory = new ArrayList<DesiredResultCategory> ();

    @objid ("a222ce1d-9d11-4043-9bfa-b817a84f49f2")
    public List<DesiredResultCategory> moreSpecificDesiredResultCategory = new ArrayList<DesiredResultCategory> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3fccd616-542d-46ba-8cfe-2c73f931c60e")
public class Directive extends Means {
    @objid ("f698a151-2505-40fc-9d55-59c6f357987c")
    public List<Assessment> motivatingAssessment = new ArrayList<Assessment> ();

    @objid ("45a12d7b-9fbd-42a4-bb60-4cc0127051d5")
    public List<Asset> governedAsset = new ArrayList<Asset> ();

    @objid ("e6712225-db3b-4f50-98df-91545e9e1259")
    public List<CourseOfAction> governedCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("64ed02f7-331e-47d3-a163-c9362703f0e5")
    public List<CourseOfAction> derivedCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("1a48e975-84c5-4d48-be55-d2a9ab1f8130")
    public List<DesiredResult> supportedDesiredResult = new ArrayList<DesiredResult> ();

    @objid ("c24b0ed4-5286-428f-93b5-77c002e48860")
    public List<PotentialImpact> motivatingPotentialImpact = new ArrayList<PotentialImpact> ();

    @objid ("d96bf64e-f1d1-4ace-8087-f70ebd617ed4")
    public List<Regulation> directiveRegulation = new ArrayList<Regulation> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d7b31918-8b27-4fb6-98ff-d024a1e1607a")
public class End extends MotivationElement {
    @objid ("1742c5f2-463f-41eb-9ccf-15f2c90614af")
    public List<Assessment> judgingAssessment = new ArrayList<Assessment> ();

    @objid ("5e16a4b6-e4a1-410f-9756-de7c5813e86e")
    public OrganizationUnit definingOrganizationUnit;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("83f597e7-91d5-43f7-b004-a0181d0888f0")
public class ExternalInfluencer extends Influencer {
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3fda1aee-4ef3-422e-bb4d-7faf185a2584")
public class FixedAsset extends Asset {
    @objid ("3263dd8b-1329-47c5-b039-04e23df09199")
    public List<Offering> usingOffering = new ArrayList<Offering> ();

    @objid ("8160ebde-2500-46e5-a98f-07589771b42c")
    public List<Resource> providedResource = new ArrayList<Resource> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8c84fa20-303f-4c49-b809-9058626bf74d")
public class Goal extends DesiredResult {
    @objid ("f7c659ae-75ec-4ca5-b868-25a113b52387")
    public List<Objective> quantifyingObjective = new ArrayList<Objective> ();

    @objid ("16947976-d87a-4a97-8411-75a910ecd915")
    public List<Vision> amplifiedVision = new ArrayList<Vision> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4f602635-25d8-4afa-a76a-38102f5cf42e")
public class Influencer extends MotivationElement {
    @objid ("cad47bc3-52c7-4305-aa8d-24217f97f34e")
    public List<Assessment> judgingAssessment = new ArrayList<Assessment> ();

    @objid ("1b61e79d-36fe-4204-9bd6-8680dde3281c")
    public List<InfluencerCategory> categorizingInfluencerCategory = new ArrayList<InfluencerCategory> ();

    @objid ("6f52804d-9d4e-4ed9-900c-da2c9e6a8d9f")
    public List<OrganizationUnit> recognizingOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("f5d53dbd-3f3a-4a70-abcf-e94aaeadf66a")
    public List<InfluencingOrganization> sourceInfluencingOrganization = new ArrayList<InfluencingOrganization> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7a21f794-400a-48d5-9e20-4cfb0e35a0d8")
public class InfluencerCategory extends MotivationElement {
    @objid ("8b99b59d-7bef-4a31-ba55-48f3436e057a")
    public List<Influencer> categorizedInfluencer = new ArrayList<Influencer> ();

    @objid ("2e839fb7-8893-4f87-bb53-d5053cdd5544")
    public List<InfluencerCategory> broaderInfluencerCategory = new ArrayList<InfluencerCategory> ();

    @objid ("cacef3f9-d0a9-4f2e-8927-dcae0ca9580b")
    public List<InfluencerCategory> narrowerInfluencerCategory = new ArrayList<InfluencerCategory> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("42455315-d76a-41d5-b37a-4b74deecc6b2")
public class InfluencingOrganization extends MotivationElement {
    @objid ("cbce5af7-3bfd-4f2e-ae4f-7ce798e0f548")
    public List<Influencer> providedInfluencer = new ArrayList<Influencer> ();

    @objid ("7546aca8-8a76-4dca-ac9f-bb929b770096")
    public List<OrganizationCategory> categorizingOrganizationCategory = new ArrayList<OrganizationCategory> ();

    @objid ("eb3624d4-fc98-491a-82f6-f8cd833c2ec5")
    public List<OrganizationUnit> influencingOrganizationUnit = new ArrayList<OrganizationUnit> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6e12c8b7-1245-4c9b-aaac-895983e35f58")
public class InternalInfluencer extends Influencer {
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2f10fd66-9ad7-4fb2-8840-adc1c4f39ece")
public class Liability extends MotivationElement {
    @objid ("eac5f422-ea51-4d97-a3fa-6646d7088f39")
    public List<CourseOfAction> dischargingCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("31e6901f-68f0-4e8f-9263-0f56c7e6e109")
    public List<OrganizationUnit> responsibleOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("c1499e7a-1e59-4a93-b9de-e788efc3512b")
    public List<Resource> claimedResource = new ArrayList<Resource> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("11cc66c5-2d15-4eff-957b-8426cbe651fc")
public class Means extends MotivationElement {
    @objid ("a259fedd-f049-4595-8925-7f3ac391d21a")
    public List<Assessment> judgingAssessment = new ArrayList<Assessment> ();

    @objid ("ecb96dd0-f831-4208-9405-cbd3174bebf0")
    public List<OrganizationUnit> establishingOrganizationUnit = new ArrayList<OrganizationUnit> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cdaa3bec-bf38-4f3f-8ee8-5c7fe954d366")
public class Mission extends Means {
    @objid ("e0bd1974-bf79-48a0-9bf7-3f7325f81b57")
    public List<Strategy> missionComponent = new ArrayList<Strategy> ();

    @objid ("b308c040-7d71-48bc-81fd-12940aa46a26")
    public List<Vision> operativeVision = new ArrayList<Vision> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b61af295-6754-4951-a6f5-1a006888a4b8")
public class Objective extends DesiredResult {
    @objid ("8f6f7fa5-7de2-4753-870e-a5b4433f4faa")
    public List<Goal> quantifiedGoal = new ArrayList<Goal> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("463074b4-19c4-4af7-ac3f-254d31deabeb")
public class Offering extends FixedAsset {
    @objid ("3a1cdd46-3ee3-44bb-a924-1d35821530de")
    public List<BusinessProcess> deliveringBusinessProcess = new ArrayList<BusinessProcess> ();

    @objid ("7f45be68-755a-49ca-8697-c8c73efbfcd8")
    public List<CourseOfAction> definingCourseOfAction = new ArrayList<CourseOfAction> ();

    @objid ("baec50b2-dfd0-44b1-95d6-f12e6af14698")
    public List<FixedAsset> usedFixedAsset = new ArrayList<FixedAsset> ();

    @objid ("4cd3bde3-6791-40b8-92c0-9607faa31d54")
    public List<Resource> requiredResource = new ArrayList<Resource> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3342a0df-5e9b-491d-ac46-f08a8ea60318")
public class OrganizationCategory extends MotivationElement {
    @objid ("c6777438-a6a7-4eb2-8912-245503617e73")
    public List<InfluencingOrganization> categorizedInfluencingOrganization = new ArrayList<InfluencingOrganization> ();

    @objid ("970a0ba7-5f94-4704-8905-79a1870bd7af")
    public List<OrganizationCategory> broaderOrganizationCategory = new ArrayList<OrganizationCategory> ();

    @objid ("1b66a6fb-d742-4e6b-b910-3591771c18b4")
    public List<OrganizationCategory> narrowerOrganizationCategory = new ArrayList<OrganizationCategory> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("111ed05d-1782-452a-9a89-12ee981fe281")
public class OrganizationUnit extends MotivationElement {
    @objid ("7c33d31e-a056-40bf-99b4-ce414857873c")
    public List<Assessment> madeAssessment = new ArrayList<Assessment> ();

    @objid ("60ce156d-07af-483f-ae30-b69da729be75")
    public List<Asset> managedAsset = new ArrayList<Asset> ();

    @objid ("573d4caf-d229-426f-a972-3e802e4fb98d")
    public List<BusinessProcess> managedBusinessProcess = new ArrayList<BusinessProcess> ();

    @objid ("a86cbb1a-404d-4927-9351-7ee20bfcbd74")
    public List<End> definedEnd = new ArrayList<End> ();

    @objid ("0884e609-fabf-4a4a-a823-f67011cc8fd9")
    public List<Influencer> recognizedInfluencer = new ArrayList<Influencer> ();

    @objid ("8355e947-0109-4f3a-a91c-f6b95fbf31b7")
    public List<InfluencingOrganization> internalInfluencingOrganization = new ArrayList<InfluencingOrganization> ();

    @objid ("4bd95d43-c0e3-46de-a676-8c0cca887f77")
    public List<Liability> managedLiability = new ArrayList<Liability> ();

    @objid ("2d98d7bb-4cea-4444-9c37-a3b5e81782d7")
    public List<Means> establishedMeans = new ArrayList<Means> ();

    @objid ("9c207e0e-3f4c-4960-b53a-f40f8b0c8b50")
    public List<Strategy> determiningStrategy = new ArrayList<Strategy> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0f54e56c-7f7b-43db-848a-a38eeb1feea8")
public class PotentialImpact extends MotivationElement {
    @objid ("0dfd45cc-f9c8-4222-98e1-f8c8388a48da")
    public List<Assessment> identifyingAssessment = new ArrayList<Assessment> ();

    @objid ("3b04dd05-a3f6-433e-9f5c-ccdfa91df317")
    public List<Directive> motivatedDirective = new ArrayList<Directive> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a8948bb5-55d7-4b55-aec1-37e701ea48c6")
public class PotentialReward extends PotentialImpact {
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("47e81527-358b-4954-a3e7-ba8948c0774c")
public class Regulation extends ExternalInfluencer {
    @objid ("e7278f33-134f-42f7-9005-42e43a67b0c0")
    public List<Directive> regulatingDirective = new ArrayList<Directive> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fff4b42d-35d5-4285-bbef-91a49a250ad2")
public class Resource extends Asset {
    @objid ("c53ec948-bcda-4f00-b867-a37979ceaecb")
    public List<FixedAsset> providingFixedAsset = new ArrayList<FixedAsset> ();

    @objid ("82a0d7ac-4d63-454b-9041-6609ce040e81")
    public List<Liability> claimingLiability = new ArrayList<Liability> ();

    @objid ("ae4e5bb0-3fb3-40e6-b017-5df7db15777b")
    public List<Offering> requiringOffering = new ArrayList<Offering> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4c3bcbe5-1134-43b1-a561-aaf6ee9a9002")
public class Risk extends PotentialImpact {
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d130e550-d488-4bbd-bff5-9dbf8622e6c6")
public class Strategy extends CourseOfAction {
    @objid ("a0aba5b5-5c64-46fb-a4f2-404309a4c1fb")
    public List<Mission> plannedMission = new ArrayList<Mission> ();

    @objid ("e11d51f4-8ed4-4c08-97e1-704f38be23c5")
    public List<OrganizationUnit> determinedOrganizationUnit = new ArrayList<OrganizationUnit> ();

    @objid ("a616153f-0a4e-4526-9c2c-a6a356c8b7f5")
    public List<Tactic> implementingTactic = new ArrayList<Tactic> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("67b01637-3464-4d59-bc22-e0e532eb6bec")
public class Tactic extends CourseOfAction {
    @objid ("df75b56a-8d32-4881-a027-9e1b0be3273f")
    public List<BusinessRule> enforcedBusinessRule = new ArrayList<BusinessRule> ();

    @objid ("6b5a251f-79bf-4293-a9fe-5b1fb24e2980")
    public List<Strategy> implementedStrategy = new ArrayList<Strategy> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8e81158e-aab1-421e-81d3-9f62ac1d4d32")
public class Vision extends End {
    @objid ("b82b3674-947c-43c0-8ac4-5de4b88b7424")
    public List<Goal> amplifyingGoal = new ArrayList<Goal> ();

    @objid ("924ab187-6dbd-4c2a-b117-4f53fdb3e238")
    public List<Mission> deliveringMission = new ArrayList<Mission> ();

}

