// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a machine that is part of a machine group
 * 
 */
public final class VmRecommendationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmRecommendationArgs Empty = new VmRecommendationArgs();

    /**
     * The configuration status of the machines group or machine or rule
     * 
     */
    @Import(name="configurationStatus")
      private final @Nullable Output<String> configurationStatus;

    public Output<String> getConfigurationStatus() {
        return this.configurationStatus == null ? Codegen.empty() : this.configurationStatus;
    }

    /**
     * The machine supportability of Enforce feature
     * 
     */
    @Import(name="enforcementSupport")
      private final @Nullable Output<String> enforcementSupport;

    public Output<String> getEnforcementSupport() {
        return this.enforcementSupport == null ? Codegen.empty() : this.enforcementSupport;
    }

    /**
     * The recommendation action of the machine or rule
     * 
     */
    @Import(name="recommendationAction")
      private final @Nullable Output<String> recommendationAction;

    public Output<String> getRecommendationAction() {
        return this.recommendationAction == null ? Codegen.empty() : this.recommendationAction;
    }

    /**
     * The full resource id of the machine
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public VmRecommendationArgs(
        @Nullable Output<String> configurationStatus,
        @Nullable Output<String> enforcementSupport,
        @Nullable Output<String> recommendationAction,
        @Nullable Output<String> resourceId) {
        this.configurationStatus = configurationStatus;
        this.enforcementSupport = enforcementSupport;
        this.recommendationAction = recommendationAction;
        this.resourceId = resourceId;
    }

    private VmRecommendationArgs() {
        this.configurationStatus = Codegen.empty();
        this.enforcementSupport = Codegen.empty();
        this.recommendationAction = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmRecommendationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationStatus;
        private @Nullable Output<String> enforcementSupport;
        private @Nullable Output<String> recommendationAction;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmRecommendationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationStatus = defaults.configurationStatus;
    	      this.enforcementSupport = defaults.enforcementSupport;
    	      this.recommendationAction = defaults.recommendationAction;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder configurationStatus(@Nullable Output<String> configurationStatus) {
            this.configurationStatus = configurationStatus;
            return this;
        }
        public Builder configurationStatus(@Nullable String configurationStatus) {
            this.configurationStatus = Codegen.ofNullable(configurationStatus);
            return this;
        }
        public Builder enforcementSupport(@Nullable Output<String> enforcementSupport) {
            this.enforcementSupport = enforcementSupport;
            return this;
        }
        public Builder enforcementSupport(@Nullable String enforcementSupport) {
            this.enforcementSupport = Codegen.ofNullable(enforcementSupport);
            return this;
        }
        public Builder recommendationAction(@Nullable Output<String> recommendationAction) {
            this.recommendationAction = recommendationAction;
            return this;
        }
        public Builder recommendationAction(@Nullable String recommendationAction) {
            this.recommendationAction = Codegen.ofNullable(recommendationAction);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public VmRecommendationArgs build() {
            return new VmRecommendationArgs(configurationStatus, enforcementSupport, recommendationAction, resourceId);
        }
    }
}
