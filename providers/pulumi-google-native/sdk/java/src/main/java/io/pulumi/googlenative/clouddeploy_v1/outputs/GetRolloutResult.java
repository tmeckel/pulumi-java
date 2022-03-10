// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRolloutResult {
    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * Approval state of the `Rollout`.
     * 
     */
    private final String approvalState;
    /**
     * Time at which the `Rollout` was approved.
     * 
     */
    private final String approveTime;
    /**
     * Time at which the `Rollout` was created.
     * 
     */
    private final String createTime;
    /**
     * Time at which the `Rollout` finished deploying.
     * 
     */
    private final String deployEndTime;
    /**
     * The reason this deploy failed. This will always be unspecified while the deploy in progress.
     * 
     */
    private final String deployFailureCause;
    /**
     * Time at which the `Rollout` started deploying.
     * 
     */
    private final String deployStartTime;
    /**
     * The resource name of the Cloud Build `Build` object that is used to deploy the Rollout. Format is `projects/{project}/locations/{location}/builds/{build}`.
     * 
     */
    private final String deployingBuild;
    /**
     * Description of the `Rollout` for user purposes. Max length is 255 characters.
     * 
     */
    private final String description;
    /**
     * Time at which the `Rollout` was enqueued.
     * 
     */
    private final String enqueueTime;
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * Reason the build failed. Empty if the build succeeded.
     * 
     */
    private final String failureReason;
    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Optional. Name of the `Rollout`. Format is projects/{project}/ locations/{location}/deliveryPipelines/{deliveryPipeline}/ releases/{release}/rollouts/a-z{0,62}.
     * 
     */
    private final String name;
    /**
     * Current state of the `Rollout`.
     * 
     */
    private final String state;
    /**
     * The ID of Target to which this `Rollout` is deploying.
     * 
     */
    private final String targetId;
    /**
     * Unique identifier of the `Rollout`.
     * 
     */
    private final String uid;

    @OutputCustomType.Constructor
    private GetRolloutResult(
        @OutputCustomType.Parameter("annotations") Map<String,String> annotations,
        @OutputCustomType.Parameter("approvalState") String approvalState,
        @OutputCustomType.Parameter("approveTime") String approveTime,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("deployEndTime") String deployEndTime,
        @OutputCustomType.Parameter("deployFailureCause") String deployFailureCause,
        @OutputCustomType.Parameter("deployStartTime") String deployStartTime,
        @OutputCustomType.Parameter("deployingBuild") String deployingBuild,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("enqueueTime") String enqueueTime,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("failureReason") String failureReason,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("targetId") String targetId,
        @OutputCustomType.Parameter("uid") String uid) {
        this.annotations = annotations;
        this.approvalState = approvalState;
        this.approveTime = approveTime;
        this.createTime = createTime;
        this.deployEndTime = deployEndTime;
        this.deployFailureCause = deployFailureCause;
        this.deployStartTime = deployStartTime;
        this.deployingBuild = deployingBuild;
        this.description = description;
        this.enqueueTime = enqueueTime;
        this.etag = etag;
        this.failureReason = failureReason;
        this.labels = labels;
        this.name = name;
        this.state = state;
        this.targetId = targetId;
        this.uid = uid;
    }

    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
    */
    public Map<String,String> getAnnotations() {
        return this.annotations;
    }
    /**
     * Approval state of the `Rollout`.
     * 
    */
    public String getApprovalState() {
        return this.approvalState;
    }
    /**
     * Time at which the `Rollout` was approved.
     * 
    */
    public String getApproveTime() {
        return this.approveTime;
    }
    /**
     * Time at which the `Rollout` was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Time at which the `Rollout` finished deploying.
     * 
    */
    public String getDeployEndTime() {
        return this.deployEndTime;
    }
    /**
     * The reason this deploy failed. This will always be unspecified while the deploy in progress.
     * 
    */
    public String getDeployFailureCause() {
        return this.deployFailureCause;
    }
    /**
     * Time at which the `Rollout` started deploying.
     * 
    */
    public String getDeployStartTime() {
        return this.deployStartTime;
    }
    /**
     * The resource name of the Cloud Build `Build` object that is used to deploy the Rollout. Format is `projects/{project}/locations/{location}/builds/{build}`.
     * 
    */
    public String getDeployingBuild() {
        return this.deployingBuild;
    }
    /**
     * Description of the `Rollout` for user purposes. Max length is 255 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Time at which the `Rollout` was enqueued.
     * 
    */
    public String getEnqueueTime() {
        return this.enqueueTime;
    }
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Reason the build failed. Empty if the build succeeded.
     * 
    */
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Name of the `Rollout`. Format is projects/{project}/ locations/{location}/deliveryPipelines/{deliveryPipeline}/ releases/{release}/rollouts/a-z{0,62}.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Current state of the `Rollout`.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The ID of Target to which this `Rollout` is deploying.
     * 
    */
    public String getTargetId() {
        return this.targetId;
    }
    /**
     * Unique identifier of the `Rollout`.
     * 
    */
    public String getUid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolloutResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private String approvalState;
        private String approveTime;
        private String createTime;
        private String deployEndTime;
        private String deployFailureCause;
        private String deployStartTime;
        private String deployingBuild;
        private String description;
        private String enqueueTime;
        private String etag;
        private String failureReason;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String targetId;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRolloutResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.approvalState = defaults.approvalState;
    	      this.approveTime = defaults.approveTime;
    	      this.createTime = defaults.createTime;
    	      this.deployEndTime = defaults.deployEndTime;
    	      this.deployFailureCause = defaults.deployFailureCause;
    	      this.deployStartTime = defaults.deployStartTime;
    	      this.deployingBuild = defaults.deployingBuild;
    	      this.description = defaults.description;
    	      this.enqueueTime = defaults.enqueueTime;
    	      this.etag = defaults.etag;
    	      this.failureReason = defaults.failureReason;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.targetId = defaults.targetId;
    	      this.uid = defaults.uid;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder approvalState(String approvalState) {
            this.approvalState = Objects.requireNonNull(approvalState);
            return this;
        }

        public Builder approveTime(String approveTime) {
            this.approveTime = Objects.requireNonNull(approveTime);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder deployEndTime(String deployEndTime) {
            this.deployEndTime = Objects.requireNonNull(deployEndTime);
            return this;
        }

        public Builder deployFailureCause(String deployFailureCause) {
            this.deployFailureCause = Objects.requireNonNull(deployFailureCause);
            return this;
        }

        public Builder deployStartTime(String deployStartTime) {
            this.deployStartTime = Objects.requireNonNull(deployStartTime);
            return this;
        }

        public Builder deployingBuild(String deployingBuild) {
            this.deployingBuild = Objects.requireNonNull(deployingBuild);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder enqueueTime(String enqueueTime) {
            this.enqueueTime = Objects.requireNonNull(enqueueTime);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder failureReason(String failureReason) {
            this.failureReason = Objects.requireNonNull(failureReason);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }

        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public GetRolloutResult build() {
            return new GetRolloutResult(annotations, approvalState, approveTime, createTime, deployEndTime, deployFailureCause, deployStartTime, deployingBuild, description, enqueueTime, etag, failureReason, labels, name, state, targetId, uid);
        }
    }
}
