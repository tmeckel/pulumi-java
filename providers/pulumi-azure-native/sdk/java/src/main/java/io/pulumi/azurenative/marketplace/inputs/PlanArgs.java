// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.inputs;

import io.pulumi.azurenative.marketplace.enums.Accessibility;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlanArgs Empty = new PlanArgs();

    /**
     * Plan accessibility
     * 
     */
    @Import(name="accessibility")
      private final @Nullable Output<Either<String,Accessibility>> accessibility;

    public Output<Either<String,Accessibility>> getAccessibility() {
        return this.accessibility == null ? Codegen.empty() : this.accessibility;
    }

    public PlanArgs(@Nullable Output<Either<String,Accessibility>> accessibility) {
        this.accessibility = accessibility;
    }

    private PlanArgs() {
        this.accessibility = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Accessibility>> accessibility;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessibility = defaults.accessibility;
        }

        public Builder accessibility(@Nullable Output<Either<String,Accessibility>> accessibility) {
            this.accessibility = accessibility;
            return this;
        }
        public Builder accessibility(@Nullable Either<String,Accessibility> accessibility) {
            this.accessibility = Codegen.ofNullable(accessibility);
            return this;
        }        public PlanArgs build() {
            return new PlanArgs(accessibility);
        }
    }
}
