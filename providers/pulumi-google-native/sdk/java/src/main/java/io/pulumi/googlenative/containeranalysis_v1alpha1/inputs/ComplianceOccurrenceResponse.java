// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.NonCompliantFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An indication that the compliance checks in the associated ComplianceNote were not satisfied for particular resources or a specified reason.
 * 
 */
public final class ComplianceOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComplianceOccurrenceResponse Empty = new ComplianceOccurrenceResponse();

    /**
     * The reason for non compliance of these files.
     * 
     */
    @InputImport(name="nonComplianceReason", required=true)
    private final String nonComplianceReason;

    public String getNonComplianceReason() {
        return this.nonComplianceReason;
    }

    /**
     * A list of files which are violating compliance checks.
     * 
     */
    @InputImport(name="nonCompliantFiles", required=true)
    private final List<NonCompliantFileResponse> nonCompliantFiles;

    public List<NonCompliantFileResponse> getNonCompliantFiles() {
        return this.nonCompliantFiles;
    }

    public ComplianceOccurrenceResponse(
        String nonComplianceReason,
        List<NonCompliantFileResponse> nonCompliantFiles) {
        this.nonComplianceReason = Objects.requireNonNull(nonComplianceReason, "expected parameter 'nonComplianceReason' to be non-null");
        this.nonCompliantFiles = Objects.requireNonNull(nonCompliantFiles, "expected parameter 'nonCompliantFiles' to be non-null");
    }

    private ComplianceOccurrenceResponse() {
        this.nonComplianceReason = null;
        this.nonCompliantFiles = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nonComplianceReason;
        private List<NonCompliantFileResponse> nonCompliantFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonComplianceReason = defaults.nonComplianceReason;
    	      this.nonCompliantFiles = defaults.nonCompliantFiles;
        }

        public Builder setNonComplianceReason(String nonComplianceReason) {
            this.nonComplianceReason = Objects.requireNonNull(nonComplianceReason);
            return this;
        }

        public Builder setNonCompliantFiles(List<NonCompliantFileResponse> nonCompliantFiles) {
            this.nonCompliantFiles = Objects.requireNonNull(nonCompliantFiles);
            return this;
        }

        public ComplianceOccurrenceResponse build() {
            return new ComplianceOccurrenceResponse(nonComplianceReason, nonCompliantFiles);
        }
    }
}
