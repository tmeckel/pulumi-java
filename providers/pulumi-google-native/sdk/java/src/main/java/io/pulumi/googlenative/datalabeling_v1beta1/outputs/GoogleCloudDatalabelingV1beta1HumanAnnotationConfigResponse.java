// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse {
    /**
     * Optional. A human-readable description for AnnotatedDataset. The description can be up to 10000 characters long.
     * 
     */
    private final String annotatedDatasetDescription;
    /**
     * A human-readable name for AnnotatedDataset defined by users. Maximum of 64 characters .
     * 
     */
    private final String annotatedDatasetDisplayName;
    /**
     * Optional. If you want your own labeling contributors to manage and work on this labeling request, you can set these contributors here. We will give them access to the question types in crowdcompute. Note that these emails must be registered in crowdcompute worker UI: https://crowd-compute.appspot.com/
     * 
     */
    private final List<String> contributorEmails;
    /**
     * Instruction resource name.
     * 
     */
    private final String instruction;
    /**
     * Optional. A human-readable label used to logically group labeling tasks. This string must match the regular expression `[a-zA-Z\\d_-]{0,128}`.
     * 
     */
    private final String labelGroup;
    /**
     * Optional. The Language of this question, as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). Default value is en-US. Only need to set this when task is language related. For example, French text classification.
     * 
     */
    private final String languageCode;
    /**
     * Optional. Maximum duration for contributors to answer a question. Maximum is 3600 seconds. Default is 3600 seconds.
     * 
     */
    private final String questionDuration;
    /**
     * Optional. Replication of questions. Each question will be sent to up to this number of contributors to label. Aggregated answers will be returned. Default is set to 1. For image related labeling, valid values are 1, 3, 5.
     * 
     */
    private final Integer replicaCount;
    /**
     * Email of the user who started the labeling task and should be notified by email. If empty no notification will be sent.
     * 
     */
    private final String userEmailAddress;

    @OutputCustomType.Constructor({"annotatedDatasetDescription","annotatedDatasetDisplayName","contributorEmails","instruction","labelGroup","languageCode","questionDuration","replicaCount","userEmailAddress"})
    private GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse(
        String annotatedDatasetDescription,
        String annotatedDatasetDisplayName,
        List<String> contributorEmails,
        String instruction,
        String labelGroup,
        String languageCode,
        String questionDuration,
        Integer replicaCount,
        String userEmailAddress) {
        this.annotatedDatasetDescription = Objects.requireNonNull(annotatedDatasetDescription);
        this.annotatedDatasetDisplayName = Objects.requireNonNull(annotatedDatasetDisplayName);
        this.contributorEmails = Objects.requireNonNull(contributorEmails);
        this.instruction = Objects.requireNonNull(instruction);
        this.labelGroup = Objects.requireNonNull(labelGroup);
        this.languageCode = Objects.requireNonNull(languageCode);
        this.questionDuration = Objects.requireNonNull(questionDuration);
        this.replicaCount = Objects.requireNonNull(replicaCount);
        this.userEmailAddress = Objects.requireNonNull(userEmailAddress);
    }

    /**
     * Optional. A human-readable description for AnnotatedDataset. The description can be up to 10000 characters long.
     * 
     */
    public String getAnnotatedDatasetDescription() {
        return this.annotatedDatasetDescription;
    }
    /**
     * A human-readable name for AnnotatedDataset defined by users. Maximum of 64 characters .
     * 
     */
    public String getAnnotatedDatasetDisplayName() {
        return this.annotatedDatasetDisplayName;
    }
    /**
     * Optional. If you want your own labeling contributors to manage and work on this labeling request, you can set these contributors here. We will give them access to the question types in crowdcompute. Note that these emails must be registered in crowdcompute worker UI: https://crowd-compute.appspot.com/
     * 
     */
    public List<String> getContributorEmails() {
        return this.contributorEmails;
    }
    /**
     * Instruction resource name.
     * 
     */
    public String getInstruction() {
        return this.instruction;
    }
    /**
     * Optional. A human-readable label used to logically group labeling tasks. This string must match the regular expression `[a-zA-Z\\d_-]{0,128}`.
     * 
     */
    public String getLabelGroup() {
        return this.labelGroup;
    }
    /**
     * Optional. The Language of this question, as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). Default value is en-US. Only need to set this when task is language related. For example, French text classification.
     * 
     */
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Optional. Maximum duration for contributors to answer a question. Maximum is 3600 seconds. Default is 3600 seconds.
     * 
     */
    public String getQuestionDuration() {
        return this.questionDuration;
    }
    /**
     * Optional. Replication of questions. Each question will be sent to up to this number of contributors to label. Aggregated answers will be returned. Default is set to 1. For image related labeling, valid values are 1, 3, 5.
     * 
     */
    public Integer getReplicaCount() {
        return this.replicaCount;
    }
    /**
     * Email of the user who started the labeling task and should be notified by email. If empty no notification will be sent.
     * 
     */
    public String getUserEmailAddress() {
        return this.userEmailAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String annotatedDatasetDescription;
        private String annotatedDatasetDisplayName;
        private List<String> contributorEmails;
        private String instruction;
        private String labelGroup;
        private String languageCode;
        private String questionDuration;
        private Integer replicaCount;
        private String userEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotatedDatasetDescription = defaults.annotatedDatasetDescription;
    	      this.annotatedDatasetDisplayName = defaults.annotatedDatasetDisplayName;
    	      this.contributorEmails = defaults.contributorEmails;
    	      this.instruction = defaults.instruction;
    	      this.labelGroup = defaults.labelGroup;
    	      this.languageCode = defaults.languageCode;
    	      this.questionDuration = defaults.questionDuration;
    	      this.replicaCount = defaults.replicaCount;
    	      this.userEmailAddress = defaults.userEmailAddress;
        }

        public Builder setAnnotatedDatasetDescription(String annotatedDatasetDescription) {
            this.annotatedDatasetDescription = Objects.requireNonNull(annotatedDatasetDescription);
            return this;
        }

        public Builder setAnnotatedDatasetDisplayName(String annotatedDatasetDisplayName) {
            this.annotatedDatasetDisplayName = Objects.requireNonNull(annotatedDatasetDisplayName);
            return this;
        }

        public Builder setContributorEmails(List<String> contributorEmails) {
            this.contributorEmails = Objects.requireNonNull(contributorEmails);
            return this;
        }

        public Builder setInstruction(String instruction) {
            this.instruction = Objects.requireNonNull(instruction);
            return this;
        }

        public Builder setLabelGroup(String labelGroup) {
            this.labelGroup = Objects.requireNonNull(labelGroup);
            return this;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder setQuestionDuration(String questionDuration) {
            this.questionDuration = Objects.requireNonNull(questionDuration);
            return this;
        }

        public Builder setReplicaCount(Integer replicaCount) {
            this.replicaCount = Objects.requireNonNull(replicaCount);
            return this;
        }

        public Builder setUserEmailAddress(String userEmailAddress) {
            this.userEmailAddress = Objects.requireNonNull(userEmailAddress);
            return this;
        }

        public GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse(annotatedDatasetDescription, annotatedDatasetDisplayName, contributorEmails, instruction, labelGroup, languageCode, questionDuration, replicaCount, userEmailAddress);
        }
    }
}
