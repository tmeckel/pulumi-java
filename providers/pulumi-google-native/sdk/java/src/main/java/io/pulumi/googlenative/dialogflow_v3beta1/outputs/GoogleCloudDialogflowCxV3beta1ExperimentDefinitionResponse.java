// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1VersionVariantsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse {
    /**
     * The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. "query_input.language_code=en" See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    private final String condition;
    /**
     * The flow versions as the variants of this experiment.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants;

    @OutputCustomType.Constructor({"condition","versionVariants"})
    private GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse(
        String condition,
        GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants) {
        this.condition = Objects.requireNonNull(condition);
        this.versionVariants = Objects.requireNonNull(versionVariants);
    }

    /**
     * The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. "query_input.language_code=en" See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    public String getCondition() {
        return this.condition;
    }
    /**
     * The flow versions as the variants of this experiment.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1VersionVariantsResponse getVersionVariants() {
        return this.versionVariants;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.versionVariants = defaults.versionVariants;
        }

        public Builder setCondition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setVersionVariants(GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants) {
            this.versionVariants = Objects.requireNonNull(versionVariants);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse(condition, versionVariants);
        }
    }
}
