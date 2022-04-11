// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The daily volume cap for ingestion.
 * 
 */
public final class WorkspaceCappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceCappingArgs Empty = new WorkspaceCappingArgs();

    /**
     * The workspace daily quota for ingestion.
     * 
     */
    @Import(name="dailyQuotaGb")
      private final @Nullable Output<Double> dailyQuotaGb;

    public Output<Double> getDailyQuotaGb() {
        return this.dailyQuotaGb == null ? Codegen.empty() : this.dailyQuotaGb;
    }

    public WorkspaceCappingArgs(@Nullable Output<Double> dailyQuotaGb) {
        this.dailyQuotaGb = dailyQuotaGb;
    }

    private WorkspaceCappingArgs() {
        this.dailyQuotaGb = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> dailyQuotaGb;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyQuotaGb = defaults.dailyQuotaGb;
        }

        public Builder dailyQuotaGb(@Nullable Output<Double> dailyQuotaGb) {
            this.dailyQuotaGb = dailyQuotaGb;
            return this;
        }
        public Builder dailyQuotaGb(@Nullable Double dailyQuotaGb) {
            this.dailyQuotaGb = Codegen.ofNullable(dailyQuotaGb);
            return this;
        }        public WorkspaceCappingArgs build() {
            return new WorkspaceCappingArgs(dailyQuotaGb);
        }
    }
}
