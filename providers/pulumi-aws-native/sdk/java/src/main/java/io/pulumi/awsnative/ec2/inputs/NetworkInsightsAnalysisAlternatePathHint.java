// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisAlternatePathHint extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsAnalysisAlternatePathHint Empty = new NetworkInsightsAnalysisAlternatePathHint();

    @InputImport(name="componentArn")
      private final @Nullable String componentArn;

    public Optional<String> getComponentArn() {
        return this.componentArn == null ? Optional.empty() : Optional.ofNullable(this.componentArn);
    }

    @InputImport(name="componentId")
      private final @Nullable String componentId;

    public Optional<String> getComponentId() {
        return this.componentId == null ? Optional.empty() : Optional.ofNullable(this.componentId);
    }

    public NetworkInsightsAnalysisAlternatePathHint(
        @Nullable String componentArn,
        @Nullable String componentId) {
        this.componentArn = componentArn;
        this.componentId = componentId;
    }

    private NetworkInsightsAnalysisAlternatePathHint() {
        this.componentArn = null;
        this.componentId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAlternatePathHint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentArn;
        private @Nullable String componentId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAlternatePathHint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
    	      this.componentId = defaults.componentId;
        }

        public Builder componentArn(@Nullable String componentArn) {
            this.componentArn = componentArn;
            return this;
        }

        public Builder componentId(@Nullable String componentId) {
            this.componentId = componentId;
            return this;
        }
        public NetworkInsightsAnalysisAlternatePathHint build() {
            return new NetworkInsightsAnalysisAlternatePathHint(componentArn, componentId);
        }
    }
}
