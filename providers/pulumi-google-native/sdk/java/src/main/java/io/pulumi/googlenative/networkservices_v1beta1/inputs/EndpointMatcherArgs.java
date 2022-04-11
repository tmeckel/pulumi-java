// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.MetadataLabelMatcherArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A definition of a matcher that selects endpoints to which the policies should be applied.
 * 
 */
public final class EndpointMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointMatcherArgs Empty = new EndpointMatcherArgs();

    /**
     * The matcher is based on node metadata presented by xDS clients.
     * 
     */
    @Import(name="metadataLabelMatcher")
      private final @Nullable Output<MetadataLabelMatcherArgs> metadataLabelMatcher;

    public Output<MetadataLabelMatcherArgs> getMetadataLabelMatcher() {
        return this.metadataLabelMatcher == null ? Codegen.empty() : this.metadataLabelMatcher;
    }

    public EndpointMatcherArgs(@Nullable Output<MetadataLabelMatcherArgs> metadataLabelMatcher) {
        this.metadataLabelMatcher = metadataLabelMatcher;
    }

    private EndpointMatcherArgs() {
        this.metadataLabelMatcher = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MetadataLabelMatcherArgs> metadataLabelMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataLabelMatcher = defaults.metadataLabelMatcher;
        }

        public Builder metadataLabelMatcher(@Nullable Output<MetadataLabelMatcherArgs> metadataLabelMatcher) {
            this.metadataLabelMatcher = metadataLabelMatcher;
            return this;
        }
        public Builder metadataLabelMatcher(@Nullable MetadataLabelMatcherArgs metadataLabelMatcher) {
            this.metadataLabelMatcher = Codegen.ofNullable(metadataLabelMatcher);
            return this;
        }        public EndpointMatcherArgs build() {
            return new EndpointMatcherArgs(metadataLabelMatcher);
        }
    }
}
