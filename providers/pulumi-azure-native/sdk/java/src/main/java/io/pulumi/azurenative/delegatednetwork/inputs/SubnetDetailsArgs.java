// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of orchestrator
 * 
 */
public final class SubnetDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetDetailsArgs Empty = new SubnetDetailsArgs();

    /**
     * subnet arm resource id
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    public SubnetDetailsArgs(@Nullable Output<String> id) {
        this.id = id;
    }

    private SubnetDetailsArgs() {
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }        public SubnetDetailsArgs build() {
            return new SubnetDetailsArgs(id);
        }
    }
}
