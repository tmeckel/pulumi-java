// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.WorkloadInquiryDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details about inquired protectable items under a given container.
 * 
 */
public final class InquiryInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final InquiryInfoArgs Empty = new InquiryInfoArgs();

    /**
     * Inquiry Details which will have workload specific details.
     * For e.g. - For SQL and oracle this will contain different details.
     * 
     */
    @InputImport(name="inquiryDetails")
      private final @Nullable Input<List<WorkloadInquiryDetailsArgs>> inquiryDetails;

    public Input<List<WorkloadInquiryDetailsArgs>> getInquiryDetails() {
        return this.inquiryDetails == null ? Input.empty() : this.inquiryDetails;
    }

    /**
     * Inquiry Status for this container such as
     * InProgress | Failed | Succeeded
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public InquiryInfoArgs(
        @Nullable Input<List<WorkloadInquiryDetailsArgs>> inquiryDetails,
        @Nullable Input<String> status) {
        this.inquiryDetails = inquiryDetails;
        this.status = status;
    }

    private InquiryInfoArgs() {
        this.inquiryDetails = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InquiryInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WorkloadInquiryDetailsArgs>> inquiryDetails;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(InquiryInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inquiryDetails = defaults.inquiryDetails;
    	      this.status = defaults.status;
        }

        public Builder inquiryDetails(@Nullable Input<List<WorkloadInquiryDetailsArgs>> inquiryDetails) {
            this.inquiryDetails = inquiryDetails;
            return this;
        }

        public Builder inquiryDetails(@Nullable List<WorkloadInquiryDetailsArgs> inquiryDetails) {
            this.inquiryDetails = Input.ofNullable(inquiryDetails);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public InquiryInfoArgs build() {
            return new InquiryInfoArgs(inquiryDetails, status);
        }
    }
}
