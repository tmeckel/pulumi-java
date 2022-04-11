// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.NonCompliantFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An indication that the compliance checks in the associated ComplianceNote were not satisfied for particular resources or a specified reason.
 * 
 */
public final class ComplianceOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComplianceOccurrenceArgs Empty = new ComplianceOccurrenceArgs();

    /**
     * The reason for non compliance of these files.
     * 
     */
    @Import(name="nonComplianceReason")
      private final @Nullable Output<String> nonComplianceReason;

    public Output<String> getNonComplianceReason() {
        return this.nonComplianceReason == null ? Codegen.empty() : this.nonComplianceReason;
    }

    /**
     * A list of files which are violating compliance checks.
     * 
     */
    @Import(name="nonCompliantFiles")
      private final @Nullable Output<List<NonCompliantFileArgs>> nonCompliantFiles;

    public Output<List<NonCompliantFileArgs>> getNonCompliantFiles() {
        return this.nonCompliantFiles == null ? Codegen.empty() : this.nonCompliantFiles;
    }

    public ComplianceOccurrenceArgs(
        @Nullable Output<String> nonComplianceReason,
        @Nullable Output<List<NonCompliantFileArgs>> nonCompliantFiles) {
        this.nonComplianceReason = nonComplianceReason;
        this.nonCompliantFiles = nonCompliantFiles;
    }

    private ComplianceOccurrenceArgs() {
        this.nonComplianceReason = Codegen.empty();
        this.nonCompliantFiles = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> nonComplianceReason;
        private @Nullable Output<List<NonCompliantFileArgs>> nonCompliantFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonComplianceReason = defaults.nonComplianceReason;
    	      this.nonCompliantFiles = defaults.nonCompliantFiles;
        }

        public Builder nonComplianceReason(@Nullable Output<String> nonComplianceReason) {
            this.nonComplianceReason = nonComplianceReason;
            return this;
        }
        public Builder nonComplianceReason(@Nullable String nonComplianceReason) {
            this.nonComplianceReason = Codegen.ofNullable(nonComplianceReason);
            return this;
        }
        public Builder nonCompliantFiles(@Nullable Output<List<NonCompliantFileArgs>> nonCompliantFiles) {
            this.nonCompliantFiles = nonCompliantFiles;
            return this;
        }
        public Builder nonCompliantFiles(@Nullable List<NonCompliantFileArgs> nonCompliantFiles) {
            this.nonCompliantFiles = Codegen.ofNullable(nonCompliantFiles);
            return this;
        }
        public Builder nonCompliantFiles(NonCompliantFileArgs... nonCompliantFiles) {
            return nonCompliantFiles(List.of(nonCompliantFiles));
        }        public ComplianceOccurrenceArgs build() {
            return new ComplianceOccurrenceArgs(nonComplianceReason, nonCompliantFiles);
        }
    }
}
